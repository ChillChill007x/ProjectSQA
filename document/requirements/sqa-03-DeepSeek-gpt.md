# คนที่ 3 — DeepSeek V4 Flash / GPT-5.6 Terra

ผู้รับผิดชอบ นายภีมเดช กลั่นกิ่ง 673380420-2
ชื่อไฟล์คู่มือนี้คงไว้เพื่อให้ลิงก์เก่าใช้งานได้ เนื้อหาปัจจุบันใช้ KKU Direct API

1. ติดตั้ง Git, Python 3.10+, Docker Desktop แล้ว clone ทั้ง repo
2. รัน `AI_API/setup.ps1` เพื่อเตรียม image และตรวจ Defects4J
3. หากสร้างใหม่ ใส่ KKU_API_KEY ใน .env และตรวจ doctor -CheckModels
4. เลือก Project ที่รับผิดชอบตามที่ทีมแบ่ง; ใช้ทั้งสองโมเดลกับบั๊กเดียวกัน
5. ทำ plan → preview → run ตาม [คู่มือคำสั่งฉบับเต็ม](../../AI_API/README.md)
6. ตรวจ `result.json`, fixed/buggy logs, coverage และ model_reported/request/response
7. ส่ง Prompt / Result / TestCode ของทั้งสองโฟลเดอร์ พร้อม manifest ของ workflow ที่ใช้

ไฟล์ที่มีอยู่แล้วประเมินด้วย `-Workflow existing` โดยไม่เรียก API และไม่แก้ข้ออ้างเรื่องโมเดลย้อนหลัง
การสร้างใหม่ใช้ `-Workflow generate` (ค่าเริ่มต้น) ต้อง resume และ -AllowApiCalls
ไม่เปลี่ยน prompt/config หลัง freeze; ไม่แก้ assertions ในผลเดิมให้กลายเป็นการสร้างใหม่
เก็บทุก failure และทุก attempt ตามจริง คำสั่ง collect สร้าง CSV โดยไม่ต้องกรอกคะแนนเอง
