# วิธี Push ขึ้น GitHub + ให้เพื่อน Clone มาทำงานต่อ

## ส่วนที่ 1 — สิ่งที่คุณ (คนสร้าง repo) ต้องทำก่อน push

### 1. สร้าง repo บน GitHub
ไปที่ https://github.com/new → ตั้งชื่อ repo (เช่น `ProjectSQA`) → เลือก **Private** (แนะนำ เพราะเป็นงานส่งอาจารย์ ไม่ควร public จนกว่าจะส่งงานเสร็จ) → **ไม่ต้อง** ติ๊ก "Add README" (เรามีแล้ว) → Create repository

### 2. ขอบเขตข้อมูลกำหนดไว้แล้วใน README.md
ทีมใช้ทั้ง 17 projects เต็ม (ไม่ subset) — ระบุไว้ใน README.md ให้แล้ว ไม่ต้องแก้เพิ่ม

### 3. Init git + commit แยกตามส่วนงาน (ให้ history อ่านง่าย ไม่ commit รวมทีเดียว)
เปิด Terminal ที่โฟลเดอร์ `sqa-project-repo/` แล้วรัน:

```bash
git init
git branch -M main

# commit 1: โครงสร้างพื้นฐาน + README
git add README.md .gitignore
git commit -m "docs: add project README and gitignore"

# commit 2: Docker environment
git add docker/
git commit -m "chore: add Docker environment for Defects4J + EvoSuite + GRT"

# commit 3: benchmark runner script
git add scripts/
git commit -m "feat: add universal benchmark runner (MOSA/EvoSuite, GRT)"

# commit 4: requirement specs แยกตามคน
git add requirements/
git commit -m "docs: add per-person requirement specs (4 roles)"

# commit 5: โฟลเดอร์ placeholder สำหรับผลลัพธ์/tools
git add results/.gitkeep tools/.gitkeep
git commit -m "chore: add placeholder folders for results and external tools"
```

### 4. เชื่อมกับ GitHub แล้ว push
```bash
git remote add origin https://github.com/<username>/ProjectSQA.git
git push -u origin main
```

### 5. เชิญเพื่อนเข้า repo (เฉพาะกรณีตั้งเป็น Private)
GitHub repo → Settings → Collaborators → Add people → ใส่ username/email ของเพื่อนทั้ง 3 คน

---

## ส่วนที่ 2 — สิ่งที่เพื่อนแต่ละคนทำหลัง Clone

### 1. Clone repo
```bash
git clone https://github.com/<username>/ProjectSQA.git
cd ProjectSQA
```

### 2. อ่านไฟล์ requirement ของตัวเองเท่านั้น
ไม่ต้องอ่านของคนอื่น — แต่ละคนเปิดไฟล์ของตัวเองใน `requirements/`:
- คมชาญ (คนที่ 1) → `requirements/sqa-01-mosa-evosuite.md`
- ปฏิภาณ (คนที่ 2) → `requirements/sqa-02-grt.md`
- ภีมเดช (คนที่ 3) → `requirements/sqa-03-claude-code-codex.md`
- ศุภกิตติ์ (คนที่ 4) → `requirements/sqa-04-consolidation-report-deploy.md`

### 3. คนที่ 1 และ 2 — ทำตาม `docker/README-docker-desktop.md`
สร้างโฟลเดอร์ `work/` เปล่าเอง (ไม่อยู่ใน repo เพราะไม่ track):
```bash
mkdir work
cd docker
docker compose build
docker compose run --rm sqa-runner bash
```

### 4. คนที่ 2 เท่านั้น — วาง `grt.jar`
```bash
cp /path/to/grt.jar tools/grt.jar
```
(ไม่ push jar ขึ้น git เพราะไฟล์ใหญ่ — `.gitignore` กันไว้ให้แล้ว)

### 5. ทุกคน — commit + push ผลงานของตัวเองกลับเข้า repo
```bash
git add results/results_evosuite.csv     # (เปลี่ยนชื่อไฟล์ตามที่ตัวเองสร้าง)
git commit -m "results: add MOSA/EvoSuite results for <project(s) ที่รันจริงรอบนี้>"
git pull --rebase                        # ดึงงานคนอื่นมารวมก่อน push
git push
```

> **สำคัญ:** ก่อน push ทุกครั้งให้ `git pull --rebase` ก่อน เพื่อลด merge conflict เวลาหลายคน push พร้อมกัน

---

## Checklist ก่อนส่งงานจริง
- [ ] `results/` มีผลครบทั้ง 17 projects (เช็คจำนวนแถวใน CSV เทียบกับ `defects4j bids` ของแต่ละ project)
- [ ] `results/` มี CSV ครบทั้ง 4 เครื่องมือ (evosuite, grt, claude_code, codex)
- [ ] แต่ละคน push สรุปข้อจำกัด 300-500 คำของตัวเองแล้ว (ใส่ในโฟลเดอร์ผลลัพธ์ของตัวเอง)
- [ ] คนที่ 4 รวมทุกอย่างเป็นรายงานฉบับสมบูรณ์ + Presentation แล้ว push เข้า `Report/`, `Presentation/`
- [ ] repo เปลี่ยนเป็น public หรือ invite อาจารย์เป็น collaborator ตามที่ spec ต้องการ ("ส่งงานผ่าน GitHub")
