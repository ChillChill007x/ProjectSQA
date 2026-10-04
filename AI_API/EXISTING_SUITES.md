# ประเมินไฟล์ AI ที่นำเข้ามา

อ่านขั้นตอนที่ 3 ใน [คู่มือหลัก](README.md)
ใช้ `run.ps1 -Workflow existing` หรือ wrapper `evaluate-existing.ps1`
รับ Java ชั้นตรงของ `Deepseek-v4_flash/TestCode/<Project>_<bug>b/` และ `gpt-5.6-terra/TestCode/<Project>_<bug>b/`
รับ prompt .md และ generation_metrics ทั้ง .md/.json บันทึก hash แล้วทำ snapshot สำหรับประเมิน
ไม่ดึง subfolder ของ run ใหม่กลับมาเป็น input ซ้ำ และไม่เรียก API

ผลใหม่อยู่ใต้ run-id ของตัวเอง มี logs ทั้ง fixed/buggy และชื่อโมเดลเป็นเพียง declared model
ไม่มีการคืนค่า token/time ที่หายไป หรือเปลี่ยนที่มาของชุดให้เป็นโมเดลอื่น
ใช้ `-Action collect -Workflow existing` เพื่อสร้าง results/ai_existing_summary.csv
