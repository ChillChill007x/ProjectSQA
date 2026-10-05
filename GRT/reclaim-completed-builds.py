#!/usr/bin/env python3
"""Preview/remove rebuildable scratch for completed projects in the Linux work volume."""
import argparse
from datetime import datetime, timezone
import json
import os
from pathlib import Path
import shutil
import sys
ROOT = Path(__file__).resolve().parents[1]
WORK = Path("/workspace/work")
PROJECTS = ["Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv", "Gson", "JacksonCore"]

def ensure_idle():
    active = []
    for proc in Path("/proc").iterdir():
        if not proc.name.isdigit() or int(proc.name) == os.getpid(): continue
        try:
            args = (proc / "cmdline").read_bytes().decode(errors="replace").split("\0")
        except FileNotFoundError: continue
        except PermissionError: raise RuntimeError("Cannot inspect processes; stop and inspect container manually")
        if not args or not args[0]: continue
        if Path(args[0]).name in ("java", "javac", "ant", "mvn") or any(Path(a).name in ("run_full_round1.py", "run_benchmark.py", "run-remaining-projects.py", "defects4j") for a in args[:4]):
            active.append(proc.name + " " + " ".join(args[:3]))
    if active: raise RuntimeError("Runner/build still active. Stop it first:\n" + "\n".join(active))
    locks = list((ROOT / "GRT/Campaigns").rglob(".running.lock"))
    if locks: raise RuntimeError("Campaign lock remains. Do not delete it until the old runner/container is confirmed stopped: " + str(locks[0]))

def check_path(p):
    if p.is_symlink() or p.resolve() != p.absolute(): raise RuntimeError("Refusing symlink/redirected path: " + str(p))
    if not p.resolve().is_relative_to(WORK.resolve()): raise RuntimeError("Path outside work volume")
    if not (p / ".sqa-ready.json").is_file(): raise RuntimeError("Missing completed-build marker: " + str(p))

def size(p):
    total=0
    for folder, dirs, files in os.walk(p, followlinks=False):
        for name in files:
            f=Path(folder)/name
            if not f.is_symlink(): total+=f.stat().st_size
    return total

def main():
    ap=argparse.ArgumentParser(description=__doc__);ap.add_argument("--apply",action="store_true");args=ap.parse_args()
    if os.name != "posix" or not WORK.is_mount(): raise RuntimeError("Run this inside the fast-work Docker shell; /workspace/work must be its own volume mount")
    ensure_idle()
    reports=list((ROOT/"GRT/Campaigns").glob("*/*/projects/JacksonDatabind/progress.json"))
    base=max(reports,key=lambda p:p.stat().st_mtime).parents[2]
    eligible=[]
    for project in PROJECTS:
        report=base/"projects"/project/"progress.json"
        if not report.exists():continue
        d=json.loads(report.read_text())
        if not d.get("bugs") or any(b['status'] not in ('EVALUATED','FAILED','METADATA_ERROR') for b in d['bugs']):continue
        eligible.append(project)
    candidates=[]
    # Only complete checkout directories; logs in their parents remain intact.
    for project in eligible:
        for run in (WORK/"checkouts").glob(project+"-*"):
            for marker in run.glob("generation-fixed/.sqa-ready.json"):candidates.append(marker.parent)
            for marker in run.glob("evaluation-*/*/.sqa-ready.json"):candidates.append(marker.parent)
        for marker in (WORK/"metadata"/project).glob("*/fixed*/.sqa-ready.json"):candidates.append(marker.parent)
    plan=[]
    for p in sorted(set(candidates)):
        check_path(p);identity=json.loads((p/".sqa-ready.json").read_text())
        if identity.get("project") not in eligible:raise RuntimeError("Checkout project mismatch")
        plan.append({"path":str(p),"bytes":size(p)})
    total=sum(x['bytes'] for x in plan)
    print(f"Completed projects: {eligible}\nRebuildable directories: {len(plan)}; logical size: {total/1024**3:.2f} GiB",flush=True)
    print("Preserving all GRT evidence and all JacksonDatabind scratch. Host C free space may not rise; volume space can be reused.",flush=True)
    if not args.apply:
        print("Preview only. To execute: python3 GRT/reclaim-completed-builds.py --apply");return
    ensure_idle()
    audit=ROOT/"GRT/Performance"/("cleanup-"+datetime.now(timezone.utc).strftime("%Y%m%dT%H%M%SZ")+".json")
    audit.parent.mkdir(parents=True,exist_ok=True)
    record={"plan":plan,"removed":[],"note":"Scratch only; no experiment evidence deleted"}
    audit.write_text(json.dumps(record,indent=2))
    for item in plan:
        ensure_idle();p=Path(item['path']);check_path(p);shutil.rmtree(p)
        record['removed'].append(str(p));audit.write_text(json.dumps(record,indent=2))
    print(f"Done. Volume free: {shutil.disk_usage(WORK).free/1024**3:.2f} GiB. Audit: {audit}",flush=True)

if __name__=='__main__':
    try:main()
    except (OSError,ValueError,RuntimeError) as exc:print('STOP:',exc,file=sys.stderr);sys.exit(2)
