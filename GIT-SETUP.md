# ส่งงานเข้ากลุ่มผ่าน Git

## เริ่ม branch ของตัวเอง

```bash
git pull --ff-only
git switch -c member1/mosa-results
```

คนที่ 2 ใช้ `member2/grt-results`; คนที่ 3 ใช้ `member3/ai-results`; คนที่ 4 ใช้ `member4/integration`
ชื่อเป็นตัวอย่าง ไม่ต้องสร้าง branch ของสมาชิกคนอื่น
ก่อนสลับ branch ต้องจัดการไฟล์ที่ตัวเองแก้ค้างไว้ด้วย commit ที่ตั้งใจส่ง ห้าม reset งานเพื่อน

## หลังรัน

```bash
python3 scripts/check_submission.py --tool evosuite
git status --short
git add MOSA_EvoSuite/Configuration MOSA_EvoSuite/Test MOSA_EvoSuite/Result_Round1 MOSA_EvoSuite/Result_Round2
git diff --cached --stat
git commit -m "Add MOSA Lang benchmark evidence"
git push -u origin member1/mosa-results
```

สำหรับคนที่ 2 เปลี่ยนเป็น `GRT/Configuration GRT/Test GRT/Result_Round1 GRT/Result_Round2`
ถ้าแก้ engine ให้ส่ง GRT/Code และ tests ที่เกี่ยวข้องใน commit แยกด้วย
สำหรับคนที่ 3:

```bash
python3 scripts/check_submission.py --tool claude_code
python3 scripts/check_submission.py --tool codex
git add Claude-sonnet_4_6/Prompt Claude-sonnet_4_6/Result Claude-sonnet_4_6/TestCode Codex/Prompt Codex/Result Codex/TestCode
git diff --cached --stat
git commit -m "Add Claude Code and Codex benchmark evidence"
git push -u origin member3/ai-results
```

เปิด Pull Request ให้คนที่ 4 ตรวจผลก่อน merge ห้าม force-push main
runner ไม่ commit/push ให้เอง เพื่อให้สมาชิกตรวจหลักฐานก่อนส่ง

## ส่งอะไร

- run-config.json และ result.json ของทุก attempt รวมรายการล้มเหลว
- Java tests ที่ตรง checksum และ JUnit JSON/coverage XML/raw command logs
- AI: TASK.md, provenance.json, prompts/response ทุก attempt และ usage หากบริการรายงาน
- fault-review.json เฉพาะเมื่อมีผู้ตรวจยืนยันพร้อมเหตุผลแล้ว

ไม่ส่ง work/, .class, .exec, jar, checkout, .env หรือ credentials
ไม่ส่ง summary.csv ที่แก้มือ คนที่ 4 สร้างใหม่ด้วย `python3 scripts/collect_results.py`
อย่าแก้เทสต์หลัง result เป็น EVALUATED ถ้าจำเป็นให้สร้าง run ใหม่เพื่อคงหลักฐานเดิม
