# AI: DeepSeek V4 Flash และ GPT-5.6 Terra ผ่าน KKU

> สถานะ checkout วันที่ 5 ตุลาคม 2026: สคริปต์ที่หายกู้จาก implementation.zip แล้ว
> แต่ยังขาด active-bugs-17.json และบางพาธของแคมเปญเดิมเป็นโครงสร้างก่อนย้าย
> อ่าน [เงื่อนไขติดตั้งและเริ่มแคมเปญใน README หลัก](../README.md#ai) ก่อนใช้ plan/run
> การรวมข้อมูลนำเข้าปัจจุบันใช้ `python -B scripts/consolidate_member4.py` และ `python -B AI_API/audit_results.py`
> อย่าใช้ collect workflow existing ทับ results/ai_existing_summary.csv ที่เป็นข้อมูลนำเข้า
> คำสั่งทดลองใหม่ด้านล่างต้องใช้แคมเปญและ inventory ที่ตรวจพร้อมแล้ว

คู่มือหลักของทีมสำหรับ Windows PowerShell (รันที่ root ของ repo)
ระบบใช้ Direct API ไม่ต้องติดตั้งหรือ login Claude Code/Codex CLI

| Provider ที่ใช้ในคำสั่ง | Model ID ที่ร้องขอ | โฟลเดอร์ |
|---|---|---|
| deepseek | deepseek-v4-flash | Deepseek-v4_flash |
| openai | gpt-5.6-terra | gpt-5.6-terra |

ใช้ KKU IntelSphere `https://gen.ai.kku.ac.th/api/v1` ด้วย `KKU_API_KEY` เดียวได้
คำว่า openai เป็นชื่อ provider ภายใน runner ไม่ใช่การเรียก endpoint OpenAI โดยตรง

## 1. เตรียมเครื่องครั้งแรก

ติดตั้ง Git, Python 3.10+ และ Docker Desktop (Linux containers/WSL2) เปิด Docker ให้พร้อม
Clone ทั้ง repo ลงไดรฟ์ที่มีที่ว่าง ไม่คัดลอกเฉพาะโฟลเดอร์ AI
ต้องมีพื้นที่ว่างอย่างน้อย 8 GiB ตอนเริ่มงาน; Docker image/checkout ต้องใช้พื้นที่เพิ่ม

```powershell
.\AI_API\setup.ps1
```

setup ตรวจ image `project-sqa:core-v2`; ถ้าไม่มีจะ build จาก Dockerfile ของเรา
ตรวจ Java, Defects4J commit และ dependencies แล้วบันทึก image digest ใน `work/ai-api/runtime.json`
ไม่เริ่ม generation และไม่ติดตั้ง AI CLI ใช้ `-Build` เฉพาะเมื่อต้อง build image ใหม่
ถ้าไม่พบ Python ให้เติม `-Python C:\path\to\python.exe` ได้ทุกคำสั่ง PowerShell

สำหรับสร้างเทสใหม่ ตั้ง key ส่วนตัวใน `.env` (ไม่ commit):

```powershell
if (!(Test-Path -LiteralPath .env)) { Copy-Item -LiteralPath .env.example -Destination .env }
notepad .env
.\AI_API\run.ps1 -Action doctor -CheckModels
```

เติม `KKU_API_KEY=...` ในไฟล์บนเครื่อง ห้ามใส่ key ใน prompt, logs หรือ Git
`doctor -CheckModels` ใช้ GET /models เท่านั้น การประเมินไฟล์เดิมไม่ต้องมี API key:

```powershell
.\AI_API\run.ps1 -Action doctor -Workflow existing
```

## 2. เลือกงานที่จะทำ

- `generate`: สร้างเทสใหม่จาก fixed source ด้วย API แล้ว compile/JUnit/coverage อัตโนมัติ
- `existing`: ประเมิน Java ที่คุณใส่ไว้ใน `TestCode/<Project>_<bug>b/*.java` โดยไม่เรียก AI

ไฟล์ที่ใส่มาแล้วไม่ถูกเขียนทับหรือถูกนับว่าเป็นการสร้างใหม่
การประเมิน existing จะเก็บชื่อโมเดลจากไฟล์เป็น declared model; ไม่รับรองที่มาหรือ token เดิม

## 3. ถ้าจะตรวจไฟล์ที่ใส่มาแล้ว

```powershell
.\AI_API\run.ps1 -Action plan -Workflow existing
.\AI_API\run.ps1 -Action preview -Workflow existing -Project Lang -Bug 1 -MaxUnits 2
.\AI_API\run.ps1 -Action run -Workflow existing -Project Lang -Bug 1 -MaxUnits 2 -Workers 2
.\AI_API\run.ps1 -Action status -Workflow existing -Project Lang
```

เมื่อ pilot ตรงตามที่คาด จึงประเมินทุกบั๊กของโปรเจกต์ที่รับผิดชอบ:

```powershell
.\AI_API\run.ps1 -Action run -Workflow existing -Project Lang,Math -MaxUnits 1708 -Workers 2
```

## 4. ถ้าจะสร้างเทสใหม่ด้วยทั้งสองโมเดล

```powershell
.\AI_API\run.ps1 -Action plan
.\AI_API\run.ps1 -Action preview -Project Lang -Bug 1 -MaxUnits 2
.\AI_API\run.ps1 -Action resume
.\AI_API\run.ps1 -Action run -Project Lang -Bug 1 -MaxUnits 2 -TokenBudget 200000 -AllowApiCalls
.\AI_API\run.ps1 -Action status -Project Lang
```

`-Provider all` เป็นค่าเริ่มต้น; ใช้ `-Provider deepseek` หรือ `-Provider openai` เพื่อเลือกตัวเดียว
`-MaxUnits 2` = สองงาน (Lang-1 โมเดลละหนึ่งงาน) ไม่ใช่สองรอบการทดลอง
`-Bug` เป็นตัวเลือก; ถ้าไม่ใส่จะเลือกทุก active bug ของ `-Project`
ไม่ใส่ Project = ทั้ง 17 โปรเจกต์ ใช้ preview ตรวจขอบเขตก่อน run
ตัวอย่างแบ่งทีม: แต่ละคนใช้รายชื่อ Project ที่ไม่ทับกัน แล้วใช้ทั้งสองโมเดลในโปรเจกต์ของตัวเอง

รันต่อด้วยคำสั่ง run เดิมได้: ข้ามทุกงานที่มี result แล้ว รวมงานล้ม/หยุดค้าง
ผลที่ล้มต้องตรวจสาเหตุก่อน ไม่ retry API อัตโนมัติและไม่สลับ key/model เงียบ ๆ
`TokenBudget` คือเพดานแบบประมาณเผื่อของการเรียกคำสั่งครั้งนั้น ไม่ใช่ยอดโควตาคงเหลือของ KKU
การรันต่อครั้งใหม่มี budget ใหม่ ต้องคำนึงถึงยอดรวมบัญชีด้วย

```powershell
.\AI_API\run.ps1 -Action pause
```

pause หยุดคำขอ API ถัดไป; คำขอที่ส่งไปแล้วอาจทำต่อจนจบ ไม่ใช่การยกเลิกค่าใช้จ่ายย้อนหลัง
ไม่หยุด workflow existing ซึ่งไม่ได้ใช้ API

## 5. หลักฐานที่บันทึกอัตโนมัติ

```text
Deepseek-v4_flash/ หรือ gpt-5.6-terra/
  Prompt/Lang_1b/<run-id>/
    run-config.json, TASK.md, source-inventory.json, provenance.json
    attempt-1/request.json, actual_prompt.md, response.json, completion.txt, feedback.json, tests/
  TestCode/Lang_1b/<run-id>/...GeneratedTest.java
  Result/Lang_1b/<run-id>/
    result.json, generation_metrics_attempt-1.json
    generation/, ai-feedback-1/, evaluation-1/fixed/, evaluation-1/buggy/, evaluation-1/baseline/
```

existing เก็บสำเนาเทส/prompt/metrics ที่นำเข้าพร้อม SHA256 และผลประเมินใหม่ใน run-id ของตัวเอง
ชื่อไฟล์ต่อคลาสแบบเดิมยังอยู่ที่ชั้น `<Project>_<bug>b/` และไม่ถูกแก้
`result.json` เป็นสถานะสุดท้าย; generation metrics เพียงอย่างเดียวไม่ใช่หลักฐานว่าเทสผ่าน
ผลผิดพลาดและคำตอบถูกตัดจะถูกเก็บไว้ ไม่เติมโค้ด/ตัวเลข/เวลาให้ดูเหมือนสำเร็จ

## 6. ดูสถานะและส่งงาน

```powershell
.\AI_API\run.ps1 -Action status
.\AI_API\run.ps1 -Action status -Workflow existing
.\AI_API\run.ps1 -Action collect
.\AI_API\run.ps1 -Action collect -Workflow existing
python -B scripts/check_submission.py --tool deepseek
python -B scripts/check_submission.py --tool openai
```

status อ่านอย่างเดียว ดูได้ระหว่างรันโดยไม่ต้องถามผู้ช่วย
CSV ใหม่: `results/ai_generate_summary.csv` และ `results/ai_existing_summary.csv`
ไม่ดึง `results/benchmark_results.csv` ที่นำเข้ามาเป็นผลใหม่
ส่งโฟลเดอร์ Prompt/Result/TestCode ของงานตัวเองพร้อม manifest ใน `AI_API/Campaign` หรือ `AI_API/ExistingSuites`
และไฟล์ source/config/scripts/protocol ที่ใช้ร่วมกัน ไม่ส่ง `.env`, `work/`, credentials
ผลรันที่ใช้รายงานต้องมี hash ตรง, fixed ผ่าน, logs fixed/buggy ครบ; fault_candidate ต้อง review ก่อนเรียกว่า fault confirmed
เมื่อรวม Git ให้เก็บ per-run JSON แล้วใช้ collect สร้าง CSV อีกครั้ง ไม่แก้ CSV เป็นแหล่งความจริง

## เงื่อนไขการทดลองที่ตรึงไว้

854 active bugs / 17 projects / 1,070 Java targets และ resource metadata 3 รายการ
สองโมเดล = 1,708 หน่วยทดลอง; หนึ่งชุดต่อบั๊กต่อโมเดล (อาจมีหลายคลาสในชุดเดียว)
API เริ่มหนึ่งคำขอ ซ่อมจากผล fixed ได้ไม่เกิน 2 ครั้ง คำตอบสูงสุด 4,096 tokens/คำขอ
ใช้ fixed source ทุก target, ตัด comments เพื่อประหยัด input; ไม่ส่ง root cause, patch หรือ triggering tests
DeepSeek ปิด thinking; GPT ใช้ reasoning_effort=none ต้องตรวจความเข้ากันได้กับ KKU ด้วยการรันจริง
JUnit ทำซ้ำสองครั้งต่อ revision เพื่อตรวจความคงที่ ไม่ใช่สร้างเทสใหม่สองรอบ
JaCoCo เก็บ coverage ต่อคลาส; compile fail ไม่ถูกแทนด้วย coverage 0
ผลจาก protocol นี้อาจต่างจากชุดตัวอย่าง ซึ่งมี prompt/ข้อมูลนำเข้าและตัววัดต่างกัน

Manifest ตรึง code/config/prompt/image หลัง plan หากเปลี่ยนไฟล์ที่มีผลต่อการทดลอง runner จะหยุด
ห้ามแก้ manifest หรือ result เพื่อข้ามการตรวจ ต้องเก็บแคมเปญเดิมเป็นประวัติก่อนวางแผนรอบใหม่
MOSA/GRT ใช้คำสั่งและอัลกอริทึมเดิม คู่มือ AI นี้ไม่เปลี่ยนจำนวนรอบ/seed ของสองอัลกอริทึม

Linux/WSL ใช้ `python3 -B scripts/ai_workspace.py setup` แล้วใช้ action เดียวกัน เช่น
`python3 -B scripts/ai_workspace.py run --workflow existing --projects Lang --bugs 1 --max-units 2`

Prompt ที่ runner ใช้สร้างใหม่คือ `prompts/ai-api-system.txt`; master_prompt ที่นำเข้าในสองโฟลเดอร์เป็นหลักฐานเดิม ไม่ถูกใช้สร้างใหม่โดยอัตโนมัติ


## ความคืบหน้าจากผลที่นำมาใส่ใน results

อ่าน [สรุปความคืบหน้าที่ตรวจจากไฟล์](ImportedResults/README.md) และ [สถานะรวม](STATUS.md)
ข้อมูลชุดนี้มีสถานะใน CSV ครบ 854 บั๊กต่อโมเดล แต่ยังต้องตรวจความตรงกันของ run-id, hash และ coverage
รายงานแยกจาก Campaign/ExistingSuites เพราะแผนเหล่านั้นนับ result.json ของ runner ปัจจุบัน

ตรวจไฟล์ results และสร้างรายงานใหม่ได้โดยไม่ใช้ API หรือรันเทส:

```powershell
python -B AI_API/audit_results.py
```

ผลตรวจอยู่ใน `AI_API/ImportedResults/`: progress.json, progress.csv, projects.csv,
source_manifest.json และ coverage_conflicts.json
การใช้ action collect ของ runner จะสร้าง CSV จาก native result.json เท่านั้น
อย่าใช้ collect เพื่อรักษาตารางนำเข้าที่ไม่มี native result.json; เก็บ snapshot/ตรวจ source_manifest ก่อน
