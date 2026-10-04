#!/usr/bin/env python3
"""Frozen 854-bug algorithm campaign. Default pass resumes unfinished work; retries are explicit."""
import argparse
from collections import Counter
import csv
import hashlib
import json
import os
from pathlib import Path
import sys

from common import ROOT, FOLDERS, StageError, config, dump
from run_benchmark import (active_bugs, artifact_hashes, implementation_hash, paths_for,
                           run_unit, targets_for, unit_id, utc)


def expected_inventory(profile):
    inventory = {}
    for project, ranges in profile["active_bug_ranges"].items():
        ids = []
        for item in ranges.split(","):
            ends = [int(x) for x in item.split("-")]
            ids.extend(range(ends[0], ends[-1] + 1))
        if len(ids) != len(set(ids)) or any(i < 1 for i in ids):
            raise ValueError(f"Invalid inventory for {project}")
        inventory[project] = [str(i) for i in sorted(ids)]
    if sum(map(len, inventory.values())) != profile["expected_bugs"]:
        raise ValueError("Profile inventory does not total expected_bugs")
    return inventory


def prepare(profile, tool, folder, implementation, project=None):
    expected = expected_inventory(profile)
    actual = {project: active_bugs(project) for project in expected}
    if actual != expected:
        differences = {p: {"missing": sorted(set(expected[p]) - set(actual[p]), key=int),
                           "unexpected": sorted(set(actual[p]) - set(expected[p]), key=int)}
                       for p in expected if expected[p] != actual[p]}
        dump(folder / "inventory-mismatch.json", differences)
        raise StageError("INVENTORY_MISMATCH", f"Installed active bug IDs differ from the 854-bug profile: {differences}")
    manifest = {"profile": profile, "tool": tool, "implementation_sha256": implementation,
                "dependencies": json.loads((ROOT / "config/dependencies.lock.json").read_text(encoding="utf-8")),
                "bugs": [{"project": p, "bug": b} for p, bids in actual.items() for b in bids
                         if project is None or p == project]}
    if project is not None:
        manifest["selected_project"] = project
    path = folder / "manifest.json"
    if path.exists() and json.loads(path.read_text(encoding="utf-8")) != manifest:
        raise StageError("MANIFEST_MISMATCH", "Existing manifest differs; do not mix campaigns")
    dump(path, manifest)
    return manifest


def make_unit(manifest, entry, target):
    profile = manifest["profile"]
    unit = dict(project=entry["project"], bug=entry["bug"], target=target, tool=manifest["tool"],
                round=profile["round"], seed=profile["seed"], budget_seconds=profile["budget_seconds"],
                generation_revision="f", protocol_version=config()["protocol_version"],
                implementation_sha256=manifest["implementation_sha256"], ai_mode=None,
                purpose="experiment", model=None, campaign=profile["profile"])
    if manifest["tool"] == "grt":
        unit["grt_overrides"] = profile["grt_overrides"]
    return unit


def inspect_unit(unit):
    base = unit_id(unit)
    parent = paths_for(unit["tool"], unit["project"], unit["bug"], unit["round"], base)["result"].parent
    attempts = []
    for path in sorted(parent.glob(base + "*/result.json")):
        try:
            row = json.loads(path.read_text(encoding="utf-8"))
            if row["unit"] != unit:
                continue
            status = row["status"]
            if status == "EVALUATED":
                tests = ROOT / row["paths"]["tests"]
                valid = (row.get("test_sha256") and row["test_sha256"] == artifact_hashes(tests)
                         and not (path.parent / "validation-only.json").exists()
                         and not (path.parent / "coverage-superseded.json").exists())
                if not valid:
                    status = "ARTIFACT_INVALID"
            attempts.append({"status": status, "result_path": path.relative_to(ROOT).as_posix(),
                             "started_at": row.get("started_at", ""), "error": row.get("error")})
        except (OSError, ValueError, KeyError) as exc:
            attempts.append({"status": "RESULT_INVALID", "result_path": path.relative_to(ROOT).as_posix(),
                             "started_at": "", "error": str(exc)})
    evaluated = [r for r in attempts if r["status"] == "EVALUATED"]
    if evaluated:
        # Operational completion only, not a statistical choice of the best attempt.
        return min(evaluated, key=lambda r: r["started_at"])
    if attempts:
        return max(attempts, key=lambda r: r["started_at"])
    return {"status": "NOT_RUN"}


def refresh(manifest, entries):
    for entry in entries:
        if not entry.get("targets"):
            continue
        entry["units"] = {t: inspect_unit(make_unit(manifest, entry, t)) for t in entry["targets"]}
        statuses = [u["status"] for u in entry["units"].values()]
        if all(s == "EVALUATED" for s in statuses):
            entry["status"] = "EVALUATED"
        elif "RUNNING" in statuses:
            entry["status"] = "RUNNING"
        elif "NOT_RUN" in statuses:
            entry["status"] = "NOT_RUN" if all(s == "NOT_RUN" for s in statuses) else "PARTIAL"
        else:
            entry["status"] = "FAILED"


def save_summary(manifest, entries, folder):
    counts = dict(Counter(e["status"] for e in entries))
    data = {"updated_at": utc(), "expected_bugs": len(manifest["bugs"]),
            "inventory_total_bugs": manifest["profile"]["expected_bugs"],
            "bug_counts": counts, "bugs": entries,
            "note": "EVALUATED requires every target and matching Java checksums. RUNNING may be interrupted. Failures are not detected faults."}
    dump(folder / "progress.json", data)
    with (folder / "bugs.csv").open("w", newline="", encoding="utf-8") as stream:
        writer = csv.DictWriter(stream, fieldnames=["project", "bug", "status", "targets", "evaluated_targets", "error"])
        writer.writeheader()
        for e in entries:
            writer.writerow({"project": e["project"], "bug": e["bug"], "status": e["status"],
                             "targets": len(e.get("targets", [])),
                             "evaluated_targets": sum(u["status"] == "EVALUATED" for u in e.get("units", {}).values()),
                             "error": e.get("error", "")})
    print(f"{manifest['tool']}: {counts} / {len(entries)} bugs; {folder}", flush=True)
    return counts


def execute(manifest, entries, folder, retry_failed=False):
    refresh(manifest, entries)
    for entry in entries:
        if entry["status"] == "EVALUATED":
            continue
        if retry_failed and entry["status"] == "NOT_RUN":
            continue
        if not retry_failed and entry["status"] in ("FAILED", "METADATA_ERROR"):
            continue
        retry_metadata = entry["status"] == "METADATA_ERROR"
        try:
            if not entry.get("targets"):
                entry["targets"] = list(dict.fromkeys(targets_for(entry["project"], entry["bug"])))
                if not entry["targets"]:
                    raise StageError("METADATA_ERROR", "No modified targets")
                entry.pop("error", None)
        except (StageError, OSError, ValueError) as exc:
            entry.update(status="METADATA_ERROR", error=str(exc))
            save_summary(manifest, entries, folder)
            continue
        # Save discovered targets before any generation, so interrupted runs can be audited.
        refresh(manifest, [entry])
        save_summary(manifest, entries, folder)
        for target in entry["targets"]:
            unit = make_unit(manifest, entry, target)
            status = inspect_unit(unit)["status"]
            if status == "EVALUATED":
                continue
            if retry_failed and status == "NOT_RUN" and not retry_metadata:
                continue
            if not retry_failed and status not in ("NOT_RUN", "RUNNING"):
                continue
            try:
                run_unit(unit, resume=True)
            except (StageError, OSError, ValueError) as exc:
                # Covers failures before run_unit's own try block, e.g. directory creation.
                entry["error"] = str(exc)
                save_summary(manifest, entries, folder)
                raise StageError("CAMPAIGN_IO_ERROR", str(exc)) from exc
            refresh(manifest, [entry])
            save_summary(manifest, entries, folder)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--tool", required=True, choices=["evosuite", "grt"])
    ap.add_argument("--project", choices=config()["projects"], help="Run only this project; store separate project progress")
    actions = ap.add_mutually_exclusive_group()
    actions.add_argument("--prepare", action="store_true", help="Validate all IDs; do not generate tests")
    actions.add_argument("--status", action="store_true", help="Refresh checksums and bug-level summary; no generation")
    actions.add_argument("--retry-failed", action="store_true", help="One retry pass over failures/interrupted units")
    actions.add_argument("--resume", action="store_true", help="Default: unfinished work, leaving terminal failures for retry pass")
    actions.add_argument("--smoke", action="store_true", help="Validate Lang-1 with this profile; excluded from campaign results")
    args = ap.parse_args(argv)
    if args.project and args.smoke:
        ap.error("--smoke validates Lang-1; omit --project")
    profile = json.loads((ROOT / "config/round1-full854.json").read_text(encoding="utf-8"))
    implementation = implementation_hash()
    fingerprint = hashlib.sha256(json.dumps([profile, implementation], sort_keys=True).encode()).hexdigest()[:12]
    folder = ROOT / FOLDERS[args.tool] / "Campaigns" / profile["profile"] / fingerprint
    if args.project:
        folder = folder / "projects" / args.project
    folder.mkdir(parents=True, exist_ok=True)
    lock = folder / ".running.lock"
    try:
        fd = os.open(lock, os.O_CREAT | os.O_EXCL | os.O_WRONLY)
    except FileExistsError:
        print(f"Campaign is locked: {lock}. Stop the other runner first; remove a stale lock only after verifying it stopped.", file=sys.stderr)
        return 2
    os.close(fd)
    try:
        if args.smoke:
            manifest = {"profile": profile, "tool": args.tool, "implementation_sha256": implementation}
            ok = True
            for target in targets_for("Lang", "1"):
                unit = make_unit(manifest, {"project": "Lang", "bug": "1"}, target)
                unit["purpose"] = "validation"
                ok = run_unit(unit, resume=True) and ok
            return 0 if ok else 1
        if args.status:
            manifest = json.loads((folder / "manifest.json").read_text(encoding="utf-8"))
        else:
            manifest = prepare(profile, args.tool, folder, implementation, args.project)
        progress = folder / "progress.json"
        entries = (json.loads(progress.read_text(encoding="utf-8"))["bugs"] if progress.exists()
                   else [dict(b, status="NOT_RUN") for b in manifest["bugs"]])
        if [(e["project"], e["bug"]) for e in entries] != [(e["project"], e["bug"]) for e in manifest["bugs"]]:
            raise StageError("PROGRESS_MISMATCH", "Progress entries do not match the frozen manifest")
        refresh(manifest, entries)
        save_summary(manifest, entries, folder)
        if not (args.prepare or args.status):
            try:
                execute(manifest, entries, folder, args.retry_failed)
            finally:
                refresh(manifest, entries)
                save_summary(manifest, entries, folder)
        complete = all(e["status"] == "EVALUATED" for e in entries)
        return 0 if args.prepare or complete else 1
    except KeyboardInterrupt:
        print("Interrupted. Rerun with --resume; existing attempts are retained.", file=sys.stderr)
        return 130
    except (StageError, OSError, ValueError, KeyError) as exc:
        print(f"Cannot run campaign: {exc}", file=sys.stderr)
        return 2
    finally:
        lock.unlink(missing_ok=True)


if __name__ == "__main__":
    raise SystemExit(main())
