package sqa.grt;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import sqa.fixtures.BranchBox;
import sqa.fixtures.Helper;

/** Behavioral checks of pool reuse, feedback and source statistics, beyond component counters. */
public class GRTMechanismsTest {
  GuidedRandom engine() throws Exception {
    Map<String,Object> c=new HashMap<>();c.put("target","sqa.fixtures.BranchBox");c.put("seed",101);
    c.put("class_root",System.getProperty("sqa.fixture.classes"));
    c.put("output",System.getProperty("java.io.tmpdir"));c.put("budget_seconds",60);
    return new GuidedRandom(c);
  }
  @Test public void repeatedConstantsRetainOccurrenceFrequency() throws Exception {
    GuidedRandom g=engine();try {
      g.mineConstants();Object constant=42;
      int tf=0,df=0;
      for(Map<Object,Integer> c:g.constants.values()){tf+=c.getOrDefault(constant,0);if(c.containsKey(constant))df++;}
      assertTrue("fixture needs repetitions within a class",tf>df);
      double d=g.constants.size();
      assertEquals(tf*Math.log((d+1)/(d+1-df)),g.globalWeights.get(constant),1e-10);
    }finally{g.executor.shutdownNow();}
  }
  @Test public void runtimeTypeEnablesSubtypeInputReuse() throws Exception {
    GuidedRandom g=engine();try {
      GuidedRandom.Seq seq=new GuidedRandom.Seq();seq.steps.add(new GuidedRandom.Step(BranchBox.class.getMethod("factory"),new int[0]));seq.result=0;
      GuidedRandom.Outcome result=g.execute(seq);assertNull(result.exception);
      seq.runtimeType=result.value.getClass();g.addPool(g.mainPool,seq);
      assertEquals(Object.class,BranchBox.class.getMethod("factory").getReturnType());
      assertEquals(1,g.matching(BranchBox.class,g.mainPool).size());
    }finally{g.executor.shutdownNow();}
  }
  @Test public void detectiveExecutesAndPromotesMissingInput() throws Exception {
    GuidedRandom g=engine();try {
      assertTrue(g.mainPool.isEmpty());
      GuidedRandom.Seq seq=g.detective(Helper.class,BranchBox.class,0,new HashSet<>());
      assertNotNull(seq);assertTrue(g.execute(seq).value instanceof Helper);
      assertFalse(g.secondaryPool.isEmpty());assertFalse(g.mainPool.isEmpty());
    }finally{g.executor.shutdownNow();}
  }
  @Test public void purityDistinguishesFieldMutationFromRead() throws Exception {
    GuidedRandom g=engine();try {
      assertFalse(g.pure(BranchBox.class.getMethod("set",int.class)));
      assertTrue(g.pure(BranchBox.class.getMethod("get")));
    }finally{g.executor.shutdownNow();}
  }
  @Test public void orienteeringFavorsCheaperEquivalentSequence() throws Exception {
    GuidedRandom g=engine();try {
      GuidedRandom.Seq cheap=new GuidedRandom.Seq(),expensive=new GuidedRandom.Seq();cheap.nanos=1;expensive.nanos=1000;
      int selected=0;for(int i=0;i<1000;i++)if(g.chooseSequence(Arrays.asList(cheap,expensive))==cheap)selected++;
      assertTrue(selected>950);
    }finally{g.executor.shutdownNow();}
  }
  @Test public void bloodhoundUsesLiveBranchFeedbackAndResetsCounts() throws Exception {
    GuidedRandom g=engine();try {
      org.jacoco.agent.rt.RT.getAgent().reset();g.updateCoverage(true);
      Method m=BranchBox.class.getMethod("branch",int.class);double before=g.uncovered.get(GuidedRandom.key(m));
      BranchBox.branch(42);BranchBox.branch(-1);BranchBox.branch(0);
      g.selections.put(m,9);g.updateCoverage(true);
      assertTrue(before>g.uncovered.get(GuidedRandom.key(m)));
      assertEquals(Integer.valueOf(0),g.selections.get(m));
    }finally{g.executor.shutdownNow();}
  }
}
