# Member 2 GRT submission: split B

Completed first pass over 502 active bugs in Chart, Cli, Closure, Codec, Collections, Compress, Csv, Gson, JacksonCore and JacksonDatabind. Round1, seed101, 30 seconds per modified target; all modified targets retained.

Campaign fingerprint: `43d8695e7c2d`. 404 bugs EVALUATED; 98 bugs FAILED. No unrun or interrupted bugs remain at the campaign-summary level. Historical interrupted attempts remain as evidence. This is the member-2 allocation, not all 854 bugs; the remaining 352 belong to the other worker.

648 target units: 519 EVALUATED, 68 INVALID_ORACLE, 3 COVERAGE_ERROR, 40 COMPILE_FAIL, 13 TOOL_ERROR, 4 FLAKY, 1 NO_TESTS, 1 RUNTIME_FAIL. Do not count attempts or target units as distinct bugs.

49 candidate runs cover 44 bugs. [AI review](Review/round1-full854-30s-s101-v1-43d8695e7c2d/README.md) records representative test/patch analysis and limitations. These are explicitly AI reviews, not human confirmations; fault_confirmed remains unset. Failures are retained and were not retried solely to improve success counts.

Authoritative scope: `GRT/Campaigns/round1-full854-30s-s101-v1/43d8695e7c2d/projects/`. Each project has its own manifest, progress.json and bugs.csv. Earlier 60/180-second rounds, validation smoke runs and other fingerprints are history, not part of these totals.

The run moved checkout/build scratch from a Windows bind mount to a Linux Docker volume. Storage-change records are in GRT/Performance. Engine/config stayed the same. Timing comparisons must account for storage changes, pauses and different projects. Scratch/build files are not submitted.

Integration: combine non-overlapping project manifests with the other worker, verify matching profile/implementation, and validate 854 unique project/bug pairs. Do not aggregate every historical row from collect_results.py without campaign filtering.
