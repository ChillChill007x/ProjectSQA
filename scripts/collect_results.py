#!/usr/bin/env python3
"""Rebuild a merge-safe CSV from immutable per-run JSON, retaining failure statuses."""
import csv
import json
from pathlib import Path
from common import ROOT, FOLDERS, dump

def records():
    for folder in FOLDERS.values():
        for name in ("Result", "Result_Round1", "Result_Round2"):
            for path in sorted((ROOT / folder / name).rglob("result.json")):
                data = json.loads(path.read_text(encoding="utf-8"))
                if data.get("schema_version") == 2:
                    yield path, data

def rows():
    for path, data in records():
        unit=data["unit"]
        purpose="validation" if (path.parent/"validation-only.json").exists() else unit.get("purpose","experiment")
        superseded_path=path.parent/"coverage-superseded.json"
        superseded=json.loads(superseded_path.read_text(encoding="utf-8")).get("replacement") if superseded_path.exists() else None
        coverage=data.get("fixed",{}).get("coverage",{})
        review_path=path.parent/"fault-review.json"
        review=json.loads(review_path.read_text(encoding="utf-8")) if review_path.exists() else {}
        confirmed=review.get("confirmed") if review.get("test_sha256")==data.get("test_sha256") else None
        yield dict(run_id=data["run_id"],purpose=purpose,superseded_by=superseded,project=unit["project"],bug=unit["bug"],target=unit["target"],
                   tool=unit["tool"],round=unit["round"],seed=unit["seed"],budget_seconds=unit["budget_seconds"],
                   status=data["status"],generation_time_sec=data.get("generation_time_sec"),num_tests=data.get("num_tests"),
                   line_coverage_percent=coverage.get("line_coverage_percent"),branch_coverage_percent=coverage.get("branch_coverage_percent"),
                   fault_candidate=data.get("fault_candidate"),fault_confirmed=confirmed,
                   model_requested=unit.get("model"),result_path=path.relative_to(ROOT).as_posix())

def main():
    output=ROOT/"results/summary.csv"
    output.parent.mkdir(exist_ok=True)
    data=list(rows())
    if not data:
        print("No experiment results yet; no synthetic rows created.")
        return 0
    with output.open("w",encoding="utf-8",newline="") as f:
        writer=csv.DictWriter(f,fieldnames=list(data[0]))
        writer.writeheader();writer.writerows(data)
    print(f"{len(data)} runs -> {output}. Failed attempts remain visible; deduplicate attempts by unit before statistical analysis.")
    return 0

if __name__=="__main__":raise SystemExit(main())
