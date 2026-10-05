> โครงร่างสำหรับเขียนเล่ม ยังไม่ใช่รายงานฉบับส่ง ผลและสถานะล่าสุดดู [AI](../AI_API/STATUS.md) และหลักฐานแต่ละ run

# โครงเล่มรายงานฉบับสมบูรณ์

สถานะ: โครงสำหรับเขียนต่อ ยังไม่ใช่เล่มส่งงาน — 29 กันยายน 2026

ชื่อเรื่องเสนอ: การเปรียบเทียบการสร้างกรณีทดสอบอัตโนมัติด้วย MOSA, GRT, DeepSeek V4 Flash และ GPT-5.6 Terra บน Defects4J

ชื่อภาษาอังกฤษเสนอ: Comparing MOSA, GRT, DeepSeek V4 Flash, and GPT-5.6 Terra for Automated Test Generation on Defects4J

ใช้ชื่อเดิมได้หากทีมต้องการ แต่ชื่อฉบับสมบูรณ์ควรสื่อว่ามีการเปรียบเทียบ AI ด้วย
โครง 5 บทนี้เป็นข้อเสนอเพื่อจัดเนื้อหา ไม่ใช่รูปแบบบังคับที่อ้างว่ามาจากอาจารย์

## ส่วนต้น

- ปก: รายวิชา CP353201 Software Quality Assurance, ชื่ออาจารย์และชื่อ/รหัสทั้ง 4 คนตรวจจากรายงานเดิม
- บทคัดย่อ: ปัญหา → วิธีทดลอง → ขอบเขตจริง → ผลตัวเลขสำคัญ → ข้อจำกัด; เขียนเมื่อผลครบ
- คำนำ สารบัญ สารบัญตาราง สารบัญภาพ; ใช้ field/caption อัตโนมัติใน Word
- รายการคำย่อหากจำเป็น: SUT, MOSA, GRT, FDR, CLI

## บทที่ 1 บทนำ

1.1 ความเป็นมาและปัญหาการสร้าง unit tests อัตโนมัติ

1.2 วัตถุประสงค์: สร้างชุดทดสอบ Java เปรียบเทียบความครอบคลุม การตรวจพบข้อบกพร่อง และต้นทุนการทำงาน

1.3 คำถามการทดลองที่เสนอ

- RQ1 แต่ละเครื่องมือให้ line/branch coverage และอัตราสร้าง suite ที่ใช้ประเมินได้เท่าใด?
- RQ2 ตรวจพบบั๊กที่ยืนยันแล้วกี่รายการ ภายใต้ขอบเขตและ oracle ที่กำหนด?
- RQ3 การเปลี่ยน budget ของ MOSA/GRT และเงื่อนไขรอบ AI ที่บันทึกจริงสัมพันธ์กับผลและเวลาที่ใช้อย่างไร?
- RQ4 ข้อจำกัดและความล้มเหลวชนิดใดกระทบการใช้งานแต่ละเครื่องมือ?

1.4 ขอบเขต: Defects4J version/commit, project/bug/class manifest, 4 เครื่องมือ, fixed-to-buggy protocol

1.5 สิ่งที่ได้จากโครงงาน: code, configuration, tests, evidence และกระบวนการทำซ้ำ

## บทที่ 2 ทฤษฎีและงานที่เกี่ยวข้อง

2.1 Unit testing, JUnit, test oracle, regression testing, line/branch coverage และ fault detection

2.2 Defects4J: buggy/fixed revisions, modified classes และ triggering tests; แยกข้อมูลที่ใช้สร้างกับข้อมูลที่ใช้ตรวจผล

2.3 MOSA: many-objective search, preference sorting, archive, fitness; แยกจาก DynaMOSA

2.4 GRT: Constant Mining, Impurity, Elephant Brain, Detective, Orienteering, Bloodhound

2.5 DeepSeek V4 Flash/GPT-5.6 Terra: เครื่องมือกับ model เป็นคนละส่วน; อธิบายรูปแบบที่ทีมทดลองจริง

2.6 งานวิจัยที่เกี่ยวข้องและตารางเปรียบเทียบหลักการ; ไม่ใส่ผลคาดเดาว่าเครื่องมือใดชนะ

แหล่งตั้งต้น: รายงานรอบแรก, paper GRT ที่แนบ, bibliography เดิม; ตรวจแหล่งต้นฉบับก่อนนำข้อความเฉพาะทางมาใช้

## บทที่ 3 วิธีดำเนินงาน

3.1 ภาพรวมระบบและผู้รับผิดชอบ 4 คน

3.2 Dataset manifest และกติกาคัดเลือก target/attempt พร้อมแยก validation กับ experiment

3.3 สภาพแวดล้อม: Docker/image, OS, CPU/RAM, Java 8/11, Defects4J, EvoSuite, JUnit, JaCoCo และ commit

3.4 การนำ MOSA มาใช้และ implementation GRT ของทีม พร้อม mapping 6 กลไกและ deviations

3.5 Prompt ที่ใช้จริงของ AI, model/interface, ขอบเขตไฟล์ที่เห็น, feedback/repair และการเก็บ provenance

3.6 การออกแบบการทดลอง: unit, rounds/seeds, budgets, timeouts, stopping criteria และความไม่เท่ากันของงบ AI/algorithm

3.7 การประเมินกลาง: สร้างจาก fixed → freeze/hash → compile generated tests → fresh JVM ซ้ำสองครั้งต่อ revision
→ JaCoCo offline coverage → fault candidate → human review

3.8 นิยาม metrics, ตัวหาร FDR, วิธีรวม targets/seeds, การจัดการ N/A/failures/duplicate attempts

3.9 วิธีทำซ้ำและตรวจความครบของหลักฐาน

3.10 ข้อจำกัดของการทดลองที่ทราบล่วงหน้า: fixed oracle, scope, GRT implementation, stochasticity, model drift,
งบเวลาและ assertion power ที่ต่างกัน

ใช้ [BENCHMARK_PROTOCOL.md](BENCHMARK_PROTOCOL.md), [GRT/README.md](../GRT/README.md),
[config/benchmark.json](../config/benchmark.json), [dependencies.lock.json](../config/dependencies.lock.json)
และ [prompt ปัจจุบัน](../prompts/ai-test-generation-prompt.md) เป็นฐาน

## บทที่ 4 ผลการทดลองและอภิปรายผล

ยังไม่เติมตัวเลขจนมี experiment จริง; ใช้ช่อง “รอผล” แทน 0 เพื่อไม่สื่อว่าได้ทดลองแล้ว

4.1 ความครบของการดำเนินงาน: planned / attempted / evaluated / failed / not-run แยก tool และ project

4.2 ผล line และ branch coverage พร้อมจำนวนข้อมูล วิธีเฉลี่ยและการกระจาย

4.3 ผลตรวจพบบั๊ก: unique confirmed bugs, FDR พร้อมตัวหาร และ candidates ที่ยังไม่ผ่าน review

4.4 เวลา จำนวน tests และ repair attempts; บอก configured budget ควบคู่ actual time

4.5 เปรียบเทียบสองรอบตามเงื่อนไขที่ใช้จริง; AI ไม่ถือว่าเป็น budget 60/180 วินาทีตามชื่อรอบโดยอัตโนมัติ

4.6 Case study: ผลตรวจพบบั๊กที่ยืนยัน, coverage สูงแต่ไม่พบ fault, หรือ generation/runtime failure ตามข้อมูลที่มีจริง

4.7 ตอบ RQ1–RQ4 ด้วยหลักฐาน และอภิปราย confounders แทนการเหมารวมว่า tool ใดดีที่สุดทุกกรณี

แต่ละตาราง/กราฟต้องมีรายการ run-id หรือ dataset ที่ย้อนกลับได้; ตัวอย่างตารางสรุป:

| Tool | Project | Round | Planned | Evaluated | Failed | Not-run | Line % | Branch % | Confirmed bugs / planned bugs |
|---|---|---|---|---|---|---|---|---|---|
| รอผล experiment | รอข้อมูล | รอข้อมูล | รอข้อมูล | รอข้อมูล | รอข้อมูล | รอข้อมูล | รอผล | รอผล | รอ review |

ห้ามนำค่าของ validation Lang-1 มาแทนแถวผลหลัก หากกล่าวถึงให้แยกเป็นผลตรวจระบบในบทที่ 3/ภาคผนวก

## บทที่ 5 สรุปและข้อเสนอแนะ

5.1 สรุปตามวัตถุประสงค์และ RQ โดยใช้เฉพาะสิ่งที่ข้อมูลรองรับ

5.2 ข้อจำกัด: validity ของ oracle, coverage ไม่เท่ากับ correctness, ความครบของ dataset,
AI repeatability, resource/budget differences และ GRT deviations

5.3 บทเรียนจากการพัฒนาและแนวทางใช้งานที่เหมาะกับผลจริง

5.4 งานต่อยอดที่เป็นข้อเสนอ แยกออกจากงานที่ทำสำเร็จแล้ว

## เอกสารอ้างอิงและภาคผนวก

- อ้างอิงรูปแบบเดียวกันทั้งเล่ม ทุก citation มีรายการท้ายเล่ม และไม่อ้างชื่อรุ่นใหม่โดยใช้แหล่งเก่าที่ไม่รองรับ
- ภาคผนวก ก: คำสั่งเริ่มระบบและทำซ้ำ พร้อม commit/version ที่ส่ง
- ภาคผนวก ข: config/budget/seeds และ dataset manifest
- ภาคผนวก ค: prompt/feedback/provenance ตัวอย่างจริงที่ไม่มีข้อมูลลับ
- ภาคผนวก ง: ตัวอย่าง generated tests, JUnit results, coverage และ fault review
- ภาคผนวก จ: ตารางคะแนนฉบับเต็ม/สถานะที่ล้มเหลวและที่ยังไม่รัน
- ภาคผนวก ฉ: งานที่สมาชิกแต่ละคนรับผิดชอบ และลิงก์ artifact ใน repository

ตรวจรายการพร้อมส่งตาม [REPORT_PREPARATION.md](REPORT_PREPARATION.md) ก่อนจัด Word/PDF ฉบับสุดท้าย
