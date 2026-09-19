# REQUIREMENT 3/4 — Claude Code + Codex — AI-Assisted Test Generation Runner
**โปรเจกต์: AI-Assisted Testing vs. Automatic Test Case Generation Algorithms (SQA รอบที่ 2)**
**ผู้รับผิดชอบ: นายภีมเดช กลั่นกิ่ง (673380420-2) — คนที่ 3**
**ระดับความยาก: ⭐⭐ (ง่าย-ปานกลาง ด้าน setup) แต่ ⭐⭐⭐⭐ (ยาก ด้านปริมาณงาน)** — ไม่ต้องสู้กับ dependency เก่าเหมือน EvoSuite/JDart แต่ต้องรัน 2 เครื่องมือ (Claude Code, Codex) แยกกัน และต้อง manual-check ผลลัพธ์จาก agentic tool มากกว่า เพราะ AI อาจสร้าง test ที่ compile ไม่ผ่านหรือ hallucinate

---

## ต้องใช้ไฟล์/เครื่องมืออะไรบ้าง (เตรียมก่อนเริ่ม)
1. **Defects4J** — checkout bug/class ให้ครบทั้ง 17 projects (ไม่ใช่ subset — เหมือนคนที่ 1/2 เป๊ะ) — **แนะนำใช้ Docker ชุดเดียวกับคนที่ 1/2** (`Dockerfile`/`docker-compose.yml`) เฉพาะตอนรัน `defects4j checkout` และ `defects4j coverage` (ขั้นวัดผล) เพื่อให้ Java/Defects4J version ตรงกับอีก 2 คนเป๊ะ ผลจะได้เทียบกันได้ยุติธรรม — ส่วนตัว Claude Code CLI / Codex CLI เองแนะนำให้รัน**นอก container** ตามปกติ (เพราะต้อง login/auth กับ API ข้างนอก ใน container จัดการ credential ยุ่งยากกว่า) ดูวิธี build/run ใน `README-docker-desktop.md`
2. **Claude Code CLI** และ **Codex CLI** — ติดตั้งและ login ให้พร้อมรันแบบ agentic
3. **Prompt ที่ออกแบบไว้ในรอบ 1** (รวมตารางที่ 3: ตัวแปรที่ต้องแทนที่ต่อหนึ่ง bug และ class) — **ขอไฟล์นี้จากคนที่ทำรายงานรอบ 1** ถ้ายังไม่มีให้รวบรวมจากรายงานฉบับเดิม
4. **ขอบเขตทั้ง 17 projects เดียวกับคนที่ 1 และ 2** — รันทุก project/ทุก bug เพื่อรัน class เดียวกันทั้งหมด
5. **ไฟล์ Active Bugs metadata** — ใช้ `dataset/defects4j/<Project>_metadata.csv` ชุดเดียวกับคนที่ 1/2 (ตอนนี้มีแค่ `Lang_metadata.csv` — 61 active bugs, ตัด deprecated `2,18,25,48` ออกแล้ว) **ห้ามรัน bug ที่ deprecated** — เพราะจะได้ target class/triggering test ที่ไม่ valid ทำให้ prompt สั่งงานผิด
6. ไฟล์ requirement นี้

## เริ่มงานได้ขนานกับคนที่ 1 และ 2 ได้เลย
ขอบเขตคือทั้ง 17 projects อยู่แล้ว แค่ต้องมี prompt จากรอบ 1 ที่พร้อมใช้

---

## เป้าหมาย
ใช้ prompt ที่ออกแบบไว้ในรอบ 1 สั่ง Claude Code และ Codex ให้สร้าง JUnit test suite สำหรับ class under test ชุดเดียวกับ Requirement 1 และ 2 แล้ววัดผลด้วย metric เดียวกัน

## สิ่งที่ต้องทำ
1. **Setup**
   - ใช้ Defects4J checkout ของ class เดียวกับ Requirement 1/2 (`defects4j checkout ...`)
   - เตรียม Claude Code CLI และ Codex CLI ให้พร้อมรันในโหมด agentic ภายใน working directory ของแต่ละ bug
2. **ยืนยัน Active Bug list ตรงกับคนที่ 1/2 ก่อนเริ่ม**
   - เปิด `dataset/defects4j/<Project>_metadata.csv` ดู bug id + target class + triggering test ที่ถูกต้อง (Lang พร้อมแล้ว 61 ตัว)
   - project ที่ยังไม่มี metadata ให้รอคนที่ 4 สกัดให้ก่อน หรือแจ้งทีมถ้าจำเป็นต้องรันเร่งด่วน
   - **เริ่มจาก Lang ก่อน** ให้ตรงกับที่คนที่ 1/2 เริ่มไว้
3. **นำ prompt จากรอบ 1 มาใช้จริง**
   - ปรับ placeholder ในพรอมพ์ให้ตรงกับแต่ละ bug จริง (ใช้ target_class/triggering_test จาก metadata CSV โดยตรง ไม่ต้องเปิด Defects4J เว็บเช็คเอง)
   - สั่ง Claude Code สร้าง JUnit test suite ให้ class under test, ให้ agent รัน build/test เองจนผ่าน
   - ทำแบบเดียวกันกับ Codex บน bug/class ชุดเดียวกัน
4. **วัดผล**
   - รัน `defects4j coverage` กับ test suite ที่ AI สร้าง เพื่อวัด test coverage / branch coverage
   - เช็ค fault detection rate (fail บน buggy / pass บน fixed)
   - นับจำนวน test case ที่ compile ผ่านจริง vs ที่ AI สร้างมาทั้งหมด (metric เพิ่มเฉพาะฝั่ง AI เพราะมักมี test ที่ compile ไม่ผ่าน)
5. **ทำซ้ำอย่างน้อย 3 รอบต่อ class ต่อเครื่องมือ** (เพราะ LLM output ไม่ deterministic) แล้วเฉลี่ยผล
6. **บันทึกผลลัพธ์** แยก 2 ไฟล์ (schema เดียวกับ Requirement 1/2 + คอลัมน์เสริม):
   - `results_claude_code.csv`
   - `results_codex.csv`
   คอลัมน์: `project, bug_id, tool(claude_code/codex), run_no, test_coverage, branch_coverage, fault_detected(0/1), num_test_cases_generated, num_test_cases_compiled, execution_time_sec`
7. **จัดโครงสร้าง GitHub**:
   ```
   ProjectName/Claude-sonnet_4_6/
     Prompt/     (prompt ที่ใช้จริงต่อ bug)
     Result/     (results_claude_code.csv + raw log)
     TestCode/   (test suite ที่ generate)
   ProjectName/Codex/
     Prompt/
     Result/
     TestCode/
   ```
7. เขียนสรุปเปรียบเทียบพฤติกรรมของ Claude Code vs Codex ที่สังเกตเห็นจริง (300-500 คำ)

---

## Deliverable ที่ต้องส่งให้เพื่อนในทีม
- `results_claude_code.csv`, `results_codex.csv` ครบทุก bug/run ของทั้ง 17 projects

> **หมายเหตุเรื่องปริมาณงาน:** ทั้ง 17 projects มีบั๊กรวมกัน 800+ ตัว × 2 เครื่องมือ × 3 รอบ = งานที่หนักมากสำหรับ agentic AI (ต้องรอ API/rate limit ด้วย) แนะนำเริ่มจาก `--sample-17` (โปรเจกต์ละ 1 bug) ให้ pipeline สมบูรณ์ก่อน แล้วค่อยขยายเป็นเต็มทีละ project พร้อมเก็บ log ว่าถึงไหนแล้ว (จะได้ resume ได้ถ้าโดนตัดกลางทาง)
- โฟลเดอร์ `Prompt/` และ `TestCode/` ของทั้งสองเครื่องมือ
- สรุปเปรียบเทียบพฤติกรรม 2 เครื่องมือ 300-500 คำ

## ใครรอผลงานจากคนนี้บ้าง
- **คนที่ 4** (รวมผล+รายงาน+deploy) — ต้องรอ `results_claude_code.csv`, `results_codex.csv` และสรุปเปรียบเทียบพฤติกรรม เพื่อเอาไปรวมวิเคราะห์เปรียบเทียบกับ MOSA/JDart
