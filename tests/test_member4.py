"""Regression checks for consolidation denominators and evidence selection."""
import sys
import tempfile
import unittest
from pathlib import Path
from unittest.mock import patch

sys.path.insert(0, str(Path(__file__).resolve().parents[1] / 'scripts'))
import consolidate_member4 as m

class ConsolidationTests(unittest.TestCase):
    def test_first_attempt_does_not_cherry_pick_success(self):
        first = dict(unit_key='same', excluded=False, started_at='2026-01-01', run_id='a', result_path='a', status='COMPILE_FAIL')
        retry = dict(first, started_at='2026-01-02', run_id='b', status='EVALUATED')
        self.assertEqual(m.choose_attempts([retry, first]), [first])

    def test_excluded_validation_and_distinct_units(self):
        a = dict(unit_key='one', excluded=True, started_at='', run_id='a', result_path='a')
        b = dict(a, unit_key='two', excluded=False)
        self.assertEqual(m.choose_attempts([a, b]), [b])

    def test_missing_coverage_is_not_zero(self):
        self.assertEqual(m.average([None, '', 80, 100]), 90)
        self.assertIsNone(m.average([None]))
        self.assertEqual(m.average([0, 100]), 50)

    def test_cohorts_separate_implementation_and_budget(self):
        a = dict(tool='grt', budget_seconds=30, implementation_sha256='a')
        self.assertNotEqual(m.cohort(a), m.cohort(dict(a, budget_seconds=60)))
        self.assertNotEqual(m.cohort(a), m.cohort(dict(a, implementation_sha256='b')))

    def test_relocation_only_resolves_known_ai_move(self):
        with tempfile.TemporaryDirectory() as t, patch.object(m, 'ROOT', Path(t)):
            p=Path(t)/'Deepseek-v4_flash/TestCode/Lang/Lang_1b/T.java'
            p.parent.mkdir(parents=True);p.write_text('class T {}')
            self.assertEqual(m.resolve_saved('Deepseek-v4_flash/TestCode/Lang_1b/T.java'),p)
            self.assertIsNone(m.resolve_saved('../outside'))

if __name__ == '__main__': unittest.main()
