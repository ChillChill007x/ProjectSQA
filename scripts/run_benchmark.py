#!/usr/bin/env python3
"""
run_benchmark.py
=========================================================
Universal Benchmark Runner — MOSA (EvoSuite) และ GRT บน Defects4J
รองรับ 3 โหมด:
  --project X --bug N     รันเดี่ยวเฉพาะบั๊กเดียว
  --sample-17             รันตัวแทนโปรเจกต์ละ 1 บั๊ก (17 บั๊ก)
  --all-bugs              รันทุก active bug ใน Defects4J ทั้งหมด
เพิ่ม --resume เพื่อรันต่อจากจุดที่ค้างไว้ (อ่านจาก progress.json)

ตัวอย่างการใช้:
  python3 run_benchmark.py --project Lang --bug 1 --tool evosuite
  python3 run_benchmark.py --sample-17 --tool grt
  python3 run_benchmark.py --all-bugs --tool evosuite --resume
=========================================================
"""

import argparse
import csv
import json
import subprocess
import sys
import time
from datetime import datetime
from pathlib import Path

# ---------- Config: ปรับ path ให้ตรงกับเครื่องของคุณถ้าไม่ได้รันใน Docker ----------
BASE_DIR = Path.home() / "sqa-benchmark"
CHECKOUT_DIR = BASE_DIR / "checkouts"
RESULT_DIR = BASE_DIR / "results"
LOG_DIR = BASE_DIR / "logs"
PROGRESS_FILE = BASE_DIR / "progress.json"

# EvoSuite jar ที่ Defects4J init.sh ดาวน์โหลดไว้ให้อัตโนมัติ
EVOSUITE_JAR_GLOB = "/opt/defects4j/framework/lib/test_generation/generation/evosuite*.jar"
# GRT jar ที่ทีมต้องหามาวางเอง (mount เข้า container ที่ path นี้)
GRT_JAR_PATH = Path("/opt/tools/grt/grt.jar")

ALL_PROJECTS = [
    "Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv",
    "Gson", "JacksonCore", "JacksonDatabind", "JacksonXml", "Jsoup",
    "JxPath", "Lang", "Math", "Mockito", "Time",
]

TOOL_TO_REPO_FOLDER = {
    "evosuite": "MOSA_EvoSuite",
    "grt": "GRT",
}

for d in (CHECKOUT_DIR, RESULT_DIR, LOG_DIR):
    d.mkdir(parents=True, exist_ok=True)


# ---------- Progress tracking (สำหรับ --resume) ----------
def load_progress():
    if PROGRESS_FILE.exists():
        with open(PROGRESS_FILE, "r", encoding="utf-8") as f:
            return json.load(f)
    return {"completed": [], "failed": []}


def save_progress(progress):
    with open(PROGRESS_FILE, "w", encoding="utf-8") as f:
        json.dump(progress, f, indent=2, ensure_ascii=False)


def already_done(progress, task_id):
    return task_id in progress["completed"] or task_id in progress["failed"]


# ---------- Defects4J helpers ----------
def get_bug_ids(project):
    """ดึงรายชื่อ active bug id ทั้งหมดของ project"""
    result = subprocess.run(
        ["defects4j", "bids", "-p", project],
        capture_output=True, text=True,
    )
    if result.returncode != 0:
        print(f"[WARN] defects4j bids ล้มเหลวสำหรับ {project}: {result.stderr}")
        return []
    return [line.strip() for line in result.stdout.splitlines() if line.strip()]


def checkout_bug(project, bug_id, version="b"):
    """defects4j checkout -p <project> -v <bug_id><version> -w <dir>"""
    work_dir = CHECKOUT_DIR / f"{project}_{bug_id}{version}"
    if work_dir.exists():
        return work_dir
    result = subprocess.run(
        ["defects4j", "checkout", "-p", project, "-v", f"{bug_id}{version}", "-w", str(work_dir)],
        capture_output=True, text=True,
    )
    if result.returncode != 0:
        print(f"[ERROR] checkout ล้มเหลว {project}-{bug_id}{version}: {result.stderr}")
        return None
    return work_dir


def get_modified_classes(work_dir):
    """defects4j export -p classes.modified -w <dir>"""
    result = subprocess.run(
        ["defects4j", "export", "-p", "classes.modified", "-w", str(work_dir)],
        capture_output=True, text=True,
    )
    if result.returncode != 0:
        return []
    return [c.strip() for c in result.stdout.splitlines() if c.strip()]


# ---------- Test generation per tool ----------
def run_evosuite(work_dir, target_class, search_budget=60, run_no=1):
    """
    รัน MOSA algorithm ผ่าน EvoSuite:
      java -jar evosuite.jar -algorithm MOSA -criterion BRANCH
           -Dsearch_budget=<budget> -class <target_class> -projectCP <cp>
    (ปรับ classpath ให้ตรงกับ Defects4J export.cp.compile ของแต่ละบั๊ก)
    """
    import glob
    jars = glob.glob(EVOSUITE_JAR_GLOB)
    if not jars:
        print("[ERROR] ไม่พบ EvoSuite jar — เช็คว่า defects4j init.sh รันสำเร็จหรือยัง")
        return None
    evosuite_jar = jars[0]

    cp_result = subprocess.run(
        ["defects4j", "export", "-p", "cp.compile", "-w", str(work_dir)],
        capture_output=True, text=True,
    )
    classpath = cp_result.stdout.strip()

    out_dir = RESULT_DIR / "evosuite_raw" / target_class / f"run{run_no}_budget{search_budget}"
    out_dir.mkdir(parents=True, exist_ok=True)

    start = time.time()
    cmd = [
        "java", "-jar", evosuite_jar,
        "-algorithm", "MOSA",
        "-criterion", "BRANCH",
        f"-Dsearch_budget={search_budget}",
        "-class", target_class,
        "-projectCP", classpath,
        "-Dtest_dir", str(out_dir),
    ]
    result = subprocess.run(cmd, capture_output=True, text=True, cwd=str(work_dir))
    elapsed = time.time() - start

    return {
        "tool": "evosuite",
        "target_class": target_class,
        "search_budget": search_budget,
        "run_no": run_no,
        "execution_time_sec": round(elapsed, 2),
        "test_dir": str(out_dir),
        "success": result.returncode == 0,
        "stderr_tail": result.stderr[-500:] if result.returncode != 0 else "",
    }


def run_grt(work_dir, target_class, config_param=60, run_no=1):
    """
    รัน GRT ผ่านเครื่องมือที่ทีมเลือก (jar ที่ mount มาที่ GRT_JAR_PATH)
    ปรับคำสั่งจริงตาม CLI ของเครื่องมือที่ใช้จริง — โครงนี้เป็น template ตั้งต้น
    """
    if not GRT_JAR_PATH.exists():
        print(f"[ERROR] ไม่พบ GRT jar ที่ {GRT_JAR_PATH} — วาง grt.jar ในโฟลเดอร์ tools/ ก่อน")
        return None

    cp_result = subprocess.run(
        ["defects4j", "export", "-p", "cp.compile", "-w", str(work_dir)],
        capture_output=True, text=True,
    )
    classpath = cp_result.stdout.strip()

    out_dir = RESULT_DIR / "grt_raw" / target_class / f"run{run_no}_cfg{config_param}"
    out_dir.mkdir(parents=True, exist_ok=True)

    start = time.time()
    # TODO: แก้ flag ให้ตรงกับ CLI จริงของเครื่องมือ GRT ที่ทีมเลือกใช้
    cmd = [
        "java", "-cp", f"{GRT_JAR_PATH}:{classpath}",
        "grt.Main",  # ชื่อ main class ตัวอย่าง — แก้ตามเครื่องมือจริง
        "--target", target_class,
        "--time-limit", str(config_param),
        "--output", str(out_dir),
    ]
    result = subprocess.run(cmd, capture_output=True, text=True, cwd=str(work_dir))
    elapsed = time.time() - start

    return {
        "tool": "grt",
        "target_class": target_class,
        "config_param": config_param,
        "run_no": run_no,
        "execution_time_sec": round(elapsed, 2),
        "test_dir": str(out_dir),
        "success": result.returncode == 0,
        "stderr_tail": result.stderr[-500:] if result.returncode != 0 else "",
    }


def measure_coverage_and_fault_detection(work_dir, test_dir):
    """defects4j coverage -w <dir> -y suite -w <test_dir> — วัด line/branch coverage"""
    result = subprocess.run(
        ["defects4j", "coverage", "-w", str(work_dir), "-y", "suite"],
        capture_output=True, text=True, cwd=str(test_dir),
    )
    # แปลง output จริงของ defects4j coverage เป็นตัวเลข (รูปแบบขึ้นกับเวอร์ชัน)
    return {"coverage_raw_output": result.stdout}


# ---------- Main orchestration ----------
def run_one_bug(project, bug_id, tool, progress, runs_per_config=3, configs=(60, 180)):
    task_id = f"{project}-{bug_id}-{tool}"
    if already_done(progress, task_id):
        print(f"[SKIP] {task_id} ทำไปแล้ว")
        return

    work_dir = checkout_bug(project, bug_id)
    if work_dir is None:
        progress["failed"].append(task_id)
        save_progress(progress)
        return

    target_classes = get_modified_classes(work_dir)
    if not target_classes:
        print(f"[WARN] ไม่พบ modified class สำหรับ {task_id}")
        progress["failed"].append(task_id)
        save_progress(progress)
        return

    rows = []
    for target_class in target_classes:
        for cfg in configs:
            for run_no in range(1, runs_per_config + 1):
                if tool == "evosuite":
                    res = run_evosuite(work_dir, target_class, search_budget=cfg, run_no=run_no)
                elif tool == "grt":
                    res = run_grt(work_dir, target_class, config_param=cfg, run_no=run_no)
                else:
                    raise ValueError(f"unknown tool: {tool}")
                if res:
                    res.update({"project": project, "bug_id": bug_id})
                    rows.append(res)

    write_results_csv(tool, rows)
    progress["completed"].append(task_id)
    save_progress(progress)
    print(f"[DONE] {task_id} — {len(rows)} runs บันทึกแล้ว")


def write_results_csv(tool, rows):
    if not rows:
        return
    csv_path = RESULT_DIR / f"results_{tool}.csv"
    file_exists = csv_path.exists()
    fieldnames = sorted({k for row in rows for k in row.keys()})
    with open(csv_path, "a", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        if not file_exists:
            writer.writeheader()
        for row in rows:
            writer.writerow(row)


def main():
    parser = argparse.ArgumentParser(description="SQA Benchmark Runner: MOSA(EvoSuite) / GRT")
    parser.add_argument("--project", help="ชื่อ project เดี่ยว เช่น Lang")
    parser.add_argument("--bug", help="bug id เดี่ยว เช่น 1")
    parser.add_argument("--sample-17", action="store_true", help="รันตัวแทนโปรเจกต์ละ 1 บั๊ก (17 บั๊ก)")
    parser.add_argument("--all-bugs", action="store_true", help="รันทุก active bug ทั้งหมด")
    parser.add_argument("--tool", required=True, choices=["evosuite", "grt"])
    parser.add_argument("--resume", action="store_true")
    args = parser.parse_args()

    progress = load_progress() if args.resume else {"completed": [], "failed": []}

    if args.project and args.bug:
        run_one_bug(args.project, args.bug, args.tool, progress)
    elif args.sample_17:
        for project in ALL_PROJECTS:
            bug_ids = get_bug_ids(project)
            if bug_ids:
                run_one_bug(project, bug_ids[0], args.tool, progress)
    elif args.all_bugs:
        for project in ALL_PROJECTS:
            for bug_id in get_bug_ids(project):
                run_one_bug(project, bug_id, args.tool, progress)
    else:
        parser.print_help()
        sys.exit(1)


if __name__ == "__main__":
    main()
