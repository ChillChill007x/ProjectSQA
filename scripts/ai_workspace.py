"""One host entry point for KKU generation and supplied-suite evaluation."""
import argparse
import csv
import json
import shutil
import sys
from pathlib import Path
import ai_api as api
import ai_api_campaign as generated
import evaluate_existing_suites as supplied
from common import ROOT, WORK, FOLDERS, StageError, dump, run
from run_benchmark import utc, unit_id

RUNTIME=WORK/'ai-api/runtime.json'


def setup(build=False):
    if sys.version_info < (3,10):raise ValueError('Python 3.10+ is required.')
    docker=generated.evaluator.base.docker_executable()
    engine=run([docker,'info','--format','{{.OSType}}'],timeout=30)['stdout'].strip()
    if engine!='linux':raise ValueError('Docker Desktop must use Linux containers.')
    cfg=api.settings();tag=cfg['core_image']
    found=run([docker,'image','inspect',tag,'--format','{{.Id}}'],timeout=30,check=False)
    if found['returncode'] or build:
        run([docker,'build','--target','core','-t',tag,'-f',ROOT/'docker/Dockerfile',ROOT],timeout=7200,log=WORK/'ai-api/setup-build.json')
        found=run([docker,'image','inspect',tag,'--format','{{.Id}}'],timeout=30)
    image=found['stdout'].strip()
    if not image.startswith('sha256:'):raise ValueError('Cannot identify Docker image.')
    mask=WORK/'ai-api/empty-secret';mask.parent.mkdir(parents=True,exist_ok=True);mask.touch(exist_ok=True)
    if mask.is_symlink() or mask.stat().st_size:raise ValueError('Invalid credential mask.')
    mounts=['--mount',f'type=bind,source={ROOT},target=/workspace,readonly',
            '--mount','type=volume,source=sqa-codex-work,target=/scratch']
    if (ROOT/'.env').exists():mounts+=['--mount',f'type=bind,source={mask},target=/workspace/.env,readonly']
    result=run([docker,'run','--rm','--network','none',*mounts,'-e','SQA_WORK=/scratch',image,
                'python3','scripts/doctor.py'],timeout=300,log=WORK/'ai-api/setup-doctor.json')
    dump(RUNTIME,dict(checked_at=utc(),image_tag=tag,image_id=image,python=sys.version.split()[0],docker_os=engine))
    print(result['stdout'])
    print('Setup passed. No generation started. Next: AI_API/run.ps1 -Action plan')
    return 0


def collect(workflow):
    module=generated if workflow=='generate' else supplied
    manifest=api.read(module.MANIFEST);rows=[]
    for unit in manifest['units']:
        path=module.result_path(unit);record=api.read(path) if path.exists() else {}
        prov=record.get('ai_provenance',{});cov=record.get('fixed',{}).get('coverage',{})
        rows.append(dict(run_id=unit_id(unit),workflow=workflow,project=unit['project'],bug=unit['bug'],
            provider=unit['tool'],model_requested=unit.get('model'),model_reported=prov.get('model_reported'),
            status=record.get('status','NOT_RUN'),fault_candidate=record.get('fault_candidate'),
            line_coverage_percent=cov.get('line_coverage_percent'),branch_coverage_percent=cov.get('branch_coverage_percent'),
            num_tests=record.get('num_tests'),api_total_tokens=prov.get('total_tokens'),
            generation_time_sec=prov.get('generation_time_sec'),evaluation_time_sec=record.get('evaluation_time_sec'),
            result_path=path.relative_to(ROOT).as_posix() if record else ''))
    output=ROOT/'results'/f'ai_{workflow}_summary.csv';output.parent.mkdir(exist_ok=True)
    with output.open('w',encoding='utf-8',newline='') as f:
        writer=csv.DictWriter(f,fieldnames=list(rows[0]));writer.writeheader();writer.writerows(rows)
    print(str(output));return 0


def main(argv=None):
    parser=argparse.ArgumentParser(description=__doc__)
    parser.add_argument('action',choices=['setup','doctor','plan','preview','status','run','pause','resume','collect'])
    parser.add_argument('--workflow',choices=['generate','existing'],default='generate')
    parser.add_argument('--provider',choices=['all','deepseek','openai'],default='all')
    parser.add_argument('--projects','--project',nargs='+')
    parser.add_argument('--bugs',nargs='+',type=int)
    parser.add_argument('--max-units',type=int,default=2)
    parser.add_argument('--workers',type=int,choices=[1,2],default=2)
    parser.add_argument('--token-budget',type=int,default=200000)
    parser.add_argument('--allow-api-calls',action='store_true')
    parser.add_argument('--check-models',action='store_true')
    parser.add_argument('--build',action='store_true')
    args=parser.parse_args(argv)
    try:
        module=generated if args.workflow=='generate' else supplied
        if (args.projects or args.bugs) and args.action not in ('run','preview','status'):
            raise ValueError('Project/bug filters apply to run, preview or status.')
        if args.bugs and (not args.projects or any(b<1 for b in args.bugs)):
            raise ValueError('--bugs requires --projects and positive bug IDs.')
        if args.action=='setup':return setup(args.build)
        if args.action=='doctor':
            docker=generated.evaluator.base.docker_executable();cfg=api.settings()
            image=run([docker,'image','inspect',cfg['core_image'],'--format','{{.Id}}'],timeout=30)['stdout'].strip()
            out=dict(image=image,workflow=args.workflow,providers={})
            if args.workflow=='generate':
                for name,p in cfg['providers'].items():
                    if args.provider not in ('all',name):continue
                    api.api_key(p);out['providers'][name]={'model':p['model'],'key_present':True}
                    if args.check_models:out['providers'][name].update(api.verify_model(p))
            print(json.dumps(out,indent=2));return 0
        if args.action in ('pause','resume'):
            control=api.read(api.CONTROL);control.update(cli_enabled=False,api_paused=args.action=='pause')
            dump(api.CONTROL,control);print('API paused' if control['api_paused'] else 'API enabled; no work started.');return 0
        if args.action=='plan':
            if not generated.MANIFEST.exists():generated.plan()
            if args.workflow=='existing' and not supplied.MANIFEST.exists():supplied.plan()
            manifest=api.read(module.MANIFEST)
            if any(u['implementation_sha256']!=generated.fingerprint() for u in manifest['units']):
                raise ValueError('Existing plan uses different code/config. Preserve it and its evidence before creating a new campaign.')
            print(f"Frozen plan ready: {len(manifest['units'])} units. No API calls.");return 0
        if not module.MANIFEST.exists():raise ValueError('Run plan for this workflow first.')
        if args.action=='preview':
            manifest=api.read(module.MANIFEST)
            selection=dict(manifest,config=dict(manifest['config'],providers=api.settings()['providers']))
            chosen=generated.select_units(selection,args.provider,args.projects,args.bugs)
            pending=[]
            for u in chosen:
                p=module.result_path(u)
                if p.exists():
                    if api.read(p).get('unit')!=u:raise ValueError('Saved unit differs from plan.')
                else:pending.append(u)
            if args.max_units<1:raise ValueError('--max-units must be positive.')
            print(json.dumps(dict(matched=len(chosen),pending=len(pending),will_start=min(len(pending),args.max_units),api_calls=0,
                next_units=[dict(project=u['project'],bug=u['bug'],provider=u['tool']) for u in pending[:min(20,args.max_units)]]),indent=2));return 0
        if args.action=='status':
            print(json.dumps(module.progress(args.provider,args.projects,persist=False,bugs=args.bugs),indent=2));return 0
        if args.action=='collect':return collect(args.workflow)
        module.run_campaign(args);return collect(args.workflow)
    except (StageError,ValueError,OSError) as exc:
        print(getattr(exc,'status','ERROR')+': '+str(exc));return 1


if __name__=='__main__':raise SystemExit(main())
