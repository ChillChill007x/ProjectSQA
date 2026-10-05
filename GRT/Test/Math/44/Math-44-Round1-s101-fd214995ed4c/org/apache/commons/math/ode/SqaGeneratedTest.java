package org.apache.commons.math.ode;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 0.0D;
    ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).storeTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{0.0D};
    Object v9 = new double[]{};
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 34.18052173682364D;
    Object v7 = new double[]{};
    Object v8 = new double[]{0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).resetEvaluations();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setStateInitialized((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -30;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    Object v6 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v7 = false;
    ((org.apache.commons.math.ode.sampling.StepHandler)v5).handleStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{28.546105304647437D};
    Object v7 = new double[]{-1.684676864310371D,4.307515311158044D,1.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).finalizeStep();
    Object v6 = null;
    Object v7 = new double[]{40.38004017301598D,12.442183435312966D};
    Object v8 = new double[]{0.0D,2.889243335686075D,-32.87257054339152D};
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setEquations(((org.apache.commons.math.ode.ExpandableStatefulODE)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = -35.31704191686974D;
    Object v7 = -2.512203004106189D;
    Object v8 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addEventHandler(((org.apache.commons.math.ode.events.EventHandler)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{2.0D,-38.8220381101664D,4.0D};
    Object v7 = new double[]{-4.072770309847693D,25.909692710346388D,9.278734872159458D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 0.0D;
    ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).setSoftCurrentTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{2.3486368075889166D};
    Object v9 = new double[]{-40.22253020215815D};
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-21.343653722087947D,66.51206863993957D};
    Object v7 = new double[]{1.0D,0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -20;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D,13.647115262622563D,2.0D};
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 47;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 0.0D;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).integrate(((org.apache.commons.math.ode.ExpandableStatefulODE)v5),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 39.458983079374704D;
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 47.097333915420705D;
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 12;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v7 = new double[]{};
    Object v8 = new double[]{};
    Object v9 = 0.32325605959759046D;
    Object v10 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-42.273822449331504D};
    Object v7 = new double[]{1.0D,0.5385309908615397D};
    Object v8 = 10.71682238801929D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{5.307566732052312D,1.0D,32.42352846217957D};
    Object v7 = new double[]{61.57713517878226D,3.0D};
    Object v8 = -9.136718572559923D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 16;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = null;
    Object v8 = 50.948744293379356D;
    Object v9 = new double[]{0.0D};
    Object v10 = 0.0D;
    Object v11 = new double[]{0.0D,-25.52652395993388D,35.43492133925584D};
    Object v12 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).integrate(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),(((java.lang.Double)v10).doubleValue()),((double[])v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 35;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 49;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).copy();
    Object v7 = new double[]{5.0D,1.0D,59.34373799634126D};
    Object v8 = new double[]{-22.312891439080367D,3.495070616776034D,1.0D};
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{1.0D};
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = -0.8634316214069142D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 28;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 11;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 54;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D,-66.6694040571931D,1.0D};
    Object v7 = new double[]{1.0D};
    Object v8 = -1.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 7;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{1.0D,2.649138423812647D,Double.NaN};
    Object v7 = new double[]{16.301506290416373D,0.0D};
    Object v8 = 14.537148918904794D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-27.781215296612526D,-34.72273874915635D};
    Object v7 = new double[]{};
    Object v8 = 8.652513855013343D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{0.0D};
    Object v8 = -53.03661172427247D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 0.0D;
    ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).setInterpolatedTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{0.0D,-7.270266703485952D,41.5214087963934D};
    Object v9 = new double[]{};
    Object v10 = -29.388586886524187D;
    Object v11 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{1.0D};
    Object v8 = -5.728575949265202D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 18;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.sampling.StepHandler)v5).reset();
    Object v6 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).resetEvaluations();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{-41.7525866955388D,0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 38;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -17;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 20.26785118651663D;
    ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).setSoftPreviousTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{0.0D,5.003043103020697D,12.031822905641866D};
    Object v9 = new double[]{0.0D};
    Object v10 = 23.222592145801123D;
    Object v11 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{5.0D,0.0D,11.530223603832246D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 850;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{17.646619937871073D,0.0D,12.357332713823915D};
    Object v7 = new double[]{-37.3257157973165D};
    Object v8 = -18.33694486782615D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 8;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-1.4853642860684992D,11.066034769210303D};
    Object v7 = new double[]{};
    Object v8 = 28.556896862446262D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = null;
    Object v8 = 0.0D;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).integrate(((org.apache.commons.math.ode.ExpandableStatefulODE)v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 37;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{};
    Object v8 = -7.6778626952152855D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v7 = new double[]{-13.172246823165175D};
    Object v8 = new double[]{};
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -3;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 53;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{-1.8498051821075805D,0.0D,0.0D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = null;
    Object v7 = 1.0D;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).sanityChecks(((org.apache.commons.math.ode.ExpandableStatefulODE)v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{24.307140323494984D,0.0D,7.353219004491027D};
    Object v7 = new double[]{0.0D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = -8.849350965280546D;
    ((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5).storeTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{0.0D};
    Object v9 = new double[]{7.116915488655451D,1.0D,0.0D};
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v7 = new double[]{-30.397156907353107D,0.0D,1.0D};
    Object v8 = new double[]{4.294967295E9D};
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = null;
    Object v7 = 33.87775944919744D;
    Object v8 = new double[]{0.0D,62.46853158300112D};
    Object v9 = 52.41810195961281D;
    Object v10 = new double[]{2.0D,12.632241459801266D,14.178946047729877D};
    Object v11 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).integrate(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v6),(((java.lang.Double)v7).doubleValue()),((double[])v8),(((java.lang.Double)v9).doubleValue()),((double[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -36;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{3.710786468418739D};
    Object v7 = new double[]{0.0D,-6.9811183879741921E18D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = null;
    Object v7 = 0.0D;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).sanityChecks(((org.apache.commons.math.ode.ExpandableStatefulODE)v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -37;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = -2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D,1.0D};
    Object v7 = new double[]{1.0D};
    Object v8 = -8.246269228495787D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-16.505034318287905D};
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = -4.2684531127972D;
    Object v9 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator();
    Object v7 = new double[]{0.0D,2.0D,-38.8759390720521D};
    Object v8 = new double[]{};
    Object v9 = -1.0D;
    Object v10 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math.ode.sampling.AbstractStepInterpolator)v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setStateInitialized((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -21;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }
}
