package org.apache.commons.math.ode.nonstiff;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -15.45255681665969D;
    Object v6 = new double[]{1.0D,45.93786025176168D};
    Object v7 = new double[]{-2.786070440569023D,1.0D,8.926225861753831D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -11;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = new double[]{42.37627502777264D,24.362569762411084D,0.0D};
    Object v9 = new double[]{11.526740110128179D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v7).doubleValue()),((double[])v8),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.ode.DerivativeException");
    } catch (org.apache.commons.math.ode.DerivativeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{-19.911956973265056D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).computeDerivatives((((java.lang.Double)v2).doubleValue()),((double[])v3),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{2.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -8.500222355916177D;
    Object v6 = new double[]{0.0D,1.0D,0.0D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 6;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{51.915641048949986D,0.0D,-3.9143335263426753D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 29;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 26;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 27;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = -62.85087880840324D;
    Object v8 = new double[]{};
    Object v9 = new double[]{1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v7).doubleValue()),((double[])v8),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{27.97587445461555D,1.0D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = new double[]{0.0D,10.371730012257887D,-3.9583522085770673D};
    Object v4 = new double[]{53.86686087803414D,-47.48856766847814D,0.12880212929199664D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).computeDerivatives((((java.lang.Double)v2).doubleValue()),((double[])v3),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 4;
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).setMaxEvaluations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -2.5824139685523235D;
    Object v6 = new double[]{-20.509131416418484D,0.0D,-2.642247531366282D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 60;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 38;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Gragg-Bulirsch-Stoer"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.8807735288911642D;
    Object v6 = new double[]{0.0D,-18.967379724943758D};
    Object v7 = new double[]{-65.07168395370266D,0.0D,-40.378201752074794D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = 38.79086838157548D;
    Object v8 = new double[]{};
    Object v9 = new double[]{0.0D,1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v7).doubleValue()),((double[])v8),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -23;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -42.032307597499376D;
    Object v6 = new double[]{0.0D,-23.71586745394082D};
    Object v7 = new double[]{-25.074239434278237D,-10.234272004919811D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 3;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D,-21.994904036357187D};
    Object v7 = new double[]{1.0D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).setMaxEvaluations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{17.939732502890312D,-3.1237793589776235D,18.834699803501415D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{1.0D,0.0D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{1.0D,-9.850735202686085D};
    Object v7 = new double[]{1.0D,0.0D,8.736108445073281D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.ode.AbstractIntegrator)v1).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{-11.585071832950971D,0.0D};
    Object v7 = new double[]{-1.658047228160731D,-44.15121102138776D,6.54005496291336D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{-40.09147196217659D,0.0D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{35.993185606317894D};
    Object v7 = new double[]{-15.294707199034248D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 54.777461518024346D;
    Object v6 = new double[]{6.112737669491801D};
    Object v7 = new double[]{0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = -2.475402353339831D;
    Object v7 = 0.0D;
    Object v8 = -8;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addEventHandler(((org.apache.commons.math.ode.events.EventHandler)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = 1.6492525217124534D;
    Object v8 = -25;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addEventHandler(((org.apache.commons.math.ode.events.EventHandler)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{1.0D,0.0D,3.0D};
    Object v7 = new double[]{0.0D,8.057025503647255D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 17;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = new double[]{1.0D,43.980568473501116D,0.0D};
    Object v4 = new double[]{0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).computeDerivatives((((java.lang.Double)v2).doubleValue()),((double[])v3),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -27;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -23.600675877574737D;
    Object v6 = new double[]{50.74440752758339D};
    Object v7 = new double[]{78.6687140573829D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = -17.43685632268828D;
    Object v7 = 0.0D;
    Object v8 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addEventHandler(((org.apache.commons.math.ode.events.EventHandler)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 1.0D;
    Object v7 = new double[]{-20.26873588616874D,-48.45863957147241D};
    Object v8 = new double[]{56.76574508718038D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -49.99568097457675D;
    Object v6 = new double[]{0.0D,-8.261807906322831D};
    Object v7 = new double[]{0.0D,1.0D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{58.024965040276754D,0.0D,0.0D};
    Object v7 = new double[]{0.0D,-58.6152246896438D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{-24.076262352287642D,46.2435387962492D,-12.508147625365138D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = new double[]{-14.26624004815749D};
    Object v9 = new double[]{10.888802674939143D,0.0D,-46.9736910295879D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v7).doubleValue()),((double[])v8),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).clearEventHandlers();
    Object v2 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).clearStepHandlers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -10.51912334815761D;
    Object v6 = new double[]{0.0D,-25.78222265524386D};
    Object v7 = new double[]{-4.51592504518258D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 0.9485737180129536D;
    Object v7 = new double[]{1.0D};
    Object v8 = new double[]{Double.NaN,1.0D,-6.982176610219224D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = -13.47491693826563D;
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new double[]{13.144893017067455D,42.42031840922581D,12.302923801392115D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).computeDerivatives((((java.lang.Double)v2).doubleValue()),((double[])v3),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{-35.097152696047644D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -34;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 28.682524749167495D;
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = new double[]{0.0D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 14.436891236488115D;
    Object v6 = new double[]{1.0D,0.0D,2.0D};
    Object v7 = new double[]{0.0D,0.0D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{0.0D,2.8005922645707244D,1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    Object v3 = new double[]{0.0D,0.0D,-32.78267442048978D};
    Object v4 = new double[]{1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).computeDerivatives((((java.lang.Double)v2).doubleValue()),((double[])v3),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{1.0D,12.259440949137936D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).computeDerivatives((((java.lang.Double)v2).doubleValue()),((double[])v3),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = -21.52762547311693D;
    Object v8 = new double[]{-0.14504443551751414D};
    Object v9 = new double[]{1.0D,2.6809789035804963D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v7).doubleValue()),((double[])v8),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{-4.27515725742652D,0.0D,-0.5416720258584881D};
    Object v7 = new double[]{20.070885426355193D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -30;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 24;
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).setMaxEvaluations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = 27;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addEventHandler(((org.apache.commons.math.ode.events.EventHandler)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = 0.0D;
    Object v11 = new double[]{};
    Object v12 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v10).doubleValue()),((double[])v11),((double[])v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -25.82097464373455D;
    Object v6 = new double[]{1.0D,0.0D,0.0D};
    Object v7 = new double[]{-66.55170134247966D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(1.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = -20.598111355922665D;
    Object v7 = new double[]{16.49883013898549D,-21.005429342519438D};
    Object v8 = new double[]{42.139985156731D,0.0D,1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -11.994003477728732D;
    Object v1 = new org.apache.commons.math.ode.nonstiff.EulerIntegrator((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v1).setMaxEvaluations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -39;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 15.425676900626302D;
    Object v6 = new double[]{1.0D};
    Object v7 = new double[]{1.0D,40.71338659539487D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = new double[]{};
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = new org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }
}
