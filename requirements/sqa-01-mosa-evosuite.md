# REQUIREMENT 1/4 — MOSA (EvoSuite) Search-Based Algorithm Runner
**โปรเจกต์: AI-Assisted Testing vs. Automatic Test Case Generation Algorithms (SQA รอบที่ 2)**
**ผู้รับผิดชอบ: นายคมชาญ น้อยเนียม (673380395-5) — คนที่ 1**
**ระดับความยาก: ⭐⭐⭐ (ปานกลาง-ยาก)** — ติดตั้ง EvoSuite + Defects4J environment (Java เก่า, Maven/Ant เฉพาะเวอร์ชัน) เป็นจุดที่เสียเวลาสุด แต่ตัวรันมี flag สำเร็จรูปให้ใช้

---

## ต้องใช้ไฟล์/เครื่องมืออะไรบ้าง (เตรียมก่อนเริ่ม)
1. **Docker Desktop + ไฟล์ `Dockerfile` / `docker-compose.yml`** — ทีมใช้ Docker แทนการลง Defects4J/EvoSuite/Java 8 ตรง ๆ บนเครื่อง เพื่อให้ environment เหมือนกันทุกคนแบบ 100% (ดูวิธีใช้ใน `README-docker-desktop.md`) — **ไม่ต้อง**ติดตั้ง Defects4J/EvoSuite/Java 8 เองอีกต่อไป เพราะรวมอยู่ใน image แล้ว
2. **ขอบเขต: ทั้ง 17 projects ใน Defects4J ทุก Active Bug** (ไม่ใช่ subset — ทีมตกลงใช้ full dataset ตามสเปกข้อ 2.2(1)) รายชื่อ 17 projects: Chart, Cli, Closure, Codec, Collections, Compress, Csv, Gson, JacksonCore, JacksonDatabind, JacksonXml, Jsoup, JxPath, Lang, Math, Mockito, Time — คนที่ 2 (JDart) และคนที่ 3 (AI tools) ต้องรันชุดเดียวกันทั้งหมดนี้เพื่อให้เทียบผลกันได้ครบ
3. **ไฟล์ Active Bugs metadata** — เช็คที่ `dataset/defects4j/<Project>_metadata.csv` ก่อนรันแต่ละ project (ตอนนี้มีแค่ `Lang_metadata.csv` พร้อมใช้ — 61 active bugs, ID `1, 3–17, 19–24, 26–47, 49–65`, ตัด deprecated `2,18,25,48` ออกแล้ว) ถ้า project อื่นยังไม่มีไฟล์นี้ ให้รัน `defects4j bids -p <Project>` เองก่อนเริ่ม (ดูวิธีเต็มในหัวข้อ Dataset ของ README.md หลัก) — **ห้ามเดา bug id เอง หรือรันบั๊กที่ deprecated ไปแล้ว**
4. ไฟล์ requirement นี้ — ใช้เป็น spec หลักวางใน Claude/Claude Code

> **Docker setup:** `docker compose build` แล้ว `docker compose run --rm sqa-runner bash` จะได้ shell ที่มี Java 11 (+8/17), Defects4J, EvoSuite (auto-download ผ่าน `init.sh`) พร้อมใช้ทันที ไฟล์ที่สร้างใน `/workspace` จะ sync กับโฟลเดอร์ `work/` บนเครื่องจริงอัตโนมัติ (รายละเอียดเต็มดู `README-docker-desktop.md`)

## ไม่ต้องรอใคร — เริ่มงานได้ทันที
งานนี้เป็นงานที่เริ่มขนานกับ Requirement 2 และ 3 ได้เลย ไม่ต้องรอผลจากใครก่อน — ขอบเขตคือทั้ง 17 projects อยู่แล้ว ไม่ต้องรอมติเพิ่ม

---

## เป้าหมาย
สร้าง test suite อัตโนมัติด้วย MOSA algorithm ผ่าน EvoSuite ให้ Java class ที่มี bug ใน Defects4J แล้ววัดประสิทธิภาพ

## สิ่งที่ต้องทำ
1. **Setup environment (ผ่าน Docker)**
   - `docker compose build` (ทำครั้งแรกครั้งเดียว ใช้เวลา 15-30 นาที)
   - `docker compose run --rm sqa-runner bash` เข้าไปใน container ที่มี Java 11 (+8/17), Defects4J, EvoSuite (auto-download โดย `init.sh` แล้ว — ไม่ต้องโหลดเอง) ครบแล้ว
   - ไม่ต้องติดตั้งอะไรเพิ่มบนเครื่องจริง
2. **ยืนยัน Active Bug list ก่อนรันจริงทุกครั้ง**
   - เปิด `dataset/defects4j/<Project>_metadata.csv` ถ้ามีแล้ว (ตอนนี้มีแค่ Lang: 61 bugs) → ใช้ bug id ในไฟล์นี้เท่านั้น
   - ถ้า project ยังไม่มีไฟล์ metadata → รัน `defects4j bids -p <Project>` ใน container ก่อน แล้วขอให้คนที่ 4 (ศุภกิตติ์) สกัดเป็น `<Project>_metadata.csv` เก็บเข้า `dataset/defects4j/` ให้ทุกคนใช้ร่วมกัน (กันแต่ละคนได้ bug list ไม่ตรงกัน)
   - **ห้ามรันบั๊กที่ไม่อยู่ใน active bug list** (เช่น Lang bug 2, 18, 25, 48 ที่ deprecated แล้ว) เพราะ `defects4j checkout` จะ error หรือผลไม่ valid
3. **เริ่มจาก Lang ก่อน** (ข้อมูล active bugs พร้อมแล้ว 61 ตัว) เพื่อตรวจ pipeline ให้นิ่งก่อนขยายไป project อื่นที่ยังไม่ได้สกัด metadata
4. **รันด้วยสคริปต์ `scripts/run_benchmark.py`** (แทนการยิงคำสั่งทีละบั๊กเอง)
   ```bash
   # ทดสอบเดี่ยว 1 bug ก่อน
   python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
   # รันตัวแทน 17 projects (โปรเจกต์ละ 1 bug) เช็ค pipeline
   python3 scripts/run_benchmark.py --sample-17 --tool evosuite
   # รันเต็มทั้ง 17 projects ทุก bug จริง (ใช้เวลานาน ~800+ bugs — ใช้ --resume ถ้าค้างกลางทาง)
   python3 scripts/run_benchmark.py --all-bugs --tool evosuite --resume
   ```
   สคริปต์นี้ทำให้อัตโนมัติ: checkout บั๊ก → หา modified class → รัน MOSA ผ่าน EvoSuite (`-algorithm MOSA -criterion BRANCH -Dsearch_budget=<sec>`) ด้วย search budget 2 ค่า (60s, 180s) × 3 รอบต่อค่า (ตามข้อ 1.7) → บันทึกผลลง `results/results_evosuite.csv` อัตโนมัติ
5. **รัน test suite ที่ได้กับ buggy/fixed version**
   - รันผ่าน `defects4j coverage` เพื่อวัด line/branch coverage
   - เช็คว่า test suite detect bug ได้หรือไม่ (fail บน buggy version, pass บน fixed version) → คำนวณ **Fault detection rate**
   - (ฟังก์ชัน `measure_coverage_and_fault_detection()` ในสคริปต์เป็นจุดเริ่มต้น — ต้องเติม logic parse output ของ `defects4j coverage` ให้ครบ)
6. **ตรวจผล `results/results_evosuite.csv`** คอลัมน์ที่สคริปต์บันทึกให้:
   `project, bug_id, tool, target_class, search_budget, run_no, execution_time_sec, success, ...`
7. **จัดโครงสร้าง GitHub** ตาม spec ข้อ 1.10:
   ```
   ProjectName/MOSA_EvoSuite/
     Code/            (scripts/run_benchmark.py + Dockerfile/docker-compose.yml)
     Configuration/   (search_budget ที่ใช้แต่ละรอบ)
     Result_Round2/   (raw output + results/results_evosuite.csv)
     Test/            (generated test suite ทั้งหมด)
   ```
8. เขียนสรุปสั้น ๆ (300-500 คำ) เกี่ยวกับข้อจำกัดที่เจอจริงระหว่างรัน (เช่น class ไหน generate ไม่ได้/timeout — รวมถึง project ไหนที่ยังไม่มี Active Bugs metadata ทำให้รันไม่ได้)

---

## Deliverable ที่ต้องส่งให้เพื่อนในทีม
- `results/results_evosuite.csv` ครบทุก bug/run ของทั้ง 17 projects
- โฟลเดอร์ `Test/` มี test suite จริงที่ generate ได้
- สรุปปัญหา/ข้อจำกัดที่พบ 300-500 คำ

## ใครรอผลงานจากคนนี้บ้าง
- **คนที่ 4** (รวมผล+รายงาน+deploy) — ต้องรอ `results_mosa.csv` และสรุปข้อจำกัด เพื่อเอาไปรวมวิเคราะห์เปรียบเทียบกับอีก 3 เครื่องมือ
