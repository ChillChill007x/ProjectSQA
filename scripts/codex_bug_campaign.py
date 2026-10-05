"""Codex v2: one generation per bug; three lanes, one generator, two evaluators."""
import argparse
from concurrent.futures import ThreadPoolExecutor
from collections import Counter
import csv
import hashlib
import json
import os
from pathlib import Path
import shutil
import threading
import time

import codex_campaign as base
from common import ROOT, WORK, TOOLS, StageError, config, dump, relative, run, sha, java
from run_benchmark import implementation_hash, paths_for, unit_id, utc, artifact_hashes
import evaluator as ev
from ai_generate import source_hashes

CAMPAIGN = ROOT/'Codex/Campaign/v2'
MANIFEST = CAMPAIGN/'manifest.json'
DOCKER_GATE = threading.Semaphore(2)
AI_GATE = threading.Semaphore(1)
PROGRESS_GATE = threading.Lock()
STOP = threading.Event()
LOCAL = threading.local()
ORIGINAL_ENTRIES = base.sandbox_entries
LEGACY_FEEDBACK = base.feedback_for_prompt


def read(path):
    return json.loads(Path(path).read_text(encoding='utf-8-sig'))


def paths(unit):
    return paths_for(unit.get('tool','codex'), unit['project'], unit['bug'], unit['round'], unit_id(unit))


def plan():
    if MANIFEST.exists(): raise ValueError('Frozen v2 manifest already exists')
    old = read(ROOT/'Codex/Campaign/manifest.json')
    grouped = {}
    for u in old['units']:
        grouped.setdefault((u['project'], u['bug']), set()).add(u['target'])
    fingerprint = implementation_hash()
    environment = old['environment']
    dump(CAMPAIGN/'environment.json', environment)
    units = []
    for (project, bug), targets in grouped.items():
        targets = sorted(targets)
        units.append(dict(project=project, bug=bug, target=targets[0], targets=targets,
            tool='codex', round='Single', seed=0, budget_seconds=config()['ai_timeout_seconds'],
            generation_revision='f', protocol_version='2.0', campaign_version='2',
            implementation_sha256=fingerprint, ai_mode='cli', purpose='experiment',
            model=config()['models']['codex'], reasoning_effort='medium',
            execution_backend='isolated-windows-codex',
            environment_sha256=sha(CAMPAIGN/'environment.json')))
    # Interleave projects to discover compatibility failures early, without dropping bugs.
    project_order = {p:i for i,p in enumerate(config()['projects'])}
    units.sort(key=lambda u:(0 if (u['project'],u['bug'])==('Chart','1') else
                            1 if (u['project'],u['bug'])==('Chart','18') else 2,
                            int(u['bug']),project_order[u['project']]))
    assert len(units)==854 and sum(len(u['targets']) for u in units)==1073
    assert len({u['project'] for u in units})==17
    dump(MANIFEST, dict(created_at=utc(), scope='one generation per active bug, all modified classes',
        owner=base.OWNER, environment=environment, units=units,
        config=config(), source_manifest_sha256=sha(ROOT/'Codex/Campaign/manifest.json'),
        policy=dict(workers=2, generator_workers=1, evaluator_workers=1, independent_repetitions=1,
                    fixed_buggy_repeats=2, cache='per-unit compiled checkout and instrumented bytecode',
                    previous_results='retained as v1, excluded from v2 primary analysis')))
    progress()


def progress():
    manifest=read(MANIFEST); rows=[]
    for u in manifest['units']:
        p=base.result_path(u); r=read(p) if p.exists() else {}
        rows.append(dict(run_id=unit_id(u),project=u['project'],bug=u['bug'],
            targets=';'.join(u['targets']),status=r.get('status','NOT_RUN'),
            fault_candidate=r.get('fault_candidate'),result_path=relative(p) if r else ''))
    counts=dict(Counter(r['status'] for r in rows))
    summary=dict(updated_at=utc(),planned=len(rows),projects=17,target_classes=1073,
        status_counts=counts,evaluated=counts.get('EVALUATED',0),
        note='One generation per bug; v1 excluded. Interruptions are unresolved, not scientific failures.')
    dump(CAMPAIGN/'progress.json',summary)
    with (CAMPAIGN/'progress.csv').open('w',newline='',encoding='utf-8') as f:
        writer=csv.DictWriter(f,fieldnames=list(rows[0]));writer.writeheader();writer.writerows(rows)
    print(json.dumps(summary),flush=True)
    return summary


def aggregate_coverage(by_target):
    result={}
    for metric in ['line','branch']:
        covered=sum(c[metric+'_covered'] for c in by_target.values())
        total=sum(c[metric+'_total'] for c in by_target.values())
        result.update({metric+'_covered':covered,metric+'_total':total,
            metric+'_coverage_percent':100*covered/total if total else None})
    return result


def source_context(unit, source):
    text=''
    compact=unit.get('prompt_profile')=='compact-v1'
    for target in unit['targets']:
        from ai_api import java_source_path
        path=java_source_path(source,target)
        name=path.relative_to(source).as_posix()
        if compact:text+=f'\n- {target}: source/{name}'
        else:text+=f'\nTarget: {target}\n```java\n'+path.read_text(encoding='utf-8',errors='replace')+'\n```\n'
    if compact:
        text+='\nRead the listed fixed-source files and needed dependencies. Inspect declarations and bounded method sections; avoid printing entire large files or rereading unchanged text. Keep tool output concise. Cover every listed target. Write tests directly; final response should only list written files.\n'
    return text


def feedback_for_prompt(unit, feedback):
    if unit.get('prompt_profile')!='compact-v1':return LEGACY_FEEDBACK(unit,feedback)
    error=feedback.get('error','')
    try:error=json.loads(error)
    except (ValueError,TypeError):pass
    def prune(value):
        if isinstance(value,dict):
            result={k:prune(v) for k,v in value.items() if k!='trace'}
            if value.get('trace'):
                frames=[line.strip() for line in value['trace'].splitlines() if '.java:' in line]
                result['location']=frames[:2]
            return result
        if isinstance(value,list):return [prune(v) for v in value[:8]]
        return value[:1600] if isinstance(value,str) else value
    result=json.dumps(dict(status=feedback.get('status'),error=prune(error),
        compiler_stderr=feedback.get('compiler_stderr','')[-2200:]),ensure_ascii=False)
    return result if len(result)<=4500 else result[:4400]+'\n[Feedback excerpt; full evidence retained by evaluator.]'


def evaluate_many(work, tests, dest, targets, cache):
    """One compile/JUnit execution covers all targets; counters remain per class."""
    dest.mkdir(parents=True,exist_ok=True)
    cp,bin_dir,names=ev.compile_suite(work,tests,dest,dest)
    fingerprint=hashlib.sha256(''.join(p.relative_to(bin_dir).as_posix()+sha(p)
        for p in sorted(bin_dir.rglob('*.class'))).encode()).hexdigest()
    instrumented=cache/fingerprint/'instrumented'
    marker=instrumented.parent/'ready.json'
    if not marker.exists():
        if instrumented.exists(): raise StageError('CACHE_INCOMPLETE','Incomplete instrumentation cache')
        instrumented.parent.mkdir(parents=True,exist_ok=True)
        run([java(),'-jar',TOOLS/'jacococli.jar','instrument',bin_dir,'--dest',instrumented],
            log=dest/'instrument.json')
        dump(marker,dict(bytecode_sha256=fingerprint))
    elif read(marker).get('bytecode_sha256')!=fingerprint:
        raise StageError('CACHE_INVALID','Instrumentation cache identity mismatch')
    dump(dest/'cache.json',dict(bytecode_sha256=fingerprint,instrumented=str(instrumented)))
    cp=os.pathsep.join(str(instrumented) if x==str(bin_dir) else x for x in cp.split(os.pathsep))
    reports=[]
    for index in [1,2]:
        report=dest/f'junit-{index}.json'; execution=dest/f'coverage-{index}.exec'
        collector=f'-javaagent:{TOOLS / "jacocoagent.jar"}=destfile={execution},append=false,excludes=*'
        r=run([java(),collector,f'-Djacoco-agent.destfile={execution}','-Djacoco-agent.append=false',
            '-cp',cp,'SqaJUnitRunner',report,*names],cwd=work,log=dest/f'run-{index}.json',
            timeout=config()['test_timeout_seconds'],check=False)
        if r['timed_out']:raise StageError('TIMEOUT','JUnit timeout')
        if r['returncode'] or not report.exists():raise StageError('RUNTIME_FAIL','Missing JUnit evidence')
        j=read(report)
        if not j['run_count'] or j['ignored_count'] or j['assumption_failure_count']:
            raise StageError('INVALID_TESTS','Empty or skipped tests')
        reports.append(j)
    # Retain conservative stability rule, but expose actual failures to repair.
    signatures=lambda j:sorted((f['test'],f['exception'],f.get('message')) for f in j['failures'])
    if reports[0]['tests']!=reports[1]['tests'] or signatures(reports[0])!=signatures(reports[1]):
        raise StageError('FLAKY',json.dumps(dict(reason='Repeat evidence differs',
            failures=[r['failures'] for r in reports]))[:12000])
    command=[java(),'-jar',TOOLS/'jacococli.jar','report',dest/'coverage-1.exec']
    for target in targets:
        class_file=bin_dir/(target.replace('.','/')+'.class')
        if not class_file.exists():raise StageError('COVERAGE_ERROR',f'Missing target {target}')
        command+=['--classfiles',class_file]
    xml=dest/'coverage.xml'
    run(command+['--xml',xml],log=dest/'coverage-report.json')
    by_target={t:ev.parse_coverage(xml,t) for t in targets}
    return dict(junit=reports[0],coverage=aggregate_coverage(by_target),
        coverage_by_target=by_target,coverage_instrumentation='offline')


def worker(action,job_path):
    job=read(job_path);u=job['unit'];p=paths(u);rid=unit_id(u)
    context=ROOT/'work/codex-campaign/contexts'/rid
    scratch=WORK/'checkouts'/rid
    cache=WORK/'codex-v2-cache'/rid
    pristine=cache/'fixed'
    result=p['result']/'result.json'
    if action=='prepare':
        for folder in p.values():folder.mkdir(parents=True,exist_ok=True)
        if result.exists():raise StageError('EXISTING_UNIT','Do not overwrite partial generation')
        r=dict(schema_version=2,run_id=rid,unit=u,status='RUNNING',started_at=utc(),
               paths={k:relative(v) for k,v in p.items()},owner=base.OWNER)
        dump(result,r);dump(p['config']/'run-config.json',u)
        ev.checkout(u['project'],u['bug'],'f',pristine,p['result']/'generation')
        src=pristine/ev.export(pristine,'dir.src.classes',p['result']/'generation')
        context.mkdir(parents=True,exist_ok=False)
        shutil.copytree(src,context/'source');(context/'generated-tests').mkdir()
        dump(context/'source-hashes.json',source_hashes(context/'source'))
        task=(ROOT/'prompts/ai-test-generation-prompt.md').read_text(encoding='utf-8')
        task=task.replace('{{TARGET_CLASS}}',', '.join(u['targets'])).replace('{{ROUND}}','Single per-bug run')
        task=task.replace('{{SEED}}','0 (identifier only)').replace('{{BUDGET}}',str(u['budget_seconds']))
        task+='\nGenerate ONE combined suite for ALL listed targets. Read each target from source; do not silently omit any.\n'
        task+=source_context(u,src)
        taskfile=p['config']/'TASK.md';taskfile.write_text(task,encoding='utf-8')
        dump(p['config']/'provenance.json',dict(tool=u.get('tool','codex'),model_requested=u['model'],
            model_reported=None,mode=u.get('ai_mode','cli'),generation_time_sec=None,prompt_sha256=sha(taskfile)))
        r.update(status='AWAITING_AI',generation_context=relative(taskfile));dump(result,r)
    elif action=='feedback':
        dest=p['result']/f"ai-feedback-{job['attempt']}"
        work=scratch/f"feedback-{job['attempt']}"
        try:
            if source_hashes(context/'source')!=read(context/'source-hashes.json'):
                raise StageError('SOURCE_MODIFIED','Fixed source changed')
            shutil.copytree(pristine,work)
            evaluated=evaluate_many(work,context/'generated-tests',dest,u['targets'],cache/'bytecode')
            if not evaluated['junit']['passed']:
                raise StageError('INVALID_ORACLE',json.dumps(evaluated['junit']['failures'])[:12000])
            feedback=dict(passed=True)
        except StageError as exc:
            feedback=dict(passed=False,status=exc.status,error=str(exc))
            log=dest/'compile-generated.json'
            if log.exists():feedback['compiler_stderr']=read(log)['stderr'][-6000:]
        dump(Path(job_path).with_name('feedback-result.json'),feedback)
    elif action=='evaluate':
        r=read(result);r['status']='EVALUATING';dump(result,r)
        tests=p['tests'];r['test_sha256']=artifact_hashes(tests)
        if not r['test_sha256']:raise StageError('NO_TESTS','Missing generated Java')
        r['ai_provenance']=read(p['config']/'provenance.json')
        dest=p['result']/'evaluation-1';fixed=scratch/'evaluation-fixed';buggy=scratch/'evaluation-buggy'
        shutil.copytree(pristine,fixed)
        ev.checkout(u['project'],u['bug'],'b',buggy,dest/'buggy')
        r['reference_validation']=ev.validate_reference(fixed,buggy,dest/'baseline')
        f=evaluate_many(fixed,tests,dest/'fixed',u['targets'],cache/'bytecode')
        b=evaluate_many(buggy,tests,dest/'buggy',u['targets'],cache/'bytecode')
        r.update(ev.compare(f,b));r.update(finished_at=utc(),evaluation_path=relative(dest))
        r['uncovered_targets']=[t for t,c in f['coverage_by_target'].items() if not c['line_covered']]
        if artifact_hashes(tests)!=r['test_sha256']:raise StageError('TESTS_CHANGED','Suite changed during evaluation')
        dump(result,r)
    elif action=='cleanup':
        for candidate,boundary in [(scratch,WORK/'checkouts'),(cache,WORK/'codex-v2-cache'),
                                    (context,ROOT/'work/codex-campaign/contexts')]:
            resolved=candidate.resolve()
            if resolved.parent!=boundary.resolve() or candidate.is_symlink():raise ValueError('Unsafe cleanup')
            if resolved.exists():shutil.rmtree(resolved)


def core(action,job,docker):
    started=time.monotonic()
    with DOCKER_GATE:
        result=run([docker,'run','--rm','--init','--cpus','3','--memory','7g',
            '--mount',f'type=bind,source={ROOT},target=/workspace',
            '--mount','type=volume,source=sqa-codex-work,target=/scratch','-e','SQA_WORK=/scratch',
            base.CORE,'python3','scripts/codex_bug_campaign.py','_worker','--action',action,
            '--job','/workspace/'+relative(job)],timeout=3600,log=job.parent/f'{action}.json',check=False)
    result['wall_with_queue_sec']=time.monotonic()-started
    return result


def native_root(unit):
    return Path(ROOT.anchor)/'sqa-codex-v2-serial'


def entries(unit,task_root,native_context):
    result=ORIGINAL_ENTRIES(unit,task_root,native_context)
    result[(Path(ROOT.anchor)/'sqa-codex-v2').as_posix()]='deny'
    result[(Path(ROOT.anchor)/'sqa-codex-tasks').as_posix()]='deny'
    return result


def host_command(command, **kwargs):
    # Windows sandbox uses a shared local group: simultaneous deny rules conflict.
    # Serialize only generator CLI calls; Docker evaluation can overlap generation.
    if '--ignore-user-config' in command:
        queued=time.monotonic()
        with AI_GATE:
            wait=time.monotonic()-queued
            # The infrastructure queue does not consume the unit's generation budget.
            result=run(command,**kwargs)
            result['generator_queue_seconds']=round(wait,3)
            if kwargs.get('log'):dump(kwargs['log'],result)
            return result
    return run(command,**kwargs)


def host_run(args):
    from ai_api import assert_cli_enabled
    assert_cli_enabled()
    manifest=read(MANIFEST);docker=base.docker_executable();cli=shutil.which('codex')
    if os.name!='nt' or not cli:raise ValueError('Windows with signed-in Codex required')
    expected=manifest['environment']
    if sha(Path(cli))!=expected['cli_sha256']:raise ValueError('CLI differs from frozen environment')
    base.CORE=expected['core_image']
    run([docker,'image','inspect',base.CORE],timeout=30)
    fingerprint=implementation_hash()
    selected=[u for u in manifest['units'] if not base.result_path(u).exists()]
    if any(u['implementation_sha256']!=fingerprint for u in selected):raise ValueError('Implementation changed for unstarted units')
    for u in manifest['units']:
        existing=base.result_path(u)
        if existing.exists() and read(existing).get('unit')!=u:
            raise ValueError('Recorded unit differs from manifest; refusing to mix evidence')
    if args.max_units:selected=selected[:args.max_units]
    lock=WORK/'codex-campaign/runner.lock';lock.parent.mkdir(parents=True,exist_ok=True)
    with lock.open('x') as f:f.write(str(os.getpid()))
    started=utc();errors=[]
    def lane(slot,units):
        LOCAL.slot=slot
        native_root(None).mkdir(parents=True,exist_ok=True)
        for u in units:
            if STOP.is_set():break
            if shutil.disk_usage(ROOT).free<8*1024**3 or shutil.disk_usage('C:/').free<1024**3:
                STOP.set();errors.append('DISK_LOW');break
            print(f'START worker={slot} {unit_id(u)} targets={len(u["targets"])}',flush=True)
            try:status=base.generate(u,docker,cli)
            except Exception as exc:
                status=getattr(exc,'status','TOOL_ERROR');p=base.result_path(u)
                r=read(p) if p.exists() else dict(schema_version=2,run_id=unit_id(u),unit=u,
                    paths={k:relative(v) for k,v in paths(u).items()})
                r.update(status=status,error=str(exc),finished_at=utc());dump(p,r)
                if status in ['AI_ERROR','ENVIRONMENT_ERROR','TOOL_ERROR']:
                    errors.append(str(exc));STOP.set()
                print(f'{status}: {exc}',flush=True)
            print(f'FINISH worker={slot} {unit_id(u)} {status}',flush=True)
            with PROGRESS_GATE:progress()
    try:
        with ThreadPoolExecutor(max_workers=3) as pool:
            futures=[pool.submit(lane,i+1,selected[i::3]) for i in range(3)]
            for future in futures:future.result()
    finally:
        lock.unlink(missing_ok=True);progress()
        dump(CAMPAIGN/f'batch-{int(time.time())}.json',dict(started_at=started,finished_at=utc(),
            selected=[unit_id(u) for u in selected],errors=errors))
    if errors:raise RuntimeError('; '.join(errors))


def main():
    ap=argparse.ArgumentParser(description=__doc__)
    ap.add_argument('command',choices=['plan','status','run','_worker'])
    ap.add_argument('--max-units',type=int,default=2,help='Default bounded two-bug pilot; 0 means full plan')
    ap.add_argument('--action',choices=['prepare','feedback','evaluate','cleanup'])
    ap.add_argument('--job',type=Path)
    args=ap.parse_args()
    base.CAMPAIGN=CAMPAIGN;base.core=core;base.native_task_root=native_root;base.sandbox_entries=entries
    base.run=host_command
    base.feedback_for_prompt=feedback_for_prompt
    if args.command=='plan':plan()
    elif args.command=='status':progress()
    elif args.command=='_worker':worker(args.action,args.job)
    else:host_run(args)


if __name__=='__main__':main()
