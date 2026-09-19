# วิธีใช้ Docker Desktop สำหรับ SQA รอบ 2 (คนที่ 1 และคนที่ 2)

## 1. ติดตั้ง Docker Desktop
ดาวน์โหลดและติดตั้งจาก https://www.docker.com/products/docker-desktop/ เปิดโปรแกรมทิ้งไว้ให้ขึ้นสถานะ "Running" ก่อนทำขั้นต่อไป

## 2. จัดโฟลเดอร์
```
sqa-docker/
  Dockerfile
  docker-compose.yml
  scripts/
    run_benchmark.py
  work/       (ว่างไว้ก่อน — checkout bug + ผลลัพธ์)
  results/    (ว่างไว้ก่อน — เก็บ results_evosuite.csv / results_grt.csv)
  tools/      (ว่างไว้ก่อน — คนที่ 2 เอา grt.jar มาวางที่นี่)
```

## 3. Build image (ครั้งแรกครั้งเดียว ใช้เวลา 15-30 นาที เพราะโหลด Defects4J + init.sh)
```bash
docker compose build
```

## 4. เข้าไปใช้งานใน container
```bash
docker compose run --rm sqa-runner bash
```
จะได้ shell ที่มี Java 11 (+ 8/17 compat), Defects4J, EvoSuite (auto-download แล้ว) ครบ

## 5. รัน benchmark จริง
```bash
# ทดสอบเดี่ยว 1 bug ก่อน (แนะนำให้ทำก่อนรันเต็ม)
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite

# รันตัวแทน 17 projects (โปรเจกต์ละ 1 bug) — ใช้เช็ค pipeline ก่อนรันเต็ม
python3 scripts/run_benchmark.py --sample-17 --tool evosuite

# รันทุก bug จริง พร้อม resume ได้ถ้าโดนขัดจังหวะ
python3 scripts/run_benchmark.py --all-bugs --tool evosuite --resume
```
คนที่ 2 เปลี่ยน `--tool evosuite` เป็น `--tool grt` (ต้องมี `grt.jar` ในโฟลเดอร์ `tools/` ก่อน)

ผลลัพธ์จะออกมาที่ `results/results_evosuite.csv` หรือ `results/results_grt.csv` — sync กับเครื่องจริงทันที

## 6. ออกจาก container
พิมพ์ `exit` — container ถูกลบอัตโนมัติ (`--rm`) แต่ไฟล์ใน `work/`, `results/`, `tools/` ยังอยู่ครบ

## สำหรับคนที่ 2 (GRT) เท่านั้น
- เอา jar ของเครื่องมือ GRT ไปวางที่ `sqa-docker/tools/grt.jar` ก่อนเข้า container
- แก้ command จริงใน `run_grt()` ของ `scripts/run_benchmark.py` ให้ตรงกับ CLI จริงของเครื่องมือที่เลือกใช้ (ในไฟล์มี TODO comment ไว้ให้)

## Troubleshooting เร็ว ๆ
- **"Cannot connect to the Docker daemon"** → เปิด Docker Desktop รอจนสถานะ Running
- **Build ช้า/ค้างที่ `./init.sh`** → ปกติของ Defects4J ครั้งแรก รอได้ 15-30 นาที
- **`defects4j info -p Chart` ตอน build ล้มเหลว** → เช็ค network ว่าเข้าถึง GitHub ได้ปกติ
- **ทุกคนต้อง build จาก Dockerfile เดียวกัน** — คนที่ 1 กับ 2 ต้อง environment ตรงกันเป๊ะ เพราะรันทั้ง 17 projects ชุดเดียวกัน
