# คนที่ 3 DeepSeek V4 Flash และ GPT-5.6 Terra

ผู้รับผิดชอบ นายภีมเดช กลั่นกิ่ง 673380420-2

| Provider | โมเดลที่ประกาศ | โฟลเดอร์ |
|---|---|---|
| deepseek | deepseek-v4-flash | Deepseek-v4_flash |
| openai | gpt-5.6-terra | gpt-5.6-terra |

เก็บ Prompt, Result และ TestCode ภายใต้ `<Project>/<Project>_<bug>b/`
พร้อมหลักฐาน generation จริง ชื่อโฟลเดอร์ไม่ยืนยันโมเดลจาก API
ชุดนำเข้าใน results/benchmark.csv มี 854 แถวต่อโมเดล แยกจาก native result.json
และแผน AI_API/Campaign จำนวนแถวไม่ได้หมายถึงจำนวนเทสต์ที่ผ่าน

ตรวจโดยไม่ใช้ API:

```powershell
python -B scripts/check_submission.py --tool deepseek
python -B scripts/check_submission.py --tool openai
python -B AI_API/audit_results.py
```

สองบรรทัดแรกตรวจเฉพาะ native result.json ไม่รับรอง CSV นำเข้าทั้ง 1,708 แถว
อ่าน [ผลตรวจคนที่ 4](../document/MEMBER4_REPORT.md) และ [คู่มือ AI](../AI_API/README.md)
สคริปต์ที่หายได้รับการกู้จาก implementation.zip แล้ว แต่ Docker smoke ยังต้องตรวจ
manifest เดิมบันทึกพาธก่อนย้ายและ implementation เดิม ต้องจัดแคมเปญใหม่ก่อนทดลองเพิ่ม
ไม่แก้ hash หรือ manifest เก่าเพื่อข้ามการตรวจ
