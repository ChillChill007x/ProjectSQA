param()
$ErrorActionPreference = 'Stop'
$repo = Split-Path $PSScriptRoot -Parent
Set-Location -LiteralPath $repo
if (-not (Get-Command docker -ErrorAction SilentlyContinue)) {
    foreach ($candidate in @("$env:LOCALAPPDATA/Programs/DockerDesktop/resources/bin", "$env:ProgramFiles/Docker/Docker/resources/bin")) {
        if (Test-Path -LiteralPath (Join-Path $candidate 'docker.exe')) {
            $env:PATH = "$candidate;$env:PATH"
            break
        }
    }
}
if (-not (Get-Command docker -ErrorAction SilentlyContinue)) { throw 'Docker Desktop CLI not found.' }
$locks = @(Get-ChildItem -LiteralPath (Join-Path $repo 'GRT/Campaigns') -Filter '.running.lock' -Recurse -File -ErrorAction SilentlyContinue)
if ($locks.Count -gt 0) {
    throw "Campaign lock still exists. Stop the old benchmark before switching. Locks: $($locks.FullName -join ', ')"
}
$composeArgs = @('compose', '-p', 'sqa-grt-fast', '-f', 'docker/docker-compose.yml', '-f', 'docker/docker-compose.fast-work.yml')
$configText = & docker @composeArgs config --format json
if ($LASTEXITCODE -ne 0) { throw 'Cannot validate Docker configuration.' }
$cfg = ($configText -join "`n") | ConvertFrom-Json
$mount = @($cfg.services.'sqa-runner'.volumes | Where-Object { $_.target -eq '/workspace/work' })
if ($mount.Count -ne 1 -or $mount[0].type -ne 'volume') { throw 'Expected Linux volume at /workspace/work was not configured.' }
$ownerUid = if ($env:SQA_UID) { $env:SQA_UID } else { '1000' }
$ownerGid = if ($env:SQA_GID) { $env:SQA_GID } else { '1000' }
if ($ownerUid -notmatch '^\d+$' -or $ownerGid -notmatch '^\d+$') { throw 'SQA_UID and SQA_GID must be numeric.' }
$initCode = "import os,sys; p='/workspace/work'; assert os.path.ismount(p), 'work is not a mount'; os.chown(p,int(sys.argv[1]),int(sys.argv[2])); print('Linux work volume ready')"
& docker @composeArgs run --rm --no-deps --user '0:0' sqa-runner python3 -c $initCode $ownerUid $ownerGid
if ($LASTEXITCODE -ne 0) { throw 'Could not initialize Linux work volume.' }
$stamp = Get-Date -Format 'yyyyMMdd-HHmmss'
$recordDir = Join-Path $repo "GRT/Performance/$stamp"
New-Item -ItemType Directory -Path $recordDir -Force | Out-Null
$imageId = (& docker image inspect project-sqa:core-v2 --format '{{.Id}}')
@{mode='linux-volume-work';started_at=(Get-Date).ToUniversalTime().ToString('o');work_path='/workspace/work';volume_source=$mount[0].source;image_id=$imageId;note='Storage-only change. Historical results retained. No speedup measured yet.'} | ConvertTo-Json | Set-Content -LiteralPath (Join-Path $recordDir 'storage-change.json') -Encoding UTF8
& docker @composeArgs run --rm --no-deps sqa-runner python3 scripts/doctor.py
if ($LASTEXITCODE -ne 0) { throw 'Environment check failed; benchmark was not started.' }
Write-Host 'Linux build storage ready. Existing GRT evidence remains on Windows.'
Write-Host 'In this shell: python3 scripts/run_full_round1.py --tool grt --project Chart --resume'
Write-Host 'Do not run the old container concurrently. Do not delete this Docker volume.'
& docker @composeArgs run --rm --no-deps sqa-runner bash
