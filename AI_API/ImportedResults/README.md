# ความคืบหน้าจากไฟล์ results

ตรวจเมื่อ 2026-10-04T05:55:56.064476+00:00 (UTC)

รายงานนี้อ่านไฟล์ที่ผู้ใช้นำมาใส่ใน results ไม่ได้รัน AI/Defects4J เพิ่ม และไม่สร้าง logs ย้อนหลัง
**100% ในหน้านี้หมายถึงมีสถานะใน CSV ครบรายการบั๊ก ไม่ได้หมายถึงเทสผ่านครบ หรือยืนยันว่าเป็น generation ใหม่**

| รายการ | DeepSeek | GPT |
|---|---:|---:|
| บั๊กที่มีสถานะใน CSV | 854 | 854 |
| มี JSON รายบั๊ก | 193 | 433 |
| มี run log ของบั๊ก/ชุดเดียวกัน | 854 | 854 |
| มี run log ที่ Run_ID ตรง CSV | 0 | 0 |
| hash ชุดเทสปัจจุบันตรงตามวิธีที่ตรวจ | 846 | 0 |
| มี result.json ของ runner ปัจจุบัน | 1 | 1 |

## สถานะที่ CSV รายงาน

| สถานะ | DeepSeek | GPT |
|---|---:|---:|
| COMPILE_ERROR | 661 | 429 |
| FLAKY_OR_REGRESSION | 177 | 308 |
| BUG_DETECTED | 11 | 107 |
| NOT_DETECTED | 4 | 9 |
| NO_SUITE | 1 | 1 |

ทุกแถวด้านบนเป็นสถานะที่ไฟล์รายงาน ไม่ใช่การรับรองโมเดลหรือผลการรันใหม่จากการตรวจครั้งนี้
`BUG_DETECTED` เป็นข้ออ้างในชุดนำเข้า ยังไม่เปลี่ยนเป็น fault_confirmed ของระบบปัจจุบัน

## หลักฐานและสิ่งที่ต้องตรวจต่อ

- [รายละเอียดรายบั๊กและ flags](progress.csv) / [แยกโปรเจกต์](projects.csv)
- [สรุปพร้อมตัวหาร](progress.json) / [รายการแหล่งข้อมูลและ SHA256](source_manifest.json)
- [ค่าที่ขัดแย้งกับ native fixed coverage](coverage_conflicts.json)
- [CSV ต้นทาง](../../results/benchmark_results.csv) / [summary ที่นำเข้า](../../results/ai_existing_summary.csv)
- CSV และ run logs ที่ run-id ต่างกันไม่ถูกนำมารวมเป็นหลักฐานของการรันเดียวกันโดยอัตโนมัติ
- ช่อง model/time/token ที่ไม่มี raw API evidence ยังคงไม่ยืนยัน ไม่คัดลอกค่าประมาณเป็นหลักฐานใหม่
- Math-13 รายงาน NO_SUITE ทั้งสองชุด แต่ขณะตรวจมี Java แล้ว จึงต้องตรวจหรือประเมินใหม่
- delivery logs 29 ไฟล์; สำเนาใน New folder ตรง 0 ไฟล์ และ ZIP ตรง 0/29 ไฟล์ ไม่นับสำเนาเป็นงานเพิ่ม

## Coverage ที่ต้องตรวจแหล่งที่มา

| ชุด / บั๊ก | CSV line / branch | native fixed line / branch |
|---|---|---|
| deepseek Lang-1 | 74.08 / 60.31 | 67.63 / 52.86 |
| openai Lang-1 | 94.09 / 80.1 | 92.37 / 74.86 |

CSV บางค่าอาจเป็นคนละ revision/ตัววัด ต้องย้อนดูรายงาน coverage ดิบก่อนสรุป ไม่เลือกค่าที่สูงกว่าโดยไม่มีหลักฐาน

## แผนของ runner ปัจจุบัน

สรุปจากตำแหน่ง result.json ที่ manifest ระบุ:
- generation: {"NOT_RUN": 1708}
- existing: {"NOT_RUN": 1706, "INVALID_ORACLE": 2}

ไฟล์ progress ของ Campaign/ExistingSuites ไม่ถูกแก้ด้วยข้อมูลนำเข้า เพื่อไม่ให้ runner ข้ามงานที่ยังไม่มีหลักฐานตามสัญญาของระบบ

ตรวจใหม่ได้จาก root: `python -B AI_API/audit_results.py` (เขียนเฉพาะรายงานใน ImportedResults)
