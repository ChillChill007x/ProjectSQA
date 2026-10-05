"""Direct HTTPS generation. No agent CLI, shell tools, key rotation or implicit POST retries."""
import json
import os
import re
import socket
import time
import urllib.error
import urllib.request
from pathlib import Path, PurePosixPath
from urllib.parse import urlparse
from common import ROOT, StageError, dump, sha

CONFIG = ROOT/'config/ai-api.json'
CONTROL = ROOT/'config/ai-control.json'


def read(path):
    return json.loads(Path(path).read_text(encoding='utf-8-sig'))


def settings():
    return read(CONFIG)


def assert_api_enabled():
    if read(CONTROL).get('api_paused', True):
        raise StageError('PAUSED', 'API generation is paused; use the explicit resume command when ready.')


def assert_cli_enabled():
    if not read(CONTROL).get('cli_enabled', False):
        raise StageError('CLI_DISABLED', 'CLI generation was retired. Use scripts/ai_api_campaign.py.')


def api_key(profile):
    name = profile['key_env']
    value = os.environ.get(name, '').strip()
    if not value:
        local = ROOT/'.env'
        if local.exists():
            for line in local.read_text(encoding='utf-8-sig').splitlines():
                k, sep, v = line.partition('=')
                if sep and k.strip() == name:
                    value = v.strip().strip('\"\'')
                    break
    if not value or value.startswith('your-'):
        raise StageError('AUTH_REQUIRED', f'Set {name} in your environment or local ignored .env; never paste it into chat.')
    return value


class NoRedirect(urllib.request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):
        return None


def http_json(profile, route, payload=None, timeout=30):
    base = profile.get('base_url')
    if not base or urlparse(base).scheme != 'https' or urlparse(base).username or urlparse(base).query:
        raise StageError('API_CONFIG_ERROR', 'An explicit HTTPS base_url without embedded credentials is required.')
    key = api_key(profile)
    body = json.dumps(payload, ensure_ascii=False).encode('utf-8') if payload is not None else None
    request = urllib.request.Request(base.rstrip('/')+route, data=body,
        headers={'Authorization':'Bearer '+key, 'Content-Type':'application/json', 'Accept':'application/json'})
    try:
        with urllib.request.build_opener(NoRedirect).open(request, timeout=timeout) as response:
            raw = response.read(8*1024*1024+1)
            if len(raw)>8*1024*1024:
                raise StageError('API_RESPONSE_ERROR', 'Response exceeded 8 MiB.')
            data = json.loads(raw.decode('utf-8').replace(key, '[REDACTED]'))
            if not isinstance(data,dict):raise StageError('API_RESPONSE_ERROR','Expected a JSON object response.')
            return data
    except urllib.error.HTTPError as exc:
        # Do not save server error bodies: they can echo authorization headers.
        status = 'AUTH_REQUIRED' if exc.code in (401,403) else 'API_RATE_LIMIT' if exc.code==429 else 'API_HTTP_ERROR'
        raise StageError(status, f'HTTP {exc.code}; no automatic POST retry or model/key substitution.') from None
    except (urllib.error.URLError, TimeoutError, socket.timeout) as exc:
        raise StageError('API_NETWORK_ERROR', 'Request failed or timed out; delivery/charge may be unknown. Inspect before retrying.') from None
    except (ValueError, UnicodeError):
        raise StageError('API_RESPONSE_ERROR', 'Provider did not return valid JSON.') from None


def verify_model(profile):
    response = http_json(profile, '/models')
    available = {m.get('id') for m in response.get('data', []) if isinstance(m, dict)}
    if profile['model'] not in available:
        raise StageError('MODEL_UNAVAILABLE', f"Exact model {profile['model']} is absent from this account's /models response; no fallback.")
    return {'model':profile['model'], 'base_url':profile['base_url'], 'available':True}


def strip_comments(source):
    """Remove Java comments while retaining strings, chars and text blocks verbatim."""
    result=[]; i=0
    while i<len(source):
        if source.startswith('//',i):
            end=source.find('\n',i+2); i=len(source) if end<0 else end
        elif source.startswith('/*',i):
            end=source.find('*/',i+2)
            if end<0: raise StageError('SOURCE_ERROR','Unterminated source comment')
            result.append(' '); result.append('\n'*source[i:end+2].count('\n')); i=end+2
        elif source.startswith('"""',i):
            end=i+3
            while end<len(source):
                if source[end]=='\\':end+=2;continue
                if source.startswith('"""',end):end+=3;break
                end+=1
            result.append(source[i:end]); i=end
        elif source[i] in ('"', "'"):
            quote=source[i]; end=i+1
            while end<len(source):
                if source[end]=='\\':end+=2;continue
                if source[end]==quote:end+=1;break
                end+=1
            result.append(source[i:end]);i=end
        else:result.append(source[i]);i+=1
    # Keep code and line structure intact; only collapse empty lines outside literals in future profiles.
    return ''.join(result)


def java_source_path(source, target):
    """Prefer the exact top-level name (including $), then resolve nested classes."""
    if not re.fullmatch(r'[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*',target):
        raise StageError('SOURCE_ERROR','Invalid Java target name')
    package,_,name=target.rpartition('.')
    while name:
        path=source/((package.replace('.','/')+'/') if package else '')/(name+'.java')
        if path.is_symlink() or source.resolve() not in path.resolve().parents:
            raise StageError('SOURCE_ERROR',f'Unsafe source for {target}')
        if path.is_file():return path
        if '$' not in name:break
        name=name.rsplit('$',1)[0]
    raise StageError('SOURCE_ERROR',f'Missing source for {target}')


def source_bundle(unit, source, max_bytes):
    files={}; evidence=[]
    for target in unit['targets']:
        path=java_source_path(source,target)
        name=path.relative_to(source).as_posix()
        if name not in files:
            original=path.read_text(encoding='utf-8',errors='replace')
            files[name]=strip_comments(original)
            evidence.append({'path':name,'sha256':sha(path)})
    text=json.dumps({'targets':unit['targets'],'fixed_source':files},ensure_ascii=False)
    if len(text.encode('utf-8'))>max_bytes:
        raise StageError('CONTEXT_TOO_LARGE', 'All target bodies exceed the frozen source cap. Nothing was silently truncated; revise the plan explicitly.')
    return text,evidence


def make_payload(profile, system, source, limit, previous=None, feedback=None):
    messages=[{'role':'system','content':system},{'role':'user','content':source}]
    if previous is not None:
        messages += [{'role':'assistant','content':previous},
                     {'role':'user','content':'Repair the complete suite using only this evaluator feedback:\n'+feedback}]
    body={'model':profile['model'],'messages':messages,'stream':False,'response_format':{'type':'json_object'}}
    body['max_completion_tokens' if profile['model'].startswith('gpt-') else 'max_tokens']=limit
    if profile.get('thinking_disabled'):body['thinking']={'type':'disabled'}
    if profile.get('reasoning_effort'):body['reasoning_effort']=profile['reasoning_effort']
    return body


def unpack_response(data):
    choices=data.get('choices')
    if not isinstance(choices,list) or len(choices)!=1:raise StageError('API_RESPONSE_ERROR','Expected one completion.')
    choice=choices[0]; message=choice.get('message',{})
    if choice.get('finish_reason')=='length':raise StageError('OUTPUT_LIMIT','Completion was truncated; refusing partial Java.')
    if choice.get('finish_reason')!='stop' or message.get('refusal') or message.get('tool_calls'):
        raise StageError('API_RESPONSE_ERROR','Refused, incomplete, or tool-call output; no tools are executed.')
    content=message.get('content')
    if not isinstance(content,str) or not content.strip():raise StageError('INVALID_TESTS','Empty completion.')
    if not isinstance(data.get('model'),str) or not data['model']:raise StageError('PROVENANCE_MISSING','Missing returned model identity.')
    return content


def parse_files(content):
    try:data=json.loads(content)
    except ValueError:raise StageError('INVALID_TESTS','Expected a JSON files object, not Markdown.') from None
    files=data.get('files') if isinstance(data,dict) else None
    if not isinstance(files,list) or not 1<=len(files)<=64:raise StageError('INVALID_TESTS','Expected 1..64 Java files.')
    result={}
    for item in files:
        if not isinstance(item,dict) or set(item)!={'path','content'}:raise StageError('INVALID_TESTS','Invalid file fields.')
        name=item['path'];code=item['content']
        if not isinstance(name,str) or not isinstance(code,str) or not code.strip():raise StageError('INVALID_TESTS','Empty file.')
        parts=PurePosixPath(name).parts
        if not parts or PurePosixPath(name).is_absolute() or any(not re.fullmatch(r'[A-Za-z_$][\w$]*(?:\.java)?',p) for p in parts) or not name.endswith('.java') or '\\' in name:
            raise StageError('INVALID_TESTS','Unsafe Java output path.')
        if name.casefold() in {p.casefold() for p in result}:raise StageError('INVALID_TESTS','Duplicate output path.')
        package=re.search(r'^\s*package\s+([\w.]+)\s*;',code,re.M)
        expected=package.group(1).split('.') if package else []
        if list(parts[:-1])!=expected:raise StageError('INVALID_TESTS','Package/path mismatch.')
        public=re.search(r'\bpublic\s+(?:final\s+)?class\s+([\w$]+)',code)
        if not public or public.group(1)+'.java'!=parts[-1]:raise StageError('INVALID_TESTS','Public test class/path mismatch.')
        result[name]=code
    return result


def write_files(folder, files):
    folder=Path(folder)
    if folder.is_symlink():raise StageError('INVALID_TESTS','Output root is a symlink.')
    folder.mkdir(parents=True,exist_ok=True)
    for p in folder.rglob('*'):
        if p.is_symlink():raise StageError('INVALID_TESTS','Output contains a symlink.')
    # Only this unit's generated Java is replaced; raw attempts are archived first.
    for p in folder.rglob('*.java'):p.unlink()
    for name,content in files.items():
        target=folder/name
        if folder.resolve() not in target.resolve().parents:raise StageError('INVALID_TESTS','Output escapes root.')
        target.parent.mkdir(parents=True,exist_ok=True);target.write_text(content,encoding='utf-8')
