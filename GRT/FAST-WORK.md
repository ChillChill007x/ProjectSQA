# Linux build storage for GRT

Observed Chart 1-5 command logs: checkout plus project compilation account for about 79-83% of run-unit time; generation takes 8-12 seconds. Metadata build time is additional. Storage overhead is a hypothesis to test, not a guaranteed speedup.

Stop the existing benchmark with Ctrl+C and wait for the prompt before switching. In Windows PowerShell at the repository root:

```powershell
powershell -ExecutionPolicy Bypass -File GRT/start-fast-work.ps1
```

The launcher verifies the named-volume mount, initializes only its root ownership, records image/storage provenance, runs doctor, and opens a shell. It does not start generation automatically or change engine/config/implementation hash.

In that shell:

```bash
python3 scripts/run_full_round1.py --tool grt --project Chart --resume
```

The same /workspace/work path now uses Linux Docker volume storage for metadata, build support and checkout trees. Existing Windows work files are retained but hidden in this new container; they are not copied or deleted. Work already EVALUATED remains in GRT and is skipped when matching checksums. Interrupted attempts are retained and may be retried. Terminal failures still require explicit retry.

Evidence, generated tests, campaign progress and logs remain under the Windows-mounted GRT directory. The monitor still works. Keep using this launcher for subsequent projects and after restarting Docker so the same volume is reused. Stop other containers/runners that could use these evidence paths first. One runner only; this does not enable parallel execution.

Do not run docker compose down -v or Docker volume pruning while this campaign needs the volume. Volume storage still consumes physical disk space (usually the Docker Desktop VHD); it does not create extra capacity. Metadata and support builds are cold on the first run. Inspect Docker disk usage as well as host disk free space.

Verify the change with GRT/compare-storage-times.py after another Chart unit finishes. Compare checkout/compile timings, not just generation budget. Different bugs/classes have different build costs, so this is observational rather than a controlled speedup measurement. Preserve storage-change.json when reporting timing differences.

Rollback after stopping the runner: start the original Docker service again; the original Windows work directory is still there. Keep all historical result attempts.

Prepared/validated statically on Windows; Docker execution and timing validation must be completed in the user's Docker session.
