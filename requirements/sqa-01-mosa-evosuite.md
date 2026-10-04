# คนที่ 1 MOSA ผ่าน EvoSuite

**ข้อกำหนดปัจจุบัน (4 ตุลาคม 2026): [MOSA ครบ 854 บัค เฉพาะ Round1](sqa-01-mosa-full854-round1.md)**
ใช้คู่มือใหม่นี้สำหรับ prepare, smoke, resume, retry และส่งงาน แทน sample-17/สองรอบเดิม

เริ่มจาก [ไฟล์ที่ต้องใช้และขั้นตอนติดตั้งร่วมกัน](README.md) ก่อนรันคำสั่งด้านล่าง

เจ้าของ: นายคมชาญ น้อยเนียม 673380395-5
ใช้ environment กลาง ไม่เปลี่ยนเป็น DynaMOSA และไม่เปลี่ยนชื่ออัลกอริทึม
คำสั่งจริงเลือก `-generateMOSuite -Dalgorithm=MOSA` และใช้ EvoSuite 1.2.0 บน Java 8

```bash
python3 scripts/run_full_round1.py --tool evosuite --prepare
python3 scripts/run_full_round1.py --tool evosuite --smoke
python3 scripts/run_full_round1.py --tool evosuite --resume
python3 scripts/check_submission.py --tool evosuite
```

ตรวจ Configuration/run-config.json, Result_Round*/result.json และ Test ของ run เดียวกัน
generated scaffolding เป็นส่วนของ suite ต้องส่งด้วย ห้ามบังคับลบ import runtime ที่ EvoSuite ต้องใช้
ถ้า generator ไม่รองรับ bytecode/โปรเจกต์ ให้เก็บ failure พร้อม log และแจ้งคนที่ 4
ก่อนรันครบ 854 บัค ให้ตรวจ Lang-1 compile/run/coverage ทั้ง fixed/buggy ผ่าน pipeline
ใช้ขั้นตอน commit/push ใน GIT-SETUP.md ไม่ต้องย้ายผลด้วยมือ
