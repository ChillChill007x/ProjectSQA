# ตรวจ fault candidate

บันทึกโดย scripts/review_fault.py หลังอ่านหลักฐานจริง

- run-id และ test method ที่ fail เฉพาะ buggy
- fixed ผ่านสองครั้งหรือไม่
- failure เป็น assertion/exception จาก defect หรือเป็น environment/dependency/timeout
- จุดใน source/patch หรือ triggering behavior ที่เชื่อมโยง failure กับ defect
- reviewer, วันที่ และเหตุผลยืนยัน/ปฏิเสธ

ไม่เปลี่ยน false เป็น true จากคำว่า success ของ generator และไม่แก้ generated test หลัง freeze
