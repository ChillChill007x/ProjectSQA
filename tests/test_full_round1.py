import json
import os
from pathlib import Path
import sys
import tempfile
import unittest
from unittest.mock import patch

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / "scripts"))
import run_full_round1 as campaign
from common import StageError
from evaluator import classpath
import run_benchmark


class FullRound1Tests(unittest.TestCase):
    def profile(self):
        return json.loads((campaign.ROOT / "config/round1-full854.json").read_text())

    def manifest(self):
        return {"profile": self.profile(), "tool": "grt", "implementation_sha256": "fixture"}

    def test_exact_854_active_ids_and_deprecated_exclusions(self):
        ids = campaign.expected_inventory(self.profile())
        self.assertEqual(854, sum(map(len, ids.values())))
        self.assertEqual(17, len(ids))
        self.assertNotIn("6", ids["Cli"])
        self.assertNotIn("63", ids["Closure"])
        self.assertNotIn("2", ids["Lang"])
        self.assertIn("176", ids["Closure"])

    def test_same_count_wrong_ids_stops_before_generation(self):
        p = self.profile()
        ids = campaign.expected_inventory(p)
        ids["Cli"][0] = "6"
        with tempfile.TemporaryDirectory() as t, patch.object(campaign, "active_bugs", side_effect=ids.get):
            with self.assertRaises(StageError):
                campaign.prepare(p, "grt", Path(t), "fixture")
            self.assertFalse((Path(t) / "manifest.json").exists())

    def test_profile_keeps_round_seed_budget_and_feedback(self):
        u = campaign.make_unit(self.manifest(), {"project": "Lang", "bug": "1"}, "A")
        self.assertEqual(("Round1", 101, 30), (u["round"], u["seed"], u["budget_seconds"]))
        self.assertLess(u["grt_overrides"]["coverage_interval_seconds"], u["budget_seconds"])

    def test_metadata_failure_does_not_skip_later_bug(self):
        entries = [dict(project="Lang", bug=str(i), status="NOT_RUN") for i in (1, 3)]
        with patch.object(campaign, "targets_for", side_effect=[StageError("TOOL_ERROR", "bad checkout"), ["A"]]), \
             patch.object(campaign, "inspect_unit", return_value={"status": "NOT_RUN"}), \
             patch.object(campaign, "save_summary"), patch.object(campaign, "run_unit") as run:
            campaign.execute(self.manifest(), entries, Path("unused"))
            self.assertEqual("METADATA_ERROR", entries[0]["status"])
            self.assertEqual("3", run.call_args.args[0]["bug"])

    def test_retry_metadata_runs_newly_discovered_targets(self):
        entries = [dict(project="Lang", bug="1", status="METADATA_ERROR")]
        with patch.object(campaign, "targets_for", return_value=["A"]), \
             patch.object(campaign, "inspect_unit", return_value={"status": "NOT_RUN"}), \
             patch.object(campaign, "save_summary"), patch.object(campaign, "run_unit") as run:
            campaign.execute(self.manifest(), entries, Path("unused"), retry_failed=True)
            run.assert_called_once()

    def test_default_pass_leaves_terminal_failure_for_explicit_retry(self):
        entries = [dict(project="Lang", bug="1", status="FAILED", targets=["A"])]
        with patch.object(campaign, "inspect_unit", return_value={"status": "TIMEOUT"}), \
             patch.object(campaign, "save_summary"), patch.object(campaign, "run_unit") as run:
            campaign.execute(self.manifest(), entries, Path("unused"))
            run.assert_not_called()
            campaign.execute(self.manifest(), entries, Path("unused"), retry_failed=True)
            run.assert_called_once()

    def test_all_targets_required_for_bug_success(self):
        e = dict(project="Lang", bug="1", targets=["A", "B"])
        with patch.object(campaign, "inspect_unit", side_effect=[{"status": "EVALUATED"}, {"status": "TIMEOUT"}]):
            campaign.refresh(self.manifest(), [e])
        self.assertEqual("FAILED", e["status"])

    def test_success_with_changed_tests_is_invalid(self):
        unit = campaign.make_unit(self.manifest(), dict(project="Lang", bug="1"), "A")
        with tempfile.TemporaryDirectory() as t:
            root = Path(t)
            result = root / campaign.unit_id(unit) / "result.json"
            result.parent.mkdir()
            result.write_text(json.dumps(dict(unit=unit, status="EVALUATED", paths={"tests": "Test"}, test_sha256={"T.java": "old"})))
            with patch.object(campaign, "ROOT", root), patch.object(campaign, "paths_for", return_value={"result": result.parent}), \
                 patch.object(campaign, "artifact_hashes", return_value={"T.java": "changed"}):
                self.assertEqual("ARTIFACT_INVALID", campaign.inspect_unit(unit)["status"])

    def test_classpath_drops_missing_entries_and_logs_them(self):
        with tempfile.TemporaryDirectory() as t:
            root = Path(t)
            (root / "bin").mkdir()
            jar = root / "present.jar"
            jar.touch()
            with patch("evaluator.export", side_effect=[os.pathsep.join([str(jar), str(root / "missing.jar")]), "bin"]):
                cp, _ = classpath(root, root / "logs", test=False)
            self.assertIn(str(jar), cp)
            self.assertNotIn("missing.jar", cp)
            report = json.loads((root / "logs/classpath-compile.json").read_text())
            self.assertEqual([str(root / "missing.jar")], report["missing_entries"])

    def test_prepare_writes_all_ids_without_starting_generation(self):
        profile = self.profile()
        ids = campaign.expected_inventory(profile)
        with tempfile.TemporaryDirectory() as t, patch.object(campaign, "active_bugs", side_effect=ids.get), \
             patch.object(campaign, "run_unit") as run:
            manifest = campaign.prepare(profile, "evosuite", Path(t), "fixture")
            self.assertEqual(854, len(manifest["bugs"]))
            self.assertEqual(854, len({(b["project"], b["bug"]) for b in manifest["bugs"]}))
            run.assert_not_called()

    def test_interrupted_unit_is_resumed_and_completed_unit_skipped(self):
        entries = [dict(project="Lang", bug="1", targets=["A", "B"], status="RUNNING")]
        def inspect(unit):
            return {"status": "EVALUATED" if unit["target"] == "A" else "RUNNING"}
        with patch.object(campaign, "inspect_unit", side_effect=inspect), \
             patch.object(campaign, "save_summary"), patch.object(campaign, "run_unit") as run:
            campaign.execute(self.manifest(), entries, Path("unused"))
            run.assert_called_once()
            self.assertEqual("B", run.call_args.args[0]["target"])

    def test_generation_failure_continues_to_other_targets_and_bugs(self):
        entries = [dict(project="Lang", bug=str(i), status="NOT_RUN") for i in (1, 3)]
        with patch.object(campaign, "targets_for", return_value=["A", "B"]), \
             patch.object(campaign, "inspect_unit", return_value={"status": "NOT_RUN"}), \
             patch.object(campaign, "save_summary"), patch.object(campaign, "run_unit", return_value=False) as run:
            campaign.execute(self.manifest(), entries, Path("unused"))
            self.assertEqual(4, run.call_count)
            self.assertEqual("3", run.call_args.args[0]["bug"])

    def test_failed_fixed_suite_does_not_spend_time_evaluating_buggy(self):
        record = {"unit": {"tool": "grt", "project": "Lang", "bug": "1", "target": "A"},
                  "run_id": "fixture", "paths": {"tests": "tests"}}
        with patch.object(run_benchmark, "artifact_hashes", return_value={"T.java": "hash"}), \
             patch.object(run_benchmark, "checkout"), patch.object(run_benchmark, "validate_reference"), \
             patch.object(run_benchmark, "evaluate_revision", return_value={"junit": {"passed": False}}) as evaluate:
            with tempfile.TemporaryDirectory() as t, self.assertRaises(StageError) as error:
                run_benchmark.evaluate_record(record, Path(t))
            self.assertEqual("INVALID_ORACLE", error.exception.status)
            evaluate.assert_called_once()


if __name__ == "__main__":
    unittest.main()
