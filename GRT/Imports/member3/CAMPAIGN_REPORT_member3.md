# GRT Round1 split B — Member 3 campaign report

- Tool: `grt` (team-grt-2.0), profile `round1-full854-30s-s101-v1`, seed 101, 30 s per modified target
- Campaign fingerprint: **`43d8695e7c2d`**
- Runner code: commit `eaf7ba6b` + `grt-split-B-update` overlay (`scripts/run_full_round1.py`, `tests/test_full_round1.py`, `requirements/sqa-02-grt-split-B.md`)
- implementation_sha256: `2095c4d4de9e7311a00398207b751d68989f00b8349199e785ec58bd55409a52`
- Pre-checks passed in Docker: unit tests (23/23), `tests/smoke_java.py`, `--smoke` (Lang-1 EVALUATED)
- Run: 2026-10-04 23:55 → 2026-10-05 18:34 (+07), one project at a time, `--project <P> --prepare` then `--resume`

## Scope

Assigned to member 3: JacksonXml, Jsoup, JxPath, Lang, Math, Mockito, Time (352 bugs).
**This package covers 5 projects / 288 bugs.** Mockito (38) and Time (26) were run by another teammate
and are NOT included here; take them from that teammate and check they use the same fingerprint `43d8695e7c2d`.

## Results (bug level)

| Project | Bugs | EVALUATED | FAILED | Targets | Targets EVALUATED |
|---|---:|---:|---:|---:|---:|
| JacksonXml | 6 | 5 | 1 | 6 | 5 |
| Jsoup | 93 | 68 | 25 | 126 | 91 |
| JxPath | 22 | 19 | 3 | 35 | 28 |
| Lang | 61 | 54 | 7 | 61 | 54 |
| Math | 106 | 84 | 22 | 119 | 96 |
| **Total** | **288** | **230** | **58** | **347** | **274** |

No NOT_RUN, RUNNING or METADATA_ERROR bugs remain. A bug is EVALUATED only when every modified target is EVALUATED;
otherwise it is FAILED.

Target-level failure statuses (73 targets): COMPILE_FAIL 29, FLAKY 16, NO_TESTS 15, INVALID_ORACLE 12, COVERAGE_ERROR 1.
Failures are recorded once (no `--retry-failed` pass was run).

Bugs with at least one target `fault_candidate=true` (37): Jsoup-8, 18, 22, 26, 34, 50, 52, 60, 72, 79, 89;
JxPath-9, 13; Lang-9, 23, 29, 33, 41, 45, 57, 60; Math-3, 4, 6, 13, 14, 22, 35, 54, 66, 67, 70, 77, 89, 92, 95, 103.
EVALUATED / fault_candidate is **not** a confirmed fault.

## Operational notes

- Host: macOS (Apple Silicon, 8 GB). Image `project-sqa:core-v2` (linux/amd64) via Rosetta, Docker memory 4 GB.
- Docker run used `GIT_CONFIG_COUNT=1 GIT_CONFIG_KEY_0=safe.directory GIT_CONFIG_VALUE_0=*` to avoid git
  "dubious ownership" on Defects4J repos (environment only; no code change).
- Docker Desktop VM crashed 3 times (00:29, 01:01, 03:22). Interrupted targets were resumed with the same
  `--project` and `--resume`; stale `.running.lock` files were removed only after verifying no runner was alive.
  Interrupted attempts appear as `-attemptN` folders; `progress.json` `result_path` points to the attempt used.

## Package contents

- `GRT/Campaigns/round1-full854-30s-s101-v1/43d8695e7c2d/projects/<Project>/` — manifest.json, progress.json, bugs.csv
- `GRT/Result_Round1/…`, `GRT/Test/…`, `GRT/Configuration/…` — only unit folders referenced by these progress.json files
  (older campaigns s202/s303 etc. excluded). `classes/`, `*.class`, `*.exec`, `instrumented/` excluded per `.gitignore`.
- `member3_grt_bugs.csv` — the 288 bugs in one table.
- `work/` and credentials are not included.

## Merge checklist (member 2)

1. Combine the 17 project summaries; deduplicate by project+bug.
2. Totals: member 2 = 502, member 3 = 352 (this package 288 + teammate Mockito 38 + Time 26) → 854.
3. Report EVALUATED, FAILED, interrupted and not-run separately.
