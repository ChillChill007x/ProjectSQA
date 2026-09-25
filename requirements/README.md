# เริ่มต้นสำหรับสมาชิกทุกคน

Clone ทั้ง repository ไม่ต้องคัดลอกเฉพาะไฟล์ requirements เพราะ runner ใช้ scripts,
config, Docker และ Java support ร่วมกัน คู่มือเฉพาะคนอยู่ด้านล่าง

| คน | คู่มือ | โฟลเดอร์งานที่ต้องส่ง |
|---|---|---|
| 1 | [MOSA / EvoSuite](sqa-01-mosa-evosuite.md) | MOSA_EvoSuite/Configuration, Result_Round1, Result_Round2, Test และ Code ถ้าแก้ |
| 2 | [GRT](sqa-02-grt.md) | GRT/Configuration, Result_Round1, Result_Round2, Test และ Code ถ้าแก้ |
| 3 | [Claude Code / Codex](sqa-03-claude-code-codex.md) | Claude-sonnet_4_6 และ Codex: Prompt, Result, TestCode |
| 4 | [Infrastructure / รวมผล](sqa-04-consolidation-report-deploy.md) | config, scripts, docker, metadata และเอกสารที่แก้ |

## ทำตามลำดับนี้

1. ติดตั้ง Git และ Docker Desktop เปิด Docker ในโหมด Linux containers
2. Clone repository ทั้งชุด แล้วสร้าง branch ของตัวเองตาม [คู่มือ Git](../GIT-SETUP.md)
   งานที่ยังไม่ push จะยังไม่อยู่ใน clone ของเพื่อน ต้องส่งชุดเตรียมระบบขึ้น repository ก่อนให้เพื่อนเริ่ม
3. เปิด PowerShell ในโฟลเดอร์ repository แล้วรัน:

   ```powershell
   powershell -ExecutionPolicy Bypass -File scripts/start.ps1
   ```

   สำหรับ AI แบบ CLI ใช้ `scripts/start.ps1 -AI` และ login ตาม
   [คู่มือ Docker/AI](../docker/README-docker-desktop.md)
   Linux/macOS ใช้ `bash scripts/start.sh` ดูตัวเลือกในคู่มือ Docker
4. เมื่อ build และ doctor ผ่าน จะเข้า shell ของ container ให้รันคำสั่ง Python
   ใน requirements ของตัวเองจาก shell นี้ ไม่ต้องลง Java/Python/EvoSuite บนเครื่องเพิ่ม
5. เริ่ม Lang-1 ก่อน ตรวจผล compile, JUnit และ coverage จากนั้นจึงเริ่ม sample-17
   ตาม [ขั้นตอนกลาง](../STEP-BY-STEP.md) และ [protocol](../BENCHMARK_PROTOCOL.md)
6. ตรวจผลด้วย `python3 scripts/check_submission.py` แล้ว commit/push โฟลเดอร์ของตัวเอง
   ตามคู่มือ Git เก็บ logs, configuration, generated tests และ AI prompts ให้ครบ
   ไม่ส่ง `work/` หรือข้อมูล login

ไฟล์ส่วนกลางที่ทุกคนใช้: `config/benchmark.json`, `config/dependencies.lock.json`,
`scripts/run_benchmark.py`, `scripts/check_submission.py` และ `docker/docker-compose.yml`
ไม่ต้องแก้ไฟล์เหล่านี้แยกคน ถ้าจะเปลี่ยนค่าทดลองให้ตกลงร่วมกันก่อน

สถานะ: Docker build และ MOSA/GRT บน Defects4J Lang-1 ผ่านแล้ว รวม coverage หลังแก้ตัวประเมิน
สมาชิกยังต้องตรวจบนเครื่องตัวเองก่อนเริ่ม sample-17 ส่วน AI จริงยังไม่ได้ตรวจ
ดู [หลักฐาน validation](../VALIDATION.md) ก่อนเริ่มเก็บผลเต็มชุด
