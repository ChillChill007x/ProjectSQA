# คนที่ 1: MOSA_EvoSuite ครบ 854 บัค เฉพาะ Round1

ข้อกำหนดใหม่วันที่ 4 ตุลาคม 2026 ใช้แทนขั้นตอน sample-17/สองรอบของคนที่ 1
ผู้รับผิดชอบ: นายคมชาญ น้อยเนียม 673380395-5

## ขอบเขต

- MOSA ผ่าน EvoSuite 1.2.0 (`-generateMOSuite -Dalgorithm=MOSA`) ไม่เปลี่ยนเป็น DynaMOSA
- **854 active bugs จาก 17 โปรเจกต์; Round1; seed 101; search budget 30 วินาทีต่อ target class**
- เก็บทุก `classes.modified` ของแต่ละบัค ไม่เลือกเฉพาะคลาสแรก
- สร้างจาก fixed revision ประเมิน suite เดิมบน fixed/buggy ด้วย JUnit 4 และ JaCoCo
- คงการรันซ้ำสองครั้งเพื่อตรวจ flaky tests; ต้องผ่าน fixed ก่อนประเมิน buggy
- 30 วินาทีไม่รวม checkout, compile, assertion/minimization และ evaluation
- seed เดียวจึงไม่รายงาน mean/SD ข้าม seeds หรืออ้างว่ามีความแม่นยำเท่าการค้นหานานกว่า

Profile: `config/round1-full854.json` ใช้ **run_full_round1.py** สำหรับงานนี้
คำสั่งเก่า `run_benchmark.py --all-bugs` ยังใช้ค่า legacy ใน config/benchmark.json

## เตรียมเครื่องและตรวจระบบ

รับ commit ใหม่ทั้งชุดจากทีม ใช้ commit/config เดียวกันตลอด campaign
เปิด Docker Desktop ให้ Linux engine ทำงาน แล้วรันใน PowerShell ที่โฟลเดอร์ repository:

```powershell
powershell -ExecutionPolicy Bypass -File scripts/start.ps1
```

เมื่อเข้า shell ของ container แล้ว:

```bash
python3 -m unittest discover -s tests -v
python3 scripts/run_full_round1.py --tool evosuite --prepare
python3 scripts/run_full_round1.py --tool evosuite --smoke
```

prepare ตรวจ IDs จาก `defects4j bids` เทียบรายตัวกับชุดที่ล็อกไว้ ถ้าขาด/เกินแม้จำนวนรวมเท่ากันก็หยุด
และเขียน inventory-mismatch.json ให้ตรวจ Defects4J commit/environment ห้ามลด expected_bugs เพื่อให้ผ่าน
smoke ใช้ Lang-1 ด้วยงบใหม่ มี purpose=validation ไม่นับปนผล 854 บัค ต้องผ่านก่อนรันเต็ม

## รันเต็ม / หยุด / รันต่อ

```bash
python3 scripts/run_full_round1.py --tool evosuite --resume
```

หยุดด้วย Ctrl+C และใช้คำสั่งเดิมเพื่อรันต่อ ผลสำเร็จที่ Java checksum ตรงจะถูกข้าม
งานยังไม่เริ่ม/ค้างจะรันต่อ ส่วน failure ที่จบแล้วเก็บไว้ให้ retry ภายหลัง ไม่วนซ้ำจนไม่ได้ไปบัคถัดไป
ห้ามเปิด runner ซ้ำใน checkout เดียวกัน หรือแก้ source/config ระหว่างรัน

เมื่อจบ pass:

```bash
python3 scripts/run_full_round1.py --tool evosuite --status
python3 scripts/run_full_round1.py --tool evosuite --retry-failed
python3 scripts/run_full_round1.py --tool evosuite --status
```

retry-failed ลองใหม่หนึ่ง pass เฉพาะ failure/งานค้าง ไม่เริ่มบัคที่ยังไม่เคยรัน
หากยังมี NOT_RUN/PARTIAL ใช้ --resume; หยุด runner ก่อน --status ระหว่างรันอ่าน progress.json ได้
Exit code: 0 = prepare ผ่านหรือทุกบัค EVALUATED; 1 = ยังมีงานไม่สำเร็จ; 2 = ปัญหา inventory/environment/lock; 130 = ผู้ใช้หยุด

## อ่านผลและแก้ failures

ตัวรันพิมพ์ตำแหน่ง `MOSA_EvoSuite/Campaigns/round1-full854-30s-s101-v1/<fingerprint>/`
มี manifest.json, progress.json และ bugs.csv จำนวน 854 แถวข้อมูล

| สถานะระดับบัค | ความหมาย |
|---|---|
| NOT_RUN | ยังไม่รัน ใช้ --resume |
| PARTIAL | บาง target ยังไม่รัน ใช้ --resume |
| RUNNING | ยังไม่จบ/อาจถูกหยุด ยืนยัน process เก่าหยุดก่อน --resume |
| METADATA_ERROR | ดึง target/checkout ไม่สำเร็จ ตรวจ error แล้ว --retry-failed |
| FAILED | ทุก target มีบันทึก แต่บาง target ไม่สำเร็จ ตรวจ units/result_path |
| EVALUATED | ทุก target สำเร็จและ Java checksum ตรง ไม่ได้แปลว่าพบบัค |

progress.json มี units/result_path สำหรับเปิด log แต่ละ target
เก็บ TIMEOUT, NO_TESTS, INVALID_TESTS, COMPILE_FAIL, INVALID_ORACLE และ TOOL_ERROR ในรายงาน
ห้ามลบเทสต์ เปลี่ยน assertion หรือลบ scaffolding เพื่อทำให้คะแนนดีขึ้น

รอบนี้กรอง classpath ที่ไม่มีจริงก่อนส่ง EvoSuite และบันทึกไว้ใน generation/classpath-compile.json
ถ้ายังมี missing class ให้ตรวจ dependency ที่ขาดจริง ไม่ได้รับประกันว่าจะรองรับทุก target/bytecode
ถ้า lock ค้างหลังเครื่องดับ ต้องยืนยันว่า runner/container เก่าหยุดก่อนลบเฉพาะ .running.lock ที่ข้อความระบุ
ถ้าเปลี่ยน source/config จะได้ fingerprint ใหม่และเริ่มชุดใหม่ ไม่เอาผลเก่ามานับแทนอัตโนมัติ

## ส่งงาน

- ส่ง MOSA_EvoSuite/Configuration, Test, Result_Round1 และ Campaigns ของ fingerprint ที่ใช้จริง
- สรุปครบ 854 บัค แยกสำเร็จ ล้มเหลว ค้าง ยังไม่รัน พร้อมข้อจำกัด
- เก็บ Round2 และผล 60/180 วินาทีเดิมเป็นประวัติ ไม่นับรวม profile ใหม่
- ไม่ส่ง work/, vendor JARs หรือ credentials

ใช้ manifest/result_path ของ campaign เป็นขอบเขตรายงาน collect_results.py แบบเดิมรวมประวัติทุก profile
จึงห้ามใช้ทั้ง CSV เป็นผลชุดใหม่โดยไม่กรอง Fault candidate ต้อง review ก่อนเรียก confirmed fault
การมีบันทึกครบ 854 ไม่เท่ากับประเมินสำเร็จครบ 854

## สถานะก่อนส่งต่อ

Python regression tests และ Java GRT fixture ผ่านในเครื่องผู้แก้
Docker Linux engine ไม่ทำงานขณะตรวจ จึงยังไม่ได้ยืนยัน MOSA/Defects4J end-to-end ของโค้ดรอบนี้
สมาชิกต้องทำ prepare และ smoke ใน container ก่อนรันจริง
