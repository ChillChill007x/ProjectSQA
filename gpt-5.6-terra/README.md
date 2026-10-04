# gpt-5.6-terra

ชุดงานของทีม ProjectSQA ผ่าน KKU Direct API
[คู่มือเริ่มต้นและคำสั่ง](../AI_API/README.md)

## โครงสร้างโฟลเดอร์

จัดกลุ่มตามโปรเจกต์ (17 โปรเจกต์ รวม 854 บั๊ก) ภายในแต่ละโปรเจกต์เป็นโฟลเดอร์ `<Project>_<bug>b/`

```
gpt-5.6-terra/
├── Prompt/     master_prompt_gpt.md
│   └── <Project>/<Project>_<bug>b/    input จริง / config / request / response / usage ของแต่ละ attempt
├── Result/
│   └── <Project>/<Project>_<bug>b/    result.json พร้อม compile, JUnit, coverage, baseline logs และ generation metrics
└── TestCode/
    └── <Project>/<Project>_<bug>b/    Java ที่สร้างหรือ snapshot ของ Java ที่นำมาประเมิน (GptTest.java)
```

จำนวนบั๊กต่อโปรเจกต์: Chart 26 · Cli 39 · Closure 174 · Codec 18 · Collections 28 · Compress 47 · Csv 16 · Gson 18 · JacksonCore 26 · JacksonDatabind 110 · JacksonXml 6 · Jsoup 93 · JxPath 22 · Lang 61 · Math 106 · Mockito 38 · Time 26

ไฟล์ชั้นตรง `<Project>/<Project>_<bug>b/` ที่ใส่มาก่อนเป็นชุดนำเข้า ยังไม่รับรอง model/time/token จากชื่อไฟล์
ผลรันใหม่อยู่ใต้ `<Project>/<Project>_<bug>b/<run-id>/` จึงไม่เขียนทับชุดนำเข้า
ใช้ workflow existing เพื่อตรวจ Java เดิม หรือ generate เพื่อสร้างใหม่จากโมเดลที่เลือก
ผล CSV เดิมไม่ถูกนำมารวมเป็นผลใหม่ ดู [สถานะระบบ](../AI_API/STATUS.md)

หมายเหตุ: ไฟล์ `result.json` และไฟล์ในโฟลเดอร์รัน (ตัวอย่าง `Lang_1b`) เป็นผลที่ evaluator สร้าง ยังอ้างพาธตามโครงสร้างเดิมที่ไม่มีชั้นโปรเจกต์ หากต้องรัน evaluator ซ้ำให้ใช้โครงสร้างเดิม

## ผลประเมิน benchmark

ที่มา: `ai_existing_summary.csv` (รอบประเมินซ้ำ `Reevaluation-s0`)

| รายการ | ผลล่าสุด |
|---|---:|
| มี suite ให้ประเมิน | 853/854 |
| `NO_SUITE` | 1 |
| ประเมินเสร็จและวัด coverage ได้ | 424 |
| `COMPILE_ERROR` | 429 |
| `FLAKY_OR_REGRESSION` | 308 |
| `NOT_DETECTED` | 9 |
| `BUG_DETECTED` | 107 |
| FDR ต่อ suite evaluations | 107/853 = 12.54% |
| Line / Branch coverage เฉลี่ย (ทุกชุดที่วัดได้) | 88.34% / 82.55% (n=424) |
| Line / Branch coverage เฉลี่ย (เฉพาะชุดที่ผ่านบน fixed version: `BUG_DETECTED` + `NOT_DETECTED`) | 97.43% / 93.50% (n=116) |

สถานะ `BUG_DETECTED` ต้องมี failure บน buggy version และไม่มี failure บน fixed version
ชุดที่ `COMPILE_ERROR` ไม่มีค่า coverage จึงไม่ถูกนำมาเฉลี่ย (ไม่ใช่ coverage 0%)
ส่วนชุด `FLAKY_OR_REGRESSION` มีค่า coverage และรวมอยู่ใน n ของ "ทุกชุดที่วัดได้" (424 = 853 − 429)

## ผล generation

คำนวณจากไฟล์ `Result/<Project>/<Project>_<bug>b/generation_metrics_*.json`: 1,066 records เฉลี่ย 20,860.32 tokens และ 89.81 วินาทีต่อ record
ค่านี้เป็นข้อมูลการสร้างเทสต์ ไม่มี run ID เชื่อมกับผล benchmark detection จึงห้ามตีความเป็น token/เวลาต่อบั๊กที่ตรวจพบ
