# ตรวจความครบ GRT sample-17

อัปเดต: 2026-10-02T23:08:15.3384908+07:00

อ้างอิง active bug ที่น้อยที่สุดจาก Defects4J metadata และทุก classes.modified × 2 rounds × 3 seeds; จำกัด hash ชุดปัจจุบันตาม run-ledger ไม่รวม validation หรือ superseded

- หน่วยที่คาดหวัง: 138
- หน่วยที่มีผลจบแล้ว (รวมล้มเหลว): 138
- หน่วยที่มี EVALUATED อย่างน้อยหนึ่ง attempt: 100
- ตรวจ checksum generated Java ของ EVALUATED ทุกชุดรวมประวัติ: 109 ไฟล์; ข้อผิดพลาด 0
- Fault candidate attempts ชุดปัจจุบัน: 10; ต้องตรวจยืนยันโดยมนุษย์ก่อนสรุป confirmed faults

| Project | Expected units | Recorded incl. failures | Units with evaluated attempt |
|---|---|---|---|
| Chart | 6 | 6 | 6 |
| Cli | 6 | 6 | 6 |
| Closure | 6 | 6 | 0 |
| Codec | 18 | 18 | 12 |
| Collections | 6 | 6 | 6 |
| Compress | 6 | 6 | 6 |
| Csv | 6 | 6 | 0 |
| Gson | 6 | 6 | 0 |
| JacksonCore | 12 | 12 | 12 |
| JacksonDatabind | 6 | 6 | 4 |
| JacksonXml | 6 | 6 | 6 |
| Jsoup | 6 | 6 | 6 |
| JxPath | 12 | 12 | 12 |
| Lang | 6 | 6 | 6 |
| Math | 12 | 12 | 0 |
| Mockito | 6 | 6 | 6 |
| Time | 12 | 12 | 12 |

จำนวนหน่วยที่มี EVALUATED เป็นตัวชี้วัดการดำเนินงาน ไม่ใช่การเลือก attempt สำหรับคำนวณผลทางสถิติ ผล failures/retries ต้องรายงานด้วยและใช้เกณฑ์เลือก attempt ที่ทีมยืนยัน. การตรวจนี้ไม่ทดแทน fault review และไม่หมายความว่า tool รองรับทุก target.

## Fault candidates ที่รอตรวจ

- [JacksonCore-1-Round1-s101-751e4be4251e](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s101-751e4be4251e/result.json): com.fasterxml.jackson.core.util.TextBuffer
- [JacksonCore-1-Round1-s101-c8882b0363b1](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s101-c8882b0363b1/result.json): com.fasterxml.jackson.core.io.NumberInput
- [JacksonCore-1-Round1-s202-e5efdd7c0ba0](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s202-e5efdd7c0ba0/result.json): com.fasterxml.jackson.core.util.TextBuffer
- [JacksonCore-1-Round1-s303-11a7502ce352](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s303-11a7502ce352/result.json): com.fasterxml.jackson.core.io.NumberInput
- [JacksonCore-1-Round1-s303-11de01ab9eed](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s303-11de01ab9eed/result.json): com.fasterxml.jackson.core.util.TextBuffer
- [JacksonCore-1-Round2-s101-a7af25776749](Result_Round2/JacksonCore/1/JacksonCore-1-Round2-s101-a7af25776749/result.json): com.fasterxml.jackson.core.io.NumberInput
- [JacksonCore-1-Round2-s101-e069c3133d36](Result_Round2/JacksonCore/1/JacksonCore-1-Round2-s101-e069c3133d36/result.json): com.fasterxml.jackson.core.util.TextBuffer
- [JacksonCore-1-Round2-s202-b9b375a02194-attempt2](Result_Round2/JacksonCore/1/JacksonCore-1-Round2-s202-b9b375a02194-attempt2/result.json): com.fasterxml.jackson.core.util.TextBuffer
- [JacksonCore-1-Round2-s303-126e0bb0ed66](Result_Round2/JacksonCore/1/JacksonCore-1-Round2-s303-126e0bb0ed66/result.json): com.fasterxml.jackson.core.io.NumberInput
- [JacksonCore-1-Round2-s303-6800d23e0a69](Result_Round2/JacksonCore/1/JacksonCore-1-Round2-s303-6800d23e0a69/result.json): com.fasterxml.jackson.core.util.TextBuffer
