# Math-1: ข้อผิดพลาดการสร้าง oracle ของ implementation ทีม

ตรวจวันที่ 2026-09-30 จากผล Round1 ทั้ง 6 หน่วย ภายใต้ implementation hash `c46cfc6ed5310e529b24389f9eb79c5f5a050e2b97b02716e6007128d3dd17a6`.

## ผลที่พบ

- `org.apache.commons.math3.fraction.BigFraction`: seeds 101/202/303 เป็น COMPILE_FAIL มี `integer number too large` ใน compile-generated.json
- `org.apache.commons.math3.fraction.Fraction`: seeds 101/202/303 เป็น INVALID_ORACLE มี AssertionError บน fixed ทั้งสองครั้ง เปรียบเทียบ Integer กับ Fraction หรือค่าที่ได้จากการหารจำนวนเต็มกับ Fraction
- ไม่ใช่ timeout, ไม่ใช่ข้อจำกัด public API และไม่ใช่หลักฐานพบ defect ของ Math

## สาเหตุที่ตรวจจากโค้ดและหลักฐาน

`GuidedRandom.emit()` ใช้ `v instanceof Number` เพื่อเลือกสร้าง literal assertion แต่ Fraction และ BigFraction เป็น Number ชนิดกำหนดเองด้วย จากนั้น `literalCode()` ไม่รองรับชนิดเหล่านี้ จึงใช้ String.valueOf(v) ซึ่งอาจเป็นข้อความรูป `-4323 / 290`.

ข้อความดังกล่าวไม่ใช่ Java expression ที่สร้าง Fraction เดิม: ตัวเลขขนาดใหญ่ compile ไม่ผ่าน ส่วนตัวเลขขนาดเล็กถูกประเมินเป็นการหาร int แล้วนำ Integer ไปเทียบกับ Fraction ทำให้ oracle ไม่ถูกต้องตั้งแต่บน fixed.

ตัวอย่างหลักฐาน:

- [BigFraction seed 101](Result_Round1/Math/1/Math-1-Round1-s101-026827eb55e7/evaluation-1/fixed/compile-generated.json)
- [Fraction seed 101](Result_Round1/Math/1/Math-1-Round1-s101-274acf0655d9/evaluation-1/fixed/junit-1.json)
- รายการทั้งหมดและการรันซ้ำอื่น ๆ อยู่ใน [PROGRESS.md](PROGRESS.md) และ [run-ledger.json](run-ledger.json)

## การรักษาผลการทดลอง

เก็บ generated tests และผลทุกหน่วยตามเดิม ไม่เติม L, ไม่เปลี่ยน assertEquals, ไม่ลบ assertion เพื่อทำให้ suite ผ่าน และไม่เปลี่ยนสถานะเดิมเป็น EVALUATED.

ขณะบันทึกนี้ยังไม่ได้แก้ engine เพื่อรักษารุ่นเดียวกับชุดทดลองที่กำลังเก็บอยู่ หากคงรุ่นนี้ ให้รายงานเป็นข้อผิดพลาดของตัวสร้าง oracle ของ implementation ทีม ไม่เหมารวมว่าเป็นข้อจำกัดของ GRT ต้นฉบับ. Round2 ต้องเก็บตามเงื่อนไขเดิมและสรุปจากผลจริง.

แนวทางแก้สำหรับรุ่นใหม่: จำกัดชนิดที่แปลงเป็น Java scalar literal ได้จริง และจัดการ Number ชนิดอื่นตามนโยบาย object oracle ที่ประกาศไว้ เพิ่ม regression test ที่ compile และรันบน Fraction/BigFraction รวม primitive wrapper cases. การเปลี่ยน oracle เปลี่ยนเงื่อนไขและความสามารถตรวจ fault จึงต้องระบุรุ่นใหม่และวางแผนการรันใหม่กับทีม ห้ามนำผลคนละ hash มารวมเสมือนเป็น implementation เดียวกัน.

สถานะ: วินิจฉัยสาเหตุแล้ว / ยังไม่ได้แก้ใน engine / ไม่ยืนยัน fault จากผลเหล่านี้.
