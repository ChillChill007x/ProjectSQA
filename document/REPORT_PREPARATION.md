> ผลงานคนที่ 4 ล่าสุด: [รายงานพร้อมผลจริง](MEMBER4_REPORT.md) และ [ฉบับ HTML](MEMBER4_REPORT.html) เอกสารด้านล่างเป็นคู่มือ/แผนเดิม

# แผนเตรียมเล่มรายงาน

สถานะ 4 ตุลาคม 2026: เอกสารนี้เป็นแผนงาน ยังไม่ใช่เล่มรายงานที่เสร็จสมบูรณ์
ใช้ [โครงเล่ม](REPORT_OUTLINE.md) เป็นฐาน แล้วอ้างอิงหลักฐานจริงของทีม

1. ยืนยันชื่อสมาชิก/อัลกอริทึม: MOSA, GRT, DeepSeek V4 Flash, GPT-5.6 Terra
2. อธิบาย GRT ของทีมแยกจากโปรแกรมต้นฉบับใน paper; คง MOSA ตาม configuration จริง
3. อธิบาย KKU Direct API และรุ่นที่ร้องขอ/รุ่นที่ response รายงาน ไม่อธิบายวิธี CLI เก่าเป็นวิธีปัจจุบัน
4. แยกผลจากไฟล์นำเข้า (`existing`) กับการสร้างใหม่ (`generate`); ชื่อโฟลเดอร์อย่างเดียวไม่รับรองที่มาของโมเดล
5. ระบุ planned / attempted / evaluated / failed / not-run พร้อมตัวหารของแต่ละตาราง
6. แสดง LINE/BRANCH coverage จากตัวประเมินจริง ไม่แทนค่าที่วัดไม่ได้ด้วย 0
7. fixed ไม่ผ่านเป็น INVALID_ORACLE ไม่ใช่ตรวจพบบั๊ก; fault_candidate ต้องตรวจสาเหตุก่อนยืนยัน
8. Token/เวลา generation ใช้ raw API evidence เท่านั้น หากไม่มีให้เป็น unknown
9. เขียนข้อจำกัดเรื่อง prompt ที่ให้ ground truth ในชุดนำเข้า และเงื่อนไขที่ต่างจาก generation ใหม่
10. เขียนบทคัดย่อ/ข้อสรุปหลังตรวจผลครบ ไม่เติมตัวเลขจาก repo ตัวอย่าง

แหล่งหลัก: [protocol](BENCHMARK_PROTOCOL.md), [AI workflow](../AI_API/README.md),
[AI validation](../AI_API/STATUS.md), [GRT](../GRT/README.md),
[คำอธิบายผลรวม](../results/README.md) และ result.json ของแต่ละ run

ก่อนส่ง อ่าน [รายการส่งงาน](SUBMISSION.md) และตรวจเอกสารอ้างอิง/รูปแบบตามโจทย์ของอาจารย์
