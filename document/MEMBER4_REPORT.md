# รายงานการเปรียบเทียบและตรวจหลักฐานการสร้างกรณีทดสอบ

## MOSA GRT DeepSeek V4 Flash และ GPT 5.6 Terra บน Defects4J

รายวิชา CP353201 Software Quality Assurance ภาคเรียน 1 ปีการศึกษา 2569
มหาวิทยาลัยขอนแก่น จัดทำส่วนรวมผลและรายงานตามหน้าที่คนที่ 4
ตรวจข้อมูลวันที่ 5 ตุลาคม 2026 ตามเวลาประเทศไทย

รายงานฉบับนี้สรุปผลที่มีอยู่จริงพร้อมข้อจำกัด ยังไม่ใช่การรับรอง confirmed fault detection
หรือการรับรองว่า Docker และการเรียก API ทำงานครบวงจรบนเครื่องปัจจุบัน
หน้าที่คนที่ 3 ใช้ DeepSeek V4 Flash และ GPT-5.6 Terra ตามการเปลี่ยนขอบเขตล่าสุด

| สมาชิก | รหัสนักศึกษา | ความรับผิดชอบ |
|---|---|---|
| นายคมชาญ น้อยเนียม | 673380395-5 | MOSA ผ่าน EvoSuite |
| นายปฏิภาณ มะนิลทิพย์ | 673380589-2 | GRT |
| นายภีมเดช กลั่นกิ่ง | 673380420-2 | DeepSeek V4 Flash และ GPT-5.6 Terra |
| นายศุภกิตติ์ ฟันเฟือย | 673380427-8 | Infrastructure metadata รวมผลและรายงาน |

## บทคัดย่อ

โครงงานศึกษาการสร้างกรณีทดสอบ Java บน Defects4J โดยแยกความสำเร็จในการประเมิน
ความครอบคลุมของโค้ด และความสามารถในการตรวจพบข้อบกพร่อง การตรวจครั้งนี้รวบรวม native result.json
2,562 รายการจากสี่โฟลเดอร์ และตาราง AI นำเข้า 1,708 แถวสำหรับ 854 บั๊กใน 17 โปรเจกต์ต่อโมเดล
ผล MOSA/GRT รอบ 30 วินาทีครอบคลุมรายชื่อบั๊กทั้งหมด แต่มีหลายเวอร์ชัน implementation และหลาย attempt
จึงแยกกลุ่มก่อนคำนวณ ไม่รวมผลที่เลือกจากเงื่อนไขต่างกันเป็นการแข่งขันชุดเดียว

ตาราง AI รายงานชุดที่ผ่าน fixed จำนวน 15 ชุดสำหรับ DeepSeek และ 116 ชุดสำหรับ GPT
โดยมีสถานะตรวจพบบั๊ก 11 และ 107 บั๊กตามลำดับ ค่านี้เป็น candidate ที่รายงานในชุดนำเข้า
ยังไม่ใช่ confirmed FDR เพราะยังไม่มีหลักฐาน human fault review ที่เชื่อมกับชุดทดสอบครบ
และ run-id ของ CSV ไม่ตรงกับ run logs ที่จัดเก็บ การตรวจ native suites พบ hash และ JUnit evidence
ผ่านเกณฑ์ของตัวตรวจในรายการ EVALUATED แต่การตรงกันของไฟล์ไม่ได้ยืนยันความสัมพันธ์กับบั๊กเป้าหมาย
ผลจึงสนับสนุนการรายงานหลายตัวชี้วัดร่วมกับระดับหลักฐาน มากกว่าการจัดอันดับผู้ชนะจาก coverage เพียงค่าเดียว

## บทที่ 1 บทนำ

### 1.1 ความเป็นมา

การสร้าง unit tests อัตโนมัติช่วยลดงานเขียนชุดทดสอบ แต่โค้ดที่สร้างขึ้นอาจ compile ไม่ผ่าน
ใช้ oracle ผิด หรือเข้าถึงบรรทัดจำนวนมากโดยไม่มี assertion ที่ตรวจบั๊กได้
งานนี้จึงพิจารณาตั้งแต่ความครบของข้อมูลจนถึงหลักฐาน fixed/buggy ของชุดทดสอบเดียวกัน
การมีไฟล์ Java หรือมีแถวใน CSV ไม่เท่ากับการมีผลประเมินที่ใช้เปรียบเทียบได้

### 1.2 วัตถุประสงค์และคำถามวิจัย

- RQ1 แต่ละเทคนิคมีผลประเมินที่ใช้ได้และ coverage เท่าใดภายใต้เงื่อนไขที่บันทึกจริง
- RQ2 มี differential failures กี่รายการ และมีรายการใดผ่านการยืนยันความสัมพันธ์กับบั๊กแล้ว
- RQ3 ข้อมูลเวลาและ token รองรับการเปรียบเทียบต้นทุนได้มากน้อยเพียงใด
- RQ4 ความล้มเหลวและช่องว่างหลักฐานใดกระทบความน่าเชื่อถือและการทำซ้ำ

### 1.3 ขอบเขตและสิ่งส่งมอบ

ขอบเขตคือ MOSA ผ่าน EvoSuite, GRT ที่ทีมพัฒนา, Deepseek-v4_flash และ gpt-5.6-terra
ข้อมูลหลักมาจาก Configuration, Test/TestCode, Prompt, Result และ results
สิ่งส่งมอบประกอบด้วยตัวรวมผลที่รันซ้ำได้ ตารางราย run/ราย project, inventory 17 โปรเจกต์,
รายการ fault ที่รอตรวจ, รายงาน Markdown/HTML และ demo เปิดหลักฐานเดิม
รายงานตัวอย่างและ evaluation.zip ใช้ศึกษารูปแบบเท่านั้น ไม่ใช้ตัวเลขหรือผลของทีมอื่น

## บทที่ 2 หลักการและงานที่เกี่ยวข้อง

### 2.1 การประเมินกรณีทดสอบ

Line coverage คือสัดส่วนบรรทัดที่ถูกเรียกใช้ต่อบรรทัดที่วัดได้ ส่วน branch coverage
คือสัดส่วนแขนงที่ถูกเรียกใช้ต่อแขนงทั้งหมดที่ตัววัดนับได้ Coverage สูงไม่ได้รับรองว่า assertions ถูกต้อง
ใน protocol นี้ suite ต้องผ่าน fixed ก่อนจึงใช้ differential failure บน buggy เป็น candidate
ผลที่ fixed ล้มเป็น invalid oracle ไม่ใช่ความสำเร็จในการตรวจบั๊ก

### 2.2 Defects4J

Defects4J จัดเตรียม faulty/fixed revisions และเครื่องมือสำหรับการทดลองกับข้อบกพร่องจริงใน Java
ที่มาของแนวทางอ้างอิงงานของ Just, Jalali และ Ernst (2014)
[ต้นฉบับจากผู้วิจัย](https://homes.cs.washington.edu/~mernst/pubs/bug-database-issta2014-abstract.html)
จำนวน 854 บั๊กในรายงานนี้ตรวจจาก manifest ของทีมและ profile ที่ตรึงไว้ ไม่อ้างว่าจำนวนนี้มาจากงานปี 2014

### 2.3 MOSA และ GRT

MOSA เป็นแนวทาง many-objective search ใน EvoSuite ซึ่งรองรับการสร้าง individual tests
ตาม [คู่มือ EvoSuite](https://www.evosuite.org/documentation/tutorial-part-4/)
รายงานนี้ใช้ชื่อ MOSA ตาม configuration ของโครงการ ไม่เปลี่ยนเป็น DynaMOSA ตามรายงานตัวอย่าง

GRT ของทีมเป็น implementation ที่อธิบายกลไก Constant Mining, Impurity, Elephant Brain,
Detective, Orienteering และ Bloodhound ใน [เอกสารของทีม](../GRT/README.md)
ข้อจำกัดที่ทีมบันทึกไว้รวมถึงการวิเคราะห์ constant แบบ straight-line, purity แบบ conservative,
ขอบเขตการค้น constructor/factory และขนาด object pool ที่จำกัด ผลนี้จึงไม่ใช่ผลของ binary ต้นฉบับใน paper
และไม่รับรองว่าเทียบเท่า implementation ของผู้เขียนงานวิจัย

### 2.4 AI และที่มาของโมเดล

แผนใหม่ร้องขอ deepseek-v4-flash และ gpt-5.6-terra ผ่าน KKU Direct API
คำว่า openai เป็น provider ภายในระบบ ไม่ได้ยืนยันการติดต่อ endpoint ของ OpenAI โดยตรง
ต้องแยกชื่อที่ประกาศ ชื่อที่ร้องขอ และชื่อที่ response รายงาน
สำหรับชุดนำเข้าที่ตรวจครั้งนี้ native provenance ระบุว่าไม่มี original API logs
จึงไม่ใช้ชื่อโฟลเดอร์เป็นหลักฐานยืนยันรุ่นหรือปริมาณ token จริงจากบริการ

## บทที่ 3 วิธีดำเนินงาน

### 3.1 แหล่งข้อมูลและ inventory

ตรวจความตรงกันของรายการ project/bug จาก AI_API/Campaign/manifest.json
กับ config/round1-full854.json ได้ 854 บั๊กใน 17 โปรเจกต์
ส่งออก [inventory](../results/member4/inventory.csv) และ metadata snapshot รายโปรเจกต์ใน results/member4/metadata
snapshot นี้มีรายชื่อบั๊กและ target classes จาก manifest แต่ไม่มี revision IDs และ triggering-test metadata ครบ
จึงไม่ใช้แทนผล query ใหม่จาก Defects4J

| Project | บั๊กใน manifest |
|---|---|
| Chart | 26 |
| Cli | 39 |
| Closure | 174 |
| Codec | 18 |
| Collections | 28 |
| Compress | 47 |
| Csv | 16 |
| Gson | 18 |
| JacksonCore | 26 |
| JacksonDatabind | 110 |
| JacksonXml | 6 |
| Jsoup | 93 |
| JxPath | 22 |
| Lang | 61 |
| Math | 106 |
| Mockito | 38 |
| Time | 26 |

### 3.2 สภาพแวดล้อมและการตรวจซ้ำ

dependency lock ระบุ Defects4J 3.0.1 commit 6d54320e0db5a357f9ab38a8e4d2e5aead7e1c09,
EvoSuite 1.2.0 และ JaCoCo 0.8.13 ส่วน AI campaign ระบุ image digest
sha256:472b9cb8336865c9825e792b3c36291df0a6103ec256ce9c36930ee037f39bed
ค่าเหล่านี้เป็นหลักฐาน configuration เดิม ไม่ใช่การตรวจว่า engine ปัจจุบันใช้ image นี้จริง
ขณะตรวจ Docker Linux engine ไม่พร้อม จึงยังไม่รัน build/doctor/Lang-1 ใหม่
ไม่มีข้อมูล CPU/RAM ของทุกเครื่องที่ทดลองเพียงพอสำหรับสรุป hardware equivalence

ตรวจพบสคริปต์ AI/config/prompt ที่คู่มืออ้างถึงหายจาก checkout จึงกู้เฉพาะ 10 ไฟล์ที่ไม่มี
จาก AI_API/ExistingSuites/implementation.zip โดยไม่เขียนทับ implementation ที่มีอยู่
มี SHA256 และรายการไฟล์ใน [recovery provenance](../results/member4/recovered_files.json)
ตรวจ CLI --help ผ่านแล้ว แต่ยังไม่รับรองการทำงานครบวงจรของชุดที่กู้กับโค้ดปัจจุบัน
ต้องใช้แคมเปญใหม่เมื่อ source fingerprint หรือพาธเปลี่ยน ไม่แก้ manifest เดิมเพื่อข้ามการตรวจ

### 3.3 การตรวจหลักฐาน native

ตัวรวมอ่าน schema_version 2 ตรวจ SHA256 ของ Java ทุกไฟล์ที่บันทึกไว้และตรวจไฟล์ที่เพิ่ม/หายจาก suite
สำหรับ EVALUATED ตรวจ JUnit สองครั้งต่อ revision, test identities, failure signatures,
ความตรงกันระหว่างสรุปกับ JUnit ครั้งแรก, fixed pass และการมี coverage.xml
การตรวจนี้ไม่ได้รัน JVM ใหม่ ไม่ได้คำนวณ coverage.xml ใหม่ และไม่ได้ตรวจทุก assertion กับข้อกำหนดทางธุรกิจ
native AI Lang-1 สองรายการมีพาธก่อนย้าย ตัวตรวจ resolve ไปยังชั้น project โดยไม่แก้ JSON เดิม

### 3.4 กติกาเลือก attempt และแยกกลุ่ม

อ่าน native 2,562 รายการ ตัด validation/superseded 10 รายการ
แล้วเลือก attempt แรกตาม started_at, run_id และ path ต่อ unit JSON ได้ 2,434 หน่วย
กติกานี้เป็นการวิเคราะห์ย้อนหลังเพื่อหลีกเลี่ยงเลือกแต่ผลสำเร็จ ไม่อ้างว่า preregistered ก่อนทดลอง
แยก tool, campaign, protocol, round, seed, budget, implementation และ generation revision
ผล 60/180 วินาทีเก็บใน native_cohorts.csv แยกจากชุดหลัก 30 วินาที
ความล้มเหลวของ attempt แรกยังอยู่ในตัวหาร แม้ attempt หลังจะสำเร็จ

### 3.5 นิยามตัวชี้วัด

- Planned bugs คือจำนวนรายชื่อบั๊กเป้าหมาย ไม่ใช่จำนวนไฟล์หรือ target classes
- EVALUATED ของ native คือสถานะที่ผ่าน protocol และ evidence checks ของตัวรวม ไม่ใช่ human-confirmed fault
- AI fixed valid reported คือ BUG_DETECTED รวม NOT_DETECTED ตาม CSV นำเข้า
- Candidate rate ต่อ planned คือ unique reported candidate bugs หาร 854 คูณ 100
- Confirmed FDR ต้องใช้ unique bugs ที่ human review ยืนยันกับ suite hash เดียวกัน ขณะนี้ยังสรุปไม่ได้
- Mean coverage เป็นค่าเฉลี่ยแบบไม่ถ่วงน้ำหนักในรายการที่วัดได้ โดย native ใช้ target unit และ AI ใช้ suite ต่อบั๊ก
- N/A ไม่ถูกแทนด้วย 0 ขณะที่ coverage 0 ที่วัดได้จริงยังรวมในค่าเฉลี่ย

หน่วยของค่าเฉลี่ย native กับ AI และขอบเขต project ของ implementation ต่างกัน
จึงไม่ใช้ตารางนี้จัดอันดับเชิงสาเหตุว่าเทคนิคใดดีกว่าโดยปราศจาก matched comparison

## บทที่ 4 ผลการทดลองและอภิปรายผล

### 4.1 ความครบของผลอัลกอริทึม

ในชุด 30 วินาที ทั้ง MOSA และ GRT มีผลครอบคลุม 854 บั๊กและ 1,073 metadata targets
นี่คือความครบของรายการที่มีสถานะ ไม่ใช่จำนวนบั๊กที่ทุก target ประเมินสำเร็จ
ตารางต่อไปใช้ seed 101 และ attempt แรกต่อ unit แยก implementation
EVALUATED เป็นจำนวน target units; Candidate bugs นับ unique project/bug ภายในแถวนั้น
ห้ามบวกจำนวนบั๊กข้ามแถว เพราะ implementation อาจทดลองบั๊กเดียวกัน

| เครื่องมือ | Implementation 12 ตัวแรก | บั๊กที่มีผล | Target units | EVALUATED | Candidate bugs | Line % | Branch % |
|---|---|---|---|---|---|---|---|
| MOSA | 23ed78b73f64 | 559 | 714 | 515 | 122 | 64.11 | 58.29 |
| MOSA | 3daf9d8187ea | 263 | 326 | 240 | 79 | 73.87 | 70.59 |
| MOSA | 8e4d591b349e | 32 | 33 | 24 | 4 | 46.04 | 34.63 |
| GRT | 2095c4d4de9e | 790 | 996 | 791 | 81 | 44.11 | 29.73 |
| GRT | 23ed78b73f64 | 64 | 77 | 61 | 4 | 50.15 | 33.45 |
| GRT | 3daf9d8187ea | 1 | 1 | 0 | 0 | N/A | N/A |

Line/Branch ของแต่ละแถวคำนวณเฉพาะ EVALUATED ที่ผ่าน integrity checks
จำนวน n ของแต่ละ metric อยู่ใน [native_cohorts.csv](../results/member4/native_cohorts.csv)
ตัวอย่าง MOSA implementation 23ed78b73f64 มีผล 714 target units ใน 559 บั๊กและประเมินได้ 515 targets
ขณะที่ GRT 2095c4d4de9e มี 996 target units ใน 790 บั๊กและประเมินได้ 791 targets
ขอบเขตต่างกันจึงยังไม่ใช่คู่เทียบที่ควบคุมทุกตัวแปรเท่ากัน
รายละเอียดแยกโปรเจกต์อยู่ใน [native_projects.csv](../results/member4/native_projects.csv)

### 4.2 ความครบและสถานะ AI

| สถานะต่อ 854 บั๊ก | DeepSeek | GPT |
|---|---|---|
| มีสถานะใน CSV | 854 | 854 |
| ไม่มี suite | 1 | 1 |
| Compile ไม่ผ่าน | 661 | 429 |
| Invalid oracle / regression | 177 | 308 |
| Fixed ผ่านตามตาราง | 15 | 116 |
| Candidate ตามตาราง | 11 | 107 |
| Candidate / planned (%) | 1.29 | 12.53 |

ตัวหาร 854 รวม NO_SUITE หากรายงานอัตราต่อ suite ที่มีอยู่ ตัวหารเป็น 853
DeepSeek จึงเป็น 11/853 = 1.29% และ GPT เป็น 107/853 = 12.54%
แต่ตารางหลักใช้ planned denominator เดียวกันคือ 854 และยังเรียกว่า reported candidate rate
ไม่ใช้คำว่า confirmed FDR
DeepSeek fixed valid reported = 11 BUG_DETECTED + 4 NOT_DETECTED
ส่วน GPT = 107 BUG_DETECTED + 9 NOT_DETECTED

### 4.3 Coverage ของ AI

| โมเดล | ชุดที่วัดได้ n | Line % | Branch % | Fixed valid n | Line % fixed valid | Branch % fixed valid |
|---|---|---|---|---|---|---|
| DeepSeek V4 Flash | 192 | 80.87 | 73.45 | 15 | 88.74 | 85.67 |
| GPT-5.6 Terra | 424 | 88.34 | 82.55 | 116 | 97.43 | 93.50 |

กลุ่มที่วัดได้รวม invalid oracle ด้วย: DeepSeek n=192 = 177+15 และ GPT n=424 = 308+116
ค่าเฉลี่ยเฉพาะ fixed valid สูงขึ้น แต่เป็นคนละ subset และมี selection bias
ไม่อนุมานว่าค่า coverage สูงหมายถึงเทสต์ทั้งหมดถูกต้องหรือใช้กับบั๊กที่ compile ไม่ผ่านได้
ผล compile error ไม่มี coverage ที่ใช้ได้ แม้ CSV เดิมเก็บ 0.0 ตัวรวมจะแสดงเป็น N/A

### 4.4 ความตรงกันของหลักฐาน AI

ตารางนำเข้ามี 854 แถวต่อโมเดลและมี run logs ของ project/bug ทั้งหมด แต่ไม่มี run-id ใน logs
ตรงกับ CSV เลยทั้ง 1,708 แถว จึงไม่ย้าย logs ของคนละ run มาใช้รับรองแถวนั้น
JSON รายบั๊กมี 193 ไฟล์สำหรับ DeepSeek และ 433 ไฟล์สำหรับ GPT
suite hash ตรงตาม raw/LF/CRLF diagnostic modes 846 ชุดสำหรับ DeepSeek และ 0 ชุดสำหรับ GPT
การไม่ตรงไม่ได้พิสูจน์ว่าผลปลอม แต่อาจเกิดจากไฟล์เปลี่ยนหรือวิธี hash ต่างกัน ต้องหาต้นฉบับมาจับคู่ให้ได้
การตรงแบบปรับ line endings เป็นเพียงข้อมูลช่วยวิเคราะห์ ไม่เทียบเท่า strict raw hash ของ native

Native Lang-1 ประเมินเป็น INVALID_ORACLE ทั้งสองโมเดล ค่า fixed coverage ของ DeepSeek
67.63/52.86 ต่างจาก CSV 74.08/60.31 และ GPT 92.37/74.86 ต่างจาก CSV 94.09/80.10
เนื่องจากหลักฐานไม่รองรับว่าเป็นตัววัด/revision เดียวกัน จึงเก็บทั้งสองค่าแยกกัน
ไม่เลือกค่าที่สูงกว่าและไม่เขียนทับผลต้นฉบับ
รายละเอียดอยู่ใน [รายงานตรวจ AI](../AI_API/ImportedResults/README.md)

### 4.5 เวลาและ token

| โมเดล | Records | Mean tokens ตามไฟล์ | Mean seconds ตามไฟล์ |
|---|---|---|---|
| DeepSeek V4 Flash | 1066 | 21,062.72 | 293.20 |
| GPT-5.6 Terra | 1066 | 20,860.32 | 89.81 |

ตัวเลขนี้อ่านจาก generation_metrics รายคลาสที่นำเข้า จึงมีหน่วยเป็น record
ไม่ใช่ต้นทุนต่อบั๊กที่ตรวจพบ ไม่มี run-id join ที่ยืนยันกับตาราง detection และไม่มี raw API evidence
เพียงพอให้ถือเป็นต้นทุนที่รับรองแล้ว จึงไม่คำนวณ bugs per million tokens หรือสรุปโมเดลที่คุ้มค่ากว่า
ค่า generation_time_sec ของ native ถูกเก็บใน native_runs.csv แต่ไม่เทียบกับเวลาการประเมินของ CSV
budget 30 วินาทีต่อ target ก็ไม่จำเป็นต้องเท่ากับ wall-clock time ของ checkout/compile/evaluation ทั้งกระบวนการ

### 4.6 กรณีศึกษาและ fault review

เลือก GRT Chart-10 run `Chart-10-Round1-s101-43074e484fc3` เป็นตัวอย่างเปิดหลักฐาน
พบ fixed pass และ buggy failure ตาม result.json พร้อม test hashes และ JUnit repetitions
สถานะนี้เป็น candidate ดู [result.json](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/result.json) และ demo สำหรับพาธไฟล์ทั้งหมด
บันทึก AI review เดิมของทีมอธิบายประเด็น HTML escaping แต่ระบุชัดว่าไม่ใช่ human confirmation
จึงยังไม่สร้าง fault-review.json ในนามสมาชิกหรือเปลี่ยน candidate เป็น confirmed

อีกกรณีคือ AI Lang-1 ซึ่งมี coverage แต่ fixed ล้ม สะท้อนว่า coverage ไม่ได้แทน oracle validity
รายการ Math-13 ใน CSV เป็น NO_SUITE แม้มี Java อยู่ในโฟลเดอร์ปัจจุบัน จึงเป็นสถานะของ snapshot เดิม
ไม่แก้เป็นผ่านเพียงเพราะพบไฟล์ภายหลัง
[fault_review_queue.csv](../results/member4/fault_review_queue.csv) เก็บ candidates ทุก attempt
พร้อม selected flag สำหรับให้ทีมตรวจ ไม่ให้รายการที่ไม่ได้เลือกปนกับตัวเลขรายงาน

### 4.7 คำตอบต่อคำถามวิจัย

RQ1 มีผล coverage และอัตราประเมินได้ตามตาราง แต่ต้องอ่านควบคู่ n, หน่วยวิเคราะห์ และ cohort
RQ2 มี candidates ตามหลักฐานหลายระดับ แต่ยังไม่มี confirmed review ที่ใช้คำนวณ FDR ได้
RQ3 มี generation metrics ที่รายงานไว้ แต่ยังเชื่อมกับ detection อย่างรับรองไม่ได้
RQ4 ปัญหาหลักคือ compile/invalid oracle, run-id/hash ที่ไม่ตรง, implementation หลายรุ่น
และสภาพแวดล้อมปัจจุบันที่ยังไม่พร้อมสำหรับการตรวจซ้ำ

## บทที่ 5 สรุปและข้อเสนอแนะ

### 5.1 ผลงานที่ดำเนินการแล้ว

รวมข้อมูลของทั้งสี่เทคนิคพร้อมการเปลี่ยนชื่อ AI ให้ตรงกับงานคนที่ 3
สร้างตัวรวมที่ไม่แก้ raw evidence ตรวจ native integrity และแยก attempt/implementation
สร้าง inventory snapshot ครบ 17 โปรเจกต์ ตารางสรุปและ fault queue พร้อมแหล่งอ้างอิงราย run
แก้ตัวตรวจ/ตัวรวมเดิมให้มองเห็น DeepSeek/GPT และพาธหลังย้าย
กู้สคริปต์ที่หายจาก archive ของทีม ตรวจ Python regression tests ผ่าน 28 รายการ
และตรวจ native submission ของ AI ทั้งสองโมเดลผ่านโดยแจ้งพาธที่ย้าย

### 5.2 ข้อจำกัดต่อการตีความ

ผลชุดนำเข้าไม่รับรอง model identity และ raw token usage; provenance บางส่วนอ้างรุ่น buggy
หรือ saved prompts ที่มีข้อมูลบั๊ก จึงไม่เหมารวมว่าเป็น fixed-source generation ตามแผนใหม่ทั้งหมด
ต้องแยก fixed-code generation, imported-suite evaluation และแผน API ที่ยังไม่ได้รัน
ผลอัลกอริทึมมีหลาย implementation และ stochastic seed เดียวในชุดหลัก
การเลือก attempt แรกเป็นการตัดสินใจย้อนหลัง ไม่ใช่หลักฐานว่าออกแบบการทดลองเช่นนี้ตั้งแต่เริ่ม
GRT เป็น implementation ของทีม และยังไม่มี human-reviewed confirmed FDR
ตัวตรวจ offline ตรวจหลักฐานที่บันทึกไว้ ไม่พิสูจน์สภาพแวดล้อมในวันที่ทดลองหรือทำซ้ำ JVM วันนี้

### 5.3 งานคงเหลือก่อนรับรองฉบับส่ง

- เปิด Docker Linux engine ตรวจ doctor และ Lang-1 smoke จากโค้ด/config ที่จะใช้จริง
- สกัด metadata query ครบ 17 โปรเจกต์พร้อม revision IDs และ triggering tests
- จัดแคมเปญใหม่หลังตรวจพาธและ freeze source/config/prompt/image โดยเก็บ manifest เดิมเป็นประวัติ
- จับคู่ CSV, exact run-id, suites และ logs ของ AI หรือประเมินชุดเดิมใหม่โดยเก็บผลเป็นคนละ campaign
- ตรวจ candidate กับ patch และ API contract โดยผู้รับผิดชอบ ก่อนบันทึก human confirmation
- ทำ matched comparison ในบั๊ก/target/เงื่อนไขเดียวกัน และเพิ่ม independent repetitions หากต้องการสถิติอนุมาน

ส่วนที่ยังไม่เสร็จข้างต้นไม่ถูกแทนด้วยผลสมมติหรือข้อความรับรอง
การรวมผล offline และรายงานที่ส่งมอบครั้งนี้ทำซ้ำได้จากไฟล์ใน repository

## เอกสารอ้างอิง

- Just, R., Jalali, D., and Ernst, M. D. (2014). Defects4J A database of existing faults to enable controlled testing studies for Java programs. [หน้าบทความของผู้วิจัย](https://homes.cs.washington.edu/~mernst/pubs/bug-database-issta2014-abstract.html)
- EvoSuite. Tutorial Part 4 Extending EvoSuite. [เอกสารผู้พัฒนา](https://www.evosuite.org/documentation/tutorial-part-4/)
- ทีม ProjectSQA. [GRT implementation และ deviations](../GRT/README.md), [Benchmark protocol](../BENCHMARK_PROTOCOL.md), [AI protocol](BENCHMARK_PROTOCOL.md)
- ทีม ProjectSQA. [dependency lock](../config/dependencies.lock.json), [campaign manifest](../AI_API/Campaign/manifest.json), [แหล่งข้อมูลและ SHA256](../results/member4/source_manifest.json)
- รายงานตัวอย่าง AI-Assisted Testing vs. Automatic Test Case Generation Algorithms A Benchmark and Test Coverage Evaluation และ ตัวอย่างevaluation.zip ที่ผู้ใช้ให้ ใช้ดูโครงสร้างรายงานและการแบ่งผลราย test เท่านั้น ไม่มีการนำผลทดลองมาแทนผลโครงการนี้

## ภาคผนวก การทำซ้ำและไฟล์ส่งมอบ

```powershell
python -B scripts/consolidate_member4.py
python -B AI_API/audit_results.py
python -B scripts/build_member4_report.py
python -B -m unittest discover -s tests -p "test_*.py" -v
```

คำสั่งเหล่านี้ไม่เรียก API และไม่รัน Defects4J เพิ่ม
หาก Windows จำกัด temp directory ให้ตั้ง TEMP/TMP เป็น work/member4-temp ที่เขียนได้ก่อนรัน tests
อ่าน [คำอธิบายตารางทั้งหมด](../results/member4/README.md) และ [demo](MEMBER4_DEMO.md)
ต้นฉบับรายงานคือ MEMBER4_REPORT.md ส่วน HTML ใช้อ่านและพิมพ์จากเบราว์เซอร์
