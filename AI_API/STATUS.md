# สถานะ AI — ผลที่พบใน results

อัปเดตจากการตรวจไฟล์วันที่ 4 ตุลาคม 2026 ไม่ได้เริ่ม AI หรือรัน Defects4J ใหม่ในงานนี้

## ความคืบหน้าที่ไฟล์รายงาน

CSV มีสถานะครบ **1,708 รายการ: DeepSeek 854 บั๊ก + GPT 854 บั๊ก ครบทั้ง 17 โปรเจกต์**
นี่คือความครบของรายการสถานะ ไม่ได้หมายความว่าเทสผ่านหรือยืนยัน generation model ครบ 100%

| สถานะใน benchmark_results.csv | DeepSeek | GPT |
|---|---:|---:|
| COMPILE_ERROR | 661 | 429 |
| FLAKY_OR_REGRESSION | 177 | 308 |
| NOT_DETECTED | 4 | 9 |
| BUG_DETECTED ตามที่ไฟล์รายงาน | 11 | 107 |
| NO_SUITE | 1 | 1 |
| รวม | 854 | 854 |

รายละเอียดและลิงก์หลักฐานทุกบั๊กอยู่ที่ [ความคืบหน้าชุดนำเข้า](ImportedResults/README.md)
ดู [แยกตามโปรเจกต์](ImportedResults/projects.csv), [รายละเอียดรายบั๊ก](ImportedResults/progress.csv)
และ [แหล่งข้อมูลพร้อม SHA256](ImportedResults/source_manifest.json)

## ผลตรวจหลักฐาน

- พบ run logs ของ project/bug/ชุดโมเดลครบ 854 รายการต่อชุด แต่ Run_ID ใน logs ไม่ตรงกับ Run_ID ใน CSV ทั้ง 1,708 แถว
- hash ของชุด Java ปัจจุบันตรงวิธีคำนวณที่ตรวจ: DeepSeek 846 รายการ; GPT 0 รายการ
  ชื่อไฟล์และรูปแบบการคำนวณมีผลต่อ hash จึงไม่ใช้ความไม่ตรงนี้สรุปที่มาของโมเดลโดยลำพัง
- summary ที่นำเข้ามี result_path ว่าง 1,706 แถว; อีก 2 แถวเชื่อมกับ native Lang-1
- CSV ของ Lang-1 ใช้ run-id เดียวกับ native result แต่ coverage ต่างกัน:

| ชุด | CSV line / branch | native fixed line / branch |
|---|---|---|
| DeepSeek | 74.08 / 60.31 | 67.63 / 52.86 |
| GPT | 94.09 / 80.10 | 92.37 / 74.86 |

ยังต้องตรวจ revision/ตัววัดจาก coverage ดิบ ไม่รวมตัวเลขที่ขัดแย้งเป็นผลของ run เดียวกัน
Math-13 รายงาน NO_SUITE ทั้งสองชุด แต่พบ Java ปัจจุบันแล้ว จึงต้องประเมินหรือกระทบยอดใหม่
ไฟล์ delivery logs 29 ไฟล์มีทั้งฉบับแตกไฟล์และ ZIP ซึ่งไม่ตรงกันแบบ byte-for-byte
ตัวอย่างที่ตรวจพบมีการเอา emoji ออกจากข้อความ log; เก็บทั้งสองฉบับและไม่นับเป็นการรันเพิ่ม

## สถานะ runner ปัจจุบัน

แผนของ runner ตรวจจาก result.json จริงที่ตำแหน่งใน manifest:

| Workflow | มี result.json | ยังไม่พบ result.json |
|---|---:|---:|
| สร้างใหม่ผ่าน API | 0 | 1,708 |
| ประเมินชุดนำเข้า | 2 | 1,706 |

สอง native records คือ Lang-1 ทั้งคู่เป็น INVALID_ORACLE:
DeepSeek fixed ล้ม 5/45 tests และ GPT fixed ล้ม 1/35 tests มี logs ของ fixed/buggy และ hash ของ test snapshot
ความคืบหน้าของ runner ไม่ถูกเติมเป็น EVALUATED จาก CSV เพื่อไม่ให้ระบบข้ามงานที่ยังไม่มีหลักฐานตาม manifest
สถานะนี้ไม่ได้ยืนยันว่าไม่เคยมีการรันจากเครื่องหรือ workflow อื่น แต่ระบุขอบเขตหลักฐานที่ตรวจได้ใน repo นี้

## หลักฐานการตรวจระบบ

- [ผลตรวจไฟล์ results ครั้งนี้](validation/results-audit-2026-10-04.json): ขอบเขต, แหล่งข้อมูล, hash และข้อขัดแย้ง
- [ผลตรวจระบบครั้งก่อน](validation/workflow-2026-10-04.json): tests 49 ข้อผ่าน, Docker/Defects4J ผ่าน และ pilot Lang-1
  ตัวเลข 49 เป็นผลตรวจครั้งก่อน ไม่ใช่การรัน tests เพิ่มในงานนี้
- [รายละเอียด native DeepSeek](../Deepseek-v4_flash/Result/Lang_1b/Lang-1-Reevaluation-s0-87f11725d7a0/result.json)
- [รายละเอียด native GPT](../gpt-5.6-terra/Result/Lang_1b/Lang-1-Reevaluation-s0-b6cd12c8a406/result.json)

API รุ่นที่เลือกคือ deepseek-v4-flash และ gpt-5.6-terra ผ่าน KKU
การตรวจ GET /models ครั้งก่อนยืนยันว่าบัญชีเห็น model IDs แต่ไม่ยืนยันว่า Java ชุดนำเข้าถูกสร้างด้วยรุ่นนั้น
ยังไม่มี raw request/response ของ generation ใหม่ใน Campaign ให้ใช้ยืนยัน token/model เพิ่ม

ตรวจความคืบหน้าชุดนำเข้าอีกครั้ง: `python -B AI_API/audit_results.py`
ไฟล์รายงานเขียนเฉพาะใน AI_API; ไม่แก้ CSV/Java/logs ต้นทาง ไม่ push และไม่เริ่ม API
