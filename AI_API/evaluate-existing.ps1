param(
    [ValidateSet('status','plan','preview','run','collect')][string]$Action='status',
    [Alias('Projects')][string[]]$Project=@(),
    [int[]]$Bug=@(),
    [ValidateSet('all','deepseek','openai')][string]$Provider='all',
    [int]$MaxUnits=2,
    [ValidateRange(1,2)][int]$Workers=2,
    [string]$Python=''
)
& (Join-Path $PSScriptRoot 'run.ps1') -Workflow existing @PSBoundParameters
