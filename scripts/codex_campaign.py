#!/usr/bin/env python3
"""Frozen full-scope Codex campaign; Windows sandbox generation, Docker evaluation."""
import argparse
from collections import Counter
import csv
import json
import os
from pathlib import Path
import re
import shutil
import sys
import time

from common import ROOT, WORK, StageError, config, dump, relative, run, sha
from run_benchmark import implementation_hash, paths_for, run_unit, unit_id, utc, evaluate_record

CAMPAIGN = ROOT / 'Codex/Campaign'
MANIFEST = CAMPAIGN / 'manifest.json'
CORE = 'project-sqa:core-v2'
OWNER = {'name': 'นายภีมเดช กลั่นกิ่ง', 'student_id': '673380420-2'}


def read(path):
    return json.loads(Path(path).read_text(encoding='utf-8'))


def make_unit(project, bug, target, round_name, seed, purpose='experiment'):
    cfg = config()
    return dict(project=project, bug=str(bug), target=target, tool='codex', round=round_name,
                seed=seed, budget_seconds=cfg['budgets_seconds'][round_name], generation_revision='f',
                protocol_version=cfg['protocol_version'], implementation_sha256=implementation_hash(),
                ai_mode='cli', purpose=purpose, model=cfg['models']['codex'], reasoning_effort='medium',
                execution_backend='isolated-windows-codex', campaign_version='1',
                environment_sha256=sha(CAMPAIGN/'environment.json'))


def create_manifest():
    if MANIFEST.exists():
        raise ValueError('Manifest already exists: retain the frozen plan; do not overwrite it.')
    base = Path('/opt/defects4j/framework/projects')
    cfg = config()
    units, sources, totals = [], {}, []
    prototype = make_unit(cfg['projects'][0], '1', 'unused', 'Round1', cfg['seeds'][0])
    for project in cfg['projects']:
        active = base / project / 'active-bugs.csv'
        sources[str(active)] = sha(active)
        bugs = sorted((r['bug.id'] for r in csv.DictReader(active.open())), key=int)
        target_count = 0
        for bug in bugs:
            source = base / project / 'modified_classes' / (bug + '.src')
            sources[str(source)] = sha(source)
            targets = sorted(set(source.read_text().splitlines()))
            if not targets or any(not re.fullmatch(r'[\w.$]+', t) for t in targets):
                raise ValueError(f'Invalid targets: {source}')
            target_count += len(targets)
            for target in targets:
                for round_name in cfg['budgets_seconds']:
                    for seed in cfg['seeds']:
                        units.append(dict(prototype, project=project, bug=str(bug), target=target,
                                          round=round_name, seed=seed, budget_seconds=cfg['budgets_seconds'][round_name]))
        totals.append(dict(project=project, active_bugs=len(bugs), targets=target_count,
                           units=target_count * len(cfg['seeds']) * len(cfg['budgets_seconds'])))
    dump(MANIFEST, dict(created_at=utc(), owner=OWNER, scope='all active bugs, all modified classes',
                       environment=read(CAMPAIGN/'environment.json'),
                       config=cfg, dependencies=read(ROOT/'config/dependencies.lock.json'),
                       metadata_sha256=sources, projects=totals, units=units))
    print(json.dumps(totals))
    print(f'{len(units)} planned units -> {MANIFEST}', flush=True)


def result_path(unit):
    return paths_for('codex', unit['project'], unit['bug'], unit['round'], unit_id(unit))['result'] / 'result.json'


def progress(manifest=None):
    manifest = manifest or read(MANIFEST)
    rows = []
    for unit in manifest['units']:
        path = result_path(unit)
        record = read(path) if path.exists() else {}
        status = record.get('status', 'NOT_RUN')
        row = {k: unit[k] for k in ('project', 'bug', 'target', 'round', 'seed')}
        row.update(run_id=unit_id(unit), status=status, result_path=relative(path) if record else '',
                   num_tests=record.get('num_tests'), fault_candidate=record.get('fault_candidate'))
        row.update(record.get('fixed', {}).get('coverage', {}))
        rows.append(row)
    CAMPAIGN.mkdir(exist_ok=True, parents=True)
    keys = list(dict.fromkeys(k for row in rows for k in row))
    with (CAMPAIGN/'progress.csv').open('w', encoding='utf-8', newline='') as f:
        writer = csv.DictWriter(f, fieldnames=keys)
        writer.writeheader(); writer.writerows(rows)
    counts = dict(Counter(r['status'] for r in rows))
    pending = sum(counts.get(k, 0) for k in ('NOT_RUN', 'RUNNING', 'AWAITING_AI', 'GENERATING', 'GENERATED', 'EVALUATING'))
    summary = dict(updated_at=utc(), planned=len(rows), status_counts=counts,
                   evaluated=counts.get('EVALUATED', 0), pending=pending,
                   evaluated_percent=round(100*counts.get('EVALUATED', 0)/len(rows), 4),
                   all_units_evaluated=counts.get('EVALUATED', 0) == len(rows),
                   note='Failed attempts are visible; candidate faults still require review. Validation is excluded.')
    dump(CAMPAIGN/'progress.json', summary)
    print(json.dumps(summary), flush=True)
    return summary


def worker(action, job_path):
    """Trusted evaluator container only. Never mounts its files into the generator."""
    from evaluator import export, evaluate_revision
    from ai_generate import source_hashes
    job = read(job_path)
    unit = job['unit']
    path = result_path(unit)
    paths = paths_for('codex', unit['project'], unit['bug'], unit['round'], unit_id(unit))
    context = ROOT/'work/codex-campaign/contexts'/unit_id(unit)
    work = WORK/'checkouts'/unit_id(unit)/'generation-fixed'
    if action == 'prepare':
        if not path.exists():
            run_unit(unit, ai_mode='manual')
        record = read(path)
        if record['status'] != 'AWAITING_AI':
            return
        if not context.exists():
            source = work / export(work, 'dir.src.classes', paths['result']/'generation')
            context.mkdir(parents=True)
            shutil.copytree(source, context/'source')
            (context/'generated-tests').mkdir()
            dump(context/'source-hashes.json', source_hashes(context/'source'))
        record['owner'] = OWNER
        record['generation_context_isolation'] = 'Windows sandbox denies repository and Downloads reads; isolated fixed source is read-only, generated-tests writable.'
        dump(path, record)
    elif action == 'feedback':
        try:
            if source_hashes(context/'source') != read(context/'source-hashes.json'):
                raise StageError('SOURCE_MODIFIED', 'Fixed input source changed')
            dest = paths['result']/f"ai-feedback-{job['attempt']}"
            evaluated = evaluate_revision(work, context/'generated-tests', dest, unit['target'])
            if not evaluated['junit']['passed']:
                raise StageError('INVALID_ORACLE', json.dumps(evaluated['junit']['failures'])[:6000])
            feedback = {'passed': True}
        except StageError as exc:
            feedback = {'passed': False, 'status': exc.status, 'error': str(exc)}
            log = paths['result']/f"ai-feedback-{job['attempt']}"/'compile-generated.json'
            if log.exists(): feedback['compiler_stderr'] = read(log)['stderr'][-6000:]
        dump(Path(job_path).with_name('feedback-result.json'), feedback)
    elif action == 'evaluate':
        record = read(path)
        if record['status'] == 'EVALUATED': return
        try:
            record['status'] = 'EVALUATING'; dump(path, record)
            evaluate_record(record, paths['result'])
        except (StageError, OSError, ValueError) as exc:
            record.update(status=getattr(exc, 'status', 'TOOL_ERROR'), error=str(exc), finished_at=utc())
            dump(path, record)
    elif action == 'cleanup':
        # Only campaign-owned scratch, never the repository or submitted evidence.
        record = read(path)
        if record['status'] != 'EVALUATED': return
        for candidate, boundary in ((work.parent, WORK), (context, ROOT/'work/codex-campaign/contexts')):
            resolved = candidate.resolve()
            if boundary.resolve() not in resolved.parents or resolved.name != unit_id(unit) or candidate.is_symlink():
                raise ValueError(f'Unsafe scratch cleanup: {candidate}')
            if resolved.exists(): shutil.rmtree(resolved)


def docker_executable():
    found = shutil.which('docker')
    if found: return found
    local = Path(os.environ.get('LOCALAPPDATA', ''))/'Programs/DockerDesktop/resources/bin/docker.exe'
    if local.is_file(): return str(local)
    raise ValueError('Docker CLI not found')


def core(action, job, docker):
    return run([docker, 'run', '--rm', '--init', '--mount', f'type=bind,source={ROOT},target=/workspace',
                '--mount', 'type=volume,source=sqa-codex-work,target=/scratch', '-e', 'SQA_WORK=/scratch',
                CORE, 'python3', 'scripts/codex_campaign.py', '_worker', '--action', action,
                '--job', '/workspace/'+relative(job)], timeout=3600,
               log=job.parent/f'{action}.json', check=False)


def native_task_root(unit):
    return Path(ROOT.anchor)/'sqa-codex-tasks'


def sandbox_entries(unit, task_root, native_context):
    entries = {':root':'read', ROOT.as_posix():'deny',
               (Path.home()/'Downloads').as_posix():'deny',
               native_context.as_posix():'read', (native_context/'generated-tests').as_posix():'write'}
    entries.update({p.as_posix():'deny' for p in task_root.iterdir() if p != native_context})
    return entries


def feedback_for_prompt(unit, feedback):
    return json.dumps(feedback)


def generate(unit, docker, cli):
    from ai_api import assert_cli_enabled
    assert_cli_enabled()
    from ai_generate import response_metadata, source_hashes
    path = result_path(unit)
    paths = paths_for('codex', unit['project'], unit['bug'], unit['round'], unit_id(unit))
    job = WORK/'codex-campaign/jobs'/unit_id(unit)/'job.json'
    dump(job, {'unit': unit})
    prepared = core('prepare', job, docker)
    if prepared['returncode'] or not path.exists():
        raise StageError('ENVIRONMENT_ERROR', 'Preparation failed; inspect '+str(job.parent/'prepare.json'))
    record = read(path)
    if record['status'] not in ('AWAITING_AI', 'GENERATED'):
        return record['status']
    context = WORK/'codex-campaign/contexts'/unit_id(unit)
    task_root = native_task_root(unit)
    native_context = task_root/unit_id(unit)
    provenance_path = paths['config']/'provenance.json'
    if record['status'] == 'AWAITING_AI':
        if not native_context.exists():
            native_context.mkdir(parents=True)
            shutil.copytree(context/'source', native_context/'source')
            (native_context/'generated-tests').mkdir()
        task = (paths['config']/'TASK.md').read_text(encoding='utf-8')
        boundary = '\nWork only in '+native_context.as_posix()+'. PowerShell may start at C:\\; use absolute paths or Set-Location to this directory first. Read fixed dependencies only under its source directory and write Java files only under its generated-tests directory. Do not access the repository, authentication files, other workspaces, apps, or network. The independent evaluator runs compilation/tests; do not install tools.\n'
        prompt = task + boundary
        metadata = []
        started = time.monotonic()
        generator_queue_seconds = 0.0
        version = run([cli, '--version'], timeout=60, log=paths['result']/'cli-version.json')['stdout'].strip()
        provenance = read(provenance_path)
        provenance.update(owner=OWNER, cli_version=version, environment=read(CAMPAIGN/'environment.json'),
                          model_identity_basis='explicit_cli_argument', reasoning_effort=unit['reasoning_effort'])
        last_error = 'No successful generated suite'
        for attempt in range(1, config()['ai_max_retries']+2):
            attempt_dir = paths['config']/f'attempt-{attempt}'
            attempt_dir.mkdir(exist_ok=False)
            (attempt_dir/'prompt.txt').write_text(prompt, encoding='utf-8')
            entries = sandbox_entries(unit, task_root, native_context)
            filesystem = '{'+','.join(json.dumps(k)+'='+json.dumps(v) for k,v in entries.items())+'}'
            cmd = [cli, 'exec', '--ignore-user-config', '--skip-git-repo-check', '--json',
                   '--disable', 'apps', '--disable', 'plugins',
                   '--disable', 'multi_agent', '--disable', 'browser_use', '--disable', 'computer_use',
                   '-c', 'web_search="disabled"',
                   '-c', 'default_permissions="sqa"', '-c', 'permissions.sqa.filesystem='+filesystem,
                   '-c', 'permissions.sqa.network.enabled=false', '-c', 'windows.sandbox="elevated"',
                   '-c', 'approval_policy="never"', '-c', 'model_reasoning_effort='+json.dumps(unit['reasoning_effort']),
                   '-m', unit['model'], '-']
            remaining = config()['ai_timeout_seconds']-(time.monotonic()-started-generator_queue_seconds)
            if remaining <= 0: raise StageError('TIMEOUT', 'AI wall-clock budget exhausted')
            response = run(cmd, cwd=native_context, input_text=prompt, timeout=remaining, log=attempt_dir/'response.json', check=False)
            generator_queue_seconds += response.get('generator_queue_seconds', 0.0)
            metadata.append(response_metadata(response['stdout']))
            provenance.update(attempts=attempt, generation_time_sec=round(time.monotonic()-started, 3),
                              generator_queue_seconds=round(generator_queue_seconds, 3),
                              generation_budget_elapsed_sec=round(time.monotonic()-started-generator_queue_seconds, 3),
                              usage_by_attempt=metadata, model_reported=metadata[-1]['model_reported'])
            dump(provenance_path, provenance)
            if response['timed_out']: raise StageError('TIMEOUT', 'Codex generation timed out')
            if response['returncode']:
                raise StageError('AI_ERROR', 'Codex failed; inspect '+relative(attempt_dir/'response.json'))
            if source_hashes(native_context/'source') != read(context/'source-hashes.json'):
                raise StageError('SOURCE_MODIFIED', 'Fixed input source changed')
            generated = native_context/'generated-tests'
            for file in generated.rglob('*.java'):
                if file.is_symlink(): raise StageError('INVALID_TESTS', 'Symlink output is not permitted')
                dest = attempt_dir/'tests'/file.relative_to(generated)
                dest.parent.mkdir(parents=True, exist_ok=True); shutil.copy2(file, dest)
            mirror = context/'generated-tests'
            if mirror.resolve().parent != context.resolve() or mirror.is_symlink():
                raise ValueError('Unsafe generated test mirror')
            shutil.rmtree(mirror)
            shutil.copytree(generated, mirror)
            dump(job, {'unit': unit, 'attempt': attempt})
            checked = core('feedback', job, docker)
            if checked['returncode']: raise StageError('ENVIRONMENT_ERROR', 'Feedback evaluator failed')
            feedback = read(job.with_name('feedback-result.json'))
            dump(attempt_dir/'feedback.json', feedback)
            if feedback['passed']:
                for file in generated.rglob('*.java'):
                    dest = paths['tests']/file.relative_to(generated)
                    dest.parent.mkdir(parents=True, exist_ok=True); shutil.copy2(file, dest)
                provenance['generation_time_sec'] = round(time.monotonic()-started, 3)
                dump(provenance_path, provenance)
                record.update(status='GENERATED', generation_time_sec=provenance['generation_time_sec'])
                dump(path, record)
                break
            last_error = json.dumps(feedback)
            prompt = task+boundary+'\nRepair only these errors, preserving valid tests:\n'+feedback_for_prompt(unit, feedback)
        else:
            raise StageError('AI_VALIDATION_FAIL', last_error)
    evaluated = core('evaluate', job, docker)
    if evaluated['returncode']: raise StageError('ENVIRONMENT_ERROR', 'Evaluation process failed')
    status = read(path)['status']
    if status == 'EVALUATED':
        # Scratch cleanup must never overwrite a completed scientific result.
        warnings = []
        cleaned = core('cleanup', job, docker)
        if cleaned['returncode']: warnings.append('Docker scratch cleanup failed; see cleanup.json')
        if native_context.resolve().parent != task_root.resolve() or native_context.is_symlink():
            warnings.append('Native scratch cleanup skipped: unexpected path')
        else:
            try:
                if native_context.exists(): shutil.rmtree(native_context)
            except OSError as exc:
                warnings.append(str(exc))
        if warnings:
            record = read(path); record['cleanup_warnings'] = warnings; dump(path, record)
    return status


def host_run(args):
    from ai_api import assert_cli_enabled
    assert_cli_enabled()
    global CORE
    docker = docker_executable()
    if os.name != 'nt': raise ValueError('This campaign backend requires Windows Codex sandbox and Docker Linux containers')
    cli = shutil.which('codex')
    if not cli: raise ValueError('Codex CLI not found; sign in with Codex first')
    CORE = run([docker, 'image', 'inspect', CORE, '--format', '{{.Id}}'], timeout=30)['stdout'].strip()
    environment = dict(core_image=CORE, generator='native Windows Codex',
                       cli_sha256=sha(Path(cli)), cli_version=run([cli, '--version'], timeout=30)['stdout'].strip(),
                       sandbox='elevated Windows; repository denied; fixed source read-only; generated-tests writable')
    if not MANIFEST.exists(): dump(CAMPAIGN/'environment.json', environment)
    if args.validation:
        units = [make_unit('Lang', '1', 'org.apache.commons.lang3.math.NumberUtils', 'Round1', 101, 'validation')]
    else:
        manifest = read(MANIFEST)
        if manifest['environment'] != environment:
            raise ValueError('Docker images differ from the frozen manifest')
        units = manifest['units']
        actual_hash = implementation_hash()
        if any(u['implementation_sha256'] != actual_hash for u in units):
            raise ValueError('Implementation/config differs from the frozen manifest. Do not silently mix versions.')
    lock = WORK/'codex-campaign/runner.lock'
    lock.parent.mkdir(parents=True, exist_ok=True)
    with lock.open('x') as f: f.write(str(os.getpid()))
    completed = 0
    try:
        for unit in units:
            path = result_path(unit)
            if path.exists() and read(path)['status'] not in ('AWAITING_AI', 'GENERATED'):
                print('SKIP recorded '+unit_id(unit), flush=True); continue
            if shutil.disk_usage(ROOT).free < 8*1024**3:
                raise StageError('DISK_LOW', 'Less than 8 GiB free in workspace; stopping before new checkout')
            print('START '+unit_id(unit), flush=True)
            try:
                status = generate(unit, docker, cli)
            except (StageError, OSError, ValueError) as exc:
                status = getattr(exc, 'status', 'TOOL_ERROR')
                if path.exists():
                    record = read(path); record.update(status=status, error=str(exc), finished_at=utc()); dump(path, record)
                print(f'{status}: {exc}', flush=True)
                if status in ('AI_ERROR', 'ENVIRONMENT_ERROR'):
                    raise
            print(status+' '+unit_id(unit), flush=True)
            completed += 1
            if not args.validation: progress(manifest)
            if args.max_units and completed >= args.max_units: break
    finally:
        lock.unlink(missing_ok=True)
        if not args.validation: progress(manifest)


def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument('command', choices=['plan', 'status', 'run', '_worker'])
    ap.add_argument('--validation', action='store_true')
    ap.add_argument('--max-units', type=int, default=0)
    ap.add_argument('--action', choices=['prepare', 'feedback', 'evaluate', 'cleanup'])
    ap.add_argument('--job', type=Path)
    args = ap.parse_args()
    if args.command == 'plan': create_manifest()
    elif args.command == 'status': progress()
    elif args.command == '_worker': worker(args.action, args.job)
    else: host_run(args)


if __name__ == '__main__': main()
