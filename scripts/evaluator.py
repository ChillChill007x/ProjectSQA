"""Compile ONLY submitted Java sources and evaluate the same suite on fixed and buggy code."""
from __future__ import annotations
import json
import os
from pathlib import Path
import re
import xml.etree.ElementTree as ET
from common import ROOT, WORK, TOOLS, StageError, build_support, config, dump, java, run, support_cp

def export(work, prop, logs):
    result = run(["defects4j", "export", "-p", prop, "-w", work],
                 cwd=work, log=logs / ("export-" + prop + ".json"))
    value = result["stdout"].strip()
    if not value:
        raise StageError("METADATA_ERROR", f"Empty Defects4J property: {prop}")
    return value

def checkout(project, bug, revision, dest, logs):
    # A directory alone is never proof of a completed checkout/compile.
    marker = dest / ".sqa-ready.json"
    identity = {"project": project, "bug": str(bug), "revision": revision}
    if marker.exists() and json.loads(marker.read_text()) == identity:
        return dest
    if dest.exists():
        raise StageError("CHECKOUT_INCOMPLETE", f"Incomplete checkout retained at {dest}; retry creates a new attempt")
    dest.parent.mkdir(parents=True, exist_ok=True)
    run(["defects4j", "checkout", "-p", project, "-v", f"{bug}{revision}", "-w", dest],
        log=logs / f"checkout-{revision}.json")
    run(["defects4j", "compile", "-w", dest], cwd=dest, log=logs / f"compile-project-{revision}.json")
    dump(marker, identity)
    return dest

def classpath(work, logs, test=True):
    cp = export(work, "cp.test" if test else "cp.compile", logs)
    bin_dir = (work / export(work, "dir.bin.classes", logs)).resolve()
    # Evaluate only generated tests: developer test binaries are deliberately excluded.
    parts = [str(bin_dir)]
    for entry in cp.split(os.pathsep):
        if entry:
            path = Path(entry)
            parts.append(str(path if path.is_absolute() else (work / path).resolve()))
    return os.pathsep.join(dict.fromkeys(parts)), bin_dir

def discover_test_classes(sources):
    classes = []
    for path in sources:
        text = path.read_text(encoding="utf-8")
        if not re.search(r"@(?:org\.junit\.)?Test\b", text):
            continue
        package = re.search(r"^\s*package\s+([\w.]+)\s*;", text, re.M)
        # Public class must match filename; javac enforces this independently.
        classes.append((package.group(1) + "." if package else "") + path.stem)
    return sorted(set(classes))

def parse_coverage(path, target):
    tree = ET.parse(path)
    rows = tree.findall(f".//class[@name='{target.replace('.', '/')}']")
    if not rows:
        raise StageError("COVERAGE_ERROR", f"Target absent from coverage XML: {target}")
    values = {}
    for metric, kind in [("line", "LINE"), ("branch", "BRANCH")]:
        counts = [c for row in rows for c in row.findall("counter") if c.attrib["type"] == kind]
        if not counts and kind == "LINE":
            raise StageError("COVERAGE_ERROR", f"Missing {kind} counter")
        covered = sum(int(c.attrib["covered"]) for c in counts)
        missed = sum(int(c.attrib["missed"]) for c in counts)
        values[f"{metric}_covered"] = covered
        values[f"{metric}_total"] = covered + missed
        values[f"{metric}_coverage_percent"] = 100 * covered / (covered + missed) if covered + missed else None
    return values

def compile_suite(work, tests_dir, evaluation_dir, logs):
    build_support()
    sources = sorted(Path(tests_dir).rglob("*.java"))
    names = discover_test_classes(sources)
    if not names:
        raise StageError("NO_TESTS", "No generated JUnit 4 test classes were found")
    cp, bin_dir = classpath(work, logs)
    classes = evaluation_dir / "classes"
    classes.mkdir(parents=True, exist_ok=True)
    # Put the pinned JUnit/runtime jars first; legacy projects can ship older JUnit jars.
    cp = os.pathsep.join([str(bin_dir), support_cp(), cp])
    args_file = evaluation_dir / "sources.args"
    args_file.write_text("\n".join('"' + str(p.resolve()).replace("\\", "/") + '"' for p in sources), encoding="utf-8")
    compiler = str(Path(os.environ["JAVA_HOME"]) / "bin/javac") if os.environ.get("JAVA_HOME") else "javac"
    result = run([compiler, "-encoding", "UTF-8", "-cp", cp, "-d", classes, "@" + str(args_file)],
                 cwd=work, log=logs / "compile-generated.json", check=False)
    if result["timed_out"] or result["returncode"]:
        raise StageError("TIMEOUT" if result["timed_out"] else "COMPILE_FAIL", "Generated test compile failed; see compile-generated.json")
    return os.pathsep.join([str(classes), cp]), bin_dir, names

def evaluate_revision(work, tests_dir, dest, target, repeat=2):
    dest.mkdir(parents=True, exist_ok=True)
    cp, bin_dir, names = compile_suite(work, tests_dir, dest, dest)
    # EvoSuite's separate classloader can discard online coverage instrumentation.
    # Instrument a private copy, keeping original bytecode for JaCoCo reporting.
    instrumented = dest / "instrumented"
    run([java(), "-jar", TOOLS / "jacococli.jar", "instrument", bin_dir,
         "--dest", instrumented], log=dest / "instrument.json")
    cp = os.pathsep.join(str(instrumented) if entry == str(bin_dir) else entry for entry in cp.split(os.pathsep))
    reports = []
    for index in range(repeat):
        report_path = dest / f"junit-{index+1}.json"
        exec_path = dest / f"coverage-{index+1}.exec"
        # Start the collector before EvoSuite installs its SUT security manager.
        # All bytecode was instrumented offline; excludes=* prevents double instrumentation.
        collector = f"-javaagent:{TOOLS / 'jacocoagent.jar'}=destfile={exec_path},append=false,excludes=*"
        result = run([java(), collector, f"-Djacoco-agent.destfile={exec_path}", "-Djacoco-agent.append=false",
                      "-cp", cp, "SqaJUnitRunner", report_path, *names], cwd=work,
                     log=dest / f"run-{index+1}.json", timeout=config()["test_timeout_seconds"], check=False)
        if result["timed_out"]:
            raise StageError("TIMEOUT", f"Generated suite timed out: {dest}")
        if result["returncode"] or not report_path.exists():
            raise StageError("RUNTIME_FAIL", f"JUnit did not produce valid evidence: {dest}")
        report = json.loads(report_path.read_text(encoding="utf-8"))
        if report["run_count"] == 0 or report["ignored_count"] or report["assumption_failure_count"]:
            raise StageError("INVALID_TESTS", "Zero, ignored, or assumption-skipped tests cannot count as passing")
        reports.append(report)
    def signature(r):
        return sorted((f["test"], f["exception"], f.get("message")) for f in r["failures"])
    if reports[0]["tests"] != reports[1]["tests"] or signature(reports[0]) != signature(reports[1]):
        raise StageError("FLAKY", "Repeated executions have different outcomes")
    xml = dest / "coverage.xml"
    class_file = bin_dir / (target.replace(".", "/") + ".class")
    if not class_file.exists():
        raise StageError("COVERAGE_ERROR", f"Compiled target missing: {class_file}")
    run([java(), "-jar", TOOLS / "jacococli.jar", "report", dest / "coverage-1.exec",
         "--classfiles", class_file, "--xml", xml], log=dest / "coverage-report.json")
    return {"junit": reports[0], "coverage": parse_coverage(xml, target), "coverage_instrumentation": "offline"}

def compare(fixed, buggy):
    # Differential failure is a candidate, not automatic proof of the real Defects4J defect.
    if not fixed["junit"]["passed"]:
        raise StageError("INVALID_ORACLE", "Suite must pass on fixed revision before fault evaluation")
    if sorted(fixed["junit"]["tests"]) != sorted(buggy["junit"]["tests"]):
        raise StageError("INVALID_TESTS", "Different test identities executed between revisions")
    return {"status": "EVALUATED", "num_tests": fixed["junit"]["run_count"],
            "fault_candidate": bool(buggy["junit"]["failures"]), "fault_confirmed": None,
            "fixed": fixed, "buggy": buggy}

def validate_reference(fixed, buggy, logs):
    """Verify a Defects4J ground-truth trigger separately from generated-suite evidence."""
    triggers = export(buggy, "tests.trigger", logs / "metadata").splitlines()
    trigger = triggers[0]
    evidence = {"trigger": trigger, "available_triggers": triggers}
    for name, work in (("fixed", fixed), ("buggy", buggy)):
        r = run(["defects4j", "test", "-w", work, "-t", trigger], cwd=work,
                log=logs / f"reference-{name}.json", timeout=config()["process_timeout_seconds"])
        match = re.search(r"Failing tests:\s*(\d+)", r["stdout"] + r["stderr"])
        if not match:
            raise StageError("BASELINE_ERROR", f"No Defects4J test summary for {name}")
        evidence[name + "_failing_tests"] = int(match.group(1))
        failures = work / "failing_tests"
        if failures.exists():
            (logs / f"reference-{name}-failures.txt").write_text(failures.read_text(encoding="utf-8", errors="replace"), encoding="utf-8")
    if evidence["fixed_failing_tests"] != 0 or evidence["buggy_failing_tests"] < 1:
        raise StageError("BASELINE_ERROR", "Reference trigger does not pass fixed/fail buggy in this environment")
    dump(logs / "reference.json", evidence)
    return evidence
