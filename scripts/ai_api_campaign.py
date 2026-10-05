"""Frozen per-bug direct-API campaigns. Generation remains paused until explicitly resumed."""
import argparse
from collections import Counter
from concurrent.futures import ThreadPoolExecutor
import csv
import hashlib
import json
import os
from pathlib import Path
import shutil
import threading
import time
import ai_api as api
import codex_bug_campaign as evaluator
from common import ROOT, WORK, StageError, dump, relative, run, sha
from run_benchmark import unit_id, utc

CAMPAIGN=ROOT/'AI_API/Campaign'
MANIFEST=CAMPAIGN/'manifest.json'
LOCK=WORK/'ai-api/runner.lock'
REPORT_GATE=threading.Lock()
STOP=threading.Event()
INFRA={'AUTH_REQUIRED','MODEL_UNAVAILABLE','API_CONFIG_ERROR','API_HTTP_ERROR','API_RATE_LIMIT',
       'API_NETWORK_ERROR','API_RESPONSE_ERROR','PROVENANCE_MISSING','ENVIRONMENT_ERROR','TOOL_ERROR',
       'DISK_LOW','PAUSED','TOKEN_BUDGET','USAGE_UNKNOWN'}


def fingerprint():
    # Git normalizes these text files to LF; Windows checkouts must yield the same identity.
    files=list((ROOT/'scripts').glob('*.py'))+list((ROOT/'scripts/java').glob('*.java'))+list((ROOT/'GRT/Code/src').rglob('*.java'))
    files += [ROOT/p for p in ['config/benchmark.json','config/dependencies.lock.json','prompts/ai-test-generation-prompt.md','prompts/ai-api-system.txt']]
    files.extend([api.CONFIG,ROOT/'dataset/defects4j/active-bugs-17.json'])
    digest=hashlib.sha256()
    for path in sorted(files,key=lambda p:p.relative_to(ROOT).as_posix()):
        digest.update(path.relative_to(ROOT).as_posix().encode()+b'\0')
        digest.update(path.read_bytes().replace(b'\r\n',b'\n')+b'\0')
    return digest.hexdigest()


def result_path(unit):
    return evaluator.paths(unit)['result']/'result.json'


def plan():
    if MANIFEST.exists():raise ValueError('Frozen API manifest already exists; archive explicitly before changing conditions.')
    cfg=api.settings()
    runtime=WORK/'ai-api/runtime.json'
    if runtime.exists():
        local=api.read(runtime)
        if local.get('image_tag')==cfg['core_image']:cfg['core_image']=local['image_id']
    inventory=ROOT/'dataset/defects4j/active-bugs-17.json'; previous=api.read(inventory)
    bugs={}
    for u in previous['bugs']:bugs[(u['project'],u['bug'])]=sorted(u['targets'])
    if len(bugs)!=854 or len({p for p,b in bugs})!=17 or sum(map(len,bugs.values()))!=1073:
        raise ValueError('Historical verified active-bug inventory differs from the agreed scope.')
    units=[];current_fingerprint=fingerprint()
    for (project,bug),metadata_targets in bugs.items():
        excluded=[t for t in metadata_targets if t.startswith('src.main.resources.')]
        targets=[t for t in metadata_targets if t not in excluded]
        if not targets:raise ValueError('No Java targets for '+project+'-'+str(bug))
        for provider,profile in cfg['providers'].items():
            units.append(dict(project=project,bug=bug,target=targets[0],targets=targets,tool=provider,
                model=profile['model'],round='Single',seed=0,generation_revision='f',ai_mode='api',
                purpose='experiment',campaign_version=cfg.get('campaign_version','api-1'),protocol_version=cfg['protocol_version'],
                metadata_targets=metadata_targets,excluded_non_java_targets=excluded,
                budget_seconds=900,implementation_sha256=current_fingerprint,api_profile=profile,
                prompt_profile='fixed-target-source-json-v1',max_repairs=cfg['max_repairs'],
                max_output_tokens=cfg['max_output_tokens']))
    dump(MANIFEST,dict(created_at=utc(),config=cfg,units=units,inventory_sha256=sha(inventory),
        policy={'one_suite_per_bug_per_provider':True,'legacy_results':'excluded from new API comparison',
                'fixed_buggy_repeats':2,'silent_truncation':False,'post_transport_retries':0,
                'scope':'854 active bugs / 17 projects / 1070 Java targets plus 3 resource metadata entries per provider',
                'non_java_metadata':'Preserved in metadata_targets and excluded_non_java_targets; not Java coverage targets'}))
    progress()


def select_units(manifest, provider='all', projects=None, bugs=None):
    available=sorted({u['project'] for u in manifest['units']})
    canonical={name.casefold():name for name in available}
    requested=[]
    for value in projects or []:
        for name in value.split(','):
            name=name.strip()
            if name.casefold() not in canonical:
                raise ValueError('Unknown project '+repr(name)+'. Choose: '+', '.join(available))
            requested.append(canonical[name.casefold()])
    if provider!='all' and provider not in manifest['config']['providers']:
        raise ValueError('Unknown provider: '+provider)
    selected=[u for u in manifest['units'] if (provider=='all' or u['tool']==provider)
              and (not requested or u['project'] in requested)]
    if bugs:
        if not requested:raise ValueError('Bug selection requires a project filter.')
        missing=set(map(str,bugs))-{str(u['bug']) for u in selected}
        if missing:raise ValueError('Inactive or unknown bug IDs for selected projects: '+', '.join(sorted(missing)))
        selected=[u for u in selected if str(u['bug']) in set(map(str,bugs))]
    return selected


def pending_units(units, limit):
    if limit is None or limit<1:raise ValueError('Specify positive --max-units.')
    pending=[]
    for u in units:
        path=result_path(u)
        if path.exists():
            if api.read(path).get('unit')!=u:raise ValueError('Existing record differs from frozen unit.')
        else:pending.append(u)
    return pending[:limit],len(pending)


def preview(args):
    manifest=api.read(MANIFEST)
    chosen=select_units(manifest,args.provider,args.projects)
    selected,pending=pending_units(chosen,args.max_units)
    return dict(api_calls=0,projects=sorted({u['project'] for u in chosen}),
        matched_units=len(chosen),pending_units=pending,will_start=len(selected),
        max_units=args.max_units,preview_truncated=len(selected)>20,
        next_units=[dict(run_id=unit_id(u),project=u['project'],bug=u['bug'],provider=u['tool']) for u in selected[:20]],
        note='Read-only preview; existing records, including failures, are skipped. No cross-machine work reservation.')


def progress(provider='all', projects=None, persist=True, bugs=None):
    m=api.read(MANIFEST);rows=[]
    chosen=select_units(m,provider,projects,bugs)
    for u in chosen:
        p=result_path(u);r=api.read(p) if p.exists() else {}
        prov=r.get('ai_provenance',{})
        rows.append(dict(run_id=unit_id(u),provider=u['tool'],model=u['model'],project=u['project'],bug=u['bug'],
            targets=';'.join(u['targets']),status=r.get('status','NOT_RUN'),
            api_total_tokens=prov.get('total_tokens'),result_path=relative(p) if r else ''))
    out=dict(updated_at=utc(),planned=len(rows),status_counts=dict(Counter(r['status'] for r in rows)),
             providers={p:dict(Counter(r['status'] for r in rows if r['provider']==p)) for p in sorted({u['tool'] for u in chosen})},
             projects={p:dict(Counter(r['status'] for r in rows if r['project']==p)) for p in sorted({u['project'] for u in chosen})},
             api_paused=api.read(api.CONTROL)['api_paused'])
    # A filtered status must never overwrite the campaign-wide progress files.
    if persist and provider=='all' and not projects and not bugs:
        dump(CAMPAIGN/'progress.json',out)
        with (CAMPAIGN/'progress.csv').open('w',newline='',encoding='utf-8') as f:
            w=csv.DictWriter(f,fieldnames=rows[0].keys());w.writeheader();w.writerows(rows)
    return out


class TokenBudget:
    """A conservative request reservation, not a price estimate or fabricated provider usage."""
    def __init__(self,limit):self.limit=limit;self.reserved=0;self.lock=threading.Lock();self.reported=0
    def reserve(self,payload):
        amount=len(json.dumps(payload,ensure_ascii=False).encode('utf-8'))+payload.get('max_completion_tokens',payload.get('max_tokens',0))+1024
        with self.lock:
            if self.reserved+amount>self.limit:raise StageError('TOKEN_BUDGET','Conservative token reservation would exceed this invocation budget.')
            self.reserved+=amount
        return amount
    def settle(self,reservation,usage):
        total=usage.get('total_tokens') if isinstance(usage,dict) else None
        if not isinstance(total,int) or isinstance(total,bool) or total<0:
            raise StageError('USAGE_UNKNOWN','Provider omitted usage; reservation retained and campaign stopped before further calls.')
        with self.lock:
            self.reserved+=total-reservation;self.reported+=total
            if self.reserved>self.limit:raise StageError('TOKEN_BUDGET','Provider-reported usage exceeded reservation; stopping.')
        return total


def core(action,job,cfg):
    docker=evaluator.base.docker_executable()
    unit=api.read(job)['unit'];paths=evaluator.paths(unit)
    context_root=WORK/'codex-campaign/contexts'
    context_root.mkdir(parents=True,exist_ok=True)
    mask=WORK/'ai-api/empty-secret'
    mask.parent.mkdir(parents=True,exist_ok=True);mask.touch(exist_ok=True)
    if mask.is_symlink() or mask.stat().st_size:raise StageError('ENVIRONMENT_ERROR','Secret mask must be an empty regular file.')
    mounts=['--mount',f'type=bind,source={ROOT},target=/workspace,readonly',
            '--mount','type=volume,source=sqa-codex-work,target=/scratch']
    if (ROOT/'.env').exists():
        mounts+=['--mount',f'type=bind,source={mask},target=/workspace/.env,readonly']
    for folder in [*paths.values(),context_root,job.parent]:
        folder.mkdir(parents=True,exist_ok=True)
        mounts+=['--mount',f'type=bind,source={folder},target=/workspace/{relative(folder)}']
    with evaluator.DOCKER_GATE:
        r=run([docker,'run','--rm','--init','--network','none','--cpus','3','--memory','7g',
            *mounts,'-e','SQA_WORK=/scratch',cfg['core_image'],
            'python3','scripts/codex_bug_campaign.py','_worker','--action',action,
            '--job','/workspace/'+relative(job)],timeout=3600,log=job.parent/f'{action}.json',check=False)
    if r['returncode'] or r['timed_out']:raise StageError('ENVIRONMENT_ERROR',f'Docker {action} failed; see {relative(job.parent)}.')


def perform(unit,cfg,budget):
    p=evaluator.paths(unit);rid=unit_id(unit);result=result_path(unit)
    job=WORK/'ai-api/jobs'/rid/'job.json'
    context=WORK/'codex-campaign/contexts'/rid
    if result.exists():raise StageError('EXISTING_UNIT','Never overwrite existing evidence.')
    api.assert_api_enabled()
    dump(job,{'unit':unit});core('prepare',job,cfg)
    r=api.read(result);started=time.monotonic()
    source,evidence=api.source_bundle(unit,context/'source',cfg['max_source_bytes'])
    system=(ROOT/'prompts/ai-api-system.txt').read_text(encoding='utf-8')
    dump(p['config']/'source-inventory.json',evidence)
    (p['config']/'TASK.md').write_text(system+'\n'+source,encoding='utf-8')
    prov=dict(mode='api',tool=unit['tool'],transport=cfg['transport'],endpoint=unit['api_profile']['base_url'],
        model_requested=unit['model'],model_reported=None,model_identity_basis='api_response',
        generation_time_sec=0,usage_by_attempt=[],total_tokens=0,known_total_tokens=0,api_time_sec=0,
        implementation_sha256=unit['implementation_sha256'],prompt_sha256=sha(p['config']/'TASK.md'))
    dump(p['config']/'provenance.json',prov)
    previous=None;feedback=None
    for attempt in range(1,cfg['max_repairs']+2):
        api.assert_api_enabled()
        if STOP.is_set():raise StageError('PAUSED','Another worker stopped the campaign.')
        remaining=unit['budget_seconds']-(time.monotonic()-started)
        if remaining<=0:raise StageError('TIMEOUT','Per-bug generation/feedback budget exhausted.')
        payload=api.make_payload(unit['api_profile'],system,source,cfg['max_output_tokens'],previous,feedback)
        if len(json.dumps(payload,ensure_ascii=False).encode('utf-8'))>cfg['max_request_bytes']:
            raise StageError('CONTEXT_TOO_LARGE','Request exceeds frozen cap; no target or feedback was silently dropped.')
        reservation=budget.reserve(payload)
        dest=p['config']/f'attempt-{attempt}';dest.mkdir(exist_ok=False)
        dump(dest/'request.json',payload)
        (dest/'actual_prompt.md').write_text('\n\n'.join('## '+m['role']+'\n'+m['content'] for m in payload['messages']),encoding='utf-8')
        prov['attempts']=attempt;prov['request_sha256']=sha(dest/'request.json')
        begin=time.monotonic()
        try:
            response=api.http_json(unit['api_profile'],'/chat/completions',payload,min(remaining,cfg['request_timeout_seconds']))
        except StageError as exc:
            prov['total_tokens']=None
            prov['generation_time_sec']=round(time.monotonic()-started,3)
            dump(p['config']/'provenance.json',prov)
            dump(dest/'transport-error.json',dict(status=exc.status,error=str(exc),delivery='unknown unless rejected by provider'))
            raise
        elapsed=time.monotonic()-begin
        dump(dest/'response.json',response)
        prov['api_time_sec']+=elapsed
        prov['usage_by_attempt'].append(dict(attempt=attempt,usage=response.get('usage'),elapsed_sec=round(elapsed,3)))
        prov['model_reported']=response.get('model')
        prov['generation_time_sec']=round(time.monotonic()-started,3)
        prov['total_tokens']=None
        dump(p['config']/'provenance.json',prov)
        actual=budget.settle(reservation,response.get('usage'))
        prov['known_total_tokens']+=actual
        prov['total_tokens']=prov['known_total_tokens']
        dump(p['config']/'provenance.json',prov)
        # Retain every generated attempt, even when validation fails.
        dump(p['result']/f'generation_metrics_attempt-{attempt}.json',dict(
            run_id=rid,attempt=attempt,model_requested=unit['model'],model_reported=response.get('model'),
            experiment_timestamp=utc(),project=unit['project'],bug_id=unit['bug'],version='f',
            targets=unit['targets'],usage=response.get('usage'),api_elapsed_seconds=round(elapsed,3),
            request_sha256=sha(dest/'request.json'),response_sha256=sha(dest/'response.json'),
            finish_reason=(response.get('choices') or [{}])[0].get('finish_reason'),
            generation_status='RESPONSE_RECEIVED_NOT_YET_VALIDATED'))
        previous=api.unpack_response(response)
        (dest/'completion.txt').write_text(previous,encoding='utf-8')
        try:
            files=api.parse_files(previous)
            api.write_files(dest/'tests',files)
            api.write_files(p['tests'],files)
            api.write_files(context/'generated-tests',files)
        except StageError as exc:
            if exc.status!='INVALID_TESTS':raise
            checked={'passed':False,'status':exc.status,'error':str(exc)}
        else:
            dump(job,dict(unit=unit,attempt=attempt));core('feedback',job,cfg)
            checked=api.read(job.with_name('feedback-result.json'))
        dump(dest/'feedback.json',checked)
        prov['generation_time_sec']=round(time.monotonic()-started,3)
        dump(p['config']/'provenance.json',prov)
        if checked['passed']:
            api.write_files(p['tests'],files)
            r.update(status='GENERATED',generation_time_sec=prov['generation_time_sec'],ai_provenance=prov)
            dump(result,r);core('evaluate',job,cfg)
            if api.read(result)['status']=='EVALUATED':
                try:core('cleanup',job,cfg)
                except StageError as exc:
                    r=api.read(result);r['cleanup_warning']=str(exc);dump(result,r)
            return
        feedback=evaluator.feedback_for_prompt({'prompt_profile':'compact-v1'},checked)
    raise StageError('AI_VALIDATION_FAIL','Fixed-revision validation failed after the frozen repair limit.')


def run_campaign(args):
    api.assert_api_enabled()
    if not args.allow_api_calls:raise ValueError('Explicit --allow-api-calls is required; this operation uses the KKU account quota.')
    if args.max_units is None or args.max_units<1 or args.token_budget is None or args.token_budget<1:
        raise ValueError('Specify positive --max-units and --token-budget; no implicit unlimited run.')
    m=api.read(MANIFEST);cfg=m['config']
    chosen=select_units(m,args.provider,args.projects,getattr(args,'bugs',None))
    selected,_=pending_units(chosen,args.max_units)
    if not selected:print('No unstarted units; existing failures/interruption require review.');return
    current_fingerprint=fingerprint()
    if any(u['implementation_sha256']!=current_fingerprint for u in selected):raise ValueError('Frozen code/config/prompt changed; do not silently mix profiles.')
    LOCK.parent.mkdir(parents=True,exist_ok=True)
    with LOCK.open('x') as f:f.write(str(os.getpid()))
    STOP.clear()
    budget=TokenBudget(args.token_budget);started=utc();errors=[]
    try:
        verification=[api.verify_model(cfg['providers'][p]) for p in sorted({u['tool'] for u in selected})]
        dump(CAMPAIGN/'model-verification.json',dict(checked_at=utc(),models=verification))
        docker=evaluator.base.docker_executable();run([docker,'image','inspect',cfg['core_image']],timeout=30)
        evaluator.DOCKER_GATE=threading.Semaphore(cfg['docker_workers'])
        def lane(items):
            for u in items:
                if STOP.is_set():break
                try:
                    if shutil.disk_usage(ROOT).free<8*1024**3:raise StageError('DISK_LOW','Less than 8 GiB free on the work drive.')
                    print('START',unit_id(u),u['tool'],flush=True)
                    perform(u,cfg,budget)
                except Exception as exc:
                    status=getattr(exc,'status','TOOL_ERROR');p=result_path(u)
                    paths=evaluator.paths(u)
                    for folder in paths.values():folder.mkdir(parents=True,exist_ok=True)
                    r=api.read(p) if p.exists() else dict(schema_version=2,run_id=unit_id(u),unit=u,paths={k:relative(v) for k,v in paths.items()})
                    r.update(status=status,error=str(exc),finished_at=utc())
                    prov=paths['config']/'provenance.json'
                    if prov.exists():r['ai_provenance']=api.read(prov)
                    r['test_sha256']=evaluator.artifact_hashes(paths['tests'])
                    dump(p,r)
                    if status in INFRA:STOP.set();errors.append(status)
                with REPORT_GATE:progress()
                print('FINISH',unit_id(u),api.read(result_path(u))['status'],flush=True)
        workers=min(cfg['workers'],getattr(args,'workers',cfg['workers']))
        if workers not in (1,2):raise ValueError('Use one or two API workers.')
        with ThreadPoolExecutor(max_workers=workers) as pool:
            futures=[pool.submit(lane,selected[i::workers]) for i in range(workers)]
            for f in futures:f.result()
    except Exception as exc:
        errors.append(getattr(exc,'status','PREFLIGHT_ERROR'))
        raise
    finally:
        LOCK.unlink(missing_ok=True)
        dump(CAMPAIGN/f'batch-{time.time_ns()}.json',dict(started_at=started,finished_at=utc(),errors=errors,
            projects=sorted({u['project'] for u in chosen}),provider=args.provider,
            selected=[unit_id(u) for u in selected],reported_tokens=budget.reported,
            budget_accounted_tokens=budget.reserved,token_budget=args.token_budget))
        progress()
    if errors:raise StageError('CAMPAIGN_STOPPED',','.join(errors))


def main():
    ap=argparse.ArgumentParser(description=__doc__)
    ap.add_argument('command',choices=['plan','status','preview','doctor','pause','resume','run'])
    ap.add_argument('--provider',choices=['all','deepseek','openai'],default='all')
    ap.add_argument('--projects','--project',nargs='+',help='Project names (case-insensitive, space or comma separated); omitted = all projects.')
    ap.add_argument('--check-models',action='store_true')
    ap.add_argument('--allow-api-calls',action='store_true')
    ap.add_argument('--max-units',type=int)
    ap.add_argument('--token-budget',type=int)
    args=ap.parse_args()
    try:
        if args.projects and args.command not in ('run','preview','status'):
            raise ValueError('--projects applies only to run, preview, or status.')
        if args.command in ('pause','resume'):
            control=api.read(api.CONTROL);control['api_paused']=args.command=='pause';control['cli_enabled']=False;dump(api.CONTROL,control)
            print('API paused' if control['api_paused'] else 'API enabled for explicit run commands; nothing started.')
        elif args.command=='plan':plan();print('Frozen 1708 units: 854 bugs for each provider. No API call made.')
        elif args.command=='status':print(json.dumps(progress(args.provider,args.projects),ensure_ascii=False,indent=2))
        elif args.command=='preview':print(json.dumps(preview(args),ensure_ascii=False,indent=2))
        elif args.command=='doctor':
            cfg=api.settings();out={}
            for name,p in cfg['providers'].items():
                if args.provider not in ('all',name):continue
                try:
                    api.api_key(p);out[name]={'key_present':True,'model':p['model']}
                    if args.check_models:out[name].update(api.verify_model(p))
                except StageError as exc:out[name]={'status':exc.status,'message':str(exc)}
            print(json.dumps({'control':api.read(api.CONTROL),'providers':out},ensure_ascii=False,indent=2))
            return int(any('status' in r for r in out.values()))
        else:run_campaign(args)
        return 0
    except (StageError,ValueError,OSError) as exc:
        print(getattr(exc,'status','ERROR')+': '+str(exc));return 1


if __name__=='__main__':raise SystemExit(main())
