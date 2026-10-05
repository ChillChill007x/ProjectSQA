#!/usr/bin/env python3
"""Read-only GRT progress monitor. Kept outside scripts/ to preserve the experiment hash."""
import argparse
from collections import Counter
from datetime import datetime, timezone
import json
import os
from pathlib import Path
import shutil
import sys
import time
sys.dont_write_bytecode = True
ROOT = Path(__file__).resolve().parents[1]
sys.path.insert(0, str(ROOT / "scripts"))
from run_full_round1 import refresh

MEMBER2 = ["Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv", "Gson", "JacksonCore", "JacksonDatabind"]

def read(path):
    return json.loads(path.read_text(encoding="utf-8"))

def snapshot(project):
    profile = read(ROOT / "config/round1-full854.json")
    campaign_root = ROOT / "GRT/Campaigns" / profile["profile"]
    candidates = []
    for progress_path in campaign_root.glob("*/projects/" + project + "/progress.json"):
        candidates.append((progress_path.stat().st_mtime, progress_path.parents[2]))
    if not candidates:
        for progress_path in campaign_root.glob("*/progress.json"):
            candidates.append((progress_path.stat().st_mtime, progress_path.parent))
    if not candidates:
        return "No campaign reports found yet. Start --prepare first."
    base = max(candidates, key=lambda x: x[0])[1]
    fingerprint = base.name
    folders = [base] + [base / "projects" / p for p in profile["active_bug_ranges"]]
    entries = {}; sources = {}; warnings = []
    for folder in folders:
        if not (folder / "progress.json").exists():
            continue
        try:
            manifest = read(folder / "manifest.json")
            progress = read(folder / "progress.json")
            bugs = progress["bugs"]
            refresh(manifest, bugs)  # only reads records/checksums; never saves or locks
            for bug in bugs:
                key = (bug["project"], str(bug["bug"]))
                entries[key] = bug
                sources[key] = (folder, progress["updated_at"])
        except (OSError, ValueError, KeyError) as exc:
            warnings.append(str(exc))
    lines = ["GRT LIVE PROGRESS (read-only)", datetime.now().astimezone().strftime("%Y-%m-%d %H:%M:%S %Z"),
             "Round1 | seed 101 | 30s/target | fingerprint " + fingerprint, ""]
    ranges = profile["active_bug_ranges"][project]
    total = sum(int(x.split("-")[-1])-int(x.split("-")[0])+1 for x in ranges.split(","))
    chosen = [b for (p, _), b in entries.items() if p == project]
    counts = Counter(b["status"] for b in chosen)
    counts["NOT_RUN"] += total - len(chosen)
    done = sum(counts[s] for s in ("EVALUATED", "FAILED", "METADATA_ERROR"))
    lines += [f"PROJECT {project}: evaluated {counts['EVALUATED']}/{total} ({100*counts['EVALUATED']/total:.1f}%)",
              f"Finished attempts at bug level: {done}/{total} ({100*done/total:.1f}%) - includes failures",
              " | ".join(f"{s}: {counts[s]}" for s in ("EVALUATED", "FAILED", "METADATA_ERROR", "RUNNING", "PARTIAL", "NOT_RUN"))]
    assigned = [b for (p, _), b in entries.items() if p in MEMBER2]
    passed = sum(b["status"] == "EVALUATED" for b in assigned)
    finished = sum(b["status"] in ("EVALUATED", "FAILED", "METADATA_ERROR") for b in assigned)
    lines += [f"YOUR 502 BUGS (this machine/displayed fingerprint): evaluated {passed}/502; finished {finished}/502", ""]
    project_folder = base / "projects" / project
    relevant = {src[0] for key, src in sources.items() if key[0] == project}
    if not relevant: relevant = {project_folder}
    locked = any((f / ".running.lock").exists() for f in relevant)
    lines.append("Runner lock: " + ("present (may be stale; not proof of a live process)" if locked else "absent (no runner lock found)"))
    timestamps = [src[1] for key, src in sources.items() if key[0] == project]
    if timestamps: lines.append("Last saved summary UTC: " + max(timestamps))
    active = []
    for bug in chosen:
        for target, unit in bug.get("units", {}).items():
            if unit["status"] != "RUNNING": continue
            path = ROOT / unit["result_path"]
            record = read(path)
            start = datetime.fromisoformat(record["started_at"])
            elapsed = (datetime.now(timezone.utc) - start).total_seconds()
            active.append(f"RUNNING record: {project}-{bug['bug']} | {target} | elapsed {elapsed/60:.1f} min")
            logs = list(path.parent.rglob("*.json"))
            if logs:
                newest = max(logs, key=lambda p: p.stat().st_mtime)
                age = time.time()-newest.stat().st_mtime
                active.append(f"Latest artifact ({age:.0f}s ago): {newest.relative_to(ROOT)}")
    lines += active or ["No RUNNING unit record yet. Metadata checkout/build may be in progress if locked."]
    lines += ["Latest artifact is completed evidence, not an exact live process stage.",
              f"Free space on repo drive: {shutil.disk_usage(ROOT).free/1024**3:.1f} GiB",
              "Showing the most recently updated project campaign; other fingerprints excluded. No ETA until there is enough completed data.",
              "Ctrl+C stops this monitor only; it does not stop the benchmark."]
    lines += ["Read warning: " + w for w in warnings]
    return "\n".join(lines)

def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--project", default="Chart", choices=list(read(ROOT / "config/round1-full854.json")["active_bug_ranges"]))
    ap.add_argument("--interval", type=float, default=10)
    ap.add_argument("--once", action="store_true")
    args = ap.parse_args()
    if args.interval < 2: ap.error("interval must be at least 2 seconds")
    try:
        while True:
            try: output = snapshot(args.project)
            except (OSError, ValueError, KeyError) as exc: output = "Snapshot temporarily unavailable: " + str(exc)
            if sys.stdout.isatty() and not args.once: os.system("cls" if os.name == "nt" else "clear")
            print(output, flush=True)
            if args.once: break
            time.sleep(args.interval)
    except KeyboardInterrupt:
        print("Monitor stopped. Benchmark was not stopped.")

if __name__ == "__main__": main()
