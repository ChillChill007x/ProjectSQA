#!/usr/bin/env python3
"""Compatibility entry point: all tools now use the same benchmark/evaluator."""
from run_benchmark import main
if __name__ == "__main__":
    raise SystemExit(main())
