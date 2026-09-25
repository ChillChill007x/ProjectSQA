# SQA Project 2026

การเปรียบเทียบ **MOSA ผ่าน EvoSuite**, **GRT**, **Claude Code** และ **Codex** บน Defects4J
รายวิชา CP353201 Software Quality Assurance ปีการศึกษา 1/2569 มหาวิทยาลัยขอนแก่น

## สถานะที่ตรวจได้

- แบ่งโฟลเดอร์ส่งงานและตัวประเมินผลกลางแล้ว ผลอยู่บนเครื่องจริงแม้ลบ container
- GRT เป็น implementation ของทีมจาก Ma et al. ASE 2015 ซึ่งมีทั้งหกกลไกในวงรอบสร้างเทสต์
  ไม่ใช่ binary ของผู้เขียน และไม่อ้างว่าผลเทียบเท่าต้นฉบับ ดู [ขอบเขต GRT](GRT/README.md)
- MOSA และ GRT ผ่าน Lang-1 end-to-end แล้ว รวม generation, compile, JUnit บน fixed/buggy และ JaCoCo coverage
- **ยังไม่รับรองทั้ง 17 projects** ให้แต่ละเครื่องตรวจ Lang-1 ก่อน แล้วจึงรัน sample-17
- ตรวจ Docker Linux engine ได้แล้ว และย้าย storage ไป E: เพื่อแก้ C: เต็ม ดูสถานะ build/Defects4J ล่าสุดใน VALIDATION.md
- ยังไม่มีการเรียกบริการ AI หรือผล AI จริงจากการเตรียมระบบนี้

อ่าน [VALIDATION.md](VALIDATION.md) สำหรับหลักฐานและข้อจำกัด และ [BENCHMARK_PROTOCOL.md](BENCHMARK_PROTOCOL.md)
ก่อนเก็บผลจริง ห้ามนำผล fixture ไปปนกับผลการทดลอง

## เริ่มใช้งาน

สิ่งที่สมาชิกต้องมี: Git, Docker Desktop ที่เปิด Linux containers และพื้นที่สำหรับ Defects4J/checkouts
สำหรับ AI ต้องมีบัญชีและสิทธิ์ใช้งานที่ตรงกับเงื่อนไขรายวิชา การเข้าสู่ระบบเป็นรายบุคคลและไม่เก็บใน Git

```powershell
git clone https://github.com/ChillChill007x/ProjectSQA.git
cd ProjectSQA
powershell -ExecutionPolicy Bypass -File scripts/start.ps1
```

Linux/macOS: `bash scripts/start.sh` สคริปต์ build, ตรวจ environment และเปิด shell ให้
ภายใน container:

```bash
# เริ่มจาก seed เดียวและบั๊กเดียวของสายตัวเอง
python3 scripts/run_benchmark.py --tool evosuite --project Lang --bug 1 --seed 101
python3 scripts/run_benchmark.py --tool grt --project Lang --bug 1 --seed 101

# เตรียม prompt และพื้นที่ส่งโค้ดให้ AI โดยยังไม่เรียกบริการ
python3 scripts/run_ai_benchmark.py --tool claude_code --project Lang --bug 1 --seed 101
python3 scripts/run_ai_benchmark.py --tool codex --project Lang --bug 1 --seed 101
```

คำสั่ง AI แสดงตำแหน่ง TASK.md, provenance.json และ TestCode ให้ทำงานด้วยเครื่องมือที่ลงทะเบียน
แล้วใช้คำสั่ง `--evaluate-run` ที่แสดงเพื่อประเมินไฟล์จริง ดู [คู่มือ AI](requirements/sqa-03-claude-code-codex.md)

## โครงสร้างส่งงาน

```text
MOSA_EvoSuite/                 GRT/
  Code/                         Code/
  Configuration/                Configuration/
  Result_Round1/                Result_Round1/
  Result_Round2/                Result_Round2/
  Test/                         Test/

Claude-sonnet_4_6/             Codex/
  Prompt/                       Prompt/
  Result/                       Result/
  TestCode/                     TestCode/
```

ทุกผลและเทสต์แยกเป็น `<Project>/<Bug>/<run-id>/` โดย run-id แยก target class, รอบ, seed,
config, implementation และ attempt ไม่เขียนทับรอบก่อน
AI ใช้ Result เดียวแต่ระบุ Round1/Round2 ใน run-id และ JSON

| ผู้รับผิดชอบ | งานและโฟลเดอร์ | คู่มือ |
|---|---|---|
| 673380395-5 นายคมชาญ น้อยเนียม | MOSA_EvoSuite | [คนที่ 1](requirements/sqa-01-mosa-evosuite.md) |
| 673380589-2 นายปฏิภาณ มะนิลทิพย์ | GRT | [คนที่ 2](requirements/sqa-02-grt.md) |
| 673380420-2 นายภีมเดช กลั่นกิ่ง | Claude-sonnet_4_6 และ Codex | [คนที่ 3](requirements/sqa-03-claude-code-codex.md) |
| 673380427-8 นายศุภกิตติ์ ฟันเฟือย | environment, metadata, รวมผล/รายงาน | [คนที่ 4](requirements/sqa-04-consolidation-report-deploy.md) |

## การรันรอบถัดไปและส่งงาน

Round1 = 60 วินาที, Round2 = 180 วินาที สำหรับ algorithms; seeds = 101/202/303
เป็นค่าที่ทีมกำหนด ไม่ใช่จำนวนรอบที่โจทย์บังคับ AI ใช้ wall-clock/retry limit แยกและรายงานแยก

```bash
python3 scripts/run_benchmark.py --tool grt --project Lang --bug 1 --round Round2 --seed 101
# หลังผ่าน end-to-end ค่อยรันทุก target ของตัวแทน 17 projects
python3 scripts/run_benchmark.py --tool grt --sample-17 --resume
# เมื่อทีม freeze protocol และพร้อมทรัพยากรแล้วจึงใช้ --all-bugs
python3 scripts/check_submission.py --tool grt
python3 scripts/collect_results.py
```

`--resume` ข้ามเฉพาะหน่วยทดลองที่ประเมินสำเร็จและไฟล์เทสต์ยังตรง checksum
รายการล้มเหลวจะมี attempt ใหม่ โดยเก็บหลักฐานเก่าไว้

- [GIT-SETUP.md](GIT-SETUP.md): branch, commit, push และสิ่งที่ต้องส่ง
- [STEP-BY-STEP.md](STEP-BY-STEP.md): checklist ก่อนเริ่มรันเต็ม
- [CAUTIONS.md](CAUTIONS.md): ข้อผิดพลาดที่ต้องแยกจาก fault detection
- [Docker](docker/README-docker-desktop.md): setup, AI login และการเก็บผล
- [Protocol](BENCHMARK_PROTOCOL.md): ข้อมูลที่ generator เห็น, coverage, oracle, fault review

## ตรวจโค้ดโดยไม่เรียก AI

ใน Docker ที่ build แล้ว:

```bash
python3 -m unittest discover -s tests -v
python3 tests/smoke_java.py
python3 scripts/doctor.py --smoke grt
```

GitHub Actions มี unit/Java fixture tests อัตโนมัติ และ workflow_dispatch สำหรับ Docker Lang-1
ไม่ได้เรียก AI อัตโนมัติและไม่ต้องเพิ่ม secrets เพื่อรันทดสอบเหล่านี้
