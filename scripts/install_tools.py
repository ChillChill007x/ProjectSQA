#!/usr/bin/env python3
"""Download pinned public dependencies; fail closed on any checksum mismatch."""
import argparse
import hashlib
import json
from pathlib import Path
import urllib.request

def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--dest", type=Path, default=Path("/opt/sqa/lib"))
    args = ap.parse_args()
    lock = json.loads((Path(__file__).resolve().parents[1] / "config/dependencies.lock.json").read_text())
    args.dest.mkdir(parents=True, exist_ok=True)
    for item in lock["jars"]:
        path = args.dest / item["file"]
        if path.exists() and hashlib.sha256(path.read_bytes()).hexdigest() == item["sha256"]:
            continue
        print("Downloading", item["file"], flush=True)
        request = urllib.request.Request(item["url"], headers={"User-Agent": "SQA-team-environment/2.0"})
        with urllib.request.urlopen(request, timeout=180) as response:
            data = response.read()
        if hashlib.sha256(data).hexdigest() != item["sha256"]:
            raise RuntimeError("Checksum mismatch: " + item["file"])
        path.write_bytes(data)
    print("All dependency checksums verified")

if __name__ == "__main__":
    main()
