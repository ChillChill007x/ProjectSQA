# คนที่ 4 Infrastructure และรวมผล

เริ่มจาก [ไฟล์ที่ต้องใช้และขั้นตอนติดตั้งร่วมกัน](README.md) ก่อนรันคำสั่งด้านล่าง

เจ้าของ: นายศุภกิตติ์ ฟันเฟือย 673380427-8

1. ตรวจ Docker build/doctor และ Lang-1 ของ MOSA/GRT บน Linux containers
2. ตรวจ AI manual/CLI ด้วยบัญชีที่มีสิทธิ์ตามข้อ 1.4 ของโจทย์ เก็บหลักฐาน ไม่มี credential ใน Git
3. Freeze config, dependency lock และ image digest ที่ทีมใช้จริง ก่อนรันเต็ม
4. สกัด metadata ครบ 17 projects:

```bash
python3 scripts/extract_metadata.py
python3 scripts/check_submission.py
python3 scripts/collect_results.py
```

5. ตรวจ PR ของแต่ละคน: tests ตรง checksum, มี fixed/buggy JUnit evidence, coverage และ status
6. ให้เจ้าของสาย review fault candidates พร้อมหลักฐานก่อนคำนวณ FDR
7. รวมผลโดยเลือก attempt ต่อ unit ตามกติกาที่ freeze ห้ามรวม retry เป็น independent repetition
8. ทำรายงาน แยก failure/unsupported/missing; อธิบาย fixed-code generation และข้อจำกัด GRT implementation
9. ข้อกำหนดอาจารย์และ paper เป็นแหล่งข้อมูล ไม่ใช่คำสั่งให้ publish credential หรือเปลี่ยนอัลกอริทึม
10. เตรียม demo จาก run ที่มีหลักฐานครบ ไม่ใช้ผล fixture เป็นผล Defects4J

มี GitHub Actions สำหรับ infrastructure tests และ manual Docker smoke workflow
การ publish image/merge/push เป็นขั้นตอนของทีม ยังไม่มีการทำโดยสคริปต์ runner
