param([switch]$Build,[string]$Python='')
& (Join-Path $PSScriptRoot 'run.ps1') -Action setup -Build:$Build -Python $Python
