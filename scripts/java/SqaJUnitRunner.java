import sqa.support.SqaJson;
import java.nio.file.*;
import java.util.*;
import org.junit.runner.*;
import org.junit.runner.notification.*;

/** Machine-readable evidence from actual JUnit execution, independent of console strings. */
public class SqaJUnitRunner {
  public static void main(String[] args) throws Exception {
    Map<String,Object> report = new LinkedHashMap<>();
    List<Map<String,Object>> failures = new ArrayList<>();
    List<String> tests = new ArrayList<>();
    JUnitCore core = new JUnitCore();
    core.addListener(new RunListener() {
      public void testStarted(Description d) { tests.add(d.getClassName()+"::"+d.getMethodName()); }
      public void testFailure(Failure f) {
        Map<String,Object> entry = new LinkedHashMap<>();
        entry.put("test", f.getDescription().getClassName()+"::"+f.getDescription().getMethodName());
        entry.put("exception", f.getException().getClass().getName());
        entry.put("message", f.getMessage()); entry.put("trace", f.getTrace()); failures.add(entry);
      }
    });
    List<Class<?>> classes = new ArrayList<>();
    for (int i=1;i<args.length;i++) classes.add(Class.forName(args[i], false, SqaJUnitRunner.class.getClassLoader()));
    Result result = core.run(classes.toArray(new Class<?>[0]));
    report.put("run_count",result.getRunCount()); report.put("ignored_count",result.getIgnoreCount());
    report.put("assumption_failure_count",result.getAssumptionFailureCount());
    report.put("runtime_ms",result.getRunTime()); report.put("tests",tests); report.put("failures",failures);
    report.put("passed",result.wasSuccessful() && result.getRunCount()>0 && result.getAssumptionFailureCount()==0);
    Files.writeString(Path.of(args[0]),SqaJson.write(report));
  }
}
