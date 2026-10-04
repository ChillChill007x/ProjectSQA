# คนที่ 2 GRT

**ข้อกำหนดปัจจุบัน (4 ตุลาคม 2026): [GRT ครบ 854 บัค เฉพาะ Round1](sqa-02-grt-full854-round1.md)**
ใช้คู่มือใหม่นี้สำหรับ prepare, smoke, resume, retry และส่งงาน แทน sample-17/สองรอบเดิม

เริ่มจาก [ไฟล์ที่ต้องใช้และขั้นตอนติดตั้งร่วมกัน](README.md) ก่อนรันคำสั่งด้านล่าง

เจ้าของ: นายปฏิภาณ มะนิลทิพย์ 673380589-2
คง GRT ตามการลงทะเบียน ใช้ Java engine ของทีมที่พัฒนาจากหกกลไกของ Ma et al. ASE 2015
อ่าน GRT/README.md ก่อนทดลอง โดยเฉพาะ static analysis, helper search และ pool bounds ที่ต่างจาก paper

```bash
python3 tests/smoke_java.py
python3 scripts/run_full_round1.py --tool grt --prepare
python3 scripts/run_full_round1.py --tool grt --smoke
python3 scripts/run_full_round1.py --tool grt --resume
python3 scripts/check_submission.py --tool grt
```

ส่ง GRT/Code เมื่อแก้ engine, Configuration, Result_Round1, Test และ Campaigns ของชุดใหม่
ตรวจ generation/grt.json: method weights, coverage feedback, unresolved inputs, invocation timeout
การมี counters ไม่ใช่หลักฐานว่า implementation เทียบเท่าต้นฉบับ ต้องอธิบายข้อจำกัดและทดลองจริง
ผล test count คือ JUnit methods ที่รันจริง ไม่ใช่จำนวนไฟล์ Java
ห้ามใช้ Python draft เดิมหรือแทน GRT ด้วย uniform Randoop
