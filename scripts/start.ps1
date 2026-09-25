param([switch]$AI)
$ErrorActionPreference = 'Stop'
$repo = Split-Path $PSScriptRoot -Parent
Set-Location $repo
if (-not (Get-Command docker -ErrorAction SilentlyContinue)) {
    foreach ($candidate in @("$env:LOCALAPPDATA/Programs/DockerDesktop/resources/bin", "$env:ProgramFiles/Docker/Docker/resources/bin")) {
        if (Test-Path -LiteralPath (Join-Path $candidate 'docker.exe')) {
            $env:PATH = "$candidate;$env:PATH"
            break
        }
    }
}
if (-not (Get-Command docker -ErrorAction SilentlyContinue)) {
    throw 'Install Docker Desktop with Linux containers, start it, then run this script again.'
}
docker info *> $null
if ($LASTEXITCODE -ne 0) { throw 'Docker engine is not running.' }
$service = if ($AI) { 'sqa-ai' } else { 'sqa-runner' }
docker compose -f docker/docker-compose.yml build $service
if ($LASTEXITCODE -ne 0) { throw 'Image build failed; no ready environment was created.' }
docker compose -f docker/docker-compose.yml run --rm $service python3 scripts/doctor.py
if ($LASTEXITCODE -ne 0) { throw 'Environment validation failed; inspect the output above.' }
docker compose -f docker/docker-compose.yml run --rm $service bash
