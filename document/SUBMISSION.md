# รายการไฟล์ส่งงาน

รายการนี้เป็นแนวทางจัดชุดส่งของทีม ไม่ได้อ้างว่าแทนรูปแบบส่งที่อาจารย์กำหนด

## ต้องเก็บใน repository

| ส่วน | สิ่งที่ต้องเก็บ |
|---|---|
| MOSA_EvoSuite | คำอธิบายเครื่องมือ, Configuration, Test รวม scaffolding, Result_Round1/2 |
| GRT | Code/src, Configuration, Test, ผลสองรอบ และบันทึกข้อจำกัด/ตรวจความครบ |
| Deepseek-v4_flash / gpt-5.6-terra | Prompt, TestCode, Result พร้อมหลักฐานแต่ละ run |
| AI_API | setup/run, คู่มือ, manifest ทั้งสอง workflow และ validation |
| scripts / tests | ตัวสร้าง ตัวประเมิน ตัวรวมผล Java support และชุดทดสอบระบบ |
| config / dataset / prompts / docker | เงื่อนไขทดลอง รุ่น dependencies รายการบั๊ก และสภาพแวดล้อมที่สร้างซ้ำได้ |
| results | สรุปที่มีแหล่งข้อมูลชัดเจน ไม่แก้ตัวเลข CSV ให้แทนหลักฐานจริง |
| document | คู่มือ protocol และรายงานที่ตรวจแล้ว; โครงรายงานต้องระบุว่ายังเป็น draft |
| .github/workflows และไฟล์ dotfiles | CI, .gitignore, .gitattributes, .dockerignore, .env.example |

เก็บงานล้มเหลวด้วย อย่าตัดทิ้งเฉพาะผลต่ำหรือเทสที่ compile ไม่ผ่าน
งาน AI แบบ existing ไม่ยืนยันว่าใคร/โมเดลใดสร้างไฟล์ที่นำเข้า และไม่กู้ค่า token ที่หายไปโดยคาดเดา
ผล generation ใหม่กับ imported evaluation ต้องรายงานแยกกัน

## ไม่ส่ง

`.env`, API keys, credentials, `.git/`, `.vscode/`, `No USE/`, `work/`, __pycache__, .pyc,
.class, checkout, Docker disk และ binaries ที่ดาวน์โหลดซ้ำตาม dependency lock ได้
เอกสาร DOCX รุ่นเก่าคนที่ 3–4 ถูกเอาออกจาก Git index และ ignore แล้ว แต่ยังเก็บไฟล์บนเครื่อง

`No USE/structure-2026-10-04/` เป็นสำรองการจัดโครงสร้าง ไม่ใช่ผลหลักที่ส่งอาจารย์

## ก่อนส่ง

1. ตรวจ status ของทุก project/bug/model ตาม manifest ไม่ใช้จำนวนไฟล์แทนจำนวนงานที่ผ่าน
2. อ่าน result.json และตรวจ logs, hashes, fixed/buggy; ตรวจ fault candidate ก่อนยืนยัน
3. ใช้ `scripts/check_submission.py` และ action collect ของ AI
4. ใส่รายงานฉบับจริงเมื่อเขียนเสร็จ อย่าเปลี่ยนชื่อ outline ให้ดูเหมือนเล่มสมบูรณ์
5. ตรวจ `git status --short` และ `git diff --cached --stat` ก่อน commit
6. หากส่ง ZIP ให้เลือกเฉพาะโฟลเดอร์/ไฟล์ในตาราง ไม่ zip ทั้งโฟลเดอร์เครื่องรวม .env และ work

ตัวอย่างเลือกไฟล์เพื่อ stage (ตรวจผลก่อน commit/push ด้วยตนเอง):

```powershell
git add README.md .gitignore .gitattributes .dockerignore .env.example
git add MOSA_EvoSuite GRT Deepseek-v4_flash gpt-5.6-terra AI_API scripts tests config dataset prompts docker results document .github/workflows
git add -u
git diff --cached --stat
```

คำสั่งนี้ยังไม่ commit หรือ push ให้ใคร; อย่าใช้ force-add กับโฟลเดอร์ที่ ignore
