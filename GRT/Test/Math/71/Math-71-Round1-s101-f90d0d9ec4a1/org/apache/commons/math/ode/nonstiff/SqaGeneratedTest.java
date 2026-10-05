package org.apache.commons.math.ode.nonstiff;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMinReduction();
    org.junit.Assert.assertEquals((Object)(0.2D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{25.10733809825744D};
    Object v7 = new double[]{-0.9064738921362309D,4.0D,0.0D};
    Object v8 = 9.818436564113101D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Dormand-Prince 8 (5, 3)"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = new double[][]{null,null};
    Object v7 = new double[]{0.0D};
    Object v8 = new double[]{1.0D,-56.95219156632775D};
    Object v9 = -36.03137830450715D;
    Object v10 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -47.42181005884372D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Dormand-Prince 8 (5, 3)"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMinReduction((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = 6.806886909261179D;
    Object v7 = new double[]{};
    Object v8 = new double[]{1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -28;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -9;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = null;
    Object v7 = false;
    Object v8 = -14;
    Object v9 = new double[]{8.011087561606166D,0.0D};
    Object v10 = 0.0D;
    Object v11 = new double[]{-26.20488999805769D};
    Object v12 = new double[]{0.0D};
    Object v13 = new double[]{-26.20488999805769D};
    Object v14 = new double[]{};
    Object v15 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Integer)v8).intValue()),((double[])v9),(((java.lang.Double)v10).doubleValue()),((double[])v11),((double[])v12),((double[])v13),((double[])v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMaxStep();
    org.junit.Assert.assertEquals((Object)(48.589278342601325D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 19.219305758508636D;
    Object v7 = new double[]{};
    Object v8 = 1.0D;
    Object v9 = new double[]{2.0D,0.0D};
    Object v10 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).integrate(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v5),(((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{-33.96368961234598D};
    Object v7 = new double[]{0.0D,Double.NaN,26.794771631418303D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{35.712126597206655D,0.0D,2.0D};
    Object v7 = new double[]{28.812476036159044D,13.930083536706247D,0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 5;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 4.534461128469775D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMaxGrowth();
    org.junit.Assert.assertEquals((Object)(10.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMaxGrowth((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 12.888367720739394D;
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMaxGrowth((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setSafety((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -22.536180157165237D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 15.75016113086387D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setSafety((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 14.822798244338037D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMinReduction((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMaxGrowth();
    org.junit.Assert.assertEquals((Object)(10.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{0.0D,5.04794701719115D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{};
    Object v6 = new double[]{-3.170264642054839D,Double.NaN};
    Object v7 = new double[]{0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 9.799331394076768D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMinReduction((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = -46.03350879657651D;
    Object v7 = new double[]{-2.241388581421979D};
    Object v8 = 16.0258497252854D;
    Object v9 = new double[]{1.0D,1.0D};
    Object v10 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).integrate(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v5),(((java.lang.Double)v6).doubleValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = 1.0D;
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = new double[]{0.0D,22.170921184551304D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null};
    Object v6 = new double[]{3.493450097482484D,0.0D,0.0D};
    Object v7 = new double[]{0.0D,-14.718510029360178D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{-27.519753771734884D,0.0D};
    Object v7 = new double[]{25.60254252260673D,-28.49181280400925D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 27.511216049912104D;
    Object v7 = 0.0D;
    Object v8 = 45;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addEventHandler(((org.apache.commons.math.ode.events.EventHandler)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMinStep();
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getSafety();
    org.junit.Assert.assertEquals((Object)(0.9D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(6.970601002969638D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{-11.54304518043821D};
    Object v8 = -6.727756438216798D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 6.7128909406684D;
    Object v6 = new double[]{0.0D,2.4863948937473617D,50.97514037224551D};
    Object v7 = new double[]{Double.POSITIVE_INFINITY,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{-22.825784678367995D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMinStep();
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -25.119117008067295D;
    Object v6 = new double[]{0.0D,0.0D};
    Object v7 = new double[]{0.0D,-10.73597184357242D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{4.9602690110762255D,60.82511562455844D};
    Object v7 = new double[]{0.0D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -17;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMinReduction();
    org.junit.Assert.assertEquals((Object)(0.2D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null};
    Object v6 = new double[]{33.1088609505892D,0.0D};
    Object v7 = new double[]{20.09599005031571D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{-9.011192798615264D,0.0D};
    Object v8 = 47.73049708640726D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(6.970601002969638D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{1.0D};
    Object v7 = new double[]{};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 8;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null,null};
    Object v6 = new double[]{0.0D,0.0D,0.0D};
    Object v7 = new double[]{0.0D,1.0D,1.0D};
    Object v8 = 9.881488184269603D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{Double.NaN};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -13.598387508437705D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{1.0D,-32.907027103241035D,-12.919311512085047D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 67.6799598312996D;
    Object v6 = new double[]{2.0D,0.0D,22.87824645264836D};
    Object v7 = new double[]{39.29942442672663D,1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null};
    Object v6 = new double[]{-100.79503188150343D};
    Object v7 = new double[]{};
    Object v8 = 6.163891320889915D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = -33.07539358765019D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = false;
    Object v7 = 0;
    Object v8 = new double[]{};
    Object v9 = 33.41924993745744D;
    Object v10 = new double[]{0.0D,-33.16231150552924D};
    Object v11 = new double[]{};
    Object v12 = new double[]{0.0D};
    Object v13 = new double[]{-39.21724500374312D};
    Object v14 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Integer)v7).intValue()),((double[])v8),(((java.lang.Double)v9).doubleValue()),((double[])v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 34;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMaxStep();
    org.junit.Assert.assertEquals((Object)(48.589278342601325D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null};
    Object v6 = new double[]{32.58440336247011D,-1.9853001052818544D};
    Object v7 = new double[]{1.0D,0.0D,26.492892161025207D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -42.33156455024935D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 36.513799029444776D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{};
    Object v6 = new double[]{1.0D,-16.261366016821512D};
    Object v7 = new double[]{0.0D};
    Object v8 = -47.19413920708863D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 14.976342342813018D;
    Object v6 = new double[]{0.0D,28.284915425093978D};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -14.26624004815749D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 3;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 23.441182976444694D;
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{-26.17251331851814D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 5.12190108124D;
    Object v6 = new double[]{};
    Object v7 = new double[]{0.9485737180129536D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new org.apache.commons.math.ode.ContinuousOutputModel();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -9.16248843952262D;
    Object v6 = new double[]{};
    Object v7 = new double[]{-34.35392544391484D,28.682524749167495D,53.61819999654096D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMaxGrowth();
    org.junit.Assert.assertEquals((Object)(10.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2.0D;
    Object v6 = new double[]{-36.42735182390328D,0.0D};
    Object v7 = new double[]{-1.495864708323794D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{0.0D,1.0D,-11.472427109155705D};
    Object v7 = new double[]{13.182740924873205D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = true;
    Object v7 = -7;
    Object v8 = new double[]{};
    Object v9 = 5.0D;
    Object v10 = new double[]{25.49621044105597D,25.524899272153814D};
    Object v11 = new double[]{0.0D,-3.555667586792291D,-27.582708269601095D};
    Object v12 = new double[]{39.203285100042955D,-65.92533289591518D};
    Object v13 = new double[]{1.0D,14.30800748136346D,0.12636370149529397D};
    Object v14 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep(((org.apache.commons.math.ode.FirstOrderDifferentialEquations)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Integer)v7).intValue()),((double[])v8),(((java.lang.Double)v9).doubleValue()),((double[])v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{};
    Object v6 = new double[]{-39.7525866955388D,0.0D};
    Object v7 = new double[]{0.0D,37.4296841200537D};
    Object v8 = 2.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{-21.266505945517725D,0.0D,0.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 4.073550759863979D;
    Object v7 = new double[]{-7.953788933307788D};
    Object v8 = new double[]{7.228121218639998D,-8.427181797239461D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
