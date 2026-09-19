# Project – AI-Assisted Testing vs. Automatic Test Case Generation Algorithms: A Benchmark and Test Coverage Evaluation

**รายวิชา:** CP353201 Software Quality Assurance (ปีการศึกษา 1/2569)
**อาจารย์ประจำวิชา:** ผศ.ดร.ชิตสุธา สุ่มเล็ก | **หลักสูตร:** วิทยาการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น
**หัวข้อโครงการ:** การประเมินประสิทธิภาพเชิงเปรียบเทียบระหว่างขั้นตอนวิธีสร้างกรณีทดสอบอัตโนมัติ (MOSA & GRT) และเครื่องมือ AI-Assisting/Generative AI (Claude Code & Codex) บนชุดข้อมูลมาตรฐาน Defects4J

---

## 👥 รายชื่อสมาชิกและบทบาทหน้าที่ (Team Roles & Responsibilities)

| ลำดับ | รหัสนักศึกษา | ชื่อ - สกุล | บทบาทในโครงการ | หน้าที่หลัก & สิ่งที่ต้องส่งมอบ (Deliverables) |
|---|---|---|---|---|
| 1 | 673380395-5 | นายคมชาญ น้อยเนียม | **Member 1: MOSA / Search-Based Testing Lead** | • รับผิดชอบ **MOSA ผ่าน EvoSuite**<br>• ตั้งค่าและรัน EvoSuite/MOSA กับ Target Modified Classes ตาม benchmark protocol<br>• ตรวจสอบ generated JUnit tests และเก็บผล Line/Branch Coverage, Fault Detection และ Generation Time<br>• **Output:** `MOSA_EvoSuite/TestCode/` และผลการทดลองที่เกี่ยวข้อง |
| 2 | 673380589-2 | นายปฏิภาณ มะนิลทิพย์ | **Member 2: GRT / Feedback-Directed Random Testing Lead** | • รับผิดชอบ **GRT (Guided/Feedback-Directed Random Testing)**<br>• ตั้งค่าและรัน GRT กับ Target Modified Classes ตาม benchmark protocol เดียวกับ MOSA<br>• ตรวจสอบ generated JUnit tests และเก็บผล Coverage, Fault Detection, Generation Time<br>• **Output:** `GRT/TestCode/` และผลการทดลองที่เกี่ยวข้อง |
| 3 | 673380420-2 | นายภีมเดช กลั่นกิ่ง | **Member 3: AI Prompt Engineer (Claude Code & Codex)** | • ออกแบบและดูแล Prompt/Task Instruction สำหรับ **Claude Code และ Codex** ภายใต้ข้อมูลและข้อจำกัดเดียวกัน<br>• สร้าง JUnit tests สำหรับ Target Modified Classes และจัดการ feedback loop เมื่อ compile/test ไม่ผ่าน<br>• เก็บผล generation time, จำนวน test ที่ compile ผ่าน/ไม่ผ่าน และผล benchmark ของ AI ทั้งสองตัว<br>• **Output:** `Claude-sonnet_4_6/TestCode/`, `Codex/TestCode/` และผลการทดลองที่เกี่ยวข้อง |
| 4 | 673380427-8 | นายศุภกิตติ์ ฟันเฟือย | **Member 4: Infrastructure / Data / Repository Manager & Integration Lead** | • จัดเตรียมและดูแล **Docker Environment** (Defects4J + EvoSuite + GRT) ให้สมาชิกใช้สภาพแวดล้อมร่วมกัน<br>• จัดเตรียมและดูแล **Defects4J Dataset** รวมถึงการสกัด Metadata, Target Classes และ Active Bugs ของแต่ละ project<br>• ดูแล **GitHub Repository**, โครงสร้างไฟล์, benchmark protocol และการรวมผลจากสมาชิกทั้ง 3 สาย<br>• เขียนรายงานฉบับสมบูรณ์, จัดทำ Presentation/Demo และ Deploy repository<br>• **Output:** `dataset/`, `docker/`, `scripts/run_benchmark.py`, รายงานฉบับสมบูรณ์, Presentation |

---

> **📖 สำหรับสมาชิกทุกคนในทีม:** ดูขั้นตอนการทำงานแบบละเอียดรายบุคคล คำสั่งที่ต้องใช้ และตำแหน่งส่งมอบไฟล์ได้ที่โฟลเดอร์ [`requirements/`](./requirements/) (ไฟล์แยกตามคน) และ [`GIT-SETUP.md`](./GIT-SETUP.md)

---

## 🎯 ขอบเขตการทดลองและการวัดผล (Scope & Benchmark Methodology)

### 1. ขอบเขตระดับโปรเจกต์ (Project-Level Scope)

- **ชุดข้อมูลทดสอบ:** Java projects ใน Defects4J Dataset ทั้ง **17 Projects** ได้แก่ `Chart`, `Cli`, `Closure`, `Codec`, `Collections`, `Compress`, `Csv`, `Gson`, `JacksonCore`, `JacksonDatabind`, `JacksonXml`, `Jsoup`, `JxPath`, `Lang`, `Math`, `Mockito`, `Time`
- **Validation ปัจจุบัน:** ก่อนรัน benchmark เต็ม ให้ตรวจ pipeline แบบ End-to-End กับ `Lang 1b` ก่อน (ดูสถานะ dataset ที่สกัดแล้วในหัวข้อ **Dataset** ด้านล่าง)
- **คลาสเป้าหมาย (Target Classes Under Test):** โฟกัสการสร้างชุดทดสอบที่ **Target Modified Classes (`classes.modified`)** ซึ่งเป็นคลาสที่มีข้อบกพร่องจริงตามที่ระบุใน Defects4J Ground Truth
- **โหมดการประเมินผล:**
  1. **Sample Benchmark Mode (`--sample-17`):** คัดเลือกบั๊กตัวแทนโปรเจกต์ละ 1 บั๊ก (17 Projects × 4 Techniques = 68 Experiment Units) — ใช้ทดสอบ pipeline ก่อน
  2. **Exhaustive Benchmark Mode (`--all-bugs`):** รันวนลูปทดสอบทุก **Active Bug** ใน Defects4J พร้อมระบบ State Persistence (`progress.json`) กดหยุด/รันต่อ (`--resume`) ได้ตลอดเวลา

### 2. ดัชนีชี้วัดประสิทธิภาพ (Evaluation Metrics)

1. **Line Coverage** — เปอร์เซ็นต์ความครอบคลุมบรรทัดคำสั่งบน Target Class
2. **Branch Coverage** — เปอร์เซ็นต์ความครอบคลุมกิ่งเงื่อนไขบน Target Class
3. **Fault Detection Rate (FDR)** — ชุดทดสอบ Fail บนเวอร์ชัน Buggy (`b`) ตรงกับข้อบกพร่องจริง และ Pass บนเวอร์ชัน Fixed (`f`)
4. **Efficiency** — เวลาที่ใช้สร้างชุดทดสอบ, จำนวน test case ที่สร้างขึ้น, (สำหรับ AI) จำนวน test ที่ compile ผ่าน/ไม่ผ่าน

---

## 📦 ชุดข้อมูล (Dataset) — สถานะ Active Bugs ต่อ Project

Defects4J แต่ละ project มี bug id บางตัวที่ถูก **deprecate** (ถอดออกจาก active set ในเวอร์ชันหลังของ framework) — ต้อง**ตัดออกก่อนรัน benchmark** ไม่เช่นนั้น `defects4j checkout` จะ error หรือ metadata จะไม่ครบ

Metadata ที่สกัดแล้วเก็บไว้ที่ `dataset/defects4j/<Project>_metadata.csv` แต่ละแถวคือ 1 active bug: `bug_id, project, revision_buggy, revision_fixed, jira_id, target_class, triggering_test, error_message`

| # | Project | สถานะการสกัด | จำนวน Active Bugs | Active Bug ID | Deprecated (ตัดออกแล้ว) |
|---|---|---|---|---|---|
| 1 | **Lang** | ✅ สกัดแล้ว (`Lang_metadata.csv`) | **61** | `1, 3–17, 19–24, 26–47, 49–65` | `2, 18, 25, 48` |
| 2 | Chart | ⏳ ยังไม่สกัด | — | — | — |
| 3 | Cli | ⏳ ยังไม่สกัด | — | — | — |
| 4 | Closure | ⏳ ยังไม่สกัด | — | — | — |
| 5 | Codec | ⏳ ยังไม่สกัด | — | — | — |
| 6 | Collections | ⏳ ยังไม่สกัด | — | — | — |
| 7 | Compress | ⏳ ยังไม่สกัด | — | — | — |
| 8 | Csv | ⏳ ยังไม่สกัด | — | — | — |
| 9 | Gson | ⏳ ยังไม่สกัด | — | — | — |
| 10 | JacksonCore | ⏳ ยังไม่สกัด | — | — | — |
| 11 | JacksonDatabind | ⏳ ยังไม่สกัด | — | — | — |
| 12 | JacksonXml | ⏳ ยังไม่สกัด | — | — | — |
| 13 | Jsoup | ⏳ ยังไม่สกัด | — | — | — |
| 14 | JxPath | ⏳ ยังไม่สกัด | — | — | — |
| 15 | Math | ⏳ ยังไม่สกัด | — | — | — |
| 16 | Mockito | ⏳ ยังไม่สกัด | — | — | — |
| 17 | Time | ⏳ ยังไม่สกัด | — | — | — |

**วิธีเช็ค active bugs ของ project ที่เหลือด้วยตัวเอง** (รันในเครื่องที่มี Defects4J แล้ว เช่นใน Docker container):
```bash
defects4j bids -p <Project>          # แสดง active bug id ทั้งหมดของ project นั้น (ตัด deprecated ออกให้อัตโนมัติแล้ว)
defects4j bids -p <Project> | wc -l  # นับจำนวน active bugs
```
คนที่ 4 (ศุภกิตติ์) เป็นผู้รับผิดชอบสกัด metadata ของอีก 16 projects ที่เหลือให้ครบก่อนรัน `--all-bugs` เต็มรูปแบบ

---

## 📜 กฎเหล็กสำหรับชุดทดสอบ (Universal Test Suite Standards)

เพื่อให้ไฟล์เทสจากทุกสายงาน (MOSA, GRT, Claude Code, Codex) คอมไพล์และประเมินผลบน Defects4J ได้โดยไม่ผิดพลาด สมาชิกทุกคนต้องปฏิบัติตาม 4 ข้อนี้:

1. **Framework Hygiene:** ใช้ `import org.junit.Test;` และ `import static org.junit.Assert.*;` เท่านั้น — ห้ามใช้ JUnit 5 หรือ Mocking Framework ภายนอก
2. **Package Declaration:** บรรทัดแรกของไฟล์เทสต้องประกาศ `package` ให้ตรงกับ target class เช่น `package org.apache.commons.lang3.math;`
3. **Execution Guard:** ทุก `@Test` ต้องกำหนด timeout เสมอ เช่น `@Test(timeout = 4000)` เพื่อกัน infinite loop
4. **Deterministic Behavior:** ห้ามใช้ `System.currentTimeMillis()` หรือค่าสุ่มที่ไม่ fix seed

---

## 📂 โครงสร้าง Repository (Directory Structure)

```
ProjectSQA/
├── README.md                          # เอกสารหลักแนะนำโปรเจกต์และข้อกำหนด (ไฟล์นี้)
├── GIT-SETUP.md                       # ขั้นตอน push/clone สำหรับทีม
├── requirements/                      # Spec แยกตามคนรับผิดชอบ (4 ไฟล์)
│   ├── sqa-01-mosa-evosuite.md
│   ├── sqa-02-grt.md
│   ├── sqa-03-claude-code-codex.md
│   └── sqa-04-consolidation-report-deploy.md
├── dataset/                           # Metadata / benchmark dataset ที่สกัดจาก Defects4J
│   └── defects4j/
│       └── Lang_metadata.csv          # Metadata ของ Lang active bugs (61 bugs) — ดูหัวข้อ Dataset
├── docker/                            # สภาพแวดล้อมมาตรฐานสำหรับรัน Defects4J
│   ├── Dockerfile                     # Multi-JDK (8/11/17; Java 11 default) + EvoSuite (auto) + Python
│   ├── docker-compose.yml
│   └── README-docker-desktop.md
├── scripts/
│   └── run_benchmark.py               # Universal Benchmark Runner (--tool evosuite/grt, --sample-17, --all-bugs, --resume)
├── results/                           # ผลลัพธ์การทดลอง (results_evosuite.csv, results_grt.csv, ...)
├── tools/                             # วาง grt.jar ที่นี่ (ไม่ push ขึ้น git)
├── MOSA_EvoSuite/                     # Algorithm 1: MOSA (ผ่าน EvoSuite)
│   ├── Code/
│   ├── Configuration/                 # Search Budget config
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── Test/                          # ไฟล์ JUnit ที่ generate
├── GRT/                                # Algorithm 2: GRT
│   ├── Code/
│   ├── Configuration/
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── Test/
├── Claude-sonnet_4_6/                  # AI Tool 1: Claude Code
│   ├── Prompt/
│   ├── Result/
│   └── TestCode/
└── Codex/                              # AI Tool 2: Codex
    ├── Prompt/
    ├── Result/
    └── TestCode/
```

---

## 🛠️ ขั้นตอนการรันเพื่อทำซ้ำผลลัพธ์ (Steps to Reproduce)

### 1. เปิดใช้งาน Docker Environment (Multi-JDK & Dependencies Ready)

```bash
git clone https://github.com/<your-username>/ProjectSQA.git
cd ProjectSQA/docker

docker compose build
docker compose run --rm sqa-runner bash
```

### 2. การสั่งรัน Benchmark ผ่าน Universal Runner

```bash
# ทดสอบเดี่ยวเฉพาะบั๊กเป้าหมาย (เช่น Lang Bug 1) ก่อนเสมอ
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite

# รันประเมินผลกลุ่มตัวแทน 17 Projects
python3 scripts/run_benchmark.py --sample-17 --tool evosuite

# รันโหมด Exhaustive (ทุก active bug ใน Defects4J) พร้อม resume อัตโนมัติ
python3 scripts/run_benchmark.py --all-bugs --tool evosuite --resume
```
เปลี่ยน `--tool evosuite` เป็น `--tool grt` สำหรับสาย GRT (คนที่ 2)

---

## 📊 ตารางสรุปผลการเปรียบเทียบประสิทธิภาพ (Benchmark Results)

*ตารางสรุปผลการทดลองเปรียบเทียบบนชุดข้อมูลตัวแทน 17 โปรเจกต์ใน Defects4J — เติมค่าเมื่อรันจริงแล้ว:*

| เครื่องมือ / เทคนิค | Line Coverage (%) | Branch Coverage (%) | Fault Detection Rate | เวลาเฉลี่ยต่อคลาส | จุดเด่น | ข้อจำกัด |
|---|---|---|---|---|---|---|
| **MOSA (EvoSuite)** | - | - | - | - | Many-objective search, ครอบคลุมหลาย target พร้อมกัน | Search อาจไม่ converge ในเวลาจำกัด, test smell |
| **GRT** | - | - | - | - | Feedback-directed random testing, เร็วในการเริ่มต้น | Coverage ไม่ deterministic, อาจพลาด edge case เชิงตรรกะ |
| **Claude Code** | - | - | - | - | เข้าใจ context ของโค้ดได้ดี ปรับ test ตาม feedback loop ได้ | ขึ้นกับความชัดเจนของ prompt/dependency ที่ให้มา |
| **Codex** | - | - | - | - | สร้าง test ได้เร็ว รองรับ agentic workflow | Assertion อาจ flaky ในตรรกะซับซ้อน |

---

## 📅 กำหนดการนำส่งงาน (Deliverables Schedule)

1. **รายงานรอบที่ 1 (5%):** ส่งแล้วภายในวันที่ 22 สิงหาคม 2569 ทาง Google Classroom
2. **รายงานฉบับสมบูรณ์ & GitHub (10%):** ส่งภายในวันสุดท้ายของการเรียนการสอน
3. **Live Presentation & Demonstration:** นำเสนอผลการทดลองและสาธิตการทำงานจริงในวันสุดท้ายของการเรียนการสอน
