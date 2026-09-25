"""Exercise the pinned EvoSuite MOSA jar and evaluate its actual generated files on a fixture."""
import json
import os
from pathlib import Path
import sys
import uuid
from unittest.mock import patch
sys.path.insert(0,str(Path(__file__).resolve().parents[1]/"scripts"))
from common import ROOT, WORK, TOOLS, build_support, java, run, support_cp, dump
from evaluator import discover_test_classes, evaluate_revision

def main():
    if not os.environ.get("JAVA8_HOME"):
        raise RuntimeError("Set JAVA8_HOME to the pinned Java 8 installation")
    build_support()
    dest=WORK/"smoke-mosa"/uuid.uuid4().hex[:12]
    classes=dest/"sut"
    classes.mkdir(parents=True)
    compiler=Path(os.environ["JAVA8_HOME"])/"bin/javac"
    run([compiler,"-d",classes,*sorted((ROOT/"tests/fixtures").rglob("*.java"))],log=dest/"compile.json")
    tests=dest/"tests"
    generated=run([java("JAVA8_HOME"),"-jar",TOOLS/"evosuite-1.2.0.jar","-generateMOSuite","-Dalgorithm=MOSA",
        "-class","sqa.fixtures.BranchBox","-projectCP",classes,"-criterion","BRANCH","-seed","101",
        "-Dsearch_budget=5",f"-Dtest_dir={tests}",f"-Dreport_dir={dest/'reports'}","-Dassertion_strategy=ALL","-Djunit_check=true"],
        cwd=dest,log=dest/"generation.json",timeout=120,
        env={"JAVA_HOME":os.environ["JAVA8_HOME"],"PATH":str(Path(os.environ["JAVA8_HOME"])/"bin")+os.pathsep+os.environ.get("PATH","")})
    sources=sorted(tests.rglob("*.java"))
    assert sources,"No EvoSuite output; inspect generation.json"
    out=dest/"classes";out.mkdir()
    cp=os.pathsep.join([str(classes),support_cp()])
    javac=Path(os.environ["JAVA_HOME"])/"bin/javac" if os.environ.get("JAVA_HOME") else "javac"
    run([javac,"-cp",cp,"-d",out,*sources],log=dest/"compile-tests.json")
    run([java(),"-cp",os.pathsep.join([str(out),cp]),"SqaJUnitRunner",dest/"junit.json",*discover_test_classes(sources)],log=dest/"run.json",timeout=120)
    result=json.loads((dest/"junit.json").read_text())
    assert result["passed"],result
    # Mock only Defects4J metadata lookup; real compiler/JUnit/JaCoCo use the fixture.
    with patch("evaluator.classpath",return_value=(str(classes),classes)):
        measured=evaluate_revision(dest,tests,dest/"evaluation","sqa.fixtures.BranchBox")
    assert measured["junit"]["passed"],measured
    assert measured["coverage"]["line_covered"]>0,"EvoSuite classloader lost coverage probes"
    dump(dest/"validation.json",dict(fixture_only=True,algorithm="MOSA",junit_tests=result["run_count"],generation_time_sec=generated["elapsed_sec"]))
    print(f"MOSA real generation and JUnit passed: {result['run_count']} tests; evidence {dest}")

if __name__=="__main__":main()
