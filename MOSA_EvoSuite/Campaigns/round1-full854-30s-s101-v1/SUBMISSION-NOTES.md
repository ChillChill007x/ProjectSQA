# บันทึกการส่งผล MOSA 854 บัค (Round1, seed 101, 30 วินาที)

งานแบ่งรันสองเครื่อง ใช้ profile เดียวกัน (round1-full854-30s-s101-v1) แต่ manifest/fingerprint แยกกัน

| ชุด | Campaign | บัค | โปรเจกต์ |
|---|---|---|---|
| คนที่ 1 | 29e4cf7257fa | 263 | Chart, Cli, Codec, Collections, Csv, Gson, JacksonCore, JacksonXml, JxPath, Mockito, Time |
| เพื่อน | da06c7626076 | 591 | Closure, Compress, JacksonDatabind, Jsoup, Lang, Math |

8ee82810bd2a คือความพยายามแรกที่ตั้งใจรัน 854 บัคบนเครื่องเดียวแล้วหยุด เก็บไว้เป็นประวัติ ไม่นับเป็นผลหลัก

## สถานะ (ระดับบัค)

- ชุดคนที่ 1 หลัง --retry-failed หนึ่ง pass: EVALUATED 212, FAILED 51, NOT_RUN 0
- ชุดเพื่อน ตาม progress.json (updated 2026-10-05 04:34 UTC): EVALUATED 429, FAILED 162, NOT_RUN 263 (263 บัคนี้คือชุดคนที่ 1)
- EVALUATED ไม่ได้แปลว่าพบบัค; fault_candidate=True ต้องผ่าน review_fault.py ก่อนเรียกว่ายืนยัน

## ข้อสังเกตและข้อจำกัด

1. รหัส implementation ต่างกัน: ชุดคนที่ 1 = 3daf9d81... (ตรงกับ commit eaf7ba6b); ชุดเพื่อนมี 23ed78b7... (714 ผล) และ 8e4d591b... (33 ผล) เพื่อนแก้ไฟล์ในเครื่องเล็กน้อย ซึ่งเพื่อนแจ้งว่าไม่กระทบผล (ยังไม่ได้ตรวจ diff อิสระ) ไฟล์ live-sync.json และ resume-compatible.json ในโฟลเดอร์ campaign ของเพื่อนเป็นไฟล์ช่วยซิงก์ ไม่ใช่ผลทดลอง
2. ดิสก์ C: เต็มเมื่อประมาณ 05:10 (5 ต.ค.) ทำให้ attempt แรกของ Csv-11 และ Csv-12 เสียหาย (ไฟล์ว่าง/checksum ไม่ตรง) attempt แรกทั้งสองถูกย้ายออกจากชุดส่ง ส่วน attempt2 ของทั้งสองบัค EVALUATED ตามปกติ
3. ผลล้มเหลวของเพื่อน 7 รายการ (JacksonDatabind 2/7/30/31 = TIMEOUT; Jsoup 50/52, Math 98 = NO_TESTS) ไม่มีเทสต์ถูกสร้าง จึงสร้างโฟลเดอร์ Test ว่างพร้อม .gitkeep เพื่อให้โครงสร้างครบ ไม่เปลี่ยนผล
4. ผลล้มเหลวทุกชนิด (INVALID_ORACLE, COMPILE_FAIL, TIMEOUT, NO_TESTS, INVALID_TESTS, COVERAGE_ERROR, FLAKY) ถูกเก็บไว้ตามจริง ไม่มีการลบเทสต์หรือแก้ assertion
5. seed เดียว (101) จึงไม่รายงาน mean/SD ข้าม seed

6. retry ไม่เท่ากัน: ชุดคนที่ 1 (263 บัค) รัน --retry-failed หนึ่ง pass ส่วนชุดเพื่อน (591 บัค) ไม่ได้รัน retry เพราะเวลาไม่พอ จึงเปรียบเทียบอัตราสำเร็จของสองชุดโดยตรงไม่ได้
