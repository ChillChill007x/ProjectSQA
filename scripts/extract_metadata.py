#!/usr/bin/env python3
"""Export all active IDs and all modified classes/triggers from pinned Defects4J."""
import argparse
import csv
import io
from common import ROOT, WORK, config, dump, run
from run_benchmark import active_bugs

def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--project", choices=config()["projects"])
    args = ap.parse_args()
    for project in ([args.project] if args.project else config()["projects"]):
        active = set(active_bugs(project))
        fields = ["bug.id", "project.id", "revision.id.buggy", "revision.id.fixed", "report.id", "classes.modified", "tests.trigger", "tests.trigger.cause"]
        data = run(["defects4j", "query", "-p", project, "-q", ",".join(fields)],
                   log=WORK / "metadata" / f"{project}-query.json")
        rows = []
        for row in csv.reader(io.StringIO(data["stdout"])):
            if not row or row[0] not in active:
                continue
            if len(row) != len(fields):
                raise ValueError(f"Unexpected metadata columns for {project}: {len(row)}")
            rows.append(dict(zip(fields, row)))
        if {r["bug.id"] for r in rows} != active:
            raise ValueError(f"Query did not return every active bug in {project}")
        rows.sort(key=lambda r: int(r["bug.id"]))
        out = ROOT / "dataset/defects4j" / f"{project}_metadata_v2.json"
        dump(out, {"schema_version": 2, "project": project, "bugs": rows})
        print(f"{project}: {len(rows)} active bugs -> {out}")
    return 0

if __name__ == "__main__":
    raise SystemExit(main())
