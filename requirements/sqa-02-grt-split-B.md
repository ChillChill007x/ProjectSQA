# GRT split B: one project per invocation

Scope: Round1, seed101, 30 seconds per modified target. All modified targets are retained.
Both machines must use the same updated repository code, profile, dependencies and Java environment.
This runner change creates a new implementation hash/campaign fingerprint. Keep earlier campaigns as history.
Do not start two runners in the same checkout, even for different projects: shared build/metadata state is not concurrency-safe.

## Member 2: 502 active bugs
Chart 26, Cli 39, Closure 174, Codec 18, Collections 28, Compress 47, Csv 16, Gson 18, JacksonCore 26, JacksonDatabind 110.
Start Chart; after it finishes, inspect its summary and manually start the next project in this order.

## Member 3 helping GRT: 352 active bugs
JacksonXml 6, Jsoup 93, JxPath 22, Lang 61, Math 106, Mockito 38, Time 26.
Use --tool grt even though the operator is member 3. Use a separate checkout from ongoing AI work.
Start JacksonXml; manually continue in the listed order.

## Before starting, in the Docker shell
python3 -m unittest discover -s tests -v
python3 tests/smoke_java.py
python3 scripts/run_full_round1.py --tool grt --smoke

Run these individually and proceed only after success.

## Per-project example (member 2)
python3 scripts/run_full_round1.py --tool grt --project Chart --prepare
python3 scripts/run_full_round1.py --tool grt --project Chart --resume
python3 scripts/run_full_round1.py --tool grt --project Chart --status

Member 3 uses JacksonXml instead of Chart for the first project.
Replace the project name for subsequent projects. Do not use an unfiltered --resume: that selects all 854 bugs.
Ctrl+C stops. Resume with the same --project and --resume. A terminal failure is retained; --retry-failed performs one retry pass for that project.
Exit 1 may mean recorded failures, not that the remaining projects must be abandoned. Inspect the project summary.

## Reporting and handoff
Project manifests still validate the complete 854-ID inventory, but contain only assigned project bugs.
Progress is in GRT/Campaigns/<profile>/<fingerprint>/projects/<project>/ (manifest.json, progress.json, bugs.csv).
Combine the 17 project summaries, deduplicate by project+bug, and verify totals of 502+352=854.
EVALUATED is not equivalent to confirmed fault. Report failed, interrupted and not-run bugs separately.
Keep tests/config/result logs and .gitkeep for empty test directories when committing. Do not submit work/ or credentials.

The accompanying zip contains only the runner, regression tests and this guide. Overlay it on the team's eaf7ba6b code or the equivalent merged checkout; it is not a full repository or Docker image.
