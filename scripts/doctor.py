#!/usr/bin/env python3
"""Readiness checks. --smoke runs an actual one-bug generation/evaluation."""
import argparse
import hashlib
import json
import os
from pathlib import Path
import shutil
from common import ROOT, WORK, TOOLS, build_support, java, run

def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--smoke", choices=["grt", "evosuite"])
    args = ap.parse_args()
    failures = []
    for name in ["defects4j", "java", "javac", "git"]:
        if not shutil.which(name):
            failures.append(f"Missing executable: {name}")
    if os.environ.get("TZ") != "America/Los_Angeles":
        failures.append("TZ must be America/Los_Angeles")
    lock = json.loads((ROOT / "config/dependencies.lock.json").read_text())
    for item in lock["jars"]:
        path = TOOLS / item["file"]
        if not path.exists() or hashlib.sha256(path.read_bytes()).hexdigest() != item["sha256"]:
            failures.append(f"Missing or incorrect dependency: {item['file']}")
    if not os.environ.get("JAVA8_HOME"):
        failures.append("JAVA8_HOME is required for MOSA/EvoSuite")
    if failures:
        print("NOT READY\n" + "\n".join(failures))
        return 1
    for cmd in [[java(), "-version"], [java("JAVA8_HOME"), "-version"], ["defects4j", "info", "-p", "Lang"]]:
        result = run(cmd, timeout=120)
        print((result["stdout"] + result["stderr"]).strip())
    revision = run(["git", "-C", os.environ.get("DEFECTS4J_HOME", "/opt/defects4j"), "rev-parse", "HEAD"])["stdout"].strip()
    if revision != lock["defects4j_commit"]:
        raise RuntimeError("Defects4J revision differs from lock")
    WORK.mkdir(exist_ok=True, parents=True)
    marker = WORK / ".doctor-write-test"
    marker.write_text("ok")
    marker.unlink()
    build_support()
    print("Environment checks passed. This alone does not validate all 17 projects.")
    if args.smoke:
        from run_benchmark import main as benchmark
        return benchmark(["--tool", args.smoke, "--project", "Lang", "--bug", "1", "--seed", "101", "--purpose", "validation"])
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
