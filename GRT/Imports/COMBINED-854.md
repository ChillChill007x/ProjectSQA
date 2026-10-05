# Combined GRT evidence inventory: 854 bugs

All 854 distinct active project/bug pairs have terminal records: 685 EVALUATED, 169 FAILED. This is an evidence inventory across TWO implementation hashes, not a homogeneous full-854 campaign.

| Project | Bugs | EVALUATED | FAILED | Campaign |
|---|---:|---:|---:|---|
| Chart | 26 | 23 | 3 | 43d8695e7c2d |
| Cli | 39 | 33 | 6 | 43d8695e7c2d |
| Closure | 174 | 142 | 32 | 43d8695e7c2d |
| Codec | 18 | 10 | 8 | 43d8695e7c2d |
| Collections | 28 | 25 | 3 | 43d8695e7c2d |
| Compress | 47 | 44 | 3 | 43d8695e7c2d |
| Csv | 16 | 14 | 2 | 43d8695e7c2d |
| Gson | 18 | 15 | 3 | 43d8695e7c2d |
| JacksonCore | 26 | 26 | 0 | 43d8695e7c2d |
| JacksonDatabind | 110 | 72 | 38 | 43d8695e7c2d |
| JacksonXml | 6 | 5 | 1 | 43d8695e7c2d |
| Jsoup | 93 | 68 | 25 | 43d8695e7c2d |
| JxPath | 22 | 19 | 3 | 43d8695e7c2d |
| Lang | 61 | 54 | 7 | 43d8695e7c2d |
| Math | 106 | 84 | 22 | 43d8695e7c2d |
| Mockito | 38 | 35 | 3 | 4591f1fe8ac7 |
| Time | 26 | 16 | 10 | 4591f1fe8ac7 |

## Comparability limitation

- 790 bugs: campaign 43d8695e7c2d; implementation 2095c4d4de9e7311a00398207b751d68989f00b8349199e785ec58bd55409a52; 634 EVALUATED / 156 FAILED.
- Mockito and Time, 64 bugs: campaign 4591f1fe8ac7; implementation 23ed78b73f64850491b1a5eb210a99d4b02c74a382b9ffce07365eda4a0a5db9; 51 EVALUATED / 13 FAILED.
- Profile and dependency manifests match. The supplied GuidedRandom.java matches local bytes, but scripts/config used by the second implementation were not supplied. Equivalence remains unverified. Do not relabel either fingerprint or report pooled performance as a single implementation.
- The 4591f1fe8ac7 manifest preserves its original 854-row scope, including 790 NOT_RUN rows. Those rows describe that campaign alone. The combined inventory selects only its Mockito/Time records and selects the other 790 from 43d8695e7c2d.

## Evidence and reviews

- Imported only selected run folders and original campaign metadata; unrelated historical results from GRT.zip and its code were not imported.
- Archive SHA-256 and per-archive checks are in member3/archive-audit.json. Imported EVALUATED Java checksums: 335, all match.
- Across selected results: 98 candidate runs / 85 distinct bugs. All 98 candidate runs now have explicit AI reviews: 53 patch-link-supported, 44 requiring contract/defect review, 1 unconfirmed timeout. See ../Review/COMBINED-AI-REVIEW.md. None are promoted to human-confirmed faults.
- Preserve failures; no benchmark reruns or assertion changes were performed. Empty evidence directories receive .gitkeep for Git transport.
- Use combined-854-inventory.json to select results, not an unfiltered collect_results export.
