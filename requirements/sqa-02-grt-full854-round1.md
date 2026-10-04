# คนที่ 2: GRT ครบ 854 บัค เฉพาะ Round1

ข้อกำหนดใหม่วันที่ 4 ตุลาคม 2026 ใช้แทนขั้นตอน sample-17/สองรอบของคนที่ 2
ผู้รับผิดชอบ: นายปฏิภาณ มะนิลทิพย์ 673380589-2

## ขอบเขต

- GRT Java implementation ของทีมใน GRT/Code/src/sqa/grt/GuidedRandom.java
  คงหกกลไกตามขอบเขตใน GRT/README.md ไม่แทนด้วย Randoop ไม่อ้างว่าเป็น binary ต้นฉบับ
- **854 active bugs จาก 17 โปรเจกต์; Round1; seed 101; budget 30 วินาทีต่อ target class**
- เก็บทุก classes.modified ไม่เลือกเฉพาะบัค/target ที่ง่าย
- สร้างจาก fixed ประเมิน suite เดิมบน fixed/buggy ด้วย JUnit 4 และ JaCoCo
- คงการรันซ้ำสองครั้งเพื่อตรวจ flaky tests ต้องผ่าน fixed ก่อนประเมิน buggy
- coverage feedback interval = **10 วินาที** สำหรับ profile นี้ เพราะค่าเดิม 50 วินาทียาวกว่างบใหม่
- คง max_tests 100 และ pool/sequence limits เดิม GRT อาจหยุดก่อนงบเมื่อครบจำนวนเทสต์
- seed เดียวไม่เพียงพอคำนวณ mean/SD ข้าม seeds ต้องระบุข้อจำกัดในรายงาน

Profile: config/round1-full854.json ใช้ **run_full_round1.py** สำหรับงานนี้
run_benchmark.py แบบเดิมยังใช้ค่า legacy งบ 30 วินาทีไม่รวม checkout/compile/evaluation

## เตรียมเครื่องและตรวจระบบ

รับ commit ใหม่ทั้งชุดจากทีม ใช้โค้ด/config ตรงกับคนที่ 1 และคงเดิมตลอด campaign
เปิด Docker Desktop ให้ Linux engine ทำงาน แล้วรันใน PowerShell ที่โฟลเดอร์ repository:

```powershell
powershell -ExecutionPolicy Bypass -File scripts/start.ps1
```

เมื่อเข้า shell ของ container แล้ว:

```bash
python3 -m unittest discover -s tests -v
python3 tests/smoke_java.py
python3 scripts/run_full_round1.py --tool grt --prepare
python3 scripts/run_full_round1.py --tool grt --smoke
```

smoke_java ตรวจกลไก GRT, compile, JUnit, coverage และบัคจำลอง
prepare ตรวจ active bug IDs ทั้ง 854 รายตัว ถ้าไม่ตรงให้ตรวจ commit/environment และ inventory-mismatch.json
ห้ามลด expected_bugs เพื่อให้ผ่าน smoke ใช้ Lang-1 ด้วยงบใหม่ มี purpose=validation ไม่นับปนผลจริง

## รันเต็ม / หยุด / รันต่อ

```bash
python3 scripts/run_full_round1.py --tool grt --resume
```

หยุดด้วย Ctrl+C ใช้คำสั่งเดิมรันต่อ งานสำเร็จที่ checksum ตรงจะถูกข้าม งานยังไม่เริ่ม/ค้างจะรันต่อ
failure ที่จบแล้วเก็บไว้รอ retry จึงเดินไปบัคถัดไปได้และไม่เขียนทับหลักฐานเดิม
ห้ามเปิด runner ซ้ำใน checkout เดียวกัน หรือแก้ source/config ระหว่างรัน

เมื่อจบ pass:

```bash
python3 scripts/run_full_round1.py --tool grt --status
python3 scripts/run_full_round1.py --tool grt --retry-failed
python3 scripts/run_full_round1.py --tool grt --status
```

หนึ่งคำสั่ง retry = หนึ่ง pass ไม่วนไม่สิ้นสุด และไม่เริ่มบัคที่ยังไม่เคยรัน
ถ้ายังมี NOT_RUN/PARTIAL ใช้ --resume หยุด runner ก่อน --status ระหว่างรันอ่าน progress.json ได้
Exit code: 0 = prepare ผ่านหรือทุกบัค EVALUATED; 1 = ยังมีงานไม่สำเร็จ; 2 = ปัญหา inventory/environment/lock; 130 = ผู้ใช้หยุด

## อ่านผลและจุดที่แก้

ตัวรันพิมพ์ตำแหน่ง `GRT/Campaigns/round1-full854-30s-s101-v1/<fingerprint>/`
มี manifest.json, progress.json และ bugs.csv จำนวน 854 แถวข้อมูล

| สถานะระดับบัค | ความหมาย |
|---|---|
| NOT_RUN | ยังไม่รัน ใช้ --resume |
| PARTIAL | บาง target ยังไม่รัน ใช้ --resume |
| RUNNING | ยังไม่จบ/อาจถูกหยุด ยืนยัน process เก่าหยุดก่อน --resume |
| METADATA_ERROR | ดึง target/checkout ไม่สำเร็จ ตรวจ error แล้ว --retry-failed |
| FAILED | ทุก target มีบันทึก แต่บาง target ไม่สำเร็จ ตรวจ units/result_path |
| EVALUATED | ทุก target สำเร็จและ Java checksum ตรง ไม่เท่ากับพบบัค |

- GRT รองรับ class/constructor/method ที่ source เข้าถึงได้จาก package ของ generated tests
  เช่น package-private target ไม่ถูกปฏิเสธเพียงเพราะไม่เป็น public
- ยังไม่เปิด private members และยังไม่รองรับ non-static inner constructor แบบ outer.new Inner()
- overload primitive/boxed ที่เคยทำ Chart compile ไม่ผ่านมีการแก้ก่อนหน้านี้แล้ว และยังมี regression test
- metadata ของบัคหนึ่งล้มเหลวไม่ทำให้ข้ามบัคที่เหลือทั้งโปรเจกต์
- ตรวจ generation/grt.json: counters, generated_tests, unresolved_inputs, invocation_timeout
  counters ไม่ได้พิสูจน์ว่า implementation เทียบเท่า GRT ต้นฉบับ

เก็บ COMPILE_FAIL, INVALID_ORACLE, FLAKY, TIMEOUT, NO_TESTS และ TOOL_ERROR ในรายงาน
ห้ามแก้ assertion หรือลบเทสต์เพื่อทำให้ผ่าน Fault candidate ต้อง review ก่อนยืนยัน
ถ้า lock ค้างหลังเครื่องดับ ยืนยัน runner/container เก่าหยุดก่อนลบเฉพาะ .running.lock ที่ข้อความระบุ
เมื่อแก้ source/config จะเกิด fingerprint ใหม่เพื่อไม่ปนผลต่างเวอร์ชัน

## ส่งงาน

- ส่ง GRT/Code เมื่อแก้ engine, Configuration, Test, Result_Round1 และ Campaigns ของ fingerprint ที่ใช้จริง
- สรุปครบ 854 บัค แยกสำเร็จ ล้มเหลว ค้าง ยังไม่รัน พร้อมข้อจำกัดของ implementation
- เก็บ Round2 และผล 60/180 วินาทีเก่าเป็นประวัติ ไม่นับรวม profile ใหม่
- ไม่ส่ง work/, vendor JARs หรือ credentials

ใช้ manifest/result_path ของ campaign เป็นขอบเขตรายงาน collect_results.py แบบเดิมรวมทุก profile
ห้ามใช้ CSV ทั้งหมดแทนผลชุดนี้ รายงานจำนวนบัคจาก bugs.csv ไม่ใช้จำนวน Java/attempts แทน

## สถานะก่อนส่งต่อ

Python regression tests และ Java fixture ผ่านในเครื่องผู้แก้ รวม package-private target,
compile generated source, JUnit, JaCoCo และตรวจบัคจำลอง
Docker Linux engine ไม่ทำงานขณะตรวจ จึงยังต้องทำ prepare/Lang-1 smoke ใน container
ของสมาชิกเพื่อยืนยัน Defects4J/Java 11 ของโค้ดรอบนี้ก่อนรันจริง
