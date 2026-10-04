param(
    [ValidateSet('setup','status','preview','doctor','plan','pause','resume','run','collect')][string]$Action='status',
    [ValidateSet('generate','existing')][string]$Workflow='generate',
    [ValidateSet('all','deepseek','openai')][string]$Provider='all',
    [Alias('Projects')][string[]]$Project=@(),
    [int[]]$Bug=@(),
    [ValidateRange(1,2147483647)][int]$MaxUnits=2,
    [ValidateRange(1,2)][int]$Workers=2,
    [int]$TokenBudget=200000,
    [switch]$AllowApiCalls,
    [switch]$CheckModels,
    [switch]$Build,
    [string]$Python=''
)
$ErrorActionPreference='Stop'
$repoPath=Split-Path -Parent $PSScriptRoot
if (!$Python) {
    $candidate=Get-Command python -ErrorAction SilentlyContinue
    if ($candidate -and $candidate.Source -notlike '*WindowsApps*') { $Python=$candidate.Source }
    elseif (Test-Path -LiteralPath 'E:\sqa-runtime\codex-primary-runtime\dependencies\python\python.exe') {
        $Python='E:\sqa-runtime\codex-primary-runtime\dependencies\python\python.exe'
    } else { throw 'Install Python 3.10+ or pass -Python C:\path\to\python.exe.' }
}
$taskTemp=Join-Path $repoPath 'work\host-temp'
New-Item -ItemType Directory -Path $taskTemp -Force | Out-Null
$previous=@{TEMP=$env:TEMP;TMP=$env:TMP;PYTHONIOENCODING=$env:PYTHONIOENCODING;PYTHONDONTWRITEBYTECODE=$env:PYTHONDONTWRITEBYTECODE}
try {
    $env:TEMP=$taskTemp;$env:TMP=$taskTemp;$env:PYTHONIOENCODING='utf-8';$env:PYTHONDONTWRITEBYTECODE='1'
    $arguments=@('-B',(Join-Path $repoPath 'scripts\ai_workspace.py'),$Action,'--workflow',$Workflow,'--provider',$Provider)
    if($Project.Count){$arguments+=@('--projects')+$Project}
    if($Bug.Count){$arguments+=@('--bugs')+@($Bug | ForEach-Object { "$_" })}
    if($CheckModels){$arguments+='--check-models'}
    if($Build){$arguments+='--build'}
    if($Action -in @('run','preview')){$arguments+=@('--max-units',"$MaxUnits")}
    if($Action -eq 'run'){
        $arguments+=@('--token-budget',"$TokenBudget",'--workers',"$Workers")
        if($AllowApiCalls){$arguments+='--allow-api-calls'}
    }
    & $Python @arguments
    if($LASTEXITCODE -ne 0){throw 'AI workflow failed. Inspect the status above; no automatic retry.'}
} finally {
    foreach($key in $previous.Keys){[Environment]::SetEnvironmentVariable($key,$previous[$key],'Process')}
}
