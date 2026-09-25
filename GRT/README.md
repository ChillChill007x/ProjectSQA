# GRT implementation ของทีม

**คงอัลกอริทึม GRT ตามที่ลงทะเบียน** อ้างอิง Ma et al., ASE 2015, DOI 10.1109/ASE.2015.49
engine อยู่ `Code/src/sqa/grt/GuidedRandom.java` เป็น Java implementation ของทีมจาก paper
ไม่ได้ใช้ binary ของผู้วิจัย และไม่อ้างว่าเหมือนต้นฉบับทุกประการหรือทำคะแนนได้เท่าต้นฉบับ

Randoop มี Bloodhound/Orienteering ให้ศึกษา แต่เปิดสอง flags ไม่ทำให้ครบทั้งหกกลไกของ GRT
engine ทีมจึงจัดการ generation loop/object pool เองเพื่อให้ทุกกลไกทำงานร่วมกันได้
สูตรและกลไกอ้างอิง paper; ไม่มีการคัดลอก source Randoop มารวมใน repo นี้
Python draft เดิมที่ใช้ placeholder และแก้เทสต์ภายหลังถูกนำออกจาก pipeline
สำเนาระหว่างพัฒนาเดิมเก็บใน work/legacy-grt ของเครื่องผู้เตรียม ไม่ใช่ artifact ที่ให้เพื่อนรัน

## แมป paper กับ implementation

| Component | จุดทำงาน | หลักฐานและขอบเขต |
|---|---|---|
| Constant Mining | mineConstants, literal | นับ occurrence ไม่ใช้ set, TF-IDF ตาม §III-A, weighted global selection และ local p_const; ASM อ่าน instruction operands และทำ straight-line propagation/folding |
| Impurity | pureKey, literal, fuzzObject | Gaussian primitive/string fuzz ระหว่างเลือก input; วิเคราะห์ writes/callees แบบ conservative แล้วเรียก mutator บน receiver ก่อนใช้ต่อ |
| Elephant Brain | execute, matching, addPool, code | จัด pool ด้วย `value.getClass()` จริง เลือกด้วย assignability; source ที่ส่งออกมี explicit casts ตามชนิด parameter |
| Detective | detective, compose | เมื่อขาด type สร้างและ execute constructor/static-factory sequences ใน secondary pool แล้ว promote เฉพาะ object ที่เข้าชนิดไป main pool |
| Orienteering | chooseSequence | เลือก input sequence ด้วย cumulative execution time และจำนวน calls ของ sequence นั้น ไม่ใช้เวลาทั้งรอบเป็นตัวแทน |
| Bloodhound | updateCoverage, selectMethod | JaCoCo branch feedback ต่อ method; success/selection counts, k reset ทุก coverage interval และน้ำหนักตาม §III-F |

## ส่วนที่แตกต่างและต้องรายงาน

- Constant analysis เป็น straight-line; ทิ้งค่าที่จุด control-flow join ไม่ใช่ abstract interpreter เต็มแบบผู้เขียน
- Purity ไม่ใช่ ReIm/ReImInfer: field/array writes, monitors, native/unknown/cyclic callees ถือว่า impure
  อาจจัด pure method เป็น impure ได้ ไม่รับรอง whole-program purity
- Detective ค้น public constructors/static factories ใน compiled SUT และชนิด JDK helper ที่ระบุใน engine
  จำกัด recursion 3 ชั้น ไม่ค้น subtype ของทุก dependency jar แบบไร้ขอบเขต
- public API เท่านั้น; unsupported type/interface ที่หา object ไม่ได้ถูกนับใน unresolved_inputs
- จำกัด pool 1000 และ sequence 40 steps; เมื่อเต็มมี eviction เป็น engineering bound ที่ไม่ใช่ paper parameter
- object fuzz probability 0.2, array lengths 0–3 และ max_tests 100 เป็นค่าของทีม
- ค่าของ paper: p_const=.01, sigma=30, p=.99, alpha=.9, coverage interval=50 วินาที
- เลือก regression oracle จาก fixed code; assertion สำหรับ primitive/String/enum/null และ non-null object
  ไม่ตรวจ deep object equivalence; execute ซ้ำสองครั้งก่อนส่งออกเพื่อลด nondeterminism
- timeout ใน invocation ทำให้หยุด generation พร้อมเก็บ partial suite และ invocation_timeout ใน generation.json
  partial suite ต้องผ่าน evaluator อีกครั้ง ไม่อ้างว่าใช้ search budget เต็ม
- ไม่ใช้ชื่อเมธอดเพียงอย่างเดียวตัดสิน purity และไม่แทรก mutation เข้า assertion ที่สร้างเสร็จแล้ว

## วิธีรัน

ภายใน environment กลาง:

```bash
python3 scripts/doctor.py --smoke grt
python3 scripts/run_benchmark.py --tool grt --project Lang --bug 1 --round Round1 --seed 101
```

ไฟล์ engine compile อัตโนมัติไป work/java ไม่ต้องมี Maven/Gradle project ส่วนตัว
เก็บ generated Test, Configuration และ Result_Round1/2 ด้วย runner เท่านั้น
`generation/grt.json` มี counters, pool sizes, coverage updates และน้ำหนักต่อ method
ห้ามใช้ counters เพียงอย่างเดียวอ้าง correctness: อ่าน tests, JUnit results และ coverage ด้วย

## การตรวจยืนยัน

`python3 tests/smoke_java.py` สร้าง Java fixture, สร้างเทสต์ด้วย GRT, compile, รัน JUnit และวัด JaCoCo จริง
มี negative compile case เพื่อยืนยันว่าไฟล์ผิดถูกปฏิเสธ
นี่พิสูจน์การเชื่อมต่อกลไกเบื้องต้น ไม่ได้พิสูจน์ semantic equivalence กับ implementation ต้นฉบับ
ก่อนส่งงานจริงให้ validate Lang-1 และ sample-17 พร้อมตรวจข้อจำกัดข้างต้นในรายงาน

แหล่ง artifact: [Randoop project ideas](https://randoop.github.io/randoop/projectideas.html)
กล่าวถึงข้อจำกัดการเข้าถึงเครื่องมือ GRT; [repository งานทำซ้ำ](https://github.com/randoop/grt-testing)
เป็นแหล่งวิธีประเมิน ไม่ใช้เป็นหลักฐานว่าทีมมี binary ต้นฉบับอยู่แล้ว
