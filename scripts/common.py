"""Shared paths and subprocess handling. Importing this module writes nothing."""
from __future__ import annotations
import hashlib
import json
import os
from pathlib import Path
import signal
import subprocess
import time
import tempfile

ROOT = Path(__file__).resolve().parents[1]
WORK = Path(os.environ.get("SQA_WORK", ROOT / "work")).resolve()
TOOLS = Path(os.environ.get("SQA_TOOLS", "/opt/sqa/lib" if os.name != "nt" else WORK / "vendor"))
FOLDERS = {"evosuite": "MOSA_EvoSuite", "grt": "GRT", "claude_code": "Claude-sonnet_4_6", "codex": "Codex"}

def config():
    return json.loads((ROOT / "config/benchmark.json").read_text(encoding="utf-8"))

def dump(path, data):
    path = Path(path)
    path.parent.mkdir(parents=True, exist_ok=True)
    tmp = path.with_name(path.name + ".tmp")
    tmp.write_text(json.dumps(data, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")
    tmp.replace(path)

def sha(path):
    return hashlib.sha256(Path(path).read_bytes()).hexdigest()

class StageError(RuntimeError):
    def __init__(self, status, message):
        super().__init__(message)
        self.status = status

def run(cmd, cwd=None, log=None, timeout=900, input_text=None, check=True, env=None):
    """Bound the whole process group; persist complete stdout/stderr and exit status."""
    cmd = [str(x) for x in cmd]
    effective_env = dict(os.environ, TZ="America/Los_Angeles", LC_ALL="C.UTF-8")
    if env:
        effective_env.update(env)
    started = time.monotonic()
    timed_out = False
    # File-backed capture avoids inherited stdout pipes hanging communicate() after
    # a generator exits while a child JVM remains alive, and bounds memory during runs.
    with tempfile.TemporaryFile() as out_file, tempfile.TemporaryFile() as err_file:
        try:
            p = subprocess.Popen(cmd, cwd=cwd, env=effective_env, text=True, encoding="utf-8",
                                 errors="replace", stdin=subprocess.PIPE, stdout=out_file,
                                 stderr=err_file, start_new_session=os.name != "nt")
        except OSError as exc:
            raise StageError("TOOL_ERROR", f"Cannot start {cmd[0]}: {exc}") from exc
        try:
            p.communicate(input_text, timeout=timeout)
        except subprocess.TimeoutExpired:
            timed_out = True
            if os.name == "nt":
                try:
                    subprocess.run(["taskkill", "/PID", str(p.pid), "/T", "/F"], capture_output=True, timeout=10)
                except (OSError, subprocess.TimeoutExpired):
                    pass
                if p.poll() is None:
                    p.kill()
            else:
                os.killpg(p.pid, signal.SIGKILL)
            p.wait(timeout=10)
        out_file.seek(0); err_file.seek(0)
        stdout = out_file.read().decode("utf-8", errors="replace")
        stderr = err_file.read().decode("utf-8", errors="replace")
    result = {"command": cmd, "returncode": p.returncode, "timed_out": timed_out,
              "elapsed_sec": round(time.monotonic() - started, 3), "stdout": stdout, "stderr": stderr}
    if log:
        dump(log, result)
    if check and (timed_out or p.returncode):
        raise StageError("TIMEOUT" if timed_out else "TOOL_ERROR",
                         f"Command failed; see {log or cmd[0]}\n{stderr[-1500:]}")
    return result

def java(home_env="JAVA_HOME"):
    home = os.environ.get(home_env)
    return str(Path(home) / "bin" / ("java.exe" if os.name == "nt" else "java")) if home else "java"

def jars():
    # Generator/CLI uber-jars and unrelated Gson must not shadow classes under test.
    return [p for p in sorted(TOOLS.glob("*.jar")) if p.name not in ("evosuite-1.2.0.jar", "jacococli.jar", "gson-2.13.1.jar")]

def support_cp():
    return os.pathsep.join(str(p) for p in [WORK / "java", *jars()])

def build_support():
    src = sorted((ROOT / "GRT/Code/src").rglob("*.java")) + sorted((ROOT / "scripts/java").glob("*.java"))
    dest = WORK / "java"
    dest.mkdir(parents=True, exist_ok=True)
    stamp = hashlib.sha256("".join(sha(p) for p in src).encode()).hexdigest()
    marker = dest / ".sources.sha256"
    if marker.exists() and marker.read_text() == stamp:
        return
    home = os.environ.get("JAVA_HOME")
    javac = str(Path(home) / "bin/javac") if home else "javac"
    run([javac, "--release", "11", "-encoding", "UTF-8", "-cp", support_cp(), "-d", dest, *src],
        log=WORK / "build-java.json", timeout=120)
    marker.write_text(stamp)

def relative(path):
    return Path(path).resolve().relative_to(ROOT).as_posix()
