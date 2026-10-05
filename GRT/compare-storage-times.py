"""Read-only timing summary for the latest project campaign."""
import argparse
import json
from pathlib import Path
ROOT=Path(__file__).resolve().parents[1]
ap=argparse.ArgumentParser()
ap.add_argument("--project", default="Chart")
args=ap.parse_args()
reports=list((ROOT/"GRT/Campaigns").glob("*/*/projects/"+args.project+"/manifest.json"))
if not reports: raise SystemExit("No project manifest found")
manifest=json.loads(max(reports,key=lambda p:p.stat().st_mtime).read_text())
print("Bug | status | checkout s | project compile s | generation s | logged total s | started UTC")
for path in sorted((ROOT/"GRT/Result_Round1"/args.project).glob("*/*/result.json")):
    try:
        row=json.loads(path.read_text()); unit=row["unit"]
        if unit.get("implementation_sha256")!=manifest["implementation_sha256"] or unit.get("campaign")!=manifest["profile"]["profile"] or unit.get("purpose")!="experiment": continue
        totals=dict(checkout=0,compile=0,generation=0,total=0)
        for log in path.parent.rglob("*.json"):
            try: data=json.loads(log.read_text())
            except (OSError, ValueError): continue
            if not isinstance(data,dict) or "elapsed_sec" not in data:continue
            seconds=data["elapsed_sec"];totals["total"]+=seconds
            if log.name.startswith("checkout-"):totals["checkout"]+=seconds
            elif log.name.startswith("compile-project-"):totals["compile"]+=seconds
            elif log.name=="generation-process.json":totals["generation"]+=seconds
        print(unit["bug"],row["status"],*[round(totals[k],1) for k in ["checkout","compile","generation","total"]],row["started_at"],sep=" | ")
    except (OSError, ValueError, KeyError) as exc:print("Read warning:",path,exc)
print("Includes incomplete attempts; excludes metadata preparation outside each result. Different bugs are not a controlled speed comparison.")
