package org.apache.commons.math.ode.events;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v2 = ((org.apache.commons.math.ode.events.EventState)v0).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{-56.95219156632775D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.ode.events.EventState)v4).getMaxCheckInterval();
    org.junit.Assert.assertEquals((Object)(39.25224322870902D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.ode.events.EventState)v4).getMaxIterationCount();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -37.03137830450715D;
    Object v6 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -28.23998416794989D;
    Object v6 = new double[]{-21.397439898573698D,0.0D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 55.089096606083444D;
    Object v6 = new double[]{40.536931476974715D,0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).getEventHandler();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v6 = ((org.apache.commons.math.ode.sampling.StepInterpolator)v5).getInterpolatedTime();
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.ode.events.EventState)v4).getEventHandler();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.2811344516405834D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v6 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -10.188715539105713D;
    Object v6 = new double[]{0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 1.0D;
    Object v9 = new double[]{1.0D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.5061906376881709D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -31.903011827881166D;
    Object v6 = new double[]{1.0D,29.4810015575928D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 0.0D;
    Object v9 = new double[]{2.0D,0.0D,1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.ode.events.EventState)v4).getEventTime();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v6 = 23.280684253220926D;
    ((org.apache.commons.math.ode.sampling.StepInterpolator)v5).setInterpolatedTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 38.82310512038056D;
    Object v6 = new double[]{0.0D,35.760619357051226D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{13.683625027688564D,1.0D,1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{46.948586109572275D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = -30.372815937179663D;
    Object v9 = new double[]{0.0D,15.4912995501784D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -57.68884021151937D;
    Object v6 = new double[]{2.0D,0.0D,-8.833949095140632D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{-22.536180157165237D,2.0D,14.211945293576866D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -2.1561455694904534D;
    Object v6 = new double[]{-8.835283887414551D,0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -10.713645665540758D;
    Object v6 = new double[]{-50.81732047727794D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 31.29400995970143D;
    Object v6 = new double[]{-13.607716053108561D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.11112783920145253D;
    Object v6 = new double[]{-32.519456146453805D,1.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{1.6085708403087349D,54.74662791846254D,29.373813785400262D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{16.0258497252854D,22.170921184551304D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.ode.events.EventState)v4).getConvergence();
    org.junit.Assert.assertEquals((Object)(12.309308709601185D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 3.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = -9.791972479968107D;
    Object v9 = new double[]{0.0D,1.0D};
    Object v10 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v8).doubleValue()),((double[])v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -58.98799800274917D;
    Object v6 = new double[]{3.374530152064464D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 35.96151269967742D;
    Object v6 = new double[]{0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -5.259160074962057D;
    Object v6 = new double[]{22.04674031240533D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 9.75496217258927D;
    Object v9 = new double[]{1.0D,2.0D,29.43565345849832D};
    Object v10 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v8).doubleValue()),((double[])v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{-23.443604718238156D,38.11961530882972D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D,0.0D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -10.383788034074895D;
    Object v6 = new double[]{0.0D,19.0232963088862D,-47.670147786744636D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 1.7445507649608838D;
    Object v9 = new double[]{2.8729056664314383D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2.0D;
    Object v6 = new double[]{-29.88175373438854D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -48.56454778719583D;
    Object v6 = new double[]{0.0D,0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{-10.378246673829299D,23.481449566337417D,8.146152464348365D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 0.0D;
    Object v9 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2.0D;
    Object v6 = new double[]{-22.825784678367995D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -25.119117008067295D;
    Object v6 = new double[]{17.92219895896297D,1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -30.23692817315633D;
    Object v6 = new double[]{0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 19.834699803501415D;
    Object v6 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{1.0D,0.0D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -8.850735202686085D;
    Object v6 = new double[]{0.0D,-11.788759316612802D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{22.771231603114046D,87.2856725234186D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 60.69557225722607D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 3.1999383130267356D;
    Object v9 = new double[]{0.0D,15.669627763644591D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -18.046562184374178D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 72.73326488802816D;
    Object v6 = new double[]{-4.31170346300726D,53.001524492172635D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 30.878594326792104D;
    Object v6 = new double[]{11.558098655928937D,-24.86566807704241D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -15.935381066422849D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 23.91942545571357D;
    Object v6 = new double[]{7.712149821922511D,3.8104262343644066D,1.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).getMaxIterationCount();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -16.851391447772926D;
    Object v6 = new double[]{1.0D,58.18777199363745D,8.39895238200091D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{23.57949498898185D,3.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{1.0D,2.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -18.527104541527528D;
    Object v6 = new double[]{0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -13.598387508437705D;
    Object v6 = new double[]{0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.0D,-25.456809093142855D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 2.0D;
    Object v9 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -23.68592637806001D;
    Object v6 = new double[]{2.0D,-6.592144068844975D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{42.80026858320471D,0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 49.53016187810739D;
    Object v6 = new double[]{11.015548220582955D,-36.98791163342709D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2.416629408295607D;
    Object v6 = new double[]{51.35382373798969D,14.274526709510582D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{-2.551571863686856D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{56.16707515804794D,-22.400090450178297D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -78.42001643796672D;
    Object v6 = new double[]{7.359396247134391D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -27.185541596830628D;
    Object v6 = new double[]{52.165696940285024D,0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -10.40389778210662D;
    Object v6 = new double[]{-59.721062271751876D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D,38.959223600323114D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{27.13249458096906D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 10.0D;
    Object v6 = new double[]{62.28390190175838D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{-6.451196563174089D,-17.920640768415947D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = Double.NaN;
    Object v6 = new double[]{0.0D,-20.19425022659757D,1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -4.51592504518258D;
    Object v6 = new double[]{1.0D,69.22798960123556D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new org.apache.commons.math.ode.sampling.DummyStepInterpolator();
    Object v9 = ((org.apache.commons.math.ode.sampling.StepInterpolator)v8).copy();
    Object v10 = ((org.apache.commons.math.ode.events.EventState)v4).evaluateStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 3.5027334162506394D;
    Object v6 = new double[]{0.0D,0.0D,39.522781078307055D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{2.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -18.95616986305575D;
    Object v6 = new double[]{10.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 31.969903215311795D;
    Object v6 = new double[]{-30.59205237108616D,0.0D,0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 0.0D;
    Object v9 = new double[]{1.0D,1.0D,0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -34.72273874915635D;
    Object v6 = new double[]{};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{9.652513855013343D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{-69.16614705258877D,28.046652194132925D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).getMaxIterationCount();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -30.06671897458254D;
    Object v6 = new double[]{1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2.0D;
    Object v6 = new double[]{0.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = ((org.apache.commons.math.ode.events.EventState)v4).stop();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D,0.0D,18.557535611591604D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 0.0D;
    Object v9 = new double[]{1.0D,48.63417696619722D,13.486688669218392D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0.0D;
    Object v6 = new double[]{-0.8644656470102964D,1.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 61.386146819653774D;
    Object v6 = new double[]{0.0D};
    ((org.apache.commons.math.ode.events.EventState)v4).reinitializeBegin((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1.0D;
    Object v6 = new double[]{1.0D,2.0D,1.0D};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 75.1779288065364D;
    Object v9 = new double[]{};
    Object v10 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v8).doubleValue()),((double[])v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 39.25224322870902D;
    Object v2 = 12.309308709601185D;
    Object v3 = 1;
    Object v4 = new org.apache.commons.math.ode.events.EventState(((org.apache.commons.math.ode.events.EventHandler)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -14.777365053106504D;
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.ode.events.EventState)v4).reset((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = 1.0D;
    Object v9 = new double[]{1.0D,2.0D,4.973211366369475D};
    ((org.apache.commons.math.ode.events.EventState)v4).stepAccepted((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
