# REQUIREMENT 2/4 — GRT (Guided Random Testing) Runner
**โปรเจกต์: AI-Assisted Testing vs. Automatic Test Case Generation Algorithms (SQA รอบที่ 2)**
**ผู้รับผิดชอบ: นายปฏิภาณ มะนิลทิพย์ (673380589-2) — คนที่ 2**
**ระดับความยาก: ⭐⭐⭐ (ปานกลาง-ยาก)** — โครงสร้างงานเหมือน Requirement 1 แต่ GRT (ผ่าน Randoop รุ่น GRT หรือ tool ที่ใช้ feedback-directed random testing) มักติดตั้ง/หา jar ยากกว่า EvoSuite เล็กน้อย

---

## ต้องใช้ไฟล์/เครื่องมืออะไรบ้าง (เตรียมก่อนเริ่ม)
1. **Docker Desktop + ไฟล์ `Dockerfile` / `docker-compose.yml`** (ชุดเดียวกับคนที่ 1) — ใช้ image เดียวกันเป๊ะ ๆ เพื่อให้ environment ตรงกับคนที่ 1 100% (ดูวิธีใช้ใน `README-docker-desktop.md`)
2. **เครื่องมือที่ implement GRT** (เช่น Randoop รุ่น GRT หรือ tool เฉพาะที่กลุ่มศึกษาไว้ในรอบ 1) — ดาวน์โหลดไฟล์ jar เอง แล้ว**วางไว้ที่โฟลเดอร์ `tools/` บนเครื่องจริง** (ตั้งชื่อ `grt.jar`) — Docker mount โฟลเดอร์นี้เข้า container อัตโนมัติที่ `/opt/tools/custom/grt.jar`
3. **ขอบเขต: ทั้ง 17 projects ใน Defects4J ทุก Active Bug** (เหมือนคนที่ 1 เป๊ะ — ไม่ใช่ subset) รายชื่อ: Chart, Cli, Closure, Codec, Collections, Compress, Csv, Gson, JacksonCore, JacksonDatabind, JacksonXml, Jsoup, JxPath, Lang, Math, Mockito, Time
4. **ไฟล์ Active Bugs metadata** — เช็คที่ `dataset/defects4j/<Project>_metadata.csv` ก่อนรันแต่ละ project (ตอนนี้มีแค่ `Lang_metadata.csv` — 61 active bugs, ID `1, 3–17, 19–24, 26–47, 49–65`, ตัด deprecated `2,18,25,48` ออกแล้ว) ต้องใช้ bug id ชุดเดียวกับคนที่ 1 เป๊ะ **ห้ามรันบั๊กที่ไม่อยู่ใน active bug list**
5. ไฟล์ requirement นี้

## เริ่มงานได้ขนานกับคนที่ 1 ได้เลย
ขอบเขตคือทั้ง 17 projects อยู่แล้วเหมือนคนที่ 1 ไม่ต้องรอมติเพิ่ม — แต่ต้องหาไฟล์ `grt.jar` มาวางก่อนเริ่มรันจริง

---

## เป้าหมาย
สร้าง test suite อัตโนมัติด้วย GRT แล้ววัดประสิทธิภาพเทียบกับ MOSA โดยใช้ metric และขอบเขตทั้ง 17 projects เดียวกันกับ Requirement 1

## สิ่งที่ต้องทำ
1. **Setup environment (ผ่าน Docker)**
   - `docker compose build` (ถ้าคนที่ 1 build ไว้แล้วในเครื่องเดียวกัน ข้ามขั้นนี้ได้ — ต้อง Dockerfile ตัวเดียวกับคนที่ 1 เป๊ะ)
   - วาง `grt.jar` ไว้ที่โฟลเดอร์ `tools/` บนเครื่องจริงก่อนเข้า container
   - `docker compose run --rm sqa-runner bash` เข้าไปใน container ที่มี Java 11(+8/17) + Defects4J พร้อมใช้ และเห็น `grt.jar` ที่ `/opt/tools/grt/grt.jar`
2. **ยืนยัน Active Bug list ตรงกับคนที่ 1 ก่อนรันจริง**
   - ใช้ `dataset/defects4j/<Project>_metadata.csv` ชุดเดียวกับที่คนที่ 1 ใช้ (ห้ามรันบั๊กคนละ id กัน)
   - project ที่ยังไม่มี metadata ให้แจ้งคนที่ 4 สกัดให้ก่อน หรือรัน `defects4j bids -p <Project>` เช็คเองชั่วคราว
3. **แก้ `scripts/run_benchmark.py` ให้ตรงกับ CLI จริงของเครื่องมือ GRT ที่เลือกใช้**
   - เปิดดูฟังก์ชัน `run_grt()` ในสคริปต์ — มี TODO ไว้ให้แก้ classname/flag ให้ตรงกับเครื่องมือจริง (main class, argument names) เพราะ GRT ไม่มี CLI มาตรฐานตายตัวเหมือน EvoSuite
4. **เริ่มจาก Lang ก่อน** (มี active bugs พร้อมแล้ว 61 ตัว) ให้ตรงกับที่คนที่ 1 เริ่มไว้ เพื่อเทียบผลได้ทันที
5. **รันด้วยสคริปต์** (โครงเดียวกับคนที่ 1 แค่เปลี่ยน `--tool`)
   ```bash
   python3 scripts/run_benchmark.py --project Lang --bug 1 --tool grt
   python3 scripts/run_benchmark.py --sample-17 --tool grt
   python3 scripts/run_benchmark.py --all-bugs --tool grt --resume
   ```
   ใช้ configuration parameter 2 ค่าที่ต่างกัน (เช่น time limit) × 3 รอบต่อค่า ตามข้อ 1.7 — ผลบันทึกลง `results/results_grt.csv` อัตโนมัติ (schema คอลัมน์เดียวกับ `results_evosuite.csv` ของคนที่ 1 เพื่อให้คนที่ 4 รวมง่าย)
6. **วัดผลแบบเดียวกับ Requirement 1**
   - รัน `defects4j coverage` วัด line/branch coverage
   - เช็ค fault detection (fail บน buggy / pass บน fixed)
7. **จัดโครงสร้าง GitHub**:
   ```
   ProjectName/GRT/
     Code/            (scripts/run_benchmark.py ที่แก้ run_grt() แล้ว)
     Configuration/
     Result_Round2/   (raw output + results/results_grt.csv)
     Test/
   ```
6. เขียนสรุปข้อจำกัดที่เจอ 300-500 คำ (รวมถึง project ไหนที่ยังไม่มี Active Bugs metadata ทำให้รันไม่ได้)

---

## Deliverable ที่ต้องส่งให้เพื่อนในทีม
- `results/results_grt.csv` ครบทุก bug/run ของทั้ง 17 projects เดียวกับ Requirement 1
- โฟลเดอร์ `Test/` มี test suite จริง
- สรุปปัญหา/ข้อจำกัด 300-500 คำ

## ใครรอผลงานจากคนนี้บ้าง
- **คนที่ 4** (รวมผล+รายงาน+deploy) — ต้องรอ `results_grt.csv` และสรุปข้อจำกัด เพื่อเอาไปรวมวิเคราะห์เปรียบเทียบ
