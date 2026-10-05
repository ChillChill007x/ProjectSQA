# ผลงานรวมผลของคนที่ 4

อ่าน [รายงาน](../../document/MEMBER4_REPORT.md) หรือ [HTML สำหรับอ่านและพิมพ์](../../document/MEMBER4_REPORT.html)
ไฟล์ในโฟลเดอร์นี้เป็น derived outputs ไม่เขียนทับ raw results

| ไฟล์ | ความหมาย |
|---|---|
| summary.json | สรุปจำนวน กติกาคัด attempt และข้อจำกัด |
| native_runs.csv | ทุก native run พร้อม integrity flags, cohort และ selected_first_attempt |
| native_cohorts.csv | สรุปแยก implementation/protocol/budget/seed ไม่บวก unique bugs ข้าม cohort |
| native_projects.csv | ผลชุด 30 วินาทีแยก cohort/project |
| ai_imported_units.csv | ข้ออ้างรายบั๊กจาก CSV นำเข้า ไม่ใช่ผลรับรองใหม่ |
| ai_summary.csv | AI รวมและแยก project พร้อม planned denominator |
| generation_claims.csv | Token/เวลาที่ไฟล์รายคลาสรายงาน ยังไม่เชื่อมกับ detection |
| inventory.csv และ metadata | Snapshot 854 บั๊ก/17 projects จาก manifest ไม่ใช่ query ใหม่ |
| fault_review_queue.csv | Candidates ทุก attempt ให้ดู selected และ dataset ก่อนใช้ |
| source_manifest.json | SHA256 แหล่งข้อมูลที่ใช้รวมผล |
| report_inputs.json | SHA256 แหล่งข้อมูลเพิ่มเติมที่ใช้สร้างรายงาน |
| recovered_files.json | รายการไฟล์ที่กู้จาก implementation.zip และ hash ต้นฉบับ |
| validation.json | หลักฐานผลทดสอบและข้อจำกัด runtime |
| ai_status.svg | กราฟสถานะ AI ตามตารางนำเข้า |

Native coverage เฉลี่ยต่อ target unit ที่ EVALUATED และ integrity ผ่าน
AI coverage เฉลี่ยต่อ imported suite แยกทุกชุดที่วัดได้กับชุดที่ fixed ผ่านตาม CSV
ทั้งสองตัวหารต่างกัน ไม่ใช้จัดอันดับโดยไม่ควบคุม matched scope
ไม่รวม missing coverage เป็นศูนย์ ไม่อ้าง reported candidates เป็น confirmed FDR
เลือก attempt แรกย้อนหลังต่อ unit; historical validation/superseded ถูกตัดออก
ไม่สร้าง human fault review แทนสมาชิก

ทำซ้ำจาก root:

```powershell
python -B scripts/consolidate_member4.py
python -B AI_API/audit_results.py
python -B scripts/build_member4_report.py
```
