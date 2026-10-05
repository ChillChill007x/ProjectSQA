# คนที่ 4 Infrastructure รวมผลและรายงาน

ผู้รับผิดชอบ นายศุภกิตติ์ ฟันเฟือย 673380427-8
ขอบเขตปัจจุบันคือ MOSA ผ่าน EvoSuite, GRT ของทีม, DeepSeek V4 Flash และ GPT-5.6 Terra
ผลการทำงานอยู่ใน [รายงาน](../document/MEMBER4_REPORT.md) และ [ชุดผลรวม](../results/member4/README.md)

## ทำซ้ำการรวมผล

```powershell
python -B scripts/consolidate_member4.py
python -B AI_API/audit_results.py
python -B scripts/build_member4_report.py
python -B -m unittest discover -s tests -p "test_*.py" -v
```

ตัวรวมตรวจ hashes, รายชื่อไฟล์ suite, fixed/buggy JUnit สองครั้ง, สถานะ fixed,
ตัวตนของ tests และไฟล์ coverage แล้วสร้าง CSV/JSON ใน results/member4
ไม่ใช้ API ไม่รัน Java และไม่แก้ raw results
collect_results.py ยังใช้ส่งออก native runs ทุก attempt ได้ แต่ไม่ใช่ตารางที่คัด attempt แล้ว

## กติกาของรายงาน

1. แยก imported claims กับ native results และ validation/superseded
2. แยก budget, seed, protocol และ implementation ไม่รวม retry เป็น repetition
3. เลือก attempt แรกตาม started_at ต่อ unit JSON เป็นการวิเคราะห์ย้อนหลัง ไม่อ้างว่า freeze ก่อนทดลอง
4. ค่าที่วัดไม่ได้เป็นช่องว่าง ไม่ใช่ coverage 0 แสดงจำนวนข้อมูลและตัวหาร
5. candidate ที่ไม่มี human review ไม่ใช่ confirmed bug และยังไม่สรุป confirmed FDR
6. inventory จาก manifest เป็น snapshot ไม่ใช่ Defects4J metadata query ใหม่
7. image digest ใน manifest เป็นหลักฐานเดิม ไม่ใช่ผล Docker verification ปัจจุบัน

## งานที่ต้องใช้ระบบรันจริง

เปิด Docker Desktop ใน Linux containers แล้วตรวจ setup/doctor/Lang-1 ของ MOSA/GRT
ประเมิน AI จากชุดเดิมโดยจัดแคมเปญใหม่หลัง freeze source/config/prompt/image
ตรวจ full metadata ทั้ง 17 projects ด้วย scripts/extract_metadata.py
เก็บ failures และตรวจ fault queue กับ patch/API contract ก่อนยืนยัน
ใช้ [demo](../document/MEMBER4_DEMO.md) เปิดหลักฐานเดิมได้โดยไม่ต้องสร้างเทสต์ใหม่
