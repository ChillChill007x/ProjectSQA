#!/usr/bin/env python3
"""Run member 2 projects sequentially; retain failures and announce project completion."""
import argparse
from datetime import datetime, timezone
import hashlib
import json
from pathlib import Path
import subprocess
import sys
sys.dont_write_bytecode = True
ROOT = Path(__file__).resolve().parents[1]
sys.path.insert(0, str(ROOT / "scripts"))
from run_benchmark import implementation_hash
from run_full_round1 import expected_inventory
PROJECTS = ["Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv", "Gson", "JacksonCore", "JacksonDatabind"]

def terminal_summary(data, project, expected):
    bugs = data["bugs"]
    if len(bugs) != len(expected) or {(b["project"], str(b["bug"])) for b in bugs} != {(project, b) for b in expected}:
        raise ValueError("Project inventory does not match")
    counts = {}
    for b in bugs: counts[b["status"]] = counts.get(b["status"], 0) + 1
    if any(s not in ("EVALUATED", "FAILED", "METADATA_ERROR") for s in counts):
        raise ValueError("Project still has unfinished work: " + str(counts))
    return counts

def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--start", choices=PROJECTS, default="Closure")
    ap.add_argument("--dry-run", action="store_true")
    args = ap.parse_args()
    projects = PROJECTS[PROJECTS.index(args.start):]
    profile = json.loads((ROOT / "config/round1-full854.json").read_text())
    initial_hash = implementation_hash()
    fingerprint = hashlib.sha256(json.dumps([profile, initial_hash], sort_keys=True).encode()).hexdigest()[:12]
    folder = ROOT / "GRT/Campaigns" / profile["profile"] / fingerprint
    inventory = expected_inventory(profile)
    print("Sequential GRT queue: " + " -> ".join(projects), flush=True)
    print("Terminal failures are retained. No automatic retry. Ctrl+C stops the queue.", flush=True)
    if args.dry_run: return 0
    events = folder / "project-completions.jsonl"
    for project in projects:
        if implementation_hash() != initial_hash or json.loads((ROOT / "config/round1-full854.json").read_text()) != profile:
            print("STOP: source/profile changed during queue.", flush=True); return 2
        if list((ROOT / "GRT/Campaigns").rglob(".running.lock")):
            print("STOP: an existing campaign lock was found. Do not run concurrently.", flush=True); return 2
        print("\n=== START " + project + " ===", flush=True)
        cmd = [sys.executable, str(ROOT / "scripts/run_full_round1.py"), "--tool", "grt", "--project", project, "--resume"]
        try:
            completed = subprocess.run(cmd, cwd=ROOT)
        except KeyboardInterrupt:
            print("Queue interrupted; no next project will start.", flush=True); return 130
        if completed.returncode not in (0, 1):
            print(f"STOP: {project} exited {completed.returncode}; inspect its error.", flush=True); return completed.returncode
        try:
            data = json.loads((folder / "projects" / project / "progress.json").read_text())
            counts = terminal_summary(data, project, inventory[project])
        except (OSError, ValueError, KeyError) as exc:
            print("STOP: cannot confirm completion: " + str(exc), flush=True); return 2
        event = dict(time=datetime.now(timezone.utc).isoformat(), project=project, bugs=len(inventory[project]), counts=counts, fingerprint=fingerprint)
        with events.open("a", encoding="utf-8") as stream: stream.write(json.dumps(event) + "\n")
        print("\a\n" + "=" * 65, flush=True)
        print(f"PROJECT FINISHED: {project} | {len(inventory[project])} bugs recorded | {counts}", flush=True)
        print("Finished includes recorded failures; it does not mean all evaluated successfully.", flush=True)
        print("=" * 65, flush=True)
    print("QUEUE FINISHED: all selected member-2 projects have terminal records. No member-3 projects were run.", flush=True)
    return 0

if __name__ == "__main__": raise SystemExit(main())
