#!/usr/bin/env python3
"""Record a human review of a differential failure without changing raw evidence."""
import argparse
import json
from pathlib import Path
from common import ROOT, dump

def main():
    ap=argparse.ArgumentParser(description=__doc__)
    ap.add_argument("result",type=Path)
    ap.add_argument("--confirmed",choices=["yes","no"],required=True)
    ap.add_argument("--reviewer",required=True)
    ap.add_argument("--evidence",required=True,help="Explain the link to target defect and cite test/stack trace/patch")
    args=ap.parse_args()
    path=args.result.resolve()
    if ROOT not in path.parents:ap.error("Result must be inside this repository")
    data=json.loads(path.read_text(encoding="utf-8"))
    if data.get("status")!="EVALUATED" or not data.get("fault_candidate"):
        ap.error("Only evaluated fault candidates can be reviewed")
    if len(args.evidence.strip())<20 or not args.reviewer.strip():ap.error("Provide reviewer and meaningful evidence")
    from run_benchmark import artifact_hashes,utc
    if data["test_sha256"]!=artifact_hashes(ROOT/data["paths"]["tests"]):ap.error("Tests changed after evaluation")
    review=path.parent/"fault-review.json"
    if review.exists():ap.error("Review exists; preserve it and discuss revisions through Git review")
    dump(review,dict(confirmed=args.confirmed=="yes",reviewer=args.reviewer,evidence=args.evidence,
                     reviewed_at=utc(),test_sha256=data["test_sha256"]))
    print(review)

if __name__=="__main__":main()
