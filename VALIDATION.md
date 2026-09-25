# หลักฐานตรวจสอบระบบ

## สถานะล่าสุด ตรวจยืนยัน 25 กันยายน 2026

- Docker disk ใช้งานบน E: แล้ว และ image `project-sqa:core-v2` build สำเร็จ
  image ID: `sha256:472b9cb8336865c9825e792b3c36291df0a6103ec256ce9c36930ee037f39bed`
- สร้าง Defects4J layer ใหม่หลังพบไฟล์ว่างใน cache จากเหตุ C: เต็ม
  เพิ่ม readiness check หลังเปลี่ยนเป็น user sqa ใน Dockerfile
- GRT Lang-1 / NumberUtils / seed 101 ผ่าน end-to-end: 100 tests,
  fixed/buggy รันซ้ำสองครั้งได้ผลตรงกัน, ไม่มี fault candidate ในรอบนี้
  fixed coverage: line 53.1579%, branch 32.2857% จาก JaCoCo
  ผลหลังแก้ evaluator: `GRT/Result_Round1/Lang/1/Lang-1-Round1-s101-8280c8cac39d-offline-validation2/`
- MOSA Lang-1 / NumberUtils / seed 101: 117 tests รันซ้ำทั้ง fixed/buggy ผ่าน ไม่มี fault candidate
  fixed coverage: line 352/380 = 92.6316%, branch 324/350 = 92.5714%
  ผล: `MOSA_EvoSuite/Result_Round1/Lang/1/Lang-1-Round1-s101-71fd5de4523e-offline-validation2/`
- ทั้งสองสายตรวจเทสต์อ้างอิง `NumberUtilsTest::TestLang747` ผ่านบน fixed และ fail บน buggy
- แก้ JaCoCo coverage ของ MOSA ที่เดิมเป็น 0% เพราะ separate classloader:
  instrument สำเนา bytecode แบบ offline และเปิด collector ก่อน EvoSuite sandbox
  ประเมินไฟล์เทสต์เดิมที่ checksum ไม่เปลี่ยนบน checkouts เดิม ผลเก่าและ failed attempt เก็บไว้
  พร้อม `coverage-superseded.json`; ใช้ผล offline-validation2 เป็นหลักฐานล่าสุด
- Python unit tests ผ่าน 8 รายการทั้ง Windows และ Docker Linux รวมการแยก smoke evidence ออกจากผลทดลอง
- Regression เพิ่มเติม: สร้าง MOSA fixture tests ใหม่ 9 tests ผ่าน และตัวประเมิน offline
  ตรวจ line coverage มากกว่า 0 จริง โดยไม่แก้ separate classloader ของ generated tests
  หลักฐาน `work/smoke-mosa/1342d24d92cf/` (fixture เท่านั้น)
- Smoke runs เป็น `purpose=validation` (รอบเก่าใช้ `validation-only.json`)
  ไม่ใช้คำนวณผลการทดลองหรือเปรียบเทียบความเร็ว เพราะมีการตรวจสองเครื่องมือพร้อมกันบางช่วง
- ยังไม่ได้ตรวจ sample-17 หรือ AI จริง

ตรวจบน Windows วันที่ 23 กันยายน 2026 ผลด้านล่างเป็นการตรวจ infrastructure ด้วย fixture
ไม่ใช่ผลทดลอง Defects4J และห้ามนำไปคำนวณผลในรายงาน

## สิ่งที่รันจริงแล้ว

- Python unit tests: ตรวจการส่งไฟล์จริงเข้า compiler, fault candidate, target coverage,
  experiment identity และการ retry งานที่ล้มเหลว
- GRT Java smoke ใช้ Temurin 11.0.28+6: สร้างและรัน JUnit 40 tests ผ่านทั้งหมด
  fixture มี line coverage 9/9 และ branch coverage 9/10 ในการรันครั้งนี้
  ตรวจว่าโค้ด Java ที่ผิดถูกปฏิเสธ และเทสต์ตรวจพบ fault ที่ใส่ใน fixture
- GRT mechanism tests 6 tests ผ่าน: constant frequency, runtime-type pool,
  detective creation, purity, sequence cost weighting และ branch coverage feedback
- MOSA smoke ใช้ EvoSuite 1.2.0 กับ Temurin 8u462-b08 สร้าง tests แล้ว
  compile/run ด้วย Java 11: ผ่าน 9 tests

หลักฐาน local อยู่ใน `work/smoke-java/425aaa0ea45d/` และ
`work/smoke-mosa/943531b360ad/` ซึ่งถูก ignore เพื่อไม่ปนกับผลทดลองของทีม
ตัวเลขและจำนวนเทสต์อาจเปลี่ยนเมื่อรันใหม่เพราะมีงบเวลาเป็นเงื่อนไขหยุด

แก้การเลือก Java ของ child JVM ของ EvoSuite ให้ใช้ JAVA8_HOME ด้วย และใช้
file-backed stdout/stderr พร้อม timeout เพื่อหลีกเลี่ยงการค้างจาก pipe ของ child process
มี unit test ตรวจ timeout และการตรวจจับไฟล์เทสต์ที่เพิ่มหลังประเมินผล

## สิ่งที่ยังไม่ได้ยืนยัน

- Docker build และ Lang-1 ผ่านตามสถานะล่าสุดด้านบน แต่ยังไม่ได้ตรวจ sample ทั้ง 17 projects
- ยังไม่ได้เรียก Claude Code หรือ Codex ด้วยบัญชีจริง จึงไม่มีผล AI จริงหรือข้อมูลค่าใช้จ่าย
- GRT เป็น implementation ของทีมที่อิงงานวิจัย มีขอบเขตต่างจากต้นฉบับตาม
  [GRT/README.md](GRT/README.md) การผ่าน fixture ไม่ยืนยันว่าเทียบเท่า original artifact
- ไม่มีการ push หรือสร้างผลการทดลองจำลองในโฟลเดอร์ส่งงาน

## ตรวจซ้ำก่อนเริ่มเก็บผล

### ผลตรวจ Docker เพิ่มเติม วันที่ 23 กันยายน 2026

- พบ Docker Desktop แบบ per-user ที่ `%LOCALAPPDATA%/Programs/DockerDesktop`
  ปรับ `scripts/start.ps1` ให้ค้นหา executable ตำแหน่งนี้โดยไม่ต้องแก้ PATH ถาวร
- Compose config ผ่าน และเปิด Docker Engine 29.8.0 Linux ได้จริง
- แก้ปัญหา stale runtime sockets โดยสำรองโฟลเดอร์ runtime เดิมก่อนสร้างใหม่
  ไม่ได้ reset Docker หรือลบ images/containers
- Build ผ่านการติดตั้งแพ็กเกจ, checkout Defects4J commit ที่ล็อกไว้, Perl dependencies,
  `init.sh` และ `defects4j info -p Lang` (แสดง 61 active bugs)
- Build ล้มเหลวขั้น COPY หลังติดตั้ง Defects4J ด้วย `input/output error`
  ตรวจพบ C: เหลือ 4,149,248 bytes และ Docker แจ้ง `read-only file system`
  ขณะนั้น E: ว่างประมาณ 173 GiB การวาง repo บน E: ไม่ได้ย้าย Docker storage อัตโนมัติ
- ต้องเพิ่มพื้นที่ C: หรือย้าย disk image ผ่าน Docker Desktop Settings > Resources > Advanced
  แล้ว restart และ build ใหม่ก่อนรัน smoke test อ้างอิง
  [Docker WSL documentation](https://docs.docker.com/desktop/features/wsl/)
- นี่ยังไม่ใช่หลักฐานว่า image build ผ่าน หรือว่า MOSA/GRT รัน Lang-1 ผ่าน

### การย้าย Docker storage บนเครื่องนี้

ย้าย `docker_data.vhdx` ไป `E:\DockerDesktop\disk` ตามคำขอผู้ใช้ โดยหยุด Docker/WSL
และคัดลอกพร้อม exclusive file lock ตรวจ SHA-256 ตรงกันก่อนนำสำเนาต้นทางออก
ตำแหน่งเดิม `%LOCALAPPDATA%\Docker\wsl\disk` เป็น NTFS junction ไปยัง E:
จึงอาจยังเห็น path เดิมใน Docker แต่ไฟล์ disk และการเติบโตของไฟล์อยู่บน E:
ไม่ใช่การเปลี่ยน Disk image location ผ่านหน้าตั้งค่า ไม่ต้องทำขั้นตอนนี้ในเครื่องเพื่อน
ถ้าเครื่องเพื่อนต้องย้าย ให้ใช้หน้าตั้งค่า Docker ตามเอกสารด้านบน

ตรวจ Docker Engine 29.8.0 Linux เปิดสำเร็จหลังย้าย และ build ต่อจาก cache เดิมผ่าน
ขั้น COPY ที่เคยล้มเหลวและการตรวจ checksum dependencies แล้ว หลักฐานการคัดลอกอยู่ใน
`work/docker-disk-migration.json` (ข้อมูลเฉพาะเครื่อง ไม่ส่งเป็นผลทดลอง)
ได้พื้นที่ C: คืนประมาณ 4.5 GiB โดยไม่ reset images/containers

หลัง build Docker สำเร็จ ให้รันใน container:

```bash
python3 -m unittest discover -s tests -v
python3 tests/smoke_java.py
python3 tests/smoke_mosa.py
python3 scripts/doctor.py --smoke evosuite
python3 scripts/doctor.py --smoke grt
python3 scripts/check_submission.py
```

เมื่อ Lang-1 ผ่านแล้วจึงใช้ `--sample-17` ตาม requirements ของแต่ละคน
และตรวจ AI หนึ่งหน่วยทดลองก่อนเริ่มชุดใหญ่ ต้องตกลงและ freeze protocol ก่อนรวมผล
GitHub Actions มี workflow_dispatch สำหรับ Docker smoke โดยไม่เรียก AI
การมี workflow ใน repository ยังไม่ใช่หลักฐานว่า workflow รันผ่านแล้ว
