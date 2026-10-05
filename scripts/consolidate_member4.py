"""Read-only evidence audit; write derived member-4 outputs, never edit raw runs.

Run: python -B scripts/consolidate_member4.py
Selection is retrospective first attempt, not a claim of preregistration.
"""
from __future__ import annotations
import csv
import hashlib
import json
from collections import Counter, defaultdict
from pathlib import Path
from statistics import mean

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / "results/member4"
FOLDERS = {"evosuite": "MOSA_EvoSuite", "grt": "GRT",
           "deepseek": "Deepseek-v4_flash", "openai": "gpt-5.6-terra"}
LABELS = {"DeepSeek V4 Flash": "deepseek", "gpt-5.6-terra": "openai"}

def read(p):
    return json.loads(p.read_text(encoding="utf-8-sig"))

def sha(p):
    return hashlib.sha256(p.read_bytes()).hexdigest()

def relative(p):
    return p.relative_to(ROOT).as_posix()

def resolve_saved(name):
    """Resolve only the known project-directory move; never rewrite provenance."""
    p = ROOT / name
    if not p.resolve().is_relative_to(ROOT):
        return None
    if p.exists():
        return p
    parts = Path(name).parts
    if len(parts) >= 3 and parts[0] in (FOLDERS['deepseek'], FOLDERS['openai']):
        project = parts[2].rsplit('_', 1)[0]
        candidate = ROOT.joinpath(parts[0], parts[1], project, *parts[2:])
        if candidate.exists():
            return candidate
    return None

def number(value):
    return None if value in (None, '') else float(value)

def average(values):
    values = [number(v) for v in values if v not in ('', None)]
    return round(mean(values), 4) if values else None

def table(name, rows, fields=None):
    with (OUT / name).open('w', encoding='utf-8-sig', newline='') as f:
        w = csv.DictWriter(f, fieldnames=fields or list(rows[0]))
        w.writeheader()
        w.writerows(rows)

def dump(name, data):
    (OUT / name).write_text(json.dumps(data, ensure_ascii=False, indent=2)+'\n', encoding='utf-8')

def cohort(unit):
    keys = ('tool', 'campaign', 'protocol_version', 'round', 'seed', 'budget_seconds',
            'implementation_sha256', 'purpose', 'generation_revision', 'grt_overrides')
    return json.dumps({k: unit.get(k) for k in keys}, sort_keys=True)

def choose_attempts(rows):
    grouped = defaultdict(list)
    for r in rows:
        if not r['excluded']:
            grouped[r['unit_key']].append(r)
    return [min(rs, key=lambda r: (r['started_at'], r['run_id'], r['result_path']))
            for rs in grouped.values()]

def audit_native(path, d):
    u = d['unit']; flags = []; fatal = []
    hashes = d.get('test_sha256', {})
    for name, digest in hashes.items():
        p = resolve_saved(name)
        if p is None:
            fatal.append('TEST_MISSING')
        elif sha(p) != digest:
            fatal.append('TEST_HASH_MISMATCH')
        elif relative(p) != name:
            flags.append('RECORDED_PATH_RELOCATED')
    for name in d.get('paths', {}).values():
        p = resolve_saved(name)
        if p is None:
            fatal.append('ARTIFACT_PATH_MISSING')
        elif relative(p) != name:
            flags.append('RECORDED_PATH_RELOCATED')
    tests_dir = resolve_saved(d.get('paths', {}).get('tests', '__missing__'))
    expected = {resolve_saved(n) for n in hashes}
    if hashes and tests_dir and set(tests_dir.rglob('*.java')) != expected:
        fatal.append('SUITE_FILE_SET_MISMATCH')
    if d['status'] == 'EVALUATED':
        if not hashes or not d.get('num_tests'):
            fatal.append('NO_TEST_EVIDENCE')
        evaluation = path.parent / Path(d.get('evaluation_path', 'evaluation-1')).name
        reports = {}
        for rev in ('fixed', 'buggy'):
            reports[rev] = []
            for i in (1, 2):
                p = evaluation / rev / f'junit-{i}.json'
                if not p.exists():
                    fatal.append('JUNIT_REPETITION_MISSING')
                else:
                    reports[rev].append(read(p))
            if len(reports[rev]) == 2:
                a, b = reports[rev]
                sig = lambda x: sorted((f.get('test',''), f.get('exception',''), f.get('message','')) for f in x.get('failures', []))
                if sorted(a.get('tests', [])) != sorted(b.get('tests', [])) or sig(a) != sig(b):
                    fatal.append('JUNIT_REPETITIONS_DIFFER')
                if d.get(rev, {}).get('junit') != a:
                    fatal.append('SUMMARY_JUNIT_DIFFERS')
            if not (evaluation / rev / 'coverage.xml').exists():
                fatal.append('COVERAGE_XML_MISSING')
        if not d.get('fixed', {}).get('junit', {}).get('passed'):
            fatal.append('FIXED_NOT_PASSING')
        if sorted(d.get('fixed', {}).get('junit', {}).get('tests', [])) != sorted(d.get('buggy', {}).get('junit', {}).get('tests', [])):
            fatal.append('REVISION_TEST_SET_DIFFERS')
        if bool(d.get('fault_candidate')) != bool(d.get('buggy', {}).get('junit', {}).get('failures')):
            fatal.append('CANDIDATE_DISAGREES_WITH_JUNIT')
    excluded = (path.parent/'validation-only.json').exists() or u.get('purpose') == 'validation' or (path.parent/'coverage-superseded.json').exists()
    c = d.get('fixed', {}).get('coverage', {})
    review = path.parent/'fault-review.json'
    reviewed = read(review) if review.exists() else {}
    confirmed = (reviewed.get('confirmed') is True and reviewed.get('test_sha256') == hashes
                 and bool(reviewed.get('reviewer')) and bool(reviewed.get('evidence'))
                 and d.get('fault_candidate') is True and not fatal)
    return dict(tool=u['tool'], project=u['project'], bug=str(u['bug']), target=u['target'],
                run_id=d['run_id'], started_at=d.get('started_at', ''), status=d['status'],
                cohort=cohort(u), unit_key=json.dumps(u, sort_keys=True), excluded=excluded,
                integrity_ok=not fatal, flags=';'.join(sorted(set(flags+fatal))),
                fault_candidate=d.get('fault_candidate') is True, fault_confirmed=confirmed,
                line=number(c.get('line_coverage_percent')), branch=number(c.get('branch_coverage_percent')),
                generation_seconds=d.get('generation_time_sec'), result_path=relative(path))

def main():
    OUT.mkdir(parents=True, exist_ok=True)
    sources = {}; native = []
    def source(p):
        sources[relative(p)] = dict(path=relative(p), sha256=sha(p), bytes=p.stat().st_size)
    manifest_path = ROOT/'AI_API/Campaign/manifest.json'
    manifest = read(manifest_path); source(manifest_path)
    inventory = defaultdict(set)
    for u in manifest['units']:
        inventory[(u['project'], str(u['bug']))].update(u.get('metadata_targets', u.get('targets', [u['target']])))
    profile_path = ROOT/'config/round1-full854.json'; source(profile_path)
    profile = read(profile_path)
    expected = set()
    for project, ranges in profile['active_bug_ranges'].items():
        for span in ranges.split(','):
            ends = list(map(int, span.split('-')))
            expected.update((project, str(b)) for b in range(ends[0], ends[-1]+1))
    if set(inventory) != expected or len(expected) != 854:
        raise ValueError('AI manifest and algorithm profile inventories disagree')
    table('inventory.csv', [dict(project=p, bug=b, metadata_targets=';'.join(sorted(ts)),
         source='AI_API/Campaign/manifest.json;config/round1-full854.json',
         evidence='saved manifest; not a fresh Defects4J query')
         for (p,b),ts in sorted(inventory.items(), key=lambda x:(x[0][0],int(x[0][1])))])
    for tool, folder in FOLDERS.items():
        for result_dir in ('Result', 'Result_Round1', 'Result_Round2'):
            base = ROOT/folder/result_dir
            for path in sorted(set(base.glob('*/*/*/result.json')) | set(base.glob('*/*/result.json'))):
                d = read(path); source(path)
                if d.get('schema_version') == 2:
                    native.append(audit_native(path, d))
        print(f'Audited {folder}', flush=True)
    selected = choose_attempts(native)
    selected_paths = {r['result_path'] for r in selected}
    for r in native:
        r['selected_first_attempt'] = r['result_path'] in selected_paths
    table('native_runs.csv', native)
    groups = defaultdict(list)
    for r in selected:
        groups[r['cohort']].append(r)
    summaries = []
    for key, rs in sorted(groups.items()):
        c = json.loads(key); good = [r for r in rs if r['status']=='EVALUATED' and r['integrity_ok']]
        summaries.append(dict(cohort_id=hashlib.sha256(key.encode()).hexdigest()[:12], **c,
            selected_targets=len(rs), represented_bugs=len({(r['project'],r['bug']) for r in rs}),
            evaluated_reported=sum(r['status']=='EVALUATED' for r in rs), evaluated_integrity_pass=len(good),
            integrity_failures=sum(not r['integrity_ok'] for r in rs),
            candidate_bugs=len({(r['project'],r['bug']) for r in good if r['fault_candidate']}),
            confirmed_bugs=len({(r['project'],r['bug']) for r in good if r['fault_confirmed']}),
            line_n=sum(r['line'] is not None for r in good), branch_n=sum(r['branch'] is not None for r in good),
            line_mean=average(r['line'] for r in good), branch_mean=average(r['branch'] for r in good),
            status_counts=json.dumps(dict(Counter(r['status'] for r in rs)), sort_keys=True)))
    table('native_cohorts.csv', summaries)
    # Imported CSV claims remain a separate dataset, without promoting them to confirmations.
    csv_path = ROOT/'results/benchmark.csv'; source(csv_path)
    with csv_path.open(encoding='utf-8-sig', newline='') as f:
        imported = list(csv.DictReader(f))
    ai = []; logs = defaultdict(list)
    for p in (ROOT/'results/run_logs').glob('*.json'):
        d = read(p); source(p)
        logs[(d.get('project'), str(d.get('bug_id')), LABELS.get(d.get('technique')))].append(d)
    seen = set()
    for r in imported:
        tool = LABELS[r['Technique']]; k = (r['Project'], r['Bug_ID'], tool)
        if k in seen or k[:2] not in expected:
            raise ValueError(f'Duplicate or unexpected imported unit {k}')
        seen.add(k); flags = []
        folder = ROOT/FOLDERS[tool]/'TestCode'/k[0]/f'{k[0]}_{k[1]}b'
        files = sorted(folder.glob('*.java'))
        modes = []
        for mode in ('raw', 'LF', 'CRLF'):
            h = hashlib.sha256()
            for p in files:
                source(p); data = p.read_bytes()
                if mode != 'raw':
                    data = data.replace(b'\r\n', b'\n').replace(b'\r', b'\n')
                if mode == 'CRLF':
                    data = data.replace(b'\n', b'\r\n')
                h.update(p.name.encode()); h.update(b'\0'); h.update(data)
            if files and h.hexdigest() == r['Suite_SHA256']:
                modes.append(mode)
        if not modes: flags.append('SUITE_HASH_NOT_MATCHED')
        exact = [d for d in logs[k] if d.get('run_id') == r['Run_ID']]
        if not exact: flags.append('NO_EXACT_RUN_ID_LOG')
        perbug = ROOT/'results'/k[0]/k[1]/('deepseek.json' if tool=='deepseek' else 'gpt.json')
        if perbug.exists():
            source(perbug); d = read(perbug)
            if d.get('run_id') != r['Run_ID']: flags.append('PERBUG_RUN_ID_DIFFERS')
            if r['Fault_Detection_Status']=='BUG_DETECTED' and (d.get('fixed_failures') or not d.get('buggy_failures')):
                flags.append('DETECTION_EVIDENCE_DISAGREES')
        else:
            flags.append('PERBUG_JSON_MISSING')
        measured = r['Execution_Status']=='DONE'
        ai.append(dict(tool=tool, project=k[0], bug=k[1], status=r['Fault_Detection_Status'],
            run_id=r['Run_ID'], line=number(r['Line_Coverage_%']) if measured else None,
            branch=number(r['Branch_Coverage_%']) if measured else None,
            fixed_valid_reported=r['Fault_Detection_Status'] in ('BUG_DETECTED','NOT_DETECTED'),
            candidate_reported=r['Fault_Detection_Status']=='BUG_DETECTED', fault_confirmed=None,
            suite_hash_match_modes=';'.join(modes), exact_log_count=len(exact),
            flags=';'.join(flags), source_path=relative(csv_path), perbug_path=relative(perbug) if perbug.exists() else ''))
    table('ai_imported_units.csv', ai)
    ai_summaries=[]
    for tool in ('deepseek','openai'):
        for project in ['ALL']+sorted({p for p,b in expected}):
            rs=[r for r in ai if r['tool']==tool and (project=='ALL' or r['project']==project)]
            valid=[r for r in rs if r['fixed_valid_reported']]
            counts=Counter(r['status'] for r in rs)
            planned=sum(project=='ALL' or p==project for p,b in expected)
            ai_summaries.append(dict(tool=tool, project=project, planned=planned, reported=len(rs),
                missing=planned-len(rs), no_suite=counts['NO_SUITE'], compile_error=counts['COMPILE_ERROR'],
                invalid_oracle=counts['FLAKY_OR_REGRESSION'], fixed_valid_reported=len(valid),
                candidates_reported=counts['BUG_DETECTED'], candidate_rate_planned=round(100*counts['BUG_DETECTED']/planned,4),
                measured_n=sum(r['line'] is not None for r in rs), line_mean_measured=average(r['line'] for r in rs),
                branch_mean_measured=average(r['branch'] for r in rs), line_mean_fixed_valid=average(r['line'] for r in valid),
                branch_mean_fixed_valid=average(r['branch'] for r in valid)))
    table('ai_summary.csv', ai_summaries)
    candidates=[dict(dataset='native',tool=r['tool'],project=r['project'],bug=r['bug'],run_id=r['run_id'],
        selected=r['selected_first_attempt'],integrity_ok=r['integrity_ok'],confirmed=r['fault_confirmed'],evidence=r['result_path'])
        for r in native if r['fault_candidate']]
    candidates += [dict(dataset='imported-claim',tool=r['tool'],project=r['project'],bug=r['bug'],run_id=r['run_id'],
        selected=True,integrity_ok=None,confirmed=None,evidence=r['perbug_path'] or r['source_path']) for r in ai if r['candidate_reported']]
    table('fault_review_queue.csv', candidates)
    for p in [ROOT/'config/benchmark.json',ROOT/'config/dependencies.lock.json',Path(__file__)]: source(p)
    dump('source_manifest.json', dict(files=list(sources.values()),note='Result JSON, imported logs/Java and configs used; native test hashes audited against each result.json.'))
    dump('summary.json', dict(native_runs=len(native), selected_first_attempts=len(selected),
        excluded=sum(r['excluded'] for r in native), native_integrity_flags=dict(Counter(f for r in native for f in r['flags'].split(';') if f)),
        native_cohorts=summaries, ai_summary=[r for r in ai_summaries if r['project']=='ALL'],
        ai_flags=dict(Counter(f for r in ai for f in r['flags'].split(';') if f)),
        selection_policy='Retrospective earliest started_at then run_id then path per complete unit JSON; validation/superseded excluded. Failed first attempts retained. Cohorts separate implementation/budget/protocol.',
        inventory_bugs=len(expected), inventory_projects=len({p for p,b in expected})))
    print(f'{len(native)} native runs; {len(selected)} first attempts; {len(ai)} imported claims -> {OUT}', flush=True)

if __name__ == '__main__':
    main()
