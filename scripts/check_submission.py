#!/usr/bin/env python3
"""Check repository result structure and integrity before committing experiment evidence."""
import argparse
import json
from common import ROOT, FOLDERS, sha
from collect_results import records

def suite_hashes(folder):
    return {p.resolve().relative_to(ROOT).as_posix(): sha(p) for p in sorted(folder.rglob("*.java"))}

def main():
    ap=argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--tool",choices=FOLDERS)
    args=ap.parse_args()
    failures=[];count=0
    for path,data in records():
        if args.tool and data["unit"]["tool"]!=args.tool:continue
        count+=1
        for key in ("tests","result","config"):
            dest=(ROOT/data["paths"][key]).resolve()
            if ROOT not in dest.parents or not dest.is_dir():failures.append(f"{path}: missing/invalid {key}")
        if data["status"]=="EVALUATED":
            tests=(ROOT/data["paths"]["tests"]).resolve()
            if ROOT in tests.parents and tests.is_dir() and suite_hashes(tests)!=data.get("test_sha256",{}):
                failures.append(f"{path}: test suite differs from evaluated suite (added, removed, or changed files)")
            for name,digest in data.get("test_sha256",{}).items():
                f=(ROOT/name).resolve()
                if ROOT not in f.parents or not f.exists() or sha(f)!=digest:failures.append(f"{path}: test changed since evaluation: {name}")
            if not data.get("test_sha256") or data.get("num_tests",0)<1:failures.append(f"{path}: no test evidence")
            for revision in ("fixed","buggy"):
                if revision not in data:failures.append(f"{path}: missing {revision} evaluation")
        elif data["status"]=="AWAITING_AI":
            print(f"PENDING (not a completed experiment): {path}")
        else:
            print(f"Recorded failure retained: {data['status']} {path}")
    if failures:
        print("\n".join(failures));return 1
    print(f"Submission structure checked: {count} runs. No claims made about unrun experiments.")
    return 0

if __name__=="__main__":raise SystemExit(main())
