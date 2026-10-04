# Checklist ก่อนส่งต่อและรันเต็ม

1. ทุกคน pull commit/config ที่ทีมตกลงตรงกัน
2. เปิด Docker แล้วใช้ scripts/start.ps1 หรือ start.sh ให้ doctor ผ่าน
3. คนที่ 1/2 ทำ prepare และ smoke ตามคู่มือ full854-round1 ของตน ตรวจ Java, JUnit และ coverage จริง
4. คนที่ 3 เตรียม prompt ของ AI ทั้งสอง ทำหนึ่ง task กรอก provenance และ evaluate-run ให้ผ่าน
5. ตรวจว่าออก container แล้ว results อยู่ และ --resume ไม่รันหน่วยที่ผ่านซ้ำ
6. ตรวจ negative case: test ที่ compile ไม่ผ่านต้องเป็น COMPILE_FAIL ไม่ใช่ EVALUATED
7. คนที่ 4ตรวจ protocol และ limitations ของ GRT กับรายงาน คงชื่อ algorithms ที่ลงทะเบียน
8. คนที่ 1/2 freeze code/config แล้วใช้ run_full_round1.py --tool grt หรือ evosuite --resume เก็บทุก failure
9. เฉพาะ algorithms ทำ Round1, seed101, 30 วินาที ทุก 854 active bugs ไม่ทำ Round2
10. ตรวจ --status / --retry-failed ตามคู่มือ และ review fault candidates แยกจาก failures
11. check_submission, commit/push เฉพาะโฟลเดอร์ตนเองและเปิด PR
12. คนที่ 4รวมผลจาก JSON สร้าง summary/วิเคราะห์พร้อมรายงานจำนวนรายการที่ล้มเหลวและยังไม่รัน

นิยามพร้อมส่ง: มีหลักฐานการรันจริงครบ ไม่ใช่เพียงมี folder หรือข้อความ success
AI ต้องระบุชื่อ model ที่ใช้จริง ไม่เดาจากชื่อ folder
