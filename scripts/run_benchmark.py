#!/usr/bin/env python3
"""One protocol and artifact layout for MOSA, GRT, Claude Code and Codex."""
from __future__ import annotations
import argparse
import hashlib
import json
import os
from pathlib import Path
import re
import shutil
import sys
from datetime import datetime, timezone
from common import ROOT, WORK, TOOLS, FOLDERS, StageError, build_support, config, dump, java, relative, run, sha, support_cp
from evaluator import checkout, classpath, compare, evaluate_revision, export, validate_reference

def utc():
    return datetime.now(timezone.utc).isoformat()

def implementation_hash():
    files = sorted((ROOT / "scripts").glob("*.py")) + sorted((ROOT / "scripts/java").glob("*.java")) + sorted((ROOT / "GRT/Code/src").rglob("*.java"))
    files += [ROOT / "config/benchmark.json", ROOT / "config/dependencies.lock.json", ROOT / "prompts/ai-test-generation-prompt.md"]
    return hashlib.sha256("".join(sha(f) for f in files if f.exists()).encode()).hexdigest()

def active_bugs(project):
    r = run(["defects4j", "bids", "-p", project], log=WORK / "metadata" / f"{project}-bids.json")
    bids = [line.strip() for line in r["stdout"].splitlines() if line.strip()]
    if not bids or any(not b.isdigit() for b in bids):
        raise StageError("METADATA_ERROR", f"Invalid active bug list: {project}")
    return sorted(bids, key=int)

def targets_for(project, bug):
    # Metadata checkouts are isolated from each tool's experiment checkouts.
    base = WORK / "metadata" / project / str(bug)
    dest = base / "fixed"
    attempt = 1
    while dest.exists() and not (dest / ".sqa-ready.json").exists():
        attempt += 1
        dest = base / f"fixed-attempt{attempt}"
    work = checkout(project, bug, "f", dest, base)
    targets = export(work, "classes.modified", base).splitlines()
    if not targets or any(not re.fullmatch(r"[\w.$]+", t) for t in targets):
        raise StageError("METADATA_ERROR", "Invalid classes.modified")
    return targets

def unit_id(unit):
    fingerprint = hashlib.sha256(json.dumps(unit, sort_keys=True).encode()).hexdigest()[:12]
    return f"{unit['project']}-{unit['bug']}-{unit['round']}-s{unit['seed']}-{fingerprint}"

def paths_for(tool, project, bug, round_name, identifier):
    folder = ROOT / FOLDERS[tool]
    ai = tool in ("claude_code", "codex")
    return {
        "result": folder / ("Result" if ai else "Result_" + round_name) / project / str(bug) / identifier,
        "tests": folder / ("TestCode" if ai else "Test") / project / str(bug) / identifier,
        "config": folder / ("Prompt" if ai else "Configuration") / project / str(bug) / identifier,
    }

def generate_algorithm(unit, work, tests, logs):
    cp, bin_dir = classpath(work, logs, test=False)
    environment = None
    if unit["tool"] == "evosuite":
        if not os.environ.get("JAVA8_HOME"):
            raise StageError("ENVIRONMENT_ERROR", "JAVA8_HOME must point to the pinned Java 8; child JVMs must use Java 8 too")
        environment = {"JAVA_HOME": os.environ["JAVA8_HOME"], "PATH": str(Path(os.environ["JAVA8_HOME"]) / "bin") + os.pathsep + os.environ.get("PATH", "")}
        cmd = [java("JAVA8_HOME"), "-jar", TOOLS / "evosuite-1.2.0.jar", "-generateMOSuite",
               "-Dalgorithm=MOSA", "-criterion", "BRANCH", "-class", unit["target"], "-projectCP", cp,
               "-seed", str(unit["seed"]), f"-Dsearch_budget={unit['budget_seconds']}",
               f"-Dtest_dir={tests}", f"-Dreport_dir={logs / 'evosuite-report'}",
               "-Dassertion_strategy=ALL", "-Djunit_check=true"]
    else:
        build_support()
        grt_config = dict(config()["grt"], seed=unit["seed"], target=unit["target"],
                          output=str(tests), class_root=str(bin_dir), budget_seconds=unit["budget_seconds"])
        cfg_path = logs / "grt-config.json"
        dump(cfg_path, grt_config)
        cmd = [java(), f"-javaagent:{TOOLS / 'jacocoagent.jar'}=output=none,includes={unit['target']}*",
               "-cp", os.pathsep.join([str(bin_dir), support_cp(), cp]), "sqa.grt.GuidedRandom", cfg_path]
    return run(cmd, cwd=work, log=logs / "generation-process.json", timeout=unit["budget_seconds"] + 120, env=environment)["elapsed_sec"]

def artifact_hashes(tests):
    return {relative(p): sha(p) for p in sorted(tests.rglob("*.java"))}

def evaluate_record(record, result_dir):
    unit = record["unit"]
    tests = ROOT / record["paths"]["tests"]
    if unit["tool"] in ("claude_code", "codex"):
        provenance_path = ROOT / record["paths"]["config"] / "provenance.json"
        provenance = json.loads(provenance_path.read_text(encoding="utf-8"))
        model_evidence = provenance.get("model_reported") or (provenance.get("mode") == "cli" and provenance.get("model_identity_basis") == "explicit_cli_argument")
        if not model_evidence or not isinstance(provenance.get("generation_time_sec"), (int, float)) or provenance["generation_time_sec"] < 0:
            raise StageError("PROVENANCE_MISSING", "Fill actual model_reported and generation_time_sec in provenance.json before evaluation")
        record["ai_provenance"] = provenance
        record["generation_time_sec"] = provenance["generation_time_sec"]
    hashes = artifact_hashes(tests)
    if not hashes:
        raise StageError("NO_TESTS", f"Add generated .java files to {tests}")
    record["test_sha256"] = hashes
    # New evaluation folder preserves earlier failed evidence and class files cannot leak between attempts.
    eval_n = 1
    while (result_dir / f"evaluation-{eval_n}").exists():
        eval_n += 1
    evaluation = result_dir / f"evaluation-{eval_n}"
    scratch = WORK / "checkouts" / record["run_id"] / f"evaluation-{eval_n}"
    fixed = checkout(unit["project"], unit["bug"], "f", scratch / "fixed", evaluation / "fixed")
    buggy = checkout(unit["project"], unit["bug"], "b", scratch / "buggy", evaluation / "buggy")
    record["reference_validation"] = validate_reference(fixed, buggy, evaluation / "baseline")
    f_result = evaluate_revision(fixed, tests, evaluation / "fixed", unit["target"])
    b_result = evaluate_revision(buggy, tests, evaluation / "buggy", unit["target"])
    record.update(compare(f_result, b_result))
    record["evaluation_path"] = relative(evaluation)
    record["finished_at"] = utc()
    dump(result_dir / "result.json", record)
    return record

def run_unit(unit, resume=False, ai_mode="manual", acknowledge=False):
    base_id = unit_id(unit)
    paths = paths_for(unit["tool"], unit["project"], unit["bug"], unit["round"], base_id)
    if resume and paths["result"].parent.exists():
        for prior in sorted(paths["result"].parent.glob(base_id + "*/result.json")):
            saved = json.loads(prior.read_text(encoding="utf-8"))
            tests = ROOT / saved["paths"]["tests"]
            if saved.get("status") == "EVALUATED" and saved["unit"] == unit and saved.get("test_sha256") == artifact_hashes(tests):
                print(f"SKIP evaluated {saved['run_id']}")
                return True
            if saved.get("status") == "AWAITING_AI" and ai_mode == "manual":
                print(f"AWAITING_AI {prior}; evaluate with --evaluate-run <result.json>")
                return True
    attempt = 1
    identifier = base_id
    while paths["result"].exists():
        attempt += 1
        identifier = f"{base_id}-attempt{attempt}"
        paths = paths_for(unit["tool"], unit["project"], unit["bug"], unit["round"], identifier)
    # Exclusive creation also prevents concurrent runs from silently sharing the same result directory.
    paths["result"].mkdir(parents=True, exist_ok=False)
    for key in ("tests", "config"):
        paths[key].mkdir(parents=True, exist_ok=False)
    record = {"schema_version": 2, "run_id": identifier, "unit": unit, "status": "RUNNING",
              "started_at": utc(), "paths": {k: relative(v) for k, v in paths.items()}}
    dump(paths["result"] / "result.json", record)
    dump(paths["config"] / "run-config.json", unit)
    work = WORK / "checkouts" / identifier / "generation-fixed"
    try:
        checkout(unit["project"], unit["bug"], "f", work, paths["result"] / "generation")
        if unit["tool"] in ("claude_code", "codex"):
            from ai_generate import prepare, generate_cli
            context = prepare(unit, work, paths)
            if ai_mode == "manual":
                record["status"] = "AWAITING_AI"
                record["generation_context"] = relative(context)
                dump(paths["result"] / "result.json", record)
                print(f"Prepared AI task: {context}\nSave Java files in {paths['tests']}\nEvaluate: python3 scripts/run_benchmark.py --evaluate-run {relative(paths['result'] / 'result.json')}")
                return True
            if not acknowledge:
                raise StageError("AUTH_REQUIRED", "Automatic AI calls require --allow-ai-calls and an authenticated CLI")
            record["generation_time_sec"] = generate_cli(unit, work, paths, context)
        else:
            record["generation_time_sec"] = generate_algorithm(unit, work, paths["tests"], paths["result"] / "generation")
        if unit["tool"] == "grt" and (paths["tests"] / "generation.json").exists():
            shutil.copy2(paths["tests"] / "generation.json", paths["result"] / "generation/grt.json")
        evaluate_record(record, paths["result"])
        print(f"EVALUATED {identifier}; fault_candidate={record['fault_candidate']}")
        return True
    except (StageError, OSError, ValueError) as exc:
        record.update(status=getattr(exc, "status", "TOOL_ERROR"), error=str(exc), finished_at=utc())
        dump(paths["result"] / "result.json", record)
        print(f"{record['status']} {identifier}: {exc}", file=sys.stderr)
        return False

def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--tool", choices=FOLDERS)
    ap.add_argument("--project", choices=config()["projects"])
    ap.add_argument("--bug", type=int)
    ap.add_argument("--sample-17", action="store_true")
    ap.add_argument("--all-bugs", action="store_true")
    ap.add_argument("--round", choices=["Round1", "Round2"], default="Round1")
    ap.add_argument("--seed", type=int, help="One seed; default all three protocol seeds")
    ap.add_argument("--resume", action="store_true")
    ap.add_argument("--purpose", choices=["experiment", "validation"], default="experiment")
    ap.add_argument("--ai-mode", choices=["manual", "cli"], default="manual")
    ap.add_argument("--allow-ai-calls", action="store_true")
    ap.add_argument("--evaluate-run", type=Path, help="result.json of a prepared AI task")
    args = ap.parse_args(argv)
    if args.evaluate_run:
        path = args.evaluate_run.resolve()
        if ROOT not in path.parents:
            ap.error("result.json must be inside this repository")
        record = json.loads(path.read_text(encoding="utf-8"))
        if record.get("status") == "EVALUATED":
            ap.error("This run is already evaluated; create a new run to change its tests")
        try:
            evaluate_record(record, path.parent)
        except StageError as exc:
            record.update(status=exc.status, error=str(exc), finished_at=utc())
            dump(path, record)
            print(str(exc), file=sys.stderr)
            return 1
        return 0
    if not args.tool:
        ap.error("--tool is required")
    if sum([bool(args.project and args.bug), args.sample_17, args.all_bugs]) != 1 or bool(args.project) != bool(args.bug):
        ap.error("Choose --project X --bug N, --sample-17, or --all-bugs")
    if args.bug is not None and args.bug < 1:
        ap.error("bug must be positive")
    cfg = config()
    ok = True
    for project in ([args.project] if args.project else cfg["projects"]):
        try:
            bids = active_bugs(project)
            if args.bug:
                if str(args.bug) not in bids:
                    raise StageError("METADATA_ERROR", "Bug is not active")
                bids = [str(args.bug)]
            elif args.sample_17:
                bids = bids[:1]
            for bug in bids:
                for target in targets_for(project, bug):
                    for seed in ([args.seed] if args.seed is not None else cfg["seeds"]):
                        unit = {"project": project, "bug": bug, "target": target, "tool": args.tool,
                                "round": args.round, "seed": seed, "budget_seconds": cfg["budgets_seconds"][args.round],
                                "generation_revision": "f", "protocol_version": cfg["protocol_version"],
                                "implementation_sha256": implementation_hash(), "ai_mode": args.ai_mode if args.tool in cfg["models"] else None,
                                "purpose": args.purpose,
                                "model": cfg["models"].get(args.tool)}
                        ok = run_unit(unit, args.resume, args.ai_mode, args.allow_ai_calls) and ok
        except StageError as exc:
            print(f"{project}: {exc}", file=sys.stderr)
            ok = False
    return 0 if ok else 1

if __name__ == "__main__":
    raise SystemExit(main())
