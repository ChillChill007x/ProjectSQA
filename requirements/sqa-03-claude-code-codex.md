# คนที่ 3 Claude Code และ Codex

เริ่มจาก [ไฟล์ที่ต้องใช้และขั้นตอนติดตั้งร่วมกัน](README.md) ก่อนรันคำสั่งด้านล่าง

เจ้าของ: นายภีมเดช กลั่นกิ่ง 673380420-2
ผลแต่ละเครื่องมือแยก Prompt / Result / TestCode ตามภาพที่ทีมกำหนด
Claude-sonnet_4_6 คือชื่อโฟลเดอร์ที่ทีมเลือก ชื่อ model จริงต้องบันทึกใน provenance ด้วย
default config ขอ claude-sonnet-4-6 และ gpt-5-codex; ตรวจสิทธิ์ใช้ของบัญชีก่อนรันและ freeze model ร่วมกัน

## แบบ manual ซึ่งใช้ได้กับสิทธิ์เครื่องมือที่มีอยู่

```bash
python3 scripts/run_ai_benchmark.py --tool claude_code --project Lang --bug 1 --seed 101
python3 scripts/run_ai_benchmark.py --tool codex --project Lang --bug 1 --seed 101
```

1. อ่าน TASK.md ที่ runner แสดง แล้วใช้กับ Claude Code/Codex โดยให้เฉพาะ fixed source และ dependencies
2. จับเวลาจริง เก็บบทสนทนา/คำตอบใน Prompt ของ run เดียวกัน ห้ามใส่ token/password/session cookie
3. วาง .java ใต้ TestCode/<Project>/<Bug>/<run-id>/ ตาม package รวม helper test files ที่ต้องใช้
4. กรอก `model_reported` และ `generation_time_sec` ใน provenance.json; usage เป็น null ได้ถ้าไม่มีข้อมูล
5. รันคำสั่งประเมินที่ runner แสดง เช่น:

```bash
python3 scripts/run_benchmark.py --evaluate-run Claude-sonnet_4_6/Result/Lang/1/<run-id>/result.json
```

ถ้าผิด compile/runtime ให้ดู logs และแก้ suite ของ run ที่ยังไม่ผ่าน เก็บประวัติ prompt/response เพิ่มทุกครั้ง
เมื่อ EVALUATED แล้วห้ามแก้ suite เดิม ถ้าจะปรับต้องสร้าง run ใหม่

## แบบ CLI อัตโนมัติ

ใช้ image sqa-ai, login บัญชีตัวเองตาม docker/README-docker-desktop.md แล้ว:

```bash
python3 scripts/run_ai_benchmark.py --tool claude_code --project Lang --bug 1 --seed 101 --ai-mode cli --allow-ai-calls
python3 scripts/run_ai_benchmark.py --tool codex --project Lang --bug 1 --seed 101 --ai-mode cli --allow-ai-calls
```

ระบบใช้ CLI จริง ไม่ส่งข้อความไป API แล้วอ้างว่าเป็น agent
agent อ่าน source และเขียนไฟล์; evaluator กลางตรวจ fixed tests และคืน feedback สูงสุด 2 repair attempts
เก็บ version, explicit model argument, คำตอบดิบ และ usage ที่บริการรายงาน
ไม่แต่ง resolved model/usage หากบริการไม่รายงาน
AI ไม่ได้ใช้ algorithm budget แบบเดียวกับ MOSA/GRT ต้องรายงานเวลาจริงและจำนวนครั้งแก้แยก

ก่อน push ใช้ check_submission.py ทั้งสอง tools และส่ง Prompt, Result, TestCode ของทั้งสองโฟลเดอร์
ห้ามเอาผลของ Claude ไปช่วย Codex หรือกลับกันในหน่วยทดลองเปรียบเทียบ
