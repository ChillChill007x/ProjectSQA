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
  results/    (ว่างไว้ก่อน — เก็บ results_evosuite.csv / results_jdart.csv)
  tools/      (ว่างไว้ก่อน — สำรองไว้ ไม่จำเป็นสำหรับ JDart)
```

## 3. Build image (ครั้งแรกครั้งเดียว — **ใช้เวลานาน 45-90 นาที**)
```bash
docker compose build
```
นานกว่าปกติเพราะนอกจาก Defects4J + EvoSuite แล้ว ต้อง `gradle build` เพิ่มอีก 4 repo สำหรับ JDart stack (jpf-core, jConstraints, jconstraints-z3, jdart) — **คนที่ 2 ควรเริ่ม build ให้เร็วที่สุด** เผื่อเวลาแก้ปัญหาถ้า build ล้มเหลว

## 4. เข้าไปใช้งานใน container
```bash
docker compose run --rm sqa-runner bash
```
จะได้ shell ที่มี Java 11 (+ 8/17 compat), Defects4J, EvoSuite (auto-download แล้ว) ครบ

**คนที่ 2 ต้องเช็คก่อนว่า JDart build สำเร็จจริง:**
```bash
ls $JPF_CORE_HOME/bin/jpf
```
ถ้าไม่มีไฟล์นี้ แปลว่า build ขั้น JDart stack ล้มเหลว ต้องย้อนดู log ตอน `docker compose build` (มี `WARNING` echo ไว้ให้เห็นว่า step ไหนพัง) แล้วแก้ตาม README ของแต่ละ repo (`tudo-aqua/jdart`, `tudo-aqua/jConstraints`, `tudo-aqua/jconstraints-z3`)

## 5. รัน benchmark จริง
```bash
# ทดสอบเดี่ยว 1 bug ก่อน (แนะนำให้ทำก่อนรันเต็ม)
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool jdart

# รันตัวแทน 17 projects (โปรเจกต์ละ 1 bug) — ใช้เช็ค pipeline ก่อนรันเต็ม
python3 scripts/run_benchmark.py --sample-17 --tool evosuite
python3 scripts/run_benchmark.py --sample-17 --tool jdart

# รันทุก bug จริง พร้อม resume ได้ถ้าโดนขัดจังหวะ
python3 scripts/run_benchmark.py --all-bugs --tool evosuite --resume
python3 scripts/run_benchmark.py --all-bugs --tool jdart --resume
```

ผลลัพธ์จะออกมาที่ `results/results_evosuite.csv` หรือ `results/results_jdart.csv` — sync กับเครื่องจริงทันที

## 6. ออกจาก container
พิมพ์ `exit` — container ถูกลบอัตโนมัติ (`--rm`) แต่ไฟล์ใน `work/`, `results/`, `tools/` ยังอยู่ครบ

## สำหรับคนที่ 2 (JDart) เท่านั้น
- **ไม่ต้องหา jar เอง** — Docker build จาก source ให้อัตโนมัติ (ต่างจาก GRT เดิมที่ไม่มี jar ให้เลย)
- `run_jdart()` ใน `scripts/run_benchmark.py` ทำได้แค่ถึงขั้นรัน concolic execution แล้วเก็บ log ดิบ — **ยังไม่แปลงผลเป็น JUnit ให้อัตโนมัติ** ต้องเขียนตัวแปลงเพิ่มเอง (ดูรายละเอียดใน `requirements/sqa-02-jdart.md` หัวข้อ "ต้องทำเอง")
- JDart รองรับ auto-symbolic ดีเฉพาะ method ที่รับ parameter เป็น primitive type — method ที่รับ String/Object ต้อง config เพิ่มเอง

## Troubleshooting เร็ว ๆ
- **"Cannot connect to the Docker daemon"** → เปิด Docker Desktop รอจนสถานะ Running
- **Build ช้า/ค้างที่ `./init.sh`** → ปกติของ Defects4J ครั้งแรก รอได้ 15-30 นาที
- **Build ค้างที่ `./gradlew clean build` ของ jpf-core/jConstraints/jdart** → ปกติของการ build ครั้งแรก (โหลด Gradle dependencies เยอะ) รอได้อีก 15-30 นาทีต่อ repo
- **`jconstraints-z3` build ล้มเหลว** → มักเกิดจาก native Z3 library path ไม่ตรง เช็คว่า `z3` ติดตั้งจาก apt สำเร็จ (`z3 --version` ใน container) แล้วดู README ของ `tudo-aqua/jconstraints-z3` เรื่อง native path
- **`defects4j info -p Chart` ตอน build ล้มเหลว** → เช็ค network ว่าเข้าถึง GitHub ได้ปกติ
- **ทุกคนต้อง build จาก Dockerfile เดียวกัน** — คนที่ 1 กับ 2 ต้อง environment ตรงกันเป๊ะ เพราะรันทั้ง 17 projects ชุดเดียวกัน
