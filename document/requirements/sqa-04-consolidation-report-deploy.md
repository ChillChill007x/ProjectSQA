# คนที่ 4 — Infrastructure และรายงาน

> คู่มือที่ปรับตามผลตรวจล่าสุดคือ [หน้าที่คนที่ 4](../../requirements/sqa-04-consolidation-report-deploy.md)
> และ [README หลัก](../../README.md) ขั้นตอนด้านล่างเป็นแผนเดิม
> สำหรับชุดนำเข้าปัจจุบันไม่ใช้ collect ทับ CSV; ใช้ตัวรวมคนที่ 4 ตามคู่มือใหม่

ผู้รับผิดชอบ นายศุภกิตติ์ ฟันเฟือย 673380427-8

1. ดูแล setup ด้วย `AI_API/setup.ps1` และให้ทุกคนใช้ manifest/code/config เดียวกัน
2. แบ่งรายชื่อ Project ให้คนในทีมไม่ซ้ำกัน คนละเครื่องเลือก `-Project` ของตน
3. ใช้ [คู่มือ AI](../../AI_API/README.md) เป็นคำสั่งปัจจุบันของ DeepSeek/GPT
4. รวม per-run JSON, logs, tests, prompts และ manifest ผ่าน Git โดยตรวจ hash ก่อน
5. ใช้ `AI_API/run.ps1 -Action collect` และเพิ่ม `-Workflow existing` สำหรับชุดนำเข้า
6. ตรวจ `python -B scripts/check_submission.py --tool deepseek` และ `--tool openai`
7. รายงาน generation API ใหม่แยกจาก imported-suite evaluation และผล CLI เก่า
8. รายงานตัวหาร: planned 854 ต่อโมเดล, attempted, compile failed, invalid oracle, evaluated และ fault candidates
9. ใช้ค่า token/model จาก response จริง; ไม่มีหลักฐานให้เป็น unknown ไม่สร้าง log ย้อนหลัง
10. ตรวจ fault candidate กับบั๊กจริงก่อนยืนยัน ห้ามนับเทสที่ fixed ล้มเป็น bug detection

MOSA/GRT คง algorithm/budget/seed เดิม การรวมผลกลางใช้ `scripts/collect_results.py` ได้
ผล AI ใน `results/benchmark_results.csv` ที่นำเข้ามายังไม่ใช่ผลที่รับรองใหม่
เอกสาร Word เก่าใช้เป็นโครงรายงานได้ แต่คำสั่ง AI ให้ยึดคู่มือปัจจุบัน
