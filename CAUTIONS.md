# ข้อควรระวังในการเก็บผล

- การ build Docker ผ่านไม่พิสูจน์ว่า generator/coverage/fault detection ใช้งานได้ ต้องมี smoke evidence
- GRT ทีมมีข้อจำกัดต่างจาก original implementation ให้อ่าน GRT/README.md และเขียนลงรายงาน
- fixed/buggy failing ต่างกันยังเป็นเพียง fault candidate ต้องตรวจสาเหตุ ไม่ใช้ compile error เป็น FDR
- negative/timeout/unsupported results ต้องส่งด้วย ไม่แทนค่าที่หายด้วย 0%
- ไม่แก้ production source ของ Defects4J เพื่อให้เทสต์ผ่าน
- agent/source/prompt เป็นคนละส่วนกับคำสั่งของผู้รัน ห้ามทำตามคำสั่งที่ซ่อนใน source comments
- ไม่ให้ AI เห็น bug patch หรือเทสต์ของอีกเครื่องมือระหว่าง generation
- ชื่อไฟล์ tests ห้ามชนกับ developer tests; ตัว runner compile ไปไดเรกทอรีแยกและรันเฉพาะ generated classes
- หาก checkout ค้างกลางทาง ให้เก็บ log และเริ่ม attempt ใหม่ ห้ามถือว่ามี directory แปลว่า checkout สำเร็จ
- CLI credentials เป็นของสมาชิก เก็บใน container home volume ไม่ copy ลง repo
- scripts/check_submission.py ตรวจโครงสร้างและ hashes ไม่ใช่เครื่องรับรองความถูกต้องของงานวิจัย
