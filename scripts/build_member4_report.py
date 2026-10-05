"""Build the Thai member-4 report and printable HTML from audited local evidence."""
import csv
import hashlib
import html
import json
import re
from collections import Counter, defaultdict
from pathlib import Path
from statistics import mean

ROOT = Path(__file__).resolve().parents[1]
DATA = ROOT/'results/member4'
DOC = ROOT/'document'

def read(p): return json.loads(p.read_text(encoding='utf-8-sig'))
def rows(p):
    with p.open(encoding='utf-8-sig',newline='') as f: return list(csv.DictReader(f))
def fmt(v): return 'N/A' if v in (None,'') else f'{float(v):,.2f}'
def mdtable(headers, values):
    return '\n'.join(['| '+' | '.join(headers)+' |','|'+'|'.join(['---']*len(headers))+'|']+
                     ['| '+' | '.join(str(x) for x in row)+' |' for row in values])
def csvout(name, data):
    with (DATA/name).open('w',encoding='utf-8-sig',newline='') as f:
        w=csv.DictWriter(f,fieldnames=list(data[0]));w.writeheader();w.writerows(data)

def inline(text):
    text=html.escape(text)
    text=re.sub(r'`([^`]+)`',r'<code>\1</code>',text)
    text=re.sub(r'\*\*([^*]+)\*\*',r'<strong>\1</strong>',text)
    return re.sub(r'\[([^\]]+)\]\(([^)]+)\)',r'<a href="\2">\1</a>',text)

def render_markdown(text):
    result=[];lines=text.splitlines();i=0
    while i<len(lines):
        line=lines[i]
        if not line.strip(): i+=1;continue
        if line.startswith('```'):
            block=[];i+=1
            while i<len(lines) and not lines[i].startswith('```'):block.append(lines[i]);i+=1
            result.append('<pre>'+html.escape('\n'.join(block))+'</pre>');i+=1;continue
        if line.startswith('|'):
            block=[]
            while i<len(lines) and lines[i].startswith('|'):block.append(lines[i]);i+=1
            cells=lambda l:[x.strip() for x in l.strip('|').split('|')]
            result.append('<div class="tablewrap"><table><thead><tr>'+''.join('<th>'+inline(c)+'</th>' for c in cells(block[0]))+'</tr></thead><tbody>')
            for l in block[2:]:result.append('<tr>'+''.join('<td>'+inline(c)+'</td>' for c in cells(l))+'</tr>')
            result.append('</tbody></table></div>');continue
        if line.startswith('#'):
            level=len(line)-len(line.lstrip('#'));result.append(f'<h{level}>'+inline(line[level:].strip())+f'</h{level}>')
        elif line.startswith('- '):result.append('<p class="item">• '+inline(line[2:])+'</p>')
        else:
            paragraph=[line];i+=1
            while i<len(lines) and lines[i].strip() and not lines[i].startswith(('#','|','```','- ')):
                paragraph.append(lines[i]);i+=1
            result.append('<p>'+inline(' '.join(paragraph))+'</p>');continue
        i+=1
    return '\n'.join(result)

def main():
    s=read(DATA/'summary.json');native=rows(DATA/'native_runs.csv');inventory=rows(DATA/'inventory.csv')
    ai=s['ai_summary'];cohorts=s['native_cohorts'];primary=[r for r in cohorts if r['budget_seconds']==30]
    labels={'deepseek':'DeepSeek V4 Flash','openai':'GPT-5.6 Terra','evosuite':'MOSA','grt':'GRT'}
    sourcefiles=[DATA/'summary.json',DATA/'native_runs.csv',DATA/'inventory.csv',ROOT/'AI_API/Campaign/manifest.json']
    generations=[]
    for provider,folder in [('deepseek','Deepseek-v4_flash'),('openai','gpt-5.6-terra')]:
        files=sorted((ROOT/folder/'Result').glob('*/*/generation_metrics_*.json'));sourcefiles+=files
        metrics=[read(p).get('metrics',{}) for p in files]
        tokens=[m['total_tokens'] for m in metrics if isinstance(m.get('total_tokens'),(int,float))]
        seconds=[m['generation_time_seconds'] for m in metrics if isinstance(m.get('generation_time_seconds'),(int,float))]
        generations.append(dict(tool=provider,records=len(files),token_n=len(tokens),reported_tokens=sum(tokens),
            mean_reported_tokens=mean(tokens) if tokens else None,time_n=len(seconds),
            mean_reported_seconds=mean(seconds) if seconds else None,
            provenance='imported generation metrics; no verified join to evaluation run; not raw API usage'))
    csvout('generation_claims.csv',generations)
    metadata=DATA/'metadata';metadata.mkdir(exist_ok=True)
    for project in sorted({r['project'] for r in inventory}):
        data=dict(project=project,provenance='Saved AI campaign manifest, cross-checked against config/round1-full854.json; not a fresh Defects4J query',
            unavailable_fields=['revision.id.buggy','revision.id.fixed','tests.trigger','tests.trigger.cause'],
            bugs=[dict(bug=r['bug'],metadata_targets=r['metadata_targets'].split(';')) for r in inventory if r['project']==project])
        (metadata/f'{project}.json').write_text(json.dumps(data,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
    grouped=defaultdict(list)
    for r in native:
        if r['selected_first_attempt']=='True':grouped[r['cohort']].append(r)
    project_rows=[]
    for key, rr in grouped.items():
        c=json.loads(key)
        if c['budget_seconds']!=30:continue
        for project in sorted({r['project'] for r in inventory}):
            part=[r for r in rr if r['project']==project]
            good=[r for r in part if r['status']=='EVALUATED' and r['integrity_ok']=='True']
            project_rows.append(dict(cohort_id=hashlib.sha256(key.encode()).hexdigest()[:12],tool=c['tool'],project=project,
                planned_bugs=sum(r['project']==project for r in inventory),represented_bugs=len({r['bug'] for r in part}),
                selected_target_units=len(part),evaluated_target_units=len(good),
                candidate_bugs=len({r['bug'] for r in good if r['fault_candidate']=='True'})))
    csvout('native_projects.csv',project_rows)
    ai_table=mdtable(['สถานะต่อ 854 บั๊ก','DeepSeek','GPT'],[
        ['มีสถานะใน CSV',854,854],['ไม่มี suite',ai[0]['no_suite'],ai[1]['no_suite']],
        ['Compile ไม่ผ่าน',ai[0]['compile_error'],ai[1]['compile_error']],
        ['Invalid oracle / regression',ai[0]['invalid_oracle'],ai[1]['invalid_oracle']],
        ['Fixed ผ่านตามตาราง',ai[0]['fixed_valid_reported'],ai[1]['fixed_valid_reported']],
        ['Candidate ตามตาราง',ai[0]['candidates_reported'],ai[1]['candidates_reported']],
        ['Candidate / planned (%)',fmt(ai[0]['candidate_rate_planned']),fmt(ai[1]['candidate_rate_planned'])]])
    coverage_table=mdtable(['โมเดล','ชุดที่วัดได้ n','Line %','Branch %','Fixed valid n','Line % fixed valid','Branch % fixed valid'],[
        [labels[r['tool']],r['measured_n'],fmt(r['line_mean_measured']),fmt(r['branch_mean_measured']),r['fixed_valid_reported'],fmt(r['line_mean_fixed_valid']),fmt(r['branch_mean_fixed_valid'])] for r in ai])
    native_table=mdtable(['เครื่องมือ','Implementation 12 ตัวแรก','บั๊กที่มีผล','Target units','EVALUATED','Candidate bugs','Line %','Branch %'],[
        [labels[r['tool']],r['implementation_sha256'][:12],r['represented_bugs'],r['selected_targets'],r['evaluated_integrity_pass'],r['candidate_bugs'],fmt(r['line_mean']),fmt(r['branch_mean'])] for r in primary])
    project_counts=Counter(r['project'] for r in inventory)
    project_table=mdtable(['Project','บั๊กใน manifest'],sorted(project_counts.items()))
    generation_table=mdtable(['โมเดล','Records','Mean tokens ตามไฟล์','Mean seconds ตามไฟล์'],[
        [labels[r['tool']],r['records'],fmt(r['mean_reported_tokens']),fmt(r['mean_reported_seconds'])] for r in generations])
    demo=next(r for r in native if r['tool']=='grt' and r['project']=='Chart' and r['bug']=='10' and r['fault_candidate']=='True' and json.loads(r['cohort'])['budget_seconds']==30)
    demo_path=Path(demo['result_path']);demo_data=read(ROOT/demo_path)
    text=f'''# รายงานการเปรียบเทียบและตรวจหลักฐานการสร้างกรณีทดสอบ

## MOSA GRT DeepSeek V4 Flash และ GPT 5.6 Terra บน Defects4J

รายวิชา CP353201 Software Quality Assurance ภาคเรียน 1 ปีการศึกษา 2569
มหาวิทยาลัยขอนแก่น จัดทำส่วนรวมผลและรายงานตามหน้าที่คนที่ 4
ตรวจข้อมูลวันที่ 5 ตุลาคม 2026 ตามเวลาประเทศไทย

รายงานฉบับนี้สรุปผลที่มีอยู่จริงพร้อมข้อจำกัด ยังไม่ใช่การรับรอง confirmed fault detection
หรือการรับรองว่า Docker และการเรียก API ทำงานครบวงจรบนเครื่องปัจจุบัน
หน้าที่คนที่ 3 ใช้ DeepSeek V4 Flash และ GPT-5.6 Terra ตามการเปลี่ยนขอบเขตล่าสุด

| สมาชิก | รหัสนักศึกษา | ความรับผิดชอบ |
|---|---|---|
| นายคมชาญ น้อยเนียม | 673380395-5 | MOSA ผ่าน EvoSuite |
| นายปฏิภาณ มะนิลทิพย์ | 673380589-2 | GRT |
| นายภีมเดช กลั่นกิ่ง | 673380420-2 | DeepSeek V4 Flash และ GPT-5.6 Terra |
| นายศุภกิตติ์ ฟันเฟือย | 673380427-8 | Infrastructure metadata รวมผลและรายงาน |

## บทคัดย่อ

โครงงานศึกษาการสร้างกรณีทดสอบ Java บน Defects4J โดยแยกความสำเร็จในการประเมิน
ความครอบคลุมของโค้ด และความสามารถในการตรวจพบข้อบกพร่อง การตรวจครั้งนี้รวบรวม native result.json
{s['native_runs']:,} รายการจากสี่โฟลเดอร์ และตาราง AI นำเข้า 1,708 แถวสำหรับ 854 บั๊กใน 17 โปรเจกต์ต่อโมเดล
ผล MOSA/GRT รอบ 30 วินาทีครอบคลุมรายชื่อบั๊กทั้งหมด แต่มีหลายเวอร์ชัน implementation และหลาย attempt
จึงแยกกลุ่มก่อนคำนวณ ไม่รวมผลที่เลือกจากเงื่อนไขต่างกันเป็นการแข่งขันชุดเดียว

ตาราง AI รายงานชุดที่ผ่าน fixed จำนวน 15 ชุดสำหรับ DeepSeek และ 116 ชุดสำหรับ GPT
โดยมีสถานะตรวจพบบั๊ก 11 และ 107 บั๊กตามลำดับ ค่านี้เป็น candidate ที่รายงานในชุดนำเข้า
ยังไม่ใช่ confirmed FDR เพราะยังไม่มีหลักฐาน human fault review ที่เชื่อมกับชุดทดสอบครบ
และ run-id ของ CSV ไม่ตรงกับ run logs ที่จัดเก็บ การตรวจ native suites พบ hash และ JUnit evidence
ผ่านเกณฑ์ของตัวตรวจในรายการ EVALUATED แต่การตรงกันของไฟล์ไม่ได้ยืนยันความสัมพันธ์กับบั๊กเป้าหมาย
ผลจึงสนับสนุนการรายงานหลายตัวชี้วัดร่วมกับระดับหลักฐาน มากกว่าการจัดอันดับผู้ชนะจาก coverage เพียงค่าเดียว

## บทที่ 1 บทนำ

### 1.1 ความเป็นมา

การสร้าง unit tests อัตโนมัติช่วยลดงานเขียนชุดทดสอบ แต่โค้ดที่สร้างขึ้นอาจ compile ไม่ผ่าน
ใช้ oracle ผิด หรือเข้าถึงบรรทัดจำนวนมากโดยไม่มี assertion ที่ตรวจบั๊กได้
งานนี้จึงพิจารณาตั้งแต่ความครบของข้อมูลจนถึงหลักฐาน fixed/buggy ของชุดทดสอบเดียวกัน
การมีไฟล์ Java หรือมีแถวใน CSV ไม่เท่ากับการมีผลประเมินที่ใช้เปรียบเทียบได้

### 1.2 วัตถุประสงค์และคำถามวิจัย

- RQ1 แต่ละเทคนิคมีผลประเมินที่ใช้ได้และ coverage เท่าใดภายใต้เงื่อนไขที่บันทึกจริง
- RQ2 มี differential failures กี่รายการ และมีรายการใดผ่านการยืนยันความสัมพันธ์กับบั๊กแล้ว
- RQ3 ข้อมูลเวลาและ token รองรับการเปรียบเทียบต้นทุนได้มากน้อยเพียงใด
- RQ4 ความล้มเหลวและช่องว่างหลักฐานใดกระทบความน่าเชื่อถือและการทำซ้ำ

### 1.3 ขอบเขตและสิ่งส่งมอบ

ขอบเขตคือ MOSA ผ่าน EvoSuite, GRT ที่ทีมพัฒนา, Deepseek-v4_flash และ gpt-5.6-terra
ข้อมูลหลักมาจาก Configuration, Test/TestCode, Prompt, Result และ results
สิ่งส่งมอบประกอบด้วยตัวรวมผลที่รันซ้ำได้ ตารางราย run/ราย project, inventory 17 โปรเจกต์,
รายการ fault ที่รอตรวจ, รายงาน Markdown/HTML และ demo เปิดหลักฐานเดิม
รายงานตัวอย่างและ evaluation.zip ใช้ศึกษารูปแบบเท่านั้น ไม่ใช้ตัวเลขหรือผลของทีมอื่น

## บทที่ 2 หลักการและงานที่เกี่ยวข้อง

### 2.1 การประเมินกรณีทดสอบ

Line coverage คือสัดส่วนบรรทัดที่ถูกเรียกใช้ต่อบรรทัดที่วัดได้ ส่วน branch coverage
คือสัดส่วนแขนงที่ถูกเรียกใช้ต่อแขนงทั้งหมดที่ตัววัดนับได้ Coverage สูงไม่ได้รับรองว่า assertions ถูกต้อง
ใน protocol นี้ suite ต้องผ่าน fixed ก่อนจึงใช้ differential failure บน buggy เป็น candidate
ผลที่ fixed ล้มเป็น invalid oracle ไม่ใช่ความสำเร็จในการตรวจบั๊ก

### 2.2 Defects4J

Defects4J จัดเตรียม faulty/fixed revisions และเครื่องมือสำหรับการทดลองกับข้อบกพร่องจริงใน Java
ที่มาของแนวทางอ้างอิงงานของ Just, Jalali และ Ernst (2014)
[ต้นฉบับจากผู้วิจัย](https://homes.cs.washington.edu/~mernst/pubs/bug-database-issta2014-abstract.html)
จำนวน 854 บั๊กในรายงานนี้ตรวจจาก manifest ของทีมและ profile ที่ตรึงไว้ ไม่อ้างว่าจำนวนนี้มาจากงานปี 2014

### 2.3 MOSA และ GRT

MOSA เป็นแนวทาง many-objective search ใน EvoSuite ซึ่งรองรับการสร้าง individual tests
ตาม [คู่มือ EvoSuite](https://www.evosuite.org/documentation/tutorial-part-4/)
รายงานนี้ใช้ชื่อ MOSA ตาม configuration ของโครงการ ไม่เปลี่ยนเป็น DynaMOSA ตามรายงานตัวอย่าง

GRT ของทีมเป็น implementation ที่อธิบายกลไก Constant Mining, Impurity, Elephant Brain,
Detective, Orienteering และ Bloodhound ใน [เอกสารของทีม](../GRT/README.md)
ข้อจำกัดที่ทีมบันทึกไว้รวมถึงการวิเคราะห์ constant แบบ straight-line, purity แบบ conservative,
ขอบเขตการค้น constructor/factory และขนาด object pool ที่จำกัด ผลนี้จึงไม่ใช่ผลของ binary ต้นฉบับใน paper
และไม่รับรองว่าเทียบเท่า implementation ของผู้เขียนงานวิจัย

### 2.4 AI และที่มาของโมเดล

แผนใหม่ร้องขอ deepseek-v4-flash และ gpt-5.6-terra ผ่าน KKU Direct API
คำว่า openai เป็น provider ภายในระบบ ไม่ได้ยืนยันการติดต่อ endpoint ของ OpenAI โดยตรง
ต้องแยกชื่อที่ประกาศ ชื่อที่ร้องขอ และชื่อที่ response รายงาน
สำหรับชุดนำเข้าที่ตรวจครั้งนี้ native provenance ระบุว่าไม่มี original API logs
จึงไม่ใช้ชื่อโฟลเดอร์เป็นหลักฐานยืนยันรุ่นหรือปริมาณ token จริงจากบริการ

## บทที่ 3 วิธีดำเนินงาน

### 3.1 แหล่งข้อมูลและ inventory

ตรวจความตรงกันของรายการ project/bug จาก AI_API/Campaign/manifest.json
กับ config/round1-full854.json ได้ 854 บั๊กใน 17 โปรเจกต์
ส่งออก [inventory](../results/member4/inventory.csv) และ metadata snapshot รายโปรเจกต์ใน results/member4/metadata
snapshot นี้มีรายชื่อบั๊กและ target classes จาก manifest แต่ไม่มี revision IDs และ triggering-test metadata ครบ
จึงไม่ใช้แทนผล query ใหม่จาก Defects4J

{project_table}

### 3.2 สภาพแวดล้อมและการตรวจซ้ำ

dependency lock ระบุ Defects4J 3.0.1 commit 6d54320e0db5a357f9ab38a8e4d2e5aead7e1c09,
EvoSuite 1.2.0 และ JaCoCo 0.8.13 ส่วน AI campaign ระบุ image digest
sha256:472b9cb8336865c9825e792b3c36291df0a6103ec256ce9c36930ee037f39bed
ค่าเหล่านี้เป็นหลักฐาน configuration เดิม ไม่ใช่การตรวจว่า engine ปัจจุบันใช้ image นี้จริง
ขณะตรวจ Docker Linux engine ไม่พร้อม จึงยังไม่รัน build/doctor/Lang-1 ใหม่
ไม่มีข้อมูล CPU/RAM ของทุกเครื่องที่ทดลองเพียงพอสำหรับสรุป hardware equivalence

ตรวจพบสคริปต์ AI/config/prompt ที่คู่มืออ้างถึงหายจาก checkout จึงกู้เฉพาะ 10 ไฟล์ที่ไม่มี
จาก AI_API/ExistingSuites/implementation.zip โดยไม่เขียนทับ implementation ที่มีอยู่
มี SHA256 และรายการไฟล์ใน [recovery provenance](../results/member4/recovered_files.json)
ตรวจ CLI --help ผ่านแล้ว แต่ยังไม่รับรองการทำงานครบวงจรของชุดที่กู้กับโค้ดปัจจุบัน
ต้องใช้แคมเปญใหม่เมื่อ source fingerprint หรือพาธเปลี่ยน ไม่แก้ manifest เดิมเพื่อข้ามการตรวจ

### 3.3 การตรวจหลักฐาน native

ตัวรวมอ่าน schema_version 2 ตรวจ SHA256 ของ Java ทุกไฟล์ที่บันทึกไว้และตรวจไฟล์ที่เพิ่ม/หายจาก suite
สำหรับ EVALUATED ตรวจ JUnit สองครั้งต่อ revision, test identities, failure signatures,
ความตรงกันระหว่างสรุปกับ JUnit ครั้งแรก, fixed pass และการมี coverage.xml
การตรวจนี้ไม่ได้รัน JVM ใหม่ ไม่ได้คำนวณ coverage.xml ใหม่ และไม่ได้ตรวจทุก assertion กับข้อกำหนดทางธุรกิจ
native AI Lang-1 สองรายการมีพาธก่อนย้าย ตัวตรวจ resolve ไปยังชั้น project โดยไม่แก้ JSON เดิม

### 3.4 กติกาเลือก attempt และแยกกลุ่ม

อ่าน native {s['native_runs']:,} รายการ ตัด validation/superseded {s['excluded']} รายการ
แล้วเลือก attempt แรกตาม started_at, run_id และ path ต่อ unit JSON ได้ {s['selected_first_attempts']:,} หน่วย
กติกานี้เป็นการวิเคราะห์ย้อนหลังเพื่อหลีกเลี่ยงเลือกแต่ผลสำเร็จ ไม่อ้างว่า preregistered ก่อนทดลอง
แยก tool, campaign, protocol, round, seed, budget, implementation และ generation revision
ผล 60/180 วินาทีเก็บใน native_cohorts.csv แยกจากชุดหลัก 30 วินาที
ความล้มเหลวของ attempt แรกยังอยู่ในตัวหาร แม้ attempt หลังจะสำเร็จ

### 3.5 นิยามตัวชี้วัด

- Planned bugs คือจำนวนรายชื่อบั๊กเป้าหมาย ไม่ใช่จำนวนไฟล์หรือ target classes
- EVALUATED ของ native คือสถานะที่ผ่าน protocol และ evidence checks ของตัวรวม ไม่ใช่ human-confirmed fault
- AI fixed valid reported คือ BUG_DETECTED รวม NOT_DETECTED ตาม CSV นำเข้า
- Candidate rate ต่อ planned คือ unique reported candidate bugs หาร 854 คูณ 100
- Confirmed FDR ต้องใช้ unique bugs ที่ human review ยืนยันกับ suite hash เดียวกัน ขณะนี้ยังสรุปไม่ได้
- Mean coverage เป็นค่าเฉลี่ยแบบไม่ถ่วงน้ำหนักในรายการที่วัดได้ โดย native ใช้ target unit และ AI ใช้ suite ต่อบั๊ก
- N/A ไม่ถูกแทนด้วย 0 ขณะที่ coverage 0 ที่วัดได้จริงยังรวมในค่าเฉลี่ย

หน่วยของค่าเฉลี่ย native กับ AI และขอบเขต project ของ implementation ต่างกัน
จึงไม่ใช้ตารางนี้จัดอันดับเชิงสาเหตุว่าเทคนิคใดดีกว่าโดยปราศจาก matched comparison

## บทที่ 4 ผลการทดลองและอภิปรายผล

### 4.1 ความครบของผลอัลกอริทึม

ในชุด 30 วินาที ทั้ง MOSA และ GRT มีผลครอบคลุม 854 บั๊กและ 1,073 metadata targets
นี่คือความครบของรายการที่มีสถานะ ไม่ใช่จำนวนบั๊กที่ทุก target ประเมินสำเร็จ
ตารางต่อไปใช้ seed 101 และ attempt แรกต่อ unit แยก implementation
EVALUATED เป็นจำนวน target units; Candidate bugs นับ unique project/bug ภายในแถวนั้น
ห้ามบวกจำนวนบั๊กข้ามแถว เพราะ implementation อาจทดลองบั๊กเดียวกัน

{native_table}

Line/Branch ของแต่ละแถวคำนวณเฉพาะ EVALUATED ที่ผ่าน integrity checks
จำนวน n ของแต่ละ metric อยู่ใน [native_cohorts.csv](../results/member4/native_cohorts.csv)
ตัวอย่าง MOSA implementation 23ed78b73f64 มีผล 714 target units ใน 559 บั๊กและประเมินได้ 515 targets
ขณะที่ GRT 2095c4d4de9e มี 996 target units ใน 790 บั๊กและประเมินได้ 791 targets
ขอบเขตต่างกันจึงยังไม่ใช่คู่เทียบที่ควบคุมทุกตัวแปรเท่ากัน
รายละเอียดแยกโปรเจกต์อยู่ใน [native_projects.csv](../results/member4/native_projects.csv)

### 4.2 ความครบและสถานะ AI

{ai_table}

ตัวหาร 854 รวม NO_SUITE หากรายงานอัตราต่อ suite ที่มีอยู่ ตัวหารเป็น 853
DeepSeek จึงเป็น 11/853 = 1.29% และ GPT เป็น 107/853 = 12.54%
แต่ตารางหลักใช้ planned denominator เดียวกันคือ 854 และยังเรียกว่า reported candidate rate
ไม่ใช้คำว่า confirmed FDR
DeepSeek fixed valid reported = 11 BUG_DETECTED + 4 NOT_DETECTED
ส่วน GPT = 107 BUG_DETECTED + 9 NOT_DETECTED

### 4.3 Coverage ของ AI

{coverage_table}

กลุ่มที่วัดได้รวม invalid oracle ด้วย: DeepSeek n=192 = 177+15 และ GPT n=424 = 308+116
ค่าเฉลี่ยเฉพาะ fixed valid สูงขึ้น แต่เป็นคนละ subset และมี selection bias
ไม่อนุมานว่าค่า coverage สูงหมายถึงเทสต์ทั้งหมดถูกต้องหรือใช้กับบั๊กที่ compile ไม่ผ่านได้
ผล compile error ไม่มี coverage ที่ใช้ได้ แม้ CSV เดิมเก็บ 0.0 ตัวรวมจะแสดงเป็น N/A

### 4.4 ความตรงกันของหลักฐาน AI

ตารางนำเข้ามี 854 แถวต่อโมเดลและมี run logs ของ project/bug ทั้งหมด แต่ไม่มี run-id ใน logs
ตรงกับ CSV เลยทั้ง 1,708 แถว จึงไม่ย้าย logs ของคนละ run มาใช้รับรองแถวนั้น
JSON รายบั๊กมี 193 ไฟล์สำหรับ DeepSeek และ 433 ไฟล์สำหรับ GPT
suite hash ตรงตาม raw/LF/CRLF diagnostic modes 846 ชุดสำหรับ DeepSeek และ 0 ชุดสำหรับ GPT
การไม่ตรงไม่ได้พิสูจน์ว่าผลปลอม แต่อาจเกิดจากไฟล์เปลี่ยนหรือวิธี hash ต่างกัน ต้องหาต้นฉบับมาจับคู่ให้ได้
การตรงแบบปรับ line endings เป็นเพียงข้อมูลช่วยวิเคราะห์ ไม่เทียบเท่า strict raw hash ของ native

Native Lang-1 ประเมินเป็น INVALID_ORACLE ทั้งสองโมเดล ค่า fixed coverage ของ DeepSeek
67.63/52.86 ต่างจาก CSV 74.08/60.31 และ GPT 92.37/74.86 ต่างจาก CSV 94.09/80.10
เนื่องจากหลักฐานไม่รองรับว่าเป็นตัววัด/revision เดียวกัน จึงเก็บทั้งสองค่าแยกกัน
ไม่เลือกค่าที่สูงกว่าและไม่เขียนทับผลต้นฉบับ
รายละเอียดอยู่ใน [รายงานตรวจ AI](../AI_API/ImportedResults/README.md)

### 4.5 เวลาและ token

{generation_table}

ตัวเลขนี้อ่านจาก generation_metrics รายคลาสที่นำเข้า จึงมีหน่วยเป็น record
ไม่ใช่ต้นทุนต่อบั๊กที่ตรวจพบ ไม่มี run-id join ที่ยืนยันกับตาราง detection และไม่มี raw API evidence
เพียงพอให้ถือเป็นต้นทุนที่รับรองแล้ว จึงไม่คำนวณ bugs per million tokens หรือสรุปโมเดลที่คุ้มค่ากว่า
ค่า generation_time_sec ของ native ถูกเก็บใน native_runs.csv แต่ไม่เทียบกับเวลาการประเมินของ CSV
budget 30 วินาทีต่อ target ก็ไม่จำเป็นต้องเท่ากับ wall-clock time ของ checkout/compile/evaluation ทั้งกระบวนการ

### 4.6 กรณีศึกษาและ fault review

เลือก GRT Chart-10 run `{demo['run_id']}` เป็นตัวอย่างเปิดหลักฐาน
พบ fixed pass และ buggy failure ตาม result.json พร้อม test hashes และ JUnit repetitions
สถานะนี้เป็น candidate ดู [result.json](../{demo['result_path']}) และ demo สำหรับพาธไฟล์ทั้งหมด
บันทึก AI review เดิมของทีมอธิบายประเด็น HTML escaping แต่ระบุชัดว่าไม่ใช่ human confirmation
จึงยังไม่สร้าง fault-review.json ในนามสมาชิกหรือเปลี่ยน candidate เป็น confirmed

อีกกรณีคือ AI Lang-1 ซึ่งมี coverage แต่ fixed ล้ม สะท้อนว่า coverage ไม่ได้แทน oracle validity
รายการ Math-13 ใน CSV เป็น NO_SUITE แม้มี Java อยู่ในโฟลเดอร์ปัจจุบัน จึงเป็นสถานะของ snapshot เดิม
ไม่แก้เป็นผ่านเพียงเพราะพบไฟล์ภายหลัง
[fault_review_queue.csv](../results/member4/fault_review_queue.csv) เก็บ candidates ทุก attempt
พร้อม selected flag สำหรับให้ทีมตรวจ ไม่ให้รายการที่ไม่ได้เลือกปนกับตัวเลขรายงาน

### 4.7 คำตอบต่อคำถามวิจัย

RQ1 มีผล coverage และอัตราประเมินได้ตามตาราง แต่ต้องอ่านควบคู่ n, หน่วยวิเคราะห์ และ cohort
RQ2 มี candidates ตามหลักฐานหลายระดับ แต่ยังไม่มี confirmed review ที่ใช้คำนวณ FDR ได้
RQ3 มี generation metrics ที่รายงานไว้ แต่ยังเชื่อมกับ detection อย่างรับรองไม่ได้
RQ4 ปัญหาหลักคือ compile/invalid oracle, run-id/hash ที่ไม่ตรง, implementation หลายรุ่น
และสภาพแวดล้อมปัจจุบันที่ยังไม่พร้อมสำหรับการตรวจซ้ำ

## บทที่ 5 สรุปและข้อเสนอแนะ

### 5.1 ผลงานที่ดำเนินการแล้ว

รวมข้อมูลของทั้งสี่เทคนิคพร้อมการเปลี่ยนชื่อ AI ให้ตรงกับงานคนที่ 3
สร้างตัวรวมที่ไม่แก้ raw evidence ตรวจ native integrity และแยก attempt/implementation
สร้าง inventory snapshot ครบ 17 โปรเจกต์ ตารางสรุปและ fault queue พร้อมแหล่งอ้างอิงราย run
แก้ตัวตรวจ/ตัวรวมเดิมให้มองเห็น DeepSeek/GPT และพาธหลังย้าย
กู้สคริปต์ที่หายจาก archive ของทีม ตรวจ Python regression tests ผ่าน 28 รายการ
และตรวจ native submission ของ AI ทั้งสองโมเดลผ่านโดยแจ้งพาธที่ย้าย

### 5.2 ข้อจำกัดต่อการตีความ

ผลชุดนำเข้าไม่รับรอง model identity และ raw token usage; provenance บางส่วนอ้างรุ่น buggy
หรือ saved prompts ที่มีข้อมูลบั๊ก จึงไม่เหมารวมว่าเป็น fixed-source generation ตามแผนใหม่ทั้งหมด
ต้องแยก fixed-code generation, imported-suite evaluation และแผน API ที่ยังไม่ได้รัน
ผลอัลกอริทึมมีหลาย implementation และ stochastic seed เดียวในชุดหลัก
การเลือก attempt แรกเป็นการตัดสินใจย้อนหลัง ไม่ใช่หลักฐานว่าออกแบบการทดลองเช่นนี้ตั้งแต่เริ่ม
GRT เป็น implementation ของทีม และยังไม่มี human-reviewed confirmed FDR
ตัวตรวจ offline ตรวจหลักฐานที่บันทึกไว้ ไม่พิสูจน์สภาพแวดล้อมในวันที่ทดลองหรือทำซ้ำ JVM วันนี้

### 5.3 งานคงเหลือก่อนรับรองฉบับส่ง

- เปิด Docker Linux engine ตรวจ doctor และ Lang-1 smoke จากโค้ด/config ที่จะใช้จริง
- สกัด metadata query ครบ 17 โปรเจกต์พร้อม revision IDs และ triggering tests
- จัดแคมเปญใหม่หลังตรวจพาธและ freeze source/config/prompt/image โดยเก็บ manifest เดิมเป็นประวัติ
- จับคู่ CSV, exact run-id, suites และ logs ของ AI หรือประเมินชุดเดิมใหม่โดยเก็บผลเป็นคนละ campaign
- ตรวจ candidate กับ patch และ API contract โดยผู้รับผิดชอบ ก่อนบันทึก human confirmation
- ทำ matched comparison ในบั๊ก/target/เงื่อนไขเดียวกัน และเพิ่ม independent repetitions หากต้องการสถิติอนุมาน

ส่วนที่ยังไม่เสร็จข้างต้นไม่ถูกแทนด้วยผลสมมติหรือข้อความรับรอง
การรวมผล offline และรายงานที่ส่งมอบครั้งนี้ทำซ้ำได้จากไฟล์ใน repository

## เอกสารอ้างอิง

- Just, R., Jalali, D., and Ernst, M. D. (2014). Defects4J A database of existing faults to enable controlled testing studies for Java programs. [หน้าบทความของผู้วิจัย](https://homes.cs.washington.edu/~mernst/pubs/bug-database-issta2014-abstract.html)
- EvoSuite. Tutorial Part 4 Extending EvoSuite. [เอกสารผู้พัฒนา](https://www.evosuite.org/documentation/tutorial-part-4/)
- ทีม ProjectSQA. [GRT implementation และ deviations](../GRT/README.md), [Benchmark protocol](../BENCHMARK_PROTOCOL.md), [AI protocol](BENCHMARK_PROTOCOL.md)
- ทีม ProjectSQA. [dependency lock](../config/dependencies.lock.json), [campaign manifest](../AI_API/Campaign/manifest.json), [แหล่งข้อมูลและ SHA256](../results/member4/source_manifest.json)
- รายงานตัวอย่าง AI-Assisted Testing vs. Automatic Test Case Generation Algorithms A Benchmark and Test Coverage Evaluation และ ตัวอย่างevaluation.zip ที่ผู้ใช้ให้ ใช้ดูโครงสร้างรายงานและการแบ่งผลราย test เท่านั้น ไม่มีการนำผลทดลองมาแทนผลโครงการนี้

## ภาคผนวก การทำซ้ำและไฟล์ส่งมอบ

```powershell
python -B scripts/consolidate_member4.py
python -B AI_API/audit_results.py
python -B scripts/build_member4_report.py
python -B -m unittest discover -s tests -p "test_*.py" -v
```

คำสั่งเหล่านี้ไม่เรียก API และไม่รัน Defects4J เพิ่ม
หาก Windows จำกัด temp directory ให้ตั้ง TEMP/TMP เป็น work/member4-temp ที่เขียนได้ก่อนรัน tests
อ่าน [คำอธิบายตารางทั้งหมด](../results/member4/README.md) และ [demo](MEMBER4_DEMO.md)
ต้นฉบับรายงานคือ MEMBER4_REPORT.md ส่วน HTML ใช้อ่านและพิมพ์จากเบราว์เซอร์
'''
    (DOC/'MEMBER4_REPORT.md').write_text(text,encoding='utf-8')
    chart=['<svg viewBox="0 0 900 230" role="img" aria-label="AI imported status counts per 854 bugs" xmlns="http://www.w3.org/2000/svg"><rect width="900" height="230" fill="white"/>',
           '<text x="10" y="25" font-size="18">AI imported statuses — 854 bugs per model</text>']
    colors=['#486581','#f2b24c','#197d78','#acb9c6']
    for i,r in enumerate(ai):
        y=55+i*65;chart.append(f'<text x="10" y="{y+22}" font-size="15">{labels[r["tool"]]}</text>');x=190
        for value,color in zip([r['compile_error'],r['invalid_oracle'],r['fixed_valid_reported'],r['no_suite']],colors):
            width=value/854*680
            chart.append(f'<rect x="{x}" y="{y}" width="{width}" height="35" fill="{color}"/>')
            if width>25:chart.append(f'<text x="{x+width/2}" y="{y+23}" text-anchor="middle" fill="white" font-size="15">{value}</text>')
            x+=width
    for i,(label,color) in enumerate(zip(['Compile error','Invalid oracle','Fixed valid reported','No suite'],colors)):
        x=10+i*225;chart.append(f'<rect x="{x}" y="195" width="14" height="14" fill="{color}"/><text x="{x+20}" y="207" font-size="14">{label}</text>')
    chart.append('</svg>')
    (DATA/'ai_status.svg').write_text(''.join(chart),encoding='utf-8')
    body=render_markdown(text).replace('<h3>4.2 ความครบและสถานะ AI</h3>', '<h3>4.2 ความครบและสถานะ AI</h3>'+''.join(chart))
    css='''body{font-family:"Leelawadee UI",Tahoma,sans-serif;color:#172b3a;max-width:1120px;margin:40px auto;padding:0 28px;line-height:1.85;font-size:16px}h1{font-size:32px;line-height:1.4}h1,h2,h3{color:#142b42}h2{margin-top:2.5em;padding-top:1em;border-top:1px solid #cad4dd}h3{margin-top:1.8em}p{margin:1em 0}a{color:#086c8d;text-decoration:none}a:hover{text-decoration:underline}table{width:100%;border-collapse:collapse;font-size:14px;line-height:1.6;margin:20px 0}th,td{padding:10px 12px;border:1px solid #d5dee5;text-align:left;vertical-align:top;overflow-wrap:anywhere}th{background:#e9f0f5;color:#142b42}tr:nth-child(even){background:#f7fafb}pre{padding:18px;background:#f1f4f7;white-space:pre-wrap;overflow-wrap:anywhere}code{font-size:.92em;overflow-wrap:anywhere}.tablewrap{overflow-x:auto}svg{width:100%;margin-top:20px}button{font:inherit;padding:8px 16px;border:1px solid #afbecb;background:white;cursor:pointer}@media print{body{font-size:11pt;max-width:none;margin:0;padding:0;color:black}h2{break-before:page;border:0;margin-top:0}h2:first-of-type{break-before:auto}h3{break-after:avoid}tr{break-inside:avoid}thead{display:table-header-group}table{font-size:9pt}button{display:none}a{color:black}pre{font-size:9pt}@page{size:A4;margin:18mm}'''
    (DOC/'MEMBER4_REPORT.html').write_text('<!doctype html><html lang="th"><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>รายงานคนที่ 4 ProjectSQA</title><style>'+css+'</style><body><button onclick="window.print()">พิมพ์รายงาน / Save as PDF</button>'+body+'</body></html>',encoding='utf-8')
    (DATA/'README.md').write_text('''# ผลงานรวมผลของคนที่ 4

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
''',encoding='utf-8')
    base=demo_path.parent
    (DOC/'MEMBER4_DEMO.md').write_text(f'''# Demo หลักฐานโครงการโดยไม่เรียก API

1. เปิด [รายงาน HTML](MEMBER4_REPORT.html) อธิบายสี่เทคนิคและขอบเขต 854 บั๊ก
2. เปิด [ตาราง AI](../results/member4/ai_summary.csv) ชี้ความต่างระหว่าง compile, fixed pass และ candidates
3. เปิด [ตาราง native](../results/member4/native_cohorts.csv) ชี้ว่า implementation ต่างกันต้องแยกกลุ่ม
4. ใช้ GRT Chart-10 เป็นตัวอย่าง candidate จากหลักฐานด้านล่าง
5. ปิดด้วยข้อจำกัดและ fault queue ไม่สรุปว่า candidate เป็น confirmed bug

## หลักฐานตัวอย่าง

- [result.json](../{demo['result_path']})
- [JUnit fixed ครั้งที่ 1](../{base.as_posix()}/evaluation-1/fixed/junit-1.json)
- [JUnit fixed ครั้งที่ 2](../{base.as_posix()}/evaluation-1/fixed/junit-2.json)
- [JUnit buggy ครั้งที่ 1](../{base.as_posix()}/evaluation-1/buggy/junit-1.json)
- [JUnit buggy ครั้งที่ 2](../{base.as_posix()}/evaluation-1/buggy/junit-2.json)
- [Coverage XML fixed](../{base.as_posix()}/evaluation-1/fixed/coverage.xml)
- [โฟลเดอร์ Java](../{demo_data['paths']['tests']})
- [Fault review queue](../results/member4/fault_review_queue.csv)

ใช้ result.test_sha256 จับคู่ Java กับหลักฐาน fixed/buggy ชุดเดียวกัน
การเปิดไฟล์นี้เป็น demo หลักฐานเก่า ไม่ใช่ live execution
Docker engine ต้องพร้อมก่อนแสดง doctor หรือ Lang-1 smoke แบบรันจริง
''',encoding='utf-8')
    sourcefiles += [ROOT/'scripts/build_member4_report.py',ROOT/'config/dependencies.lock.json']
    (DATA/'report_inputs.json').write_text(json.dumps([dict(path=p.relative_to(ROOT).as_posix(),sha256=hashlib.sha256(p.read_bytes()).hexdigest()) for p in sourcefiles],indent=2),encoding='utf-8')
    print('Created MEMBER4_REPORT.md, MEMBER4_REPORT.html, MEMBER4_DEMO.md and derived tables.')

if __name__=='__main__':main()
