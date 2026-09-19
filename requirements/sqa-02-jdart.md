# REQUIREMENT 2/4 — JDart (Dynamic Symbolic / Concolic Execution) Runner
**โปรเจกต์: AI-Assisted Testing vs. Automatic Test Case Generation Algorithms (SQA รอบที่ 2)**
**ผู้รับผิดชอบ: นายปฏิภาณ มะนิลทิพย์ (673380589-2) — คนที่ 2**
**ระดับความยาก: ⭐⭐⭐⭐⭐ (ยากที่สุดในทีม)** — JDart ไม่มี jar สำเร็จรูป ต้อง build จาก source 3 ส่วน (jpf-core, jConstraints, jdart) และ **ไม่ output เป็น JUnit test ให้อัตโนมัติ** เหมือน EvoSuite — ต้องเขียนตัวแปลงผลลัพธ์เอง

> **หมายเหตุสำคัญที่ทีมต้องรู้ก่อนเริ่ม:** เดิมทีมเลือก **GRT** แต่พบว่า GRT เป็นเครื่องมือวิจัยที่ไม่เคยปล่อย public jar/source เลย จึงเปลี่ยนมาใช้ **JDart** แทน (concolic/dynamic symbolic execution — คนละแนวทางกับ MOSA ของคนที่ 1 ชัดเจน ไม่ซ้ำกับกลุ่มอื่นในชีตของอาจารย์) **ต้องยืนยันกับอาจารย์และอัปเดตชีตกลุ่มให้เรียบร้อยก่อนเริ่มทำจริง**

---

## ต้องใช้ไฟล์/เครื่องมืออะไรบ้าง (เตรียมก่อนเริ่ม)
1. **Docker Desktop + ไฟล์ `Dockerfile` / `docker-compose.yml`** (อัปเดตแล้ว — build JDart stack ให้อัตโนมัติในนี้) — ใช้ image เดียวกับคนที่ 1 build ได้ (Dockerfile รวม EvoSuite + JDart ไว้ในตัวเดียวกันแล้ว) ดูวิธีใช้ใน `README-docker-desktop.md`
2. **ไม่ต้องหา jar เอง** (ต่างจาก GRT เดิม) — `docker compose build` จะ clone + build jpf-core, jConstraints, jconstraints-z3, jdart ให้อัตโนมัติจาก source จริง (ใช้เวลานานกว่าคนที่ 1 พอสมควร เพราะต้อง gradle build 4 repo)
3. **ขอบเขต: ทั้ง 17 projects ใน Defects4J ทุก Active Bug** (เหมือนคนที่ 1 เป๊ะ — ไม่ใช่ subset)
4. **ไฟล์ Active Bugs metadata** — เช็คที่ `dataset/defects4j/<Project>_metadata.csv` (ตอนนี้มีแค่ `Lang_metadata.csv` — 61 active bugs) ใช้ bug id ชุดเดียวกับคนที่ 1 เป๊ะ
5. ไฟล์ requirement นี้

## เริ่มงานได้ขนานกับคนที่ 1 ได้เลย
ไม่ต้องหา jar เพิ่มแล้ว (Docker build ให้เอง) แต่ **build ครั้งแรกจะนานกว่าคนที่ 1 มาก** (30-60+ นาที เพราะต้อง gradle build หลาย repo) ควรเริ่ม build ให้เร็วที่สุดเพื่อเผื่อเวลาแก้ปัญหา

---

## เป้าหมาย
ใช้ JDart ทำ dynamic symbolic (concolic) execution กับ method ของ target class ที่มี bug ใน Defects4J เพื่อหาค่า input ที่ทำให้ path การทำงานต่างกัน แล้วแปลงเป็น test case วัดผลเทียบกับ MOSA

## ทำความเข้าใจ JDart ก่อนเริ่ม (ต่างจาก EvoSuite มาก)
- JDart **ไม่ใช่** search-based algorithm แบบ MOSA — มันรัน method ด้วยค่าจริง (concrete) พร้อมติดตามเงื่อนไข symbolic ไปด้วย แล้วใช้ Z3 solver หาค่า input ใหม่ที่ทำให้ path เปลี่ยน (เช่น เข้า if-branch อีกฝั่ง)
- **รองรับดีเฉพาะ parameter ที่เป็น primitive type** (`int`, `long`, `double`, `boolean`, ...) — method ที่รับ `String`/`Object`/`Array` ต้อง config เพิ่มเอง (ซับซ้อนกว่า อ่าน JDart wiki: https://github.com/psycopaths/jdart/wiki)
- **Output ไม่ใช่ไฟล์ JUnit สำเร็จรูป** — ได้ path constraints + concrete input values ออกมาเป็น log ต้อง**เขียนตัวแปลงเป็น JUnit เอง** ก่อนจะเอาไปวัด coverage ด้วย `defects4j coverage` ได้จริง (นี่คือส่วนที่หนักที่สุดของงานนี้)

## สิ่งที่ต้องทำ
1. **Setup environment (ผ่าน Docker)**
   - `docker compose build` — จะ build EvoSuite (auto) + JDart stack (jpf-core → jConstraints → jconstraints-z3 → jdart) ให้ในตัวเดียว ใช้เวลานาน ตรวจ log ระหว่าง build ว่าแต่ละ step ผ่านจริง (มี `WARNING` echo ไว้ให้เห็นถ้า step ไหนพัง)
   - `docker compose run --rm sqa-runner bash` เข้าไปใน container — เช็คว่า `$JPF_CORE_HOME/bin/jpf` มีอยู่จริงก่อนเริ่มรัน (`ls $JPF_CORE_HOME/bin/jpf`)
2. **ยืนยัน Active Bug list ตรงกับคนที่ 1 ก่อนรันจริง**
   - ใช้ `dataset/defects4j/<Project>_metadata.csv` ชุดเดียวกับคนที่ 1
   - เริ่มจาก Lang ก่อน (มี active bugs พร้อมแล้ว 61 ตัว)
3. **รันด้วยสคริปต์ `scripts/run_benchmark.py --tool jdart`**
   ```bash
   python3 scripts/run_benchmark.py --project Lang --bug 1 --tool jdart
   python3 scripts/run_benchmark.py --sample-17 --tool jdart
   python3 scripts/run_benchmark.py --all-bugs --tool jdart --resume
   ```
   สคริปต์จะทำอัตโนมัติแค่ถึงขั้น: checkout บั๊ก → หา modified class → ใช้ `javap` อ่าน public method ที่มี parameter เป็น primitive type → สร้างไฟล์ `.jpf` config อัตโนมัติ (ใส่ `concolic.method.*` ให้ทุก method ที่เจอ สูงสุด 5 methods ต่อ class) → รัน `jpf` จริง → เก็บ log ดิบไว้ที่ `results/jdart_raw/<class>/run<n>_depth<n>/`
4. **[ต้องทำเอง] เขียนตัวแปลง JDart output → JUnit test file**
   - เปิดดู `results/jdart_raw/<class>/.../jpf_stdout.log` — หา concrete input values ที่ JDart รายงาน (รูปแบบ log ขึ้นกับเวอร์ชัน JDart ต้องลองรันจริงแล้วดู pattern)
   - เขียนสคริปต์ parse log แล้ว generate ไฟล์ `.java` ที่มี `@Test` เรียก method ด้วยค่าที่ได้ (ทำตามกฎเหล็กใน README หลัก: package ถูกต้อง, timeout, deterministic)
   - นี่คืองานพัฒนาเพิ่มเติมที่ GRT/EvoSuite ไม่ต้องทำ (เพราะมันออก JUnit ให้เลย) — ตรงกับสเปกข้อ 1.5 ที่ให้ "พัฒนาอัลกอริทึมที่เลือกมา" ไม่ใช่แค่รันเฉยๆ
5. **วัดผล**
   - เอา JUnit ที่แปลงแล้วรันผ่าน `defects4j coverage` วัด line/branch coverage
   - เช็ค fault detection (fail บน buggy / pass บน fixed)
6. **ทำซ้ำอย่างน้อย 3 รอบต่อ class** (เปลี่ยน `search.depth_limit` 2 ค่า เช่น 30, 60 ตามข้อ 1.7)
7. **บันทึกผลลัพธ์** เป็น `results/results_jdart.csv` schema:
   `project, bug_id, tool, target_class, search_depth, run_no, methods_explored, execution_time_sec, success, test_coverage, branch_coverage, fault_detected, num_test_cases_generated`
8. **จัดโครงสร้าง GitHub**:
   ```
   ProjectName/JDart/
     Code/            (scripts/run_benchmark.py + ตัวแปลง JDart→JUnit ที่เขียนเพิ่ม)
     Configuration/   (site.properties, search_depth ที่ใช้)
     Result_Round2/   (raw output + results/results_jdart.csv)
     Test/            (ไฟล์ JUnit ที่แปลงแล้ว)
   ```
9. เขียนสรุปข้อจำกัดที่เจอ 300-500 คำ — **เน้นเรื่อง method ที่ auto-symbolic ไม่ได้ (String/Object params)** และปัญหาการ build stack ที่เจอจริง เพราะเป็นข้อมูลสำคัญสำหรับบทวิเคราะห์ของคนที่ 4

---

## Deliverable ที่ต้องส่งให้เพื่อนในทีม
- `results/results_jdart.csv` ครบทุก bug/run ของทั้ง 17 projects (เท่าที่ auto-symbolic ได้จริง)
- โฟลเดอร์ `Test/` มี JUnit ที่แปลงจาก JDart output แล้ว
- ตัวแปลง JDart→JUnit ที่เขียนขึ้น (ใส่ใน `Code/`)
- สรุปปัญหา/ข้อจำกัด 300-500 คำ — โดยเฉพาะ % ของ method ที่ auto-symbolic ไม่ได้ (ข้อมูลนี้สำคัญมากสำหรับเปรียบเทียบกับ MOSA ที่ automatic 100%)

## ใครรอผลงานจากคนนี้บ้าง
- **คนที่ 4** (รวมผล+รายงาน+deploy) — ต้องรอ `results/results_jdart.csv` และสรุปข้อจำกัด (โดยเฉพาะเรื่อง auto-symbolic coverage) เพื่อเอาไปรวมวิเคราะห์เปรียบเทียบกับ MOSA/Claude Code/Codex
