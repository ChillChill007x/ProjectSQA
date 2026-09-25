#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
service=sqa-runner
if [ "${1:-}" = "--ai" ]; then service=sqa-ai; fi
export SQA_UID="$(id -u)" SQA_GID="$(id -g)"
docker info >/dev/null
docker compose -f docker/docker-compose.yml build "$service"
docker compose -f docker/docker-compose.yml run --rm "$service" python3 scripts/doctor.py
docker compose -f docker/docker-compose.yml run --rm "$service" bash
