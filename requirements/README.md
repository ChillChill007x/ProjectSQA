# คู่มือสมาชิกโครงการ

ขอบเขต AI เปลี่ยนจาก Claude/Codex เป็น DeepSeek V4 Flash และ GPT-5.6 Terra

| คน | คู่มือ | โฟลเดอร์งาน |
|---|---|---|
| 1 | [MOSA 854](sqa-01-mosa-full854-round1.md) | MOSA_EvoSuite |
| 2 | [GRT 854](sqa-02-grt-full854-round1.md) | GRT |
| 3 | [DeepSeek และ GPT](sqa-03-deepseek-gpt.md) | Deepseek-v4_flash, gpt-5.6-terra |
| 4 | [Infrastructure รวมผลและรายงาน](sqa-04-consolidation-report-deploy.md) | scripts, config, results/member4, document |

Clone ทั้ง repository อ่าน [รายงานตรวจและรวมผล](../document/MEMBER4_REPORT.md) ก่อนใช้ตารางเดิม
MOSA/GRT ชุดหลักเป็น Round1, seed 101, budget 30 วินาทีต่อ target
ผล 60/180 วินาทีเป็นอีกชุดหนึ่ง ไม่รวมกับชุดหลัก
การรวมผล offline ใช้ `python -B scripts/consolidate_member4.py`
การเริ่ม Docker ใช้ [คู่มือระบบ](../docker/README-docker-desktop.md)
และ AI ใช้ [คู่มือเฉพาะ](../AI_API/README.md) โดยต้องตรวจแคมเปญที่ freeze ไว้ก่อนรัน
