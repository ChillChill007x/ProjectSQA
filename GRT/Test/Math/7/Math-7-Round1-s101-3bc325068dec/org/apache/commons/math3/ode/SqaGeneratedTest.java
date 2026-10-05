package org.apache.commons.math3.ode;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -12.994003477728732D;
    Object v6 = new double[]{};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{10.008888440480298D,-6.096366852489794D,0.0D};
    Object v7 = 2.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 22;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -4.317231722165737D;
    Object v6 = null;
    Object v7 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.INCREMENT;
    Object v8 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.NEITHER;
    Object v9 = new org.apache.commons.math3.ode.sampling.StepNormalizer((((java.lang.Double)v5).doubleValue()),((org.apache.commons.math3.ode.sampling.FixedStepHandler)v6),((org.apache.commons.math3.ode.sampling.StepNormalizerMode)v7),((org.apache.commons.math3.ode.sampling.StepNormalizerBounds)v8));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math3.ode.sampling.StepHandler)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -13;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v7 = 25.437708113477452D;
    ((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v6).setInterpolatedTime((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    Object v9 = new double[]{};
    Object v10 = new double[]{-29.206163939431597D};
    Object v11 = -21.2332492370366D;
    Object v12 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v6),((double[])v9),((double[])v10),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-27.465734605792584D,-7.149514784532526D,-14.906902650847318D};
    Object v7 = new double[]{28.352117581238296D};
    Object v8 = -8.500222355916177D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{6.842533562818952D};
    Object v7 = new double[]{2.0D,50.47739115323097D,26.794771631418303D};
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 28.455980587569233D;
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-20.290765971716525D};
    Object v7 = new double[]{-13.71888855088967D,0.7674333537731869D,0.0D};
    Object v8 = 4.534461128469775D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 12.888367720739394D;
    Object v7 = new double[]{-35.617413523690836D};
    Object v8 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -10;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 15;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setStateInitialized((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -37;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v7 = new double[]{1.0D,22.494996627757928D,88.60783364436269D};
    Object v8 = new double[]{};
    Object v9 = -24.200823369026516D;
    Object v10 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 4;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 1.0D;
    ((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5).setSoftCurrentTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{-16.967379724943758D};
    Object v9 = new double[]{-65.07168395370266D,0.0D,-38.378201752074794D};
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = 22.41532028726412D;
    Object v7 = new double[]{0.0D,1.0D,-70.83994142779672D};
    Object v8 = 13.017783820047667D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 28;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{36.25419173704955D};
    Object v7 = -34.086562237074304D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -57;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -50;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{1.0D,0.0D,7.872905666431438D};
    Object v7 = new double[]{-29.88175373438854D,0.0D,35.66615493247935D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-36.8080229568046D,0.0D,-9.256466788758798D};
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{-15.099158736255703D,-2.447018882955848D,-4.823230760588268D};
    Object v7 = -7.677009866829908D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 51.61846449303282D;
    Object v6 = new double[]{-45.18310590604862D};
    Object v7 = 1.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.0D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.5D,0.0D};
    Object v7 = new double[]{};
    Object v8 = -13.634907689748003D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -11.059799380123813D;
    Object v6 = new double[]{1.0D,1.0D};
    Object v7 = 2.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -24.86566807704241D;
    Object v6 = new double[]{1.0D,-17.93538106642285D,-11.955064052960338D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = 7.279256248775402D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 35.993185606317894D;
    Object v7 = new double[]{-14.294707199034248D,0.0D};
    Object v8 = new double[]{11.71682238801929D,6.307566732052312D,0.0D};
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -4.317231722165737D;
    Object v6 = null;
    Object v7 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.INCREMENT;
    Object v8 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.NEITHER;
    Object v9 = new org.apache.commons.math3.ode.sampling.StepNormalizer((((java.lang.Double)v5).doubleValue()),((org.apache.commons.math3.ode.sampling.FixedStepHandler)v6),((org.apache.commons.math3.ode.sampling.StepNormalizerMode)v7),((org.apache.commons.math3.ode.sampling.StepNormalizerBounds)v8));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math3.ode.sampling.StepHandler)v9));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 0.0D;
    ((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5).setSoftCurrentTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{53.405170497659306D,0.0D,1.0D};
    Object v9 = new double[]{0.0D,41.4218160197708D};
    Object v10 = 3.4076613107674745D;
    Object v11 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{0.0D};
    Object v8 = 5.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{25.02158000614798D,2.0D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -7.946626672402804D;
    Object v6 = new double[]{35.93271410135373D,18.728977370292444D,12.821581894365787D};
    Object v7 = 1.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -24.679856285766693D;
    Object v6 = new double[]{};
    Object v7 = -3.7571648717460264D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{35.17401966516439D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = new double[]{1.0D,-15.194322721657784D,0.0D};
    Object v9 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v7).doubleValue()),((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v7 = new double[]{54.56130582287351D};
    Object v8 = new double[]{-15.260239354896038D,11.598896925073714D};
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -4.317231722165737D;
    Object v6 = null;
    Object v7 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.INCREMENT;
    Object v8 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.NEITHER;
    Object v9 = new org.apache.commons.math3.ode.sampling.StepNormalizer((((java.lang.Double)v5).doubleValue()),((org.apache.commons.math3.ode.sampling.FixedStepHandler)v6),((org.apache.commons.math3.ode.sampling.StepNormalizerMode)v7),((org.apache.commons.math3.ode.sampling.StepNormalizerBounds)v8));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math3.ode.sampling.StepHandler)v9));
    Object v10 = null;
    Object v11 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = -4.626011967083333D;
    Object v7 = new double[]{};
    Object v8 = -55.23377641392501D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = -19.370048705350726D;
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = null;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setEquations(((org.apache.commons.math3.ode.ExpandableStatefulODE)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 13;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 42;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{-27.857870931094844D,-12.933189813642556D};
    Object v7 = 1.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -11;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -20.72925956514306D;
    Object v6 = new double[]{13.182740924873205D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{-7.228244325720226D,20.3507500997151D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 26.695488369294466D;
    Object v6 = new double[]{0.0D,-31.479057621750826D};
    Object v7 = 19.12002389518301D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = new double[]{0.0D};
    Object v8 = -31.17977141588324D;
    Object v9 = new double[]{11.396918967587503D,3.373821182724995D};
    Object v10 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).integrate(((org.apache.commons.math3.ode.FirstOrderDifferentialEquations)v5),(((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -17.620087763258624D;
    Object v6 = new double[]{};
    Object v7 = 2.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = 2.0D;
    Object v7 = new double[]{-14.633234114860297D,1.0D};
    Object v8 = 46.86887694756866D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -4.317231722165737D;
    Object v6 = null;
    Object v7 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.INCREMENT;
    Object v8 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.NEITHER;
    Object v9 = new org.apache.commons.math3.ode.sampling.StepNormalizer((((java.lang.Double)v5).doubleValue()),((org.apache.commons.math3.ode.sampling.FixedStepHandler)v6),((org.apache.commons.math3.ode.sampling.StepNormalizerMode)v7),((org.apache.commons.math3.ode.sampling.StepNormalizerBounds)v8));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math3.ode.sampling.StepHandler)v9));
    Object v10 = null;
    Object v11 = 26.672661187973333D;
    Object v12 = new double[]{29.50894975434798D,0.0D};
    Object v13 = 1.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v11).doubleValue()),((double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{-4.197961016798724D};
    Object v8 = -12.49601450709974D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{9.47210519500568D,32.28148908429324D};
    Object v7 = new double[]{-9.133166754951855D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = 0.0D;
    ((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5).setSoftCurrentTime((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new double[]{2.1474836346107707E9D,28.773787045978104D,0.0D};
    Object v9 = new double[]{0.0D};
    Object v10 = -17.045240984095688D;
    Object v11 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-13.195342321388328D,32.588964880686916D};
    Object v7 = new double[]{35.302572553537075D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 12;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -4.317231722165737D;
    Object v6 = null;
    Object v7 = org.apache.commons.math3.ode.sampling.StepNormalizerMode.INCREMENT;
    Object v8 = org.apache.commons.math3.ode.sampling.StepNormalizerBounds.NEITHER;
    Object v9 = new org.apache.commons.math3.ode.sampling.StepNormalizer((((java.lang.Double)v5).doubleValue()),((org.apache.commons.math3.ode.sampling.FixedStepHandler)v6),((org.apache.commons.math3.ode.sampling.StepNormalizerMode)v7),((org.apache.commons.math3.ode.sampling.StepNormalizerBounds)v8));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math3.ode.sampling.StepHandler)v9));
    Object v10 = null;
    Object v11 = -23.715757367029664D;
    Object v12 = new double[]{-2.5343804060556776D,1.0D};
    Object v13 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v11).doubleValue()),((double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 36;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{};
    Object v8 = 57.180905105563255D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = new double[]{1.998746733864326D,-4.4187079585172055D};
    Object v8 = 15.314667787877653D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 1.0D;
    Object v7 = new double[]{-51.37738389306046D};
    Object v8 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-11.052536105150795D,-38.17770329414347D,0.0D};
    Object v7 = new double[]{0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{-27.280954422090762D,0.0D,-14.286545148660366D};
    Object v7 = new double[]{0.0D,23.575906046728853D};
    Object v8 = 1.439711303426158D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.0D,0.0D};
    Object v7 = 1.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -23.81580415841585D;
    Object v6 = new double[]{1.0D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 0;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{1.0D,-50.717040667256626D,-14.231978960059347D};
    Object v7 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).initIntegration((((java.lang.Double)v5).doubleValue()),((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 0.0D;
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).integrate(((org.apache.commons.math3.ode.ExpandableStatefulODE)v5),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{-36.23698375340545D};
    Object v7 = new double[]{-74.96063199678784D,41.91387306086511D};
    ((org.apache.commons.math3.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{};
    Object v7 = new double[]{-5.476424371868388D,1.0D,0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{15.310554363343853D,1.0D,0.0D};
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,1.0D};
    Object v4 = new org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator();
    Object v6 = new double[]{1.0D};
    Object v7 = new double[]{0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.ode.AbstractIntegrator)v4).acceptStep(((org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
