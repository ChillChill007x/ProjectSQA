# คนที่ 1 MOSA ผ่าน EvoSuite

เริ่มจาก [ไฟล์ที่ต้องใช้และขั้นตอนติดตั้งร่วมกัน](README.md) ก่อนรันคำสั่งด้านล่าง

เจ้าของ: นายคมชาญ น้อยเนียม 673380395-5
ใช้ environment กลาง ไม่เปลี่ยนเป็น DynaMOSA และไม่เปลี่ยนชื่ออัลกอริทึม
คำสั่งจริงเลือก `-generateMOSuite -Dalgorithm=MOSA` และใช้ EvoSuite 1.2.0 บน Java 8

```bash
python3 scripts/doctor.py --smoke evosuite
python3 scripts/run_benchmark.py --tool evosuite --project Lang --bug 1 --seed 101
python3 scripts/run_benchmark.py --tool evosuite --sample-17 --round Round1 --resume
python3 scripts/run_benchmark.py --tool evosuite --sample-17 --round Round2 --resume
python3 scripts/check_submission.py --tool evosuite
```

ตรวจ Configuration/run-config.json, Result_Round*/result.json และ Test ของ run เดียวกัน
generated scaffolding เป็นส่วนของ suite ต้องส่งด้วย ห้ามบังคับลบ import runtime ที่ EvoSuite ต้องใช้
ถ้า generator ไม่รองรับ bytecode/โปรเจกต์ ให้เก็บ failure พร้อม log และแจ้งคนที่ 4
ก่อนรัน sample-17 ให้ตรวจ Lang-1 compile/run/coverage ทั้ง fixed/buggy ผ่าน pipeline
ใช้ขั้นตอน commit/push ใน GIT-SETUP.md ไม่ต้องย้ายผลด้วยมือ
