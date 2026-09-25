# Docker environment สำหรับทีม

## ครั้งแรก

ติดตั้ง Git และ Docker Desktop (Linux containers/WSL2 บน Windows) แล้วเปิด Docker ให้ Running
clone repo จาก README และรัน `powershell -ExecutionPolicy Bypass -File scripts/start.ps1`
ต้องมีอินเทอร์เน็ตสำหรับ build ครั้งแรก Defects4J download และ checkout บางโปรเจกต์ใช้เวลานาน/พื้นที่มาก
สคริปต์ติดตั้ง dependency ใน image ไม่ต้องติดตั้ง Java/Python บนเครื่องสมาชิกเพิ่ม

## เข้าใช้งานครั้งต่อไป

จาก repo root:

```bash
docker compose -f docker/docker-compose.yml run --rm sqa-runner bash
```

repo ทั้งหมด mount เป็น /workspace; scratch อยู่ /workspace/work และ results อยู่ในโฟลเดอร์ของแต่ละสาย
ออกด้วย exit ได้ ผลไม่หายแม้ใช้ --rm
Linux อาจต้องปรับ ownership ของ repo ให้ user uid 1000 เขียนได้ ถ้า doctor write check ไม่ผ่าน
image ปัจจุบันเน้น linux/amd64; เครื่อง ARM ต้องตรวจ image/tool compatibility ก่อนอ้างว่า environment เดียวกัน

## ตรวจ environment และทดลอง

```bash
python3 scripts/doctor.py
python3 scripts/doctor.py --smoke evosuite
python3 scripts/doctor.py --smoke grt
```

doctor ตรวจ binary, checksum, Defects4J commit, write permission และ Java helper compilation
--smoke รัน Lang-1 จริง มีค่าใช้เวลา/พื้นที่ แต่ไม่เรียก AI
build fail หรือ checksum fail ให้หยุดแก้ต้นเหตุ ห้ามดาวน์โหลด jar คนละเวอร์ชันแล้วรายงานว่าใช้ config เดิม

## AI แบบ manual

ใช้ core image เตรียม TASK.md แล้วทำงานใน Claude Code/Codex ที่สมาชิกมีสิทธิ์อยู่แล้ว
ย้ายเฉพาะ generated Java เข้าตำแหน่ง TestCode ที่ runner ระบุ กรอก provenance แล้วประเมินผ่าน --evaluate-run
ไม่ต้องติดตั้ง CLI ใน container และไม่ส่ง account/session/token ให้เพื่อน

## AI แบบ CLI อัตโนมัติ

```bash
docker compose -f docker/docker-compose.yml build sqa-ai
docker compose -f docker/docker-compose.yml run --rm sqa-ai bash
# ภายใน container เข้าสู่ระบบของตัวเองตาม CLI ที่ใช้
codex login --device-auth
claude auth login
python3 scripts/run_ai_benchmark.py --tool codex --project Lang --bug 1 --seed 101 --ai-mode cli --allow-ai-calls
```

ชื่อโมเดลใน config/benchmark.json ต้องอยู่ในสิทธิ์บัญชีของผู้รัน ไม่เปลี่ยนชื่อ folder เพื่อแอบแทนโมเดล
CLI เวอร์ชันล็อกใน Dockerfile เก็บ credential ใน named volume ai-home ซึ่งไม่อยู่ใน Git
หากองค์กรจำกัด device login ให้ทำ login ตามคำแนะนำของบริการใน container เดิม
--allow-ai-calls เป็นการเปิดโหมดเรียกบริการจริง สมาชิกควรตรวจ quota/สิทธิ์ตามโจทย์ก่อนรัน batch
automatic run ไม่ข้ามการตรวจสิทธิ์ของ CLI; หากการเขียนไฟล์ถูก permission ปฏิเสธให้แก้ setup ไม่ bypass

## แจก image ให้ทั้งทีม

ผู้ดูแลควร build+smoke แล้ว publish image ใน registry ของทีม จากนั้นบันทึก immutable digest ในเอกสารส่งมอบ
ขั้นนี้ยังไม่ได้ทำในการเตรียม repo และไม่มีการ push image อัตโนมัติ
Dockerfile ล็อก tool releases/commit/checksums แต่ apt repositories ยังเปลี่ยนได้
การใช้ image digest เดียวกันจึงเหมาะที่สุดสำหรับ freeze environment ก่อนเก็บผลจริง
