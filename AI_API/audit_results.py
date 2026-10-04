"""Audit supplied results and publish evidence summaries without running tests or APIs.
Run from the repository root: python -B AI_API/audit_results.py
Outputs are confined to AI_API/ImportedResults; runner progress is never modified.
"""
from pathlib import Path
import collections
import csv
from datetime import datetime, timezone
import hashlib
import json
import sys
import zipfile

ROOT=Path(__file__).resolve().parents[1]
OUT=ROOT/'AI_API/ImportedResults'
LABELS={'DeepSeek V4 Flash':'deepseek','gpt-5.6-terra':'openai'}
FOLDERS={'deepseek':'Deepseek-v4_flash','openai':'gpt-5.6-terra'}
STATUS={'COMPILE_ERROR':'COMPILE_FAIL','FLAKY_OR_REGRESSION':'INVALID_ORACLE',
        'BUG_DETECTED':'EVALUATED','NOT_DETECTED':'EVALUATED','NO_SUITE':'NO_TESTS'}

def rel(path):return path.relative_to(ROOT).as_posix()
def read(path):return json.loads(path.read_text(encoding='utf-8-sig'))
def sha(path):return hashlib.sha256(path.read_bytes()).hexdigest()
def dump(name,data):
    p=OUT/name;p.parent.mkdir(parents=True,exist_ok=True)
    temp=p.with_suffix(p.suffix+'.tmp')
    temp.write_text(json.dumps(data,ensure_ascii=False,indent=2)+'\n',encoding='utf-8');temp.replace(p)
def table(name,rows):
    p=OUT/name
    with p.open('w',encoding='utf-8-sig',newline='') as f:
        w=csv.DictWriter(f,fieldnames=list(rows[0]));w.writeheader();w.writerows(rows)
def csv_rows(path):
    with path.open(encoding='utf-8-sig',newline='') as f:return list(csv.DictReader(f))
def key(project,bug,provider):return str(project),str(bug),provider
def rid(unit):
    digest=hashlib.sha256(json.dumps(unit,sort_keys=True).encode()).hexdigest()[:12]
    return f"{unit['project']}-{unit['bug']}-{unit['round']}-s{unit['seed']}-{digest}"
def native_records():
    out={};stats={}
    for workflow,folder in [('generate','Campaign'),('existing','ExistingSuites')]:
        manifest=ROOT/'AI_API'/folder/'manifest.json';states=collections.Counter();found=[]
        for u in read(manifest)['units']:
            p=ROOT/FOLDERS[u['tool']]/'Result'/f"{u['project']}_{u['bug']}b"/rid(u)/'result.json'
            if not p.exists():states['NOT_RUN']+=1;continue
            r=read(p);states[r.get('status','UNKNOWN')]+=1;found.append(rel(p))
            if workflow=='existing':out[key(u['project'],u['bug'],u['tool'])]=(p,r)
        stats[workflow]={'status_counts':dict(states),'result_files':found,'manifest_sha256':sha(manifest)}
    return out,stats

def suite_hashes(provider,project,bug):
    files=sorted((ROOT/FOLDERS[provider]/'TestCode'/f'{project}_{bug}b').glob('*.java'))
    modes={}
    for mode in ['raw','LF','CRLF']:
        digest=hashlib.sha256()
        for path in files:
            data=path.read_bytes()
            if mode!='raw':data=data.replace(b'\r\n',b'\n').replace(b'\r',b'\n')
            if mode=='CRLF':data=data.replace(b'\n',b'\r\n')
            digest.update(path.name.encode());digest.update(b'\0');digest.update(data)
        modes[mode]=digest.hexdigest()
    return files,modes

def number_diff(a,b):
    if a in ('',None) or b in ('',None):return False
    try:return abs(float(a)-float(b))>0.011
    except (ValueError,TypeError):return True

def main():
    OUT.mkdir(parents=True,exist_ok=True)
    source_csv=ROOT/'results/benchmark_results.csv';rows=csv_rows(source_csv)
    ai=[r for r in rows if r['Technique'] in LABELS]
    supplied=csv_rows(ROOT/'results/ai_existing_summary.csv')
    summary_index=collections.defaultdict(list)
    for r in supplied:summary_index[key(r['project'],r['bug'],r['provider'])].append(r)
    inventory=read(ROOT/'dataset/defects4j/active-bugs-17.json')
    expected={(str(b['project']),str(b['bug'])) for b in inventory['bugs']}
    logs=collections.defaultdict(list);parse_errors=[]
    for path in sorted((ROOT/'results/run_logs').glob('*.json')):
        try:
            data=read(path);provider=LABELS.get(data.get('technique'))
            if provider:logs[key(data.get('project'),data.get('bug_id'),provider)].append((path,data))
        except (ValueError,OSError) as exc:parse_errors.append({'path':rel(path),'error':str(exc)})
    native,native_stats=native_records();units=[];conflicts=[]
    for r in ai:
        provider=LABELS[r['Technique']];project=r['Project'];bug=r['Bug_ID'];k=key(project,bug,provider)
        ll=logs[k];exact=[(p,d) for p,d in ll if d.get('run_id')==r['Run_ID']]
        perbug=ROOT/'results'/project/bug/('deepseek.json' if provider=='deepseek' else 'gpt.json')
        current,hashes=suite_hashes(provider,project,bug)
        hash_modes=[mode for mode,value in hashes.items() if r['Suite_SHA256'] and value==r['Suite_SHA256']]
        flags=[]
        if not ll:flags.append('NO_PER_RUN_LOG')
        elif not exact:flags.append('CSV_RUN_ID_NOT_IN_PER_RUN_LOGS')
        if r['Suite_SHA256'] and not hash_modes:flags.append('CURRENT_SUITE_HASH_MISMATCH')
        if not r['Suite_SHA256']:flags.append('NO_RECORDED_SUITE_HASH')
        if r['Fault_Detection_Status']=='NO_SUITE' and current:flags.append('NO_SUITE_REPORTED_BUT_JAVA_PRESENT_NOW')
        ss=summary_index[k]
        if len(ss)!=1:flags.append('SUMMARY_ROW_COUNT_NOT_ONE')
        elif ss[0]['status']!=STATUS.get(r['Fault_Detection_Status'],r['Fault_Detection_Status']):flags.append('SUMMARY_STATUS_CONFLICT')
        if perbug.exists():
            d=read(perbug)
            if d.get('fault_detected')!=r['Fault_Detection_Status']:flags.append('PER_BUG_STATUS_DIFFERS')
            if number_diff(r['Line_Coverage_%'],d.get('line_cov')) or number_diff(r['Branch_Coverage_%'],d.get('branch_cov')):flags.append('PER_BUG_COVERAGE_DIFFERS')
        np,nr=native.get(k,(None,None))
        if nr:
            nc=nr.get('fixed',{}).get('coverage',{})
            if number_diff(r['Line_Coverage_%'],nc.get('line_coverage_percent')) or number_diff(r['Branch_Coverage_%'],nc.get('branch_coverage_percent')):
                flags.append('NATIVE_FIXED_COVERAGE_DIFFERS')
                conflicts.append({'project':project,'bug':bug,'provider':provider,'csv_run_id':r['Run_ID'],
                    'native_run_id':nr.get('run_id'),'csv_line':r['Line_Coverage_%'],'native_fixed_line':nc.get('line_coverage_percent'),
                    'csv_branch':r['Branch_Coverage_%'],'native_fixed_branch':nc.get('branch_coverage_percent'),'native_result':rel(np)})
        units.append(dict(project=project,bug=bug,provider=provider,reported_status=r['Fault_Detection_Status'],
            normalized_reported_status=STATUS.get(r['Fault_Detection_Status'],r['Fault_Detection_Status']),
            csv_run_id=r['Run_ID'],csv_line=r['Line_Coverage_%'],csv_branch=r['Branch_Coverage_%'],
            csv_source=rel(source_csv),per_bug_json=rel(perbug) if perbug.exists() else '',
            run_log_paths=';'.join(rel(p) for p,d in ll),exact_run_id_log_count=len(exact),
            supplied_summary_result_path=ss[0].get('result_path','') if len(ss)==1 else '',
            native_result=rel(np) if np else '',current_java_files=len(current),suite_hash_match_modes=';'.join(hash_modes),
            flags=';'.join(flags),generation_model_verified=False))
    providers={};projects=[]
    for provider in FOLDERS:
        rr=[u for u in units if u['provider']==provider];keys={(u['project'],u['bug']) for u in rr}
        providers[provider]=dict(expected_bugs=len(expected),csv_rows=len(rr),unique_bugs=len(keys),
            reported_scope_percent=round(100*len(keys&expected)/len(expected),2),missing_bugs=sorted(expected-keys),
            extra_bugs=sorted(keys-expected),duplicate_rows=len(rr)-len(keys),
            reported_status_counts=dict(collections.Counter(u['reported_status'] for u in rr)),
            per_bug_json_count=sum(bool(u['per_bug_json']) for u in rr),
            bugs_with_run_logs=sum(bool(u['run_log_paths']) for u in rr),
            bugs_with_exact_run_id_logs=sum(bool(u['exact_run_id_log_count']) for u in rr),
            current_suite_hash_matches=sum(bool(u['suite_hash_match_modes']) for u in rr),
            native_result_count=sum(bool(u['native_result']) for u in rr),
            summary_nonempty_result_paths=sum(bool(u['supplied_summary_result_path']) for u in rr),
            flags=dict(collections.Counter(f for u in rr for f in u['flags'].split(';') if f)))
        for project in sorted({p for p,b in expected}):
            part=[u for u in rr if u['project']==project];counts=collections.Counter(u['reported_status'] for u in part)
            projects.append(dict(project=project,provider=provider,expected_bugs=sum(p==project for p,b in expected),reported_bugs=len({u['bug'] for u in part}),
                compile_error=counts['COMPILE_ERROR'],flaky_or_regression=counts['FLAKY_OR_REGRESSION'],not_detected=counts['NOT_DETECTED'],bug_detected=counts['BUG_DETECTED'],no_suite=counts['NO_SUITE'],native_results=sum(bool(u['native_result']) for u in part)))
    source_files=[]
    for p in sorted((ROOT/'results').rglob('*')):
        if p.is_file():source_files.append({'path':rel(p),'sha256':sha(p),'bytes':p.stat().st_size})
    delivery=list((ROOT/'results/member3_delivery_logs').glob('*.log'))
    duplicate_folder=ROOT/'results/New folder/member3_delivery_logs'
    duplicates=sum((duplicate_folder/p.name).exists() and sha(p)==sha(duplicate_folder/p.name) for p in delivery)
    archive=ROOT/'results/member3_delivery_logs.zip';zip_matches=0;zip_files=0
    if archive.exists():
        with zipfile.ZipFile(archive) as z:
            for info in z.infolist():
                if info.is_dir():continue
                zip_files+=1;p=ROOT/'results'/info.filename
                if p.is_file() and hashlib.sha256(z.read(info)).hexdigest()==sha(p):zip_matches+=1
    summary=dict(audited_at=datetime.now(timezone.utc).isoformat(),basis='Supplied results files; this audit runs no API, compiler or tests.',
        meaning_of_100_percent='CSV status coverage of the expected bug list, not successful tests or verified new API generation.',
        providers=providers,native_runner=native_stats,coverage_conflicts=conflicts,parse_errors=parse_errors,
        source_file_count=len(source_files),delivery_logs=dict(files=len(delivery),identical_in_new_folder=duplicates,zip_files=zip_files,zip_matching_files=zip_matches),
        suite_hash_method='For current flat Java files: sorted filename UTF-8 + NUL + file bytes, with raw/LF/CRLF variants; matches do not establish model origin.',
        caveat='Different metric definitions/runs must be reconciled against raw coverage evidence; do not overwrite contradictory evidence.')
    dump('progress.json',summary);dump('source_manifest.json',{'audited_at':summary['audited_at'],'files':source_files})
    table('progress.csv',units);table('projects.csv',projects)
    dump('coverage_conflicts.json',conflicts)
    lines=['# ความคืบหน้าจากไฟล์ results','',f"ตรวจเมื่อ {summary['audited_at']} (UTC)",'',
        'รายงานนี้อ่านไฟล์ที่ผู้ใช้นำมาใส่ใน results ไม่ได้รัน AI/Defects4J เพิ่ม และไม่สร้าง logs ย้อนหลัง',
        '**100% ในหน้านี้หมายถึงมีสถานะใน CSV ครบรายการบั๊ก ไม่ได้หมายถึงเทสผ่านครบ หรือยืนยันว่าเป็น generation ใหม่**','',
        '| รายการ | DeepSeek | GPT |','|---|---:|---:|']
    for label,field in [('บั๊กที่มีสถานะใน CSV','unique_bugs'),('มี JSON รายบั๊ก','per_bug_json_count'),('มี run log ของบั๊ก/ชุดเดียวกัน','bugs_with_run_logs'),('มี run log ที่ Run_ID ตรง CSV','bugs_with_exact_run_id_logs'),('hash ชุดเทสปัจจุบันตรงตามวิธีที่ตรวจ','current_suite_hash_matches'),('มี result.json ของ runner ปัจจุบัน','native_result_count')]:
        lines.append(f"| {label} | {providers['deepseek'][field]} | {providers['openai'][field]} |")
    lines+=['','## สถานะที่ CSV รายงาน','', '| สถานะ | DeepSeek | GPT |','|---|---:|---:|']
    for status in STATUS:lines.append(f"| {status} | {providers['deepseek']['reported_status_counts'].get(status,0)} | {providers['openai']['reported_status_counts'].get(status,0)} |")
    lines+=['','ทุกแถวด้านบนเป็นสถานะที่ไฟล์รายงาน ไม่ใช่การรับรองโมเดลหรือผลการรันใหม่จากการตรวจครั้งนี้',
        '`BUG_DETECTED` เป็นข้ออ้างในชุดนำเข้า ยังไม่เปลี่ยนเป็น fault_confirmed ของระบบปัจจุบัน','',
        '## หลักฐานและสิ่งที่ต้องตรวจต่อ','',
        '- [รายละเอียดรายบั๊กและ flags](progress.csv) / [แยกโปรเจกต์](projects.csv)',
        '- [สรุปพร้อมตัวหาร](progress.json) / [รายการแหล่งข้อมูลและ SHA256](source_manifest.json)',
        '- [ค่าที่ขัดแย้งกับ native fixed coverage](coverage_conflicts.json)',
        '- [CSV ต้นทาง](../../results/benchmark_results.csv) / [summary ที่นำเข้า](../../results/ai_existing_summary.csv)',
        '- CSV และ run logs ที่ run-id ต่างกันไม่ถูกนำมารวมเป็นหลักฐานของการรันเดียวกันโดยอัตโนมัติ',
        '- ช่อง model/time/token ที่ไม่มี raw API evidence ยังคงไม่ยืนยัน ไม่คัดลอกค่าประมาณเป็นหลักฐานใหม่',
        '- Math-13 รายงาน NO_SUITE ทั้งสองชุด แต่ขณะตรวจมี Java แล้ว จึงต้องตรวจหรือประเมินใหม่',
        f"- delivery logs {len(delivery)} ไฟล์; สำเนาใน New folder ตรง {duplicates} ไฟล์ และ ZIP ตรง {zip_matches}/{zip_files} ไฟล์ ไม่นับสำเนาเป็นงานเพิ่ม",'',
        '## Coverage ที่ต้องตรวจแหล่งที่มา','',
        '| ชุด / บั๊ก | CSV line / branch | native fixed line / branch |','|---|---|---|']
    for c in conflicts:lines.append(f"| {c['provider']} {c['project']}-{c['bug']} | {c['csv_line']} / {c['csv_branch']} | {c['native_fixed_line']:.2f} / {c['native_fixed_branch']:.2f} |")
    lines+=['','CSV บางค่าอาจเป็นคนละ revision/ตัววัด ต้องย้อนดูรายงาน coverage ดิบก่อนสรุป ไม่เลือกค่าที่สูงกว่าโดยไม่มีหลักฐาน','',
        '## แผนของ runner ปัจจุบัน','',
        'สรุปจากตำแหน่ง result.json ที่ manifest ระบุ:',
        '- generation: '+json.dumps(native_stats['generate']['status_counts']),
        '- existing: '+json.dumps(native_stats['existing']['status_counts']),
        '', 'ไฟล์ progress ของ Campaign/ExistingSuites ไม่ถูกแก้ด้วยข้อมูลนำเข้า เพื่อไม่ให้ runner ข้ามงานที่ยังไม่มีหลักฐานตามสัญญาของระบบ',
        '', 'ตรวจใหม่ได้จาก root: `python -B AI_API/audit_results.py` (เขียนเฉพาะรายงานใน ImportedResults)']
    (OUT/'README.md').write_text('\n'.join(lines)+'\n',encoding='utf-8')
    print(json.dumps(summary,ensure_ascii=False,indent=2))

if __name__=='__main__':main()
