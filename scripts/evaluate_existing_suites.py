"""Re-evaluate supplied Java suites without AI calls or reconstruction of missing generation logs."""
import argparse
from collections import Counter
from concurrent.futures import ThreadPoolExecutor
import csv
import hashlib
import json
import os
from pathlib import Path
import re
import shutil
import threading
import time
import zipfile

import ai_api as api
import ai_api_campaign as campaign
import codex_bug_campaign as multi
import evaluator as ev
from common import ROOT, WORK, FOLDERS, StageError, dump, relative, run, sha
from run_benchmark import unit_id, utc, artifact_hashes

CAMPAIGN=ROOT/'AI_API/ExistingSuites'
MANIFEST=CAMPAIGN/'manifest.json'
LOCK=WORK/'existing-suites/runner.lock'
REPORT_GATE=threading.Lock()
STOP=threading.Event()


def read(path):return api.read(path)


def paths(unit):return multi.paths(unit)


def result_path(unit):return paths(unit)['result']/'result.json'


def inventory_files(folder, pattern='*', recursive=True):
    if folder.is_symlink():raise ValueError('Input folder may not be a symlink')
    found={}
    for p in sorted(folder.rglob(pattern) if recursive else folder.glob(pattern)):
        if p.is_symlink():raise ValueError('Input symlinks are not supported')
        if p.is_file():found[relative(p)]=sha(p)
    return found


def declared_models(files):
    labels=set()
    for name in files:
        text=(ROOT/name).read_text(encoding='utf-8-sig',errors='replace')
        if Path(name).suffix == '.json':
            data=json.loads(text)
            if isinstance(data.get('model'),str):labels.add(data['model'])
        for pattern in [r'Model Used:\*\*\s*`?([^\r\n`]+)',r'โมเดลที่ใช้.*?`([^`]+)`']:
            match=re.search(pattern,text)
            if match:labels.add(match.group(1).strip())
    return sorted(labels)


def verify_inputs(unit):
    for key in ['test_input_sha256','prompt_input_sha256','legacy_metric_sha256']:
        for name,digest in unit[key].items():
            p=(ROOT/name).resolve()
            if ROOT not in p.parents or not p.is_file() or p.is_symlink() or sha(p)!=digest:
                raise StageError('INPUT_CHANGED','Frozen input changed: '+name)
    folder=ROOT/unit['source_suite_path']
    if inventory_files(folder,'*.java',recursive=False)!=unit['test_input_sha256']:
        raise StageError('INPUT_CHANGED','Java files added, removed or changed in supplied suite')


def plan():
    if MANIFEST.exists():raise ValueError('Existing-suite manifest is frozen; never overwrite it.')
    source=read(campaign.MANIFEST);cfg=source['config'];fp=campaign.fingerprint();units=[]
    for original in source['units']:
        provider=original['tool'];name=f"{original['project']}_{original['bug']}b"
        base=ROOT/FOLDERS[provider]
        tests=inventory_files(base/'TestCode'/name,'*.java',recursive=False)
        prompts=inventory_files(base/'Prompt'/name,'actual_prompt_*.md',recursive=False)
        metrics=inventory_files(base/'Result'/name,'generation_metrics_*.*',recursive=False)
        labels=declared_models(dict(prompts,**metrics))
        oracle=any('KNOWN DEFECT SPECIFICATION' in (ROOT/p).read_text(encoding='utf-8-sig',errors='replace') for p in prompts)
        unit=dict(project=original['project'],bug=original['bug'],target=original['target'],targets=original['targets'],
            metadata_targets=original.get('metadata_targets',original['targets']),
            excluded_non_java_targets=original.get('excluded_non_java_targets',[]),
            tool=provider,round='Reevaluation',seed=0,budget_seconds=0,generation_revision='unknown',
            campaign_version='existing-suites-2',protocol_version='existing-suites-2',purpose='imported-suite-evaluation',
            ai_mode='imported',model=None,model_identity_status='UNVERIFIED_MISSING_ORIGINAL_API_LOGS',
            declared_models=labels,implementation_sha256=fp,source_suite_path=relative(base/'TestCode'/name),
            test_input_sha256=tests,prompt_input_sha256=prompts,legacy_metric_sha256=metrics,
            explicit_ground_truth_in_saved_prompt=oracle)
        units.append(unit)
    dump(MANIFEST,dict(created_at=utc(),units=units,config=dict(core_image=cfg['core_image'],workers=2),
        source_manifest_sha256=sha(campaign.MANIFEST),policy=dict(ai_calls=0,test_edits=False,
        generation_metrics='Unknown; supplied JSON/Markdown claims are preserved, not verified API usage.',
        origin='Existing supplied suites. User reports collaborator-assisted generation and missing original API logs.',
        interpretation='Evaluation of supplied suites; generation model/time/tokens remain unverified.',
        fixed_buggy_repeats=2,resource_targets='Retained in metadata; explicitly excluded from Java coverage only.',
        scope='854 bugs for each of two supplied collections; failures retained.')))
    with zipfile.ZipFile(CAMPAIGN/'implementation.zip','w',zipfile.ZIP_DEFLATED) as z:
        for folder,pattern in [('scripts','*.py'),('scripts/java','*.java'),('GRT/Code/src','*.java'),('config','*.json'),('prompts','*')]:
            for p in (ROOT/folder).rglob(pattern):
                if p.is_file():z.write(p,relative(p))
    progress()


def progress(provider='all',projects=None,persist=True,bugs=None):
    m=read(MANIFEST);units=campaign.select_units(dict(m,config=dict(m['config'],providers={'deepseek':{},'openai':{}})),provider,projects,bugs)
    rows=[]
    for u in units:
        p=result_path(u);r=read(p) if p.exists() else {}
        rows.append(dict(run_id=unit_id(u),collection=u['tool'],project=u['project'],bug=u['bug'],status=r.get('status','NOT_RUN'),
            declared_models=';'.join(u['declared_models']),model_verified=False,num_tests=r.get('num_tests'),
            fault_candidate=r.get('fault_candidate'),evaluation_seconds=r.get('evaluation_time_sec'),result_path=relative(p) if r else ''))
    out=dict(updated_at=utc(),planned=len(rows),status_counts=dict(Counter(r['status'] for r in rows)),
        projects={p:dict(Counter(r['status'] for r in rows if r['project']==p)) for p in sorted({u['project'] for u in units})},
        ai_calls=0,note='Evaluates supplied suites only. Generation model/time/tokens remain unverified.')
    if persist and provider=='all' and not projects and not bugs:
        dump(CAMPAIGN/'progress.json',out)
        with (CAMPAIGN/'progress.csv').open('w',encoding='utf-8',newline='') as f:
            writer=csv.DictWriter(f,fieldnames=rows[0].keys());writer.writeheader();writer.writerows(rows)
    return out


def prepare(unit):
    verify_inputs(unit);p=paths(unit)
    if result_path(unit).exists():raise StageError('EXISTING_UNIT','Do not overwrite previous evaluation evidence.')
    for folder in p.values():folder.mkdir(parents=True,exist_ok=True)
    if any(p['tests'].iterdir()):raise StageError('EXISTING_UNIT','Evaluation test snapshot already exists.')
    source=ROOT/unit['source_suite_path']
    for name in unit['test_input_sha256']:
        file=ROOT/name;dest=p['tests']/file.relative_to(source)
        dest.parent.mkdir(parents=True,exist_ok=True);shutil.copyfile(file,dest)
    for field,subfolder in [('prompt_input_sha256','saved-prompts'),('legacy_metric_sha256','legacy-generation-metrics')]:
        for name in unit[field]:
            file=ROOT/name;dest=p['config']/subfolder/file.name
            dest.parent.mkdir(parents=True,exist_ok=True);shutil.copyfile(file,dest)
    provenance=dict(mode='imported',tool=unit['tool'],model_requested=None,model_reported=None,
        model_identity_status=unit['model_identity_status'],declared_models=unit['declared_models'],
        generation_time_sec=None,total_tokens=None,api_calls=0,
        note='Original API generation logs unavailable; no generation values have been reconstructed.',
        explicit_ground_truth_in_saved_prompt=unit['explicit_ground_truth_in_saved_prompt'])
    dump(p['config']/'provenance.json',provenance);dump(p['config']/'run-config.json',unit)
    record=dict(schema_version=2,run_id=unit_id(unit),unit=unit,status='PREPARED',started_at=utc(),
        paths={k:relative(v) for k,v in p.items()},ai_provenance=provenance,generation_time_sec=None,
        test_sha256=artifact_hashes(p['tests']),generation_model_verified=False)
    dump(result_path(unit),record)
    return record


def coverage_scope(targets,bin_dir):
    java_targets=[];excluded=[]
    for target in targets:
        if target.startswith('src.main.resources.'):
            excluded.append(dict(target=target,reason='Resource metadata entry; not Java bytecode.'));continue
        if not (bin_dir/(target.replace('.','/')+'.class')).is_file():
            raise StageError('COVERAGE_ERROR','Compiled target missing: '+target)
        java_targets.append(target)
    if not java_targets:raise StageError('COVERAGE_ERROR','No Java bytecode targets in unit')
    return java_targets,excluded


def worker(job):
    u=read(job)['unit'];p=paths(u);record=read(result_path(u));started=time.monotonic()
    scratch=WORK/'existing-suite-checkouts'/unit_id(u)
    try:
        verify_inputs(u)
        if artifact_hashes(p['tests'])!=record['test_sha256']:raise StageError('TESTS_CHANGED','Snapshot changed before evaluation')
        if not record['test_sha256']:raise StageError('NO_TESTS','No supplied Java files for this bug')
        record['status']='EVALUATING';dump(result_path(u),record)
        dest=p['result']/'evaluation-1'
        fixed=ev.checkout(u['project'],u['bug'],'f',scratch/'fixed',dest/'fixed')
        bin_dir=fixed/ev.export(fixed,'dir.bin.classes',dest/'fixed')
        targets,excluded=coverage_scope(u['targets'],bin_dir)
        record.update(evaluated_targets=targets,excluded_non_java_targets=excluded);dump(result_path(u),record)
        evaluated={};errors={}
        for revision,work in [('fixed',fixed),('buggy',scratch/'buggy')]:
            try:
                if revision=='buggy':ev.checkout(u['project'],u['bug'],'b',work,dest/'buggy')
                evidence=multi.evaluate_many(work,p['tests'],dest/revision,targets,scratch/'bytecode')
                evaluated[revision]=evidence;record[revision]=evidence
            except (StageError,OSError,ValueError) as exc:
                errors[revision]=dict(status=getattr(exc,'status','TOOL_ERROR'),error=str(exc))
            record['revision_errors']=errors;dump(result_path(u),record)
        if (scratch/'buggy/.sqa-ready.json').exists():
            try:record['reference_validation']=ev.validate_reference(fixed,scratch/'buggy',dest/'baseline')
            except (StageError,OSError,ValueError) as exc:
                record['reference_error']=dict(status=getattr(exc,'status','TOOL_ERROR'),error=str(exc))
        if errors:
            record['status']=errors.get('fixed',errors.get('buggy'))['status']
            record['error']='One or both revisions could not be evaluated; see revision_errors and logs.'
        elif 'reference_error' in record:
            record.update(status='BASELINE_ERROR',error=record['reference_error']['error'])
        else:
            record.update(ev.compare(evaluated['fixed'],evaluated['buggy']))
            record['uncovered_targets']=[t for t,c in evaluated['fixed']['coverage_by_target'].items() if not c['line_covered']]
    except (StageError,OSError,ValueError) as exc:
        record.update(status=getattr(exc,'status','TOOL_ERROR'),error=str(exc))
    finally:
        record.update(finished_at=utc(),evaluation_time_sec=round(time.monotonic()-started,3))
        if artifact_hashes(p['tests'])!=record['test_sha256']:
            record.update(status='TESTS_CHANGED',error='Snapshot changed during evaluation')
        dump(result_path(u),record)
        # Delete only this unit's disposable checkout; all logs and tests are on host.
        if scratch.resolve().parent!=(WORK/'existing-suite-checkouts').resolve() or scratch.is_symlink():
            raise ValueError('Unsafe scratch cleanup path')
        if scratch.exists():shutil.rmtree(scratch)


def docker_evaluate(unit,cfg):
    docker=multi.base.docker_executable();p=paths(unit);job=WORK/'existing-suites/jobs'/unit_id(unit)/'job.json'
    dump(job,{'unit':unit})
    mounts=['--mount',f'type=bind,source={ROOT},target=/workspace,readonly',
        '--mount','type=volume,source=sqa-codex-work,target=/scratch']
    if (ROOT/'.env').exists():
        mask=WORK/'existing-suites/empty-secret';mask.parent.mkdir(parents=True,exist_ok=True);mask.touch(exist_ok=True)
        if mask.is_symlink() or mask.stat().st_size:raise StageError('ENVIRONMENT_ERROR','Invalid empty credential mask')
        mounts+=['--mount',f'type=bind,source={mask},target=/workspace/.env,readonly']
    for folder in [p['result'],job.parent]:
        mounts+=['--mount',f'type=bind,source={folder},target=/workspace/{relative(folder)}']
    name='sqa-existing-'+unit_id(unit).split('-')[-1]
    try:
        result=run([docker,'run','--name',name,'--rm','--init','--network','none','--cpus','3','--memory','7g',
            *mounts,'-e','SQA_WORK=/scratch',cfg['core_image'],'python3','scripts/evaluate_existing_suites.py',
            '_worker','--job','/workspace/'+relative(job)],timeout=5400,log=p['result']/'docker-evaluation.json',check=False)
        if result['returncode'] or result['timed_out']:
            raise StageError('ENVIRONMENT_ERROR','Docker evaluator failed or timed out; see docker-evaluation.json')
    finally:
        run([docker,'rm','-f',name],timeout=30,check=False)


def run_campaign(args):
    m=read(MANIFEST);selection=dict(m,config=dict(m['config'],providers={'deepseek':{},'openai':{}}))
    chosen=campaign.select_units(selection,args.provider,args.projects,getattr(args,'bugs',None))
    if not args.max_units or args.max_units<1:raise ValueError('Specify positive --max-units')
    selected=[]
    for u in chosen:
        p=result_path(u)
        if p.exists():
            if read(p).get('unit')!=u:raise ValueError('Existing result does not match frozen unit')
        else:selected.append(u)
    selected=selected[:args.max_units]
    if not selected:print('No unstarted evaluation units. Existing failures are retained.');return
    fp=campaign.fingerprint()
    if any(u['implementation_sha256']!=fp for u in selected):raise ValueError('Frozen evaluator changed; do not mix conditions.')
    if args.workers not in (1,2):raise ValueError('Use one or two evaluation workers')
    docker=multi.base.docker_executable();run([docker,'image','inspect',m['config']['core_image']],timeout=30)
    LOCK.parent.mkdir(parents=True,exist_ok=True)
    with LOCK.open('x') as f:f.write(str(os.getpid()))
    STOP.clear();started=utc();errors=[]
    def lane(items):
        for u in items:
            if STOP.is_set():break
            print('START',u['tool'],u['project'],u['bug'],flush=True)
            try:
                if shutil.disk_usage(ROOT).free<8*1024**3:raise StageError('DISK_LOW','Work drive below 8 GiB')
                prepare(u);docker_evaluate(u,m['config'])
            except Exception as exc:
                p=paths(u)
                for folder in p.values():folder.mkdir(parents=True,exist_ok=True)
                r=read(result_path(u)) if result_path(u).exists() else dict(schema_version=2,run_id=unit_id(u),unit=u,paths={k:relative(v) for k,v in p.items()})
                status=getattr(exc,'status','TOOL_ERROR');r.update(status=status,error=str(exc),finished_at=utc());dump(result_path(u),r)
                if status in ['INPUT_CHANGED','ENVIRONMENT_ERROR','TOOL_ERROR','DISK_LOW','TESTS_CHANGED']:
                    errors.append(status);STOP.set()
            with REPORT_GATE:progress()
            print('FINISH',u['tool'],u['project'],u['bug'],read(result_path(u))['status'],flush=True)
    try:
        with ThreadPoolExecutor(max_workers=args.workers) as pool:
            for f in [pool.submit(lane,selected[i::args.workers]) for i in range(args.workers)]:f.result()
    finally:
        LOCK.unlink(missing_ok=True);progress()
        dump(CAMPAIGN/f'batch-{time.time_ns()}.json',dict(started_at=started,finished_at=utc(),selected=[unit_id(u) for u in selected],
            projects=sorted({u['project'] for u in chosen}),errors=errors,api_calls=0,workers=args.workers))
    if errors:raise StageError('CAMPAIGN_STOPPED',','.join(errors))


def main():
    parser=argparse.ArgumentParser(description=__doc__)
    parser.add_argument('action',choices=['plan','status','run','_worker'])
    parser.add_argument('--projects','--project',nargs='+')
    parser.add_argument('--provider',choices=['all','deepseek','openai'],default='all')
    parser.add_argument('--max-units',type=int)
    parser.add_argument('--workers',type=int,default=2)
    parser.add_argument('--job',type=Path)
    args=parser.parse_args()
    try:
        if args.action=='plan':plan();print('Frozen 1708 existing-suite evaluation units; no API calls.')
        elif args.action=='status':print(json.dumps(progress(args.provider,args.projects),ensure_ascii=False,indent=2))
        elif args.action=='_worker':worker(args.job)
        else:run_campaign(args)
        return 0
    except (StageError,OSError,ValueError) as exc:
        print(getattr(exc,'status','ERROR')+': '+str(exc));return 1


if __name__=='__main__':raise SystemExit(main())
