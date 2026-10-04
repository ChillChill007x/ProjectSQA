# รูปแบบที่อ้างอิงและสิ่งที่ทีมใช้เอง

ศึกษารูปแบบจาก https://github.com/Bigzzz0/ProjectSQA
สำเนาที่ตรวจใน work/reference-bigzzz0: commit 5b64f09af1565d03207d47ad42a951d68c39bd46
repo นั้นเป็นตัวอย่าง ไม่ใช่ผลการทดลองหรือข้อมูลสมาชิกของทีมเรา

นำแนวคิด KKU API, การแบ่ง Prompt/Result/TestCode, การเก็บ token/time และการเลือกโปรเจกต์มาใช้
implementation ใช้ runner/evaluator ของทีมเรา; ไม่รันสคริปต์ตัวอย่างหรือดึงผลของเขามาเป็นผลใหม่
แตกต่างอย่างชัดเจน: fixed source ไม่มี ground truth, JSON output, raw request/response,
ไม่รับคำตอบ truncated เป็น Java สมบูรณ์, ไม่หมุน key เมื่อ quota เต็ม, วัด coverage ด้วย JaCoCo
จึงไม่รับรองว่าจะได้จำนวน tests/coverage/detection/token เท่าตัวอย่าง

รุ่นที่ทีมเลือก: deepseek-v4-flash และ gpt-5.6-terra บน KKU ต้องตรวจ /models ของบัญชีจริง
พารามิเตอร์ GPT อ้างอิง https://developers.openai.com/api/docs/models/gpt-5.6-terra
API รองรับ reasoning effort none; การยอมรับพารามิเตอร์ของ KKU ต้องทดสอบกับ KKU แยก
