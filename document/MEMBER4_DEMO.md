# Demo หลักฐานโครงการโดยไม่เรียก API

1. เปิด [รายงาน HTML](MEMBER4_REPORT.html) อธิบายสี่เทคนิคและขอบเขต 854 บั๊ก
2. เปิด [ตาราง AI](../results/member4/ai_summary.csv) ชี้ความต่างระหว่าง compile, fixed pass และ candidates
3. เปิด [ตาราง native](../results/member4/native_cohorts.csv) ชี้ว่า implementation ต่างกันต้องแยกกลุ่ม
4. ใช้ GRT Chart-10 เป็นตัวอย่าง candidate จากหลักฐานด้านล่าง
5. ปิดด้วยข้อจำกัดและ fault queue ไม่สรุปว่า candidate เป็น confirmed bug

## หลักฐานตัวอย่าง

- [result.json](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/result.json)
- [JUnit fixed ครั้งที่ 1](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/evaluation-1/fixed/junit-1.json)
- [JUnit fixed ครั้งที่ 2](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/evaluation-1/fixed/junit-2.json)
- [JUnit buggy ครั้งที่ 1](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/evaluation-1/buggy/junit-1.json)
- [JUnit buggy ครั้งที่ 2](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/evaluation-1/buggy/junit-2.json)
- [Coverage XML fixed](../GRT/Result_Round1/Chart/10/Chart-10-Round1-s101-43074e484fc3/evaluation-1/fixed/coverage.xml)
- [โฟลเดอร์ Java](../GRT/Test/Chart/10/Chart-10-Round1-s101-43074e484fc3)
- [Fault review queue](../results/member4/fault_review_queue.csv)

ใช้ result.test_sha256 จับคู่ Java กับหลักฐาน fixed/buggy ชุดเดียวกัน
การเปิดไฟล์นี้เป็น demo หลักฐานเก่า ไม่ใช่ live execution
Docker engine ต้องพร้อมก่อนแสดง doctor หรือ Lang-1 smoke แบบรันจริง
