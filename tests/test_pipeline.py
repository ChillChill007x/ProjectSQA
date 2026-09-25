import json
import os
from pathlib import Path
import sys
import tempfile
import unittest
from unittest.mock import patch

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "scripts"))
from common import StageError, run
from evaluator import compare, discover_test_classes, parse_coverage, compile_suite
from run_benchmark import unit_id, run_unit

class PipelineTests(unittest.TestCase):
    def test_smoke_evidence_is_not_labeled_experiment(self):
        from collect_results import rows
        with tempfile.TemporaryDirectory() as t:
            root = Path(t)
            result = root / "result.json"
            data = {"run_id":"smoke", "status":"EVALUATED", "unit":dict(project="Lang",bug="1",target="A",tool="grt",round="Round1",seed=101,budget_seconds=60)}
            (root / "validation-only.json").write_text('{"purpose":"validation"}')
            (root / "coverage-superseded.json").write_text('{"replacement":"corrected/result.json"}')
            with patch("collect_results.ROOT",root), patch("collect_results.records",return_value=[(result,data)]):
                row=list(rows())[0]
                self.assertEqual(row["purpose"],"validation")
                self.assertEqual(row["superseded_by"],"corrected/result.json")

    def test_timeout_preserves_output_and_status(self):
        with tempfile.TemporaryDirectory() as t:
            log = Path(t) / "timeout.json"
            result = run([sys.executable, "-c", "import time; print('started', flush=True); time.sleep(30)"],
                         timeout=1, log=log, check=False)
            self.assertTrue(result["timed_out"])
            self.assertIn("started", result["stdout"])
            self.assertTrue(json.loads(log.read_text())["timed_out"])

    def test_submission_detects_added_tests(self):
        from check_submission import suite_hashes
        with tempfile.TemporaryDirectory() as t:
            root = Path(t)
            (root / "First.java").write_text("class First {}")
            with patch("check_submission.ROOT", root):
                evaluated = suite_hashes(root)
                (root / "Extra.java").write_text("class Extra {}")
                self.assertNotEqual(evaluated, suite_hashes(root))

    def test_actual_java_file_must_be_compiled(self):
        with tempfile.TemporaryDirectory() as t:
            folder = Path(t)
            tests = folder / "tests"
            tests.mkdir()
            java = tests / "BrokenTest.java"
            java.write_text("public class BrokenTest { @org.junit.Test public void fails() { DOES_NOT_COMPILE; } }")
            with patch("evaluator.build_support"), patch("evaluator.classpath", return_value=("", folder)), patch("evaluator.run", return_value={"returncode":1,"timed_out":False}) as invoked:
                with self.assertRaises(StageError) as raised:
                    compile_suite(folder, tests, folder / "eval", folder)
                self.assertEqual(raised.exception.status,"COMPILE_FAIL")
                self.assertIn(str(java.resolve()).replace("\\", "/"), (folder / "eval/sources.args").read_text())
                self.assertIn("javac", invoked.call_args.args[0][0])

    def test_fault_is_candidate_not_confirmed(self):
        fixed={"junit":{"passed":True,"run_count":1,"tests":["T::x"],"failures":[]}}
        buggy={"junit":{"tests":["T::x"],"failures":[{"test":"T::x"}]}}
        result=compare(fixed,buggy)
        self.assertTrue(result["fault_candidate"])
        self.assertIsNone(result["fault_confirmed"])
        fixed["junit"]["passed"]=False
        with self.assertRaises(StageError):compare(fixed,buggy)

    def test_target_coverage_and_zero_denominator(self):
        with tempfile.TemporaryDirectory() as t:
            p=Path(t)/"coverage.xml"
            p.write_text('<report><package><class name="a/Target"><counter type="LINE" covered="3" missed="1"/><counter type="BRANCH" covered="0" missed="0"/></class><class name="Other"><counter type="LINE" covered="999" missed="0"/></class></package></report>')
            result=parse_coverage(p,"a.Target")
            self.assertEqual(result["line_coverage_percent"],75)
            self.assertIsNone(result["branch_coverage_percent"])

    def test_identity_includes_config_bug_and_seed(self):
        base=dict(project="Lang",bug="1",round="Round1",seed=101,tool="grt",target="A",budget_seconds=60)
        self.assertNotEqual(unit_id(base),unit_id(dict(base,bug="3")))
        self.assertNotEqual(unit_id(base),unit_id(dict(base,budget_seconds=180)))
        self.assertNotEqual(unit_id(base),unit_id(dict(base,seed=202)))

    def test_resume_does_not_skip_failed(self):
        with tempfile.TemporaryDirectory() as t:
            base=Path(t)
            paths={k:base/k/"run" for k in ("result","tests","config")}
            paths["result"].mkdir(parents=True)
            unit=dict(project="Lang",bug="1",tool="grt",round="Round1",seed=101,target="A")
            paths["result"].rename(paths["result"].with_name(unit_id(unit)))
            old=paths["result"].with_name(unit_id(unit))
            (old/"result.json").write_text(json.dumps({"status":"COMPILE_FAIL","unit":unit,"paths":{"tests":"work/no-tests"}}))
            with patch("run_benchmark.ROOT",base), patch("run_benchmark.paths_for",side_effect=lambda tool,project,bug,r,i:{k:base/k/i for k in paths}), patch("run_benchmark.relative",side_effect=lambda p:str(p.relative_to(base))), patch("run_benchmark.checkout",side_effect=StageError("TOOL_ERROR","fixture")) as called:
                self.assertFalse(run_unit(unit,resume=True))
                called.assert_called_once()

if __name__ == "__main__":unittest.main()
