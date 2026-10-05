param([string]$Project = "Chart")
$ErrorActionPreference = 'Stop'
$monitor = Join-Path $PSScriptRoot 'monitor_progress.py'
$bundledPython = Join-Path $env:USERPROFILE '.cache/codex-runtimes/codex-primary-runtime/dependencies/python/python.exe'
if (Test-Path -LiteralPath $bundledPython) {
    & $bundledPython $monitor --project $Project
} elseif (Get-Command python -ErrorAction SilentlyContinue) {
    & python $monitor --project $Project
} else {
    throw 'Python unavailable. Run python3 GRT/monitor_progress.py in a second Docker shell.'
}
