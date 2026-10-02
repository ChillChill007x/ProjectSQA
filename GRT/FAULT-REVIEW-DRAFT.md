# ร่างตรวจ fault candidates — รอมนุษย์ตรวจรับ

ตรวจหลักฐานหลัง freeze generated tests แล้ว วันที่ 2026-10-01. เอกสารนี้เป็นการวิเคราะห์โดยผู้ช่วย ไม่ใช่ fault-review.json ที่มนุษย์ลงชื่อ และยังไม่เปลี่ยน fault_confirmed.

## สิ่งที่พบ

มี 10 candidate runs ทั้งหมดเป็น JacksonCore bug 1: NumberInput 4 runs และ TextBuffer 6 runs. ไม่ใช่ 10 bugs. ดูลิงก์หลักฐานแต่ละ run ใน [COMPLETENESS-AUDIT.md](COMPLETENESS-AUDIT.md).

### TextBuffer: หลักฐานเชื่อมกับ patch โดยตรง

ตัวอย่าง Round1 seed101 test1/test89, seed202 test24/test46/test75 และ seed303 test26 สร้าง TextBuffer ใหม่หรือ reset ด้วย String แล้วเรียก contentsAsDecimal(). Generated oracle คาด NumberFormatException บน fixed แต่ buggy เกิด NullPointerException ใน NumberInput.parseBigDecimal ผ่าน TextBuffer.contentsAsDecimal.

ความต่าง source fixed/buggy ที่ตรวจพบ: fixed เพิ่มเงื่อนไข `_inputBuffer != null` และ `_currentSegment != null` ก่อนเลือกแปลง buffer ทำให้ไม่ส่ง buffer null เข้า BigDecimal. กรณีนี้สนับสนุนว่ามีการตรวจพบพฤติกรรม defect ที่ patch แก้จริง. ต้องให้สมาชิกตรวจรับและลงชื่อก่อนรายงาน fault_confirmed.

ตัวอย่างหลักฐาน:

- [test source seed101](Test/JacksonCore/1/JacksonCore-1-Round1-s101-751e4be4251e/com/fasterxml/jackson/core/util/SqaGeneratedTest.java)
- [buggy JUnit seed101](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s101-751e4be4251e/evaluation-1/buggy/junit-1.json)
- [fixed JUnit seed101](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s101-751e4be4251e/evaluation-1/fixed/junit-1.json)

Round2 มี candidate TextBuffer seeds เดียวกัน ให้ตรวจ fixed/buggy ทั้งสอง repetitions ของแต่ละ run จากลิงก์ใน audit ก่อนลงชื่อ. ไม่ใช้ชื่อ seed เพียงอย่างเดียวแทนการตรวจหลักฐานราย run.

### NumberInput: อย่าเพิ่งยืนยันเป็น defect

ตัวอย่าง seed101 test20 ส่ง `new char[]{}` พร้อม offset=0, len=1 ซึ่งเกินขอบเขต array. Fixed โยน StringIndexOutOfBoundsException ซึ่ง generated test จับไว้ ขณะที่ buggy โยน NumberFormatException ทำให้เทสต์ fail.

Patch เปลี่ยน catch ของ NumberFormatException ให้สร้างข้อความใหม่ผ่าน `new String(buffer, offset, len)`. เมื่อ arguments ไม่ถูกต้อง การสร้าง String นี้ทำให้ชนิด exception เปลี่ยน. นี่เป็นความต่างระหว่าง revisions จริง แต่ยังไม่เพียงพอจะอ้างว่าเป็นการตรวจ defect ที่ต้องการ เพราะอาจอยู่นอก precondition ของ API และเป็นผลข้างเคียงของ patch.

- [test20 source](Test/JacksonCore/1/JacksonCore-1-Round1-s101-c8882b0363b1/com/fasterxml/jackson/core/io/SqaGeneratedTest.java)
- [buggy JUnit](Result_Round1/JacksonCore/1/JacksonCore-1-Round1-s101-c8882b0363b1/evaluation-1/buggy/junit-1.json)

TextBuffer seed303 test96 ก็ส่ง resetWithShared ด้วย offset=224 บน array ยาว 3 จึงต้องแยกออกจากเหตุผลของ test26 ที่สัมพันธ์กับ null-buffer defect. ห้ามอ้างว่าทุก failure ใน suite นั้นเป็น defect ที่ยืนยันแล้ว.

## ขั้นตอนผู้ตรวจ

1. อ่าน source/test, fixed และ buggy JUnit ทั้งสอง repetitions รวม patch และ preconditions.
2. ตัดสินแต่ละ candidate run พร้อมเหตุผลและชื่อผู้ตรวจจริง ไม่ยืนยันอัตโนมัติจาก fault_candidate=True.
3. ใช้ scripts/review_fault.py ตาม BENCHMARK_PROTOCOL.md หลังตรวจ checksum โดยไม่แก้ generated tests.
4. รวมผลในระดับ bug: ทั้งหมดนี้อยู่ที่ JacksonCore-1 อย่านับซ้ำตาม class/seed/round.

สถานะปัจจุบัน: 10 candidate runs รอ human review. ไม่ได้สร้าง fault-review.json หรือยืนยันแทนสมาชิก.
