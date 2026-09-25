"""Real Java GRT -> javac -> JUnit -> JaCoCo smoke, independent of Docker/Defects4J.
Fixtures are validation only and are never included in benchmark result folders.
"""
import json
import os
from pathlib import Path
import sys
import uuid
sys.path.insert(0,str(Path(__file__).resolve().parents[1]/"scripts"))
from common import ROOT, WORK, TOOLS, build_support, config, dump, java, run, support_cp
from evaluator import discover_test_classes, parse_coverage

def main():
    build_support()
    dest=WORK/"smoke-java"/uuid.uuid4().hex[:12]
    dest.mkdir(parents=True,exist_ok=True)
    classes=dest/"classes"
    classes.mkdir(exist_ok=True)
    javac=Path(os.environ["JAVA_HOME"])/"bin/javac" if os.environ.get("JAVA_HOME") else "javac"
    run([javac,"--release","11","-d",classes,*sorted((ROOT/"tests/fixtures").rglob("*.java"))],log=dest/"compile-fixtures.json")
    cfg=dict(config()["grt"],seed=101,target="sqa.fixtures.BranchBox",class_root=str(classes),output=str(dest/"tests"),budget_seconds=5,coverage_interval_seconds=.1,max_tests=40)
    dump(dest/"config.json",cfg)
    cp=os.pathsep.join([str(classes),support_cp()])
    run([java(),f"-javaagent:{TOOLS/'jacocoagent.jar'}=output=none,includes=sqa.fixtures.*","-cp",cp,"sqa.grt.GuidedRandom",dest/"config.json"],log=dest/"generate.json",timeout=30)
    generated=sorted((dest/"tests").rglob("*.java"))
    manifest=json.loads((dest/"tests/generation.json").read_text())
    assert manifest["generated_tests"]>0,manifest
    for mechanism in ("bloodhound_selections","orienteering_selections","runtime_type_observations","detective_objects","primitive_fuzz","object_fuzz"):
        assert manifest["counters"].get(mechanism,0)>0,(mechanism,manifest)
    run([javac,"--release","11","-cp",cp,"-d",classes,*generated],log=dest/"compile-generated.json")
    run([java(),f"-javaagent:{TOOLS/'jacocoagent.jar'}=destfile={dest/'coverage.exec'},append=false,includes=sqa.fixtures.*","-cp",cp,"SqaJUnitRunner",dest/"junit.json",*discover_test_classes(generated)],log=dest/"run.json")
    result=json.loads((dest/"junit.json").read_text())
    assert result["passed"],result
    run([java(),"-jar",TOOLS/"jacococli.jar","report",dest/"coverage.exec","--classfiles",classes/"sqa/fixtures/BranchBox.class","--xml",dest/"coverage.xml"],log=dest/"coverage-report.json")
    coverage=parse_coverage(dest/"coverage.xml","sqa.fixtures.BranchBox")
    assert coverage["line_covered"]>0,coverage
    # Deliberately break source: proves the real compiler rejects invalid generated tests.
    bad=dest/"BrokenTest.java"
    bad.write_text('public class BrokenTest { @org.junit.Test public void test() { unknown_symbol; } }')
    rejected=run([javac,"-cp",cp,"-d",classes,bad],log=dest/"negative-compile.json",check=False)
    assert rejected["returncode"]!=0
    buggy=dest/"buggy";buggy.mkdir()
    buggy_source=buggy/"BranchBox.java"
    source=(ROOT/"tests/fixtures/sqa/fixtures/BranchBox.java").read_text()
    buggy_source.write_text(source.replace('x == 42 ? 7','x == 42 ? 999'))
    run([javac,"--release","11","-cp",cp,"-d",buggy,buggy_source],log=dest/"compile-buggy.json")
    run([java(),"-cp",os.pathsep.join([str(buggy),cp]),"SqaJUnitRunner",dest/"junit-buggy.json",*discover_test_classes(generated)],log=dest/"run-buggy.json")
    b_result=json.loads((dest/"junit-buggy.json").read_text())
    assert b_result["failures"],"Generated oracle failed to detect the injected fixture fault"
    mechanism_sources=sorted((ROOT/"tests/java").rglob("*.java"))
    run([javac,"--release","11","-cp",cp,"-d",classes,*mechanism_sources],log=dest/"compile-mechanism-tests.json")
    run([java(),f"-Dsqa.fixture.classes={classes}",f"-javaagent:{TOOLS/'jacocoagent.jar'}=output=none,includes=sqa.fixtures.*","-cp",cp,"SqaJUnitRunner",dest/"mechanism-junit.json","sqa.grt.GRTMechanismsTest"],log=dest/"mechanism-tests.json")
    mechanism_report=json.loads((dest/"mechanism-junit.json").read_text())
    assert mechanism_report["passed"],mechanism_report
    summary={"fixture_only":True,"junit_tests":result["run_count"],"coverage":coverage,"mechanisms":manifest["counters"],"invalid_test_rejected":True,"injected_fault_detected":True}
    summary["behavioral_mechanism_tests"]=mechanism_report["run_count"]
    dump(dest/"validation.json",summary)
    print(json.dumps(summary,indent=2))
    print("Evidence:",dest)

if __name__=="__main__":main()
