"""Use the registered agent tools (Claude Code/Codex), or prepare a manual task.

No silent substitution with model HTTP APIs. Authentication stays outside Git.
"""
from __future__ import annotations
import json
import os
from pathlib import Path
import shutil
import time
from common import ROOT, WORK, StageError, config, dump, relative, run, sha
from evaluator import evaluate_revision, export

def source_hashes(folder):
    return {p.relative_to(folder).as_posix(): sha(p) for p in folder.rglob("*.java")
            if "generated-tests" not in p.relative_to(folder).parts}

def response_metadata(stdout):
    """Keep reported usage/model distinct from the requested model. Never invent either."""
    events=[]
    try:
        events=[json.loads(stdout)]
    except json.JSONDecodeError:
        for line in stdout.splitlines():
            try: events.append(json.loads(line))
            except json.JSONDecodeError: pass
    usage=[]; models=[]
    def visit(value):
        if isinstance(value,dict):
            if isinstance(value.get("usage"),dict):usage.append(value["usage"])
            if isinstance(value.get("model"),str):models.append(value["model"])
            for k,v in value.items():
                if k not in ("usage","model"):visit(v)
        elif isinstance(value,list):
            for v in value:visit(v)
    visit(events)
    return {"usage":usage or None,"model_reported":models[-1] if models else None}

def prepare(unit, work, paths):
    source_root = work / export(work, "dir.src.classes", paths["result"] / "generation")
    target_file = source_root / (unit["target"].replace(".", "/") + ".java")
    if not target_file.exists():
        raise StageError("UNSUPPORTED", f"Cannot resolve Java source for {unit['target']}")
    template = (ROOT / "prompts/ai-test-generation-prompt.md").read_text(encoding="utf-8")
    task = template.replace("{{TARGET_CLASS}}", unit["target"]).replace("{{ROUND}}", unit["round"])
    task = task.replace("{{SEED}}", str(unit["seed"])).replace("{{BUDGET}}", str(unit["budget_seconds"]))
    task += "\n\nTarget source (fixed revision, experimental input):\n```java\n" + target_file.read_text(encoding="utf-8", errors="replace") + "\n```\n"
    path = paths["config"] / "TASK.md"
    path.write_text(task, encoding="utf-8")
    provenance = {"tool": unit["tool"], "model_requested": unit["model"], "model_reported": None,
                  "mode": unit["ai_mode"], "generation_time_sec": None, "usage": None,
                  "prompt_sha256": sha(path), "notes": "Fill actual model and time for manual runs; never store credentials."}
    dump(paths["config"] / "provenance.json", provenance)
    return path

def generate_cli(unit, work, paths, task):
    name = "claude" if unit["tool"] == "claude_code" else "codex"
    if not shutil.which(name):
        raise StageError("AUTH_REQUIRED", f"{name} CLI is not installed; use the AI Docker service")
    version = run([name, "--version"], log=paths["result"] / "cli-version.json", timeout=30)
    workspace = WORK / "ai" / paths["result"].name
    # Do not expose VCS history, other revisions or developer test oracles to generation.
    workspace.mkdir(parents=True, exist_ok=False)
    src_dir = export(work, "dir.src.classes", paths["result"] / "generation")
    shutil.copytree(work / src_dir, workspace / "source")
    generated = workspace / "generated-tests"
    generated.mkdir()
    baseline = source_hashes(workspace)
    prompt = task.read_text(encoding="utf-8")
    prompt += "\nWrite output only in ./generated-tests, using package directories. Source dependencies are under ./source."
    prompt += "\nDo not inspect other checkouts, Git history, patches, or existing developer tests."
    # Tools are used for reading source and writing tests. The trusted runner owns evaluation.
    started = time.monotonic()
    metadata=[]
    last_error = "No Java test files"
    for attempt in range(config()["ai_max_retries"] + 1):
        attempt_dir = paths["config"] / f"attempt-{attempt+1}"
        attempt_dir.mkdir()
        (attempt_dir / "prompt.txt").write_text(prompt, encoding="utf-8")
        if name == "codex":
            cmd = [name, "exec", "--skip-git-repo-check", "--sandbox", "workspace-write", "--json",
                   "-c", 'approval_policy="never"', "-m", unit["model"], "-"]
        else:
            cmd = [name, "-p", "--model", unit["model"], "--output-format", "json",
                   "--allowedTools", "Read,Glob,Grep,Write,Edit"]
        remaining = config()["ai_timeout_seconds"] - (time.monotonic() - started)
        if remaining <= 0:
            raise StageError("TIMEOUT", "AI wall-clock budget exhausted")
        response = run(cmd, cwd=workspace, input_text=prompt, timeout=remaining,
                       log=attempt_dir / "response.json", check=False)
        if response["timed_out"]:
            raise StageError("TIMEOUT", "AI CLI timed out")
        if response["returncode"]:
            raise StageError("AI_ERROR", f"AI CLI failed; inspect {attempt_dir / 'response.json'}")
        metadata.append(response_metadata(response["stdout"]))
        if source_hashes(workspace) != baseline:
            raise StageError("SOURCE_MODIFIED", "AI changed input Java source; output rejected")
        files = sorted(generated.rglob("*.java"))
        for file in files:
            if file.is_symlink():
                raise StageError("INVALID_TESTS", "Generated source must not be a symlink")
            archived = attempt_dir / "tests" / file.relative_to(generated)
            archived.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(file, archived)
        try:
            evaluated = evaluate_revision(work, generated, paths["result"] / f"ai-feedback-{attempt+1}", unit["target"])
            if not evaluated["junit"]["passed"]:
                raise StageError("INVALID_ORACLE", json.dumps(evaluated["junit"]["failures"])[:6000])
            for file in files:
                dest = paths["tests"] / file.relative_to(generated)
                dest.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(file, dest)
            elapsed = round(time.monotonic() - started, 3)
            provenance_path = paths["config"] / "provenance.json"
            provenance = json.loads(provenance_path.read_text(encoding="utf-8"))
            provenance.update(generation_time_sec=elapsed, cli_version=version["stdout"].strip(),
                              attempts=attempt+1, model_reported=metadata[-1]["model_reported"],
                              usage_by_attempt=metadata, model_identity_basis="explicit_cli_argument")
            dump(provenance_path, provenance)
            return elapsed
        except StageError as exc:
            last_error = str(exc)
            compile_log = paths["result"] / f"ai-feedback-{attempt+1}" / "compile-generated.json"
            if compile_log.exists():
                compile_data = json.loads(compile_log.read_text(encoding="utf-8"))
                last_error += "\n" + compile_data["stderr"][-6000:]
            prompt = task.read_text(encoding="utf-8") + "\nYour files remain under ./generated-tests. Fix these errors without changing input source:\n" + last_error
    raise StageError("AI_VALIDATION_FAIL", last_error)

if __name__ == "__main__":
    from run_benchmark import main
    raise SystemExit(main())
