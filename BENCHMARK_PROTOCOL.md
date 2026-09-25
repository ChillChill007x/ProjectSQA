# Benchmark protocol v2

ผลจาก `doctor.py --smoke` มี `purpose=validation` และต้องตัดออกจากการวิเคราะห์ผลทดลอง
CSV แสดงคอลัมน์ purpose ให้กรอง `experiment` เท่านั้น งานตรวจระบบก่อนเพิ่ม field นี้
ใช้ไฟล์ `validation-only.json` ข้าง result.json เพื่อแยกโดยไม่เปลี่ยนหลักฐานเดิม
รายการที่มี `superseded_by` เป็นหลักฐานเก่าที่มีผลแก้ไขแทนแล้ว ห้ามใช้คำนวณผล

ตัวประเมินใช้ JaCoCo offline instrumentation บนสำเนา compiled SUT ของทุกเครื่องมือ
รายงานเทียบกับ bytecode ต้นฉบับ และเริ่ม collector ก่อน EvoSuite sandbox โดยปิด online
instrumentation (`excludes=*`) เพื่อไม่ instrument ซ้ำ ไม่แก้ generated tests หรืออัลกอริทึม
วิธีนี้รองรับ separate classloader ตาม [คู่มือ EvoSuite](https://www.evosuite.org/documentation/measuring-code-coverage/)

## เครื่องมือและขอบเขต

คง MOSA, GRT, Claude Code, Codex ตามที่ทีมลงทะเบียน ไม่เปลี่ยน GRT เป็น Randoop ธรรมดา
GRT implementation ของทีมอ้างอิง DOI 10.1109/ASE.2015.49; รายละเอียด/ส่วนที่จำกัดใน GRT/README.md
ไม่อ้างว่าเป็น original artifact หรือ reproduction ที่ผ่านการยืนยันทางสถิติ

ใช้ Defects4J 3.0.1 commit ตาม config/dependencies.lock.json, Java 11, TZ America/Los_Angeles
EvoSuite 1.2.0 generator ใช้ Java 8 แยก ตัวประเมินทุกสายใช้ Java 11 + JUnit 4.13.2 + JaCoCo 0.8.13
Java bytecode ที่ EvoSuite/Java 8 ไม่รองรับต้องรายงานเป็นข้อจำกัด ไม่แก้ source ให้ผ่าน

ขอบเขตเริ่มต้นคือทุก modified class ของบั๊กตัวแทนหนึ่งตัวต่อ 17 projects จาก `defects4j bids`
ขยายเป็นทุก active bug เมื่อ pipeline ผ่านและทีมตกลงทรัพยากร; sample-17 ไม่เท่ากับทุก active bug
metadata ดึงด้วย CLI, เก็บทุก target/trigger ไม่ตัดเหลือรายการแรก

## ข้อมูลที่ใช้สร้างเทสต์และ oracle

**Protocol นี้เลือกสร้าง regression tests จาก FIXED revision (`f`) สำหรับทั้งสี่สาย**
แล้ว freeze source เทสต์และ checksum ก่อนประเมินบน `f` และ `b`
นี่เป็นการเลือกวิธีทดลองของทีมเพื่อให้มี regression oracle ที่คาดหวังพฤติกรรมถูกต้อง
ต้องบอกในรายงานว่า generator เห็น fixed code และไม่เทียบตรงกับการสร้างบน buggy code โดยไม่แยกเงื่อนไข

generator ใช้ target จาก classes.modified และ dependency/source ที่จำเป็น
ห้ามให้ AI ใช้ patch, triggering tests, developer test oracles, buggy revision หรือผลจากอีกสายเพื่อเขียนเทสต์
manual mode ต้องรักษาเงื่อนไขนี้เช่นเดียวกับ CLI mode
prompt รุ่นเดียวกันใช้กับ AI ทั้งสอง เก็บคำสั่งและคำตอบทุกครั้ง
AI CLI อ่าน source/เขียนเทสต์; Python evaluator รัน compile/test/coverage แล้วส่ง feedback (สูงสุด 2 ครั้ง)
ไม่อ้างว่าเป็นบริการ API ส่งข้อความธรรมดา และไม่สมมติว่า subscription ครอบคลุมค่า API

## หน่วยทดลองและ budget

หน่วยคือ tool × project × bug × target class × round × seed
Round1/2 มี algorithm budget 60/180 วินาที, seeds 101/202/303 เป็นค่าที่ทีมเลือกและแก้ได้ใน config
GRT หยุดได้เมื่อครบ max_tests หรือ budget เพื่อจำกัดขนาด suite ต้องรายงานเงื่อนไขหยุดและค่าจริง
EvoSuite time budget เป็น search budget; subprocess timeout มีเผื่อ startup/minimization
GRT budget ครอบคลุม analysis/generation ใน engine; total generation_time_sec ยังรวม JVM startup
จึงรายงานทั้ง configured budget และเวลาจริง ไม่กล่าวว่า overhead ของทุกเครื่องมือเท่ากัน
AI มี generation/repair wall-clock limit แยก 900 วินาที ไม่ใช้ seed ไปอ้างว่าควบคุมความสุ่มของ model ได้
Round ของ AI เป็นป้ายรอบทดลอง และใช้ prompt/config ที่ถูกเก็บจริง
ตรึง config/version ก่อนรันเต็ม การแก้ source/config เปลี่ยน implementation hash และ run-id
การใช้เวลาและต้นทุนรัน sequence ทำให้ GRT/MOSA อาจให้ผลต่างแม้ seed เดิม ให้ทำซ้ำและรายงานการกระจาย

## การประเมิน

1. checkout และ compile โปรเจกต์ก่อน generation; แยก workspace ต่อ run/attempt
2. compile เฉพาะ generated `.java` ด้วย classpath ของ revision นั้นและ runtime ที่จำเป็น
3. รันเฉพาะ generated JUnit tests ด้วย fresh JVM สองครั้งต่อ revision
4. จับเวลาทั้ง process และ timeout ของเทสต์; ไม่ใช้ exit code ของการ build โปรเจกต์แทนผล generated tests
5. เก็บ test identity, จำนวน tests/ignored/assumptions, failure exception/stack trace และ coverage XML
6. suite ต้องมีเทสต์จริง ไม่มี ignored/assumption skip และผ่านบน fixed ทั้งสองครั้ง
7. coverage ของ target class: LINE และ BRANCH ของ JaCoCo; LINE ไม่ใช่ instruction coverage ใน paper
   branch denominator เป็น 0 ให้ค่า null/N/A ไม่ใส่ 0% หรือ 100% โดยพลการ
8. ประเมิน buggy ด้วย suite เดิม; การ fail เฉพาะ buggy เป็น `fault_candidate` จนกว่ามนุษย์ตรวจสาเหตุ

`fault_confirmed` เริ่ม null เสมอ ตรวจ stack trace/source/patch หลัง freeze suite จึงใช้ review_fault.py
ตัวอย่าง:

```bash
python3 scripts/review_fault.py GRT/Result_Round1/Lang/1/<run-id>/result.json \
  --confirmed yes --reviewer "member-name" \
  --evidence "testX fails at NumberUtils line ... due to the documented defect; same assertion passes on fixed"
```

ห้ามนับ compile error, missing dependency, timeout, tool crash, NoClassDefFoundError หรือ flaky test เป็นบั๊กที่ตรวจเจอ
แยก infra/runtime failures ออกจาก evaluated suites ที่ไม่พบ fault
ก่อนคำนวณ FDR ระดับ bug ให้รวม targets ของ bug เดียวกันและใช้หนึ่ง attempt ที่เลือกด้วยกติกาล่วงหน้า
รายงานจำนวน bugs ที่สำเร็จ/ล้มเหลว/ยังไม่รันและตัวหาร FDR ชัดเจน ไม่ทิ้งรายการล้มเหลวจากสรุปโดยไม่แจ้ง
ผล CSV เก็บทุก attempt เพื่อ audit; ห้ามเฉลี่ยทุกแถวทันทีโดยไม่ตัด attempt ซ้ำ

## หลักฐานส่งงาน

แต่ละ run เก็บ config, tool/model version, prompt/response (AI), seed, generated tests,
checksum, command/exit code/time, JUnit JSON, coverage XML และ status/error
ไฟล์ .class, .exec, binaries และ checkout อยู่ใน work/หรือถูก ignore ไม่ส่ง Git
ผลสำเร็จต้องใช้ check_submission.py ก่อน commit เพื่อป้องกันแก้ tests หลัง evaluation
ชุด fixture ของระบบอยู่ tests/ และผลอยู่ work/smoke-java เท่านั้น ไม่ใช่ข้อมูล Defects4J

## แหล่งอ้างอิง

- [GRT paper](https://people.kth.se/~artho/papers/lei-ase2015.pdf), Sections III-A ถึง III-F
- [Defects4J reproducibility](https://github.com/rjust/defects4j#reproducibility)
- [EvoSuite command line](https://www.evosuite.org/documentation/commandline/)
- [Randoop Bloodhound reference implementation](https://randoop.github.io/randoop/api/randoop/generation/Bloodhound.html)
- [Codex non-interactive mode](https://developers.openai.com/codex/noninteractive)
- [Claude Code programmatic execution](https://code.claude.com/docs/en/headless)
