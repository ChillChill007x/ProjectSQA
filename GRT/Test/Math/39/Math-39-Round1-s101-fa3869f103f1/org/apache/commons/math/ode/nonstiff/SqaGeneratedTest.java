package org.apache.commons.math.ode.nonstiff;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null,null};
    Object v6 = new double[]{24.10733809825744D,0.0D,8.574283783216543D};
    Object v7 = new double[]{29.73077905978319D,1.6356556208652138D};
    Object v8 = -11.994003477728732D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 25.82318643773622D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMaxGrowth((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 15;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0.0D;
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
  public void test7() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0.0D;
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
  public void test9() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).integrate(((org.apache.commons.math.ode.ExpandableStatefulODE)v5),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getCurrentSignedStepsize();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getName();
    org.junit.Assert.assertEquals((Object)("Dormand-Prince 8 (5, 3)"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    Object v6 = 13.575653407124548D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = 11.385087131485014D;
    Object v10 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = new double[]{0.0D};
    Object v7 = new double[]{1.0D,1.0D,1.0D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 1;
    Object v7 = new double[]{6.192227342396837D,-6.981062314754047D};
    Object v8 = 10.041992858490703D;
    Object v9 = new double[]{60.44833720950099D,0.0D,0.0D};
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{0.0D,1.0D};
    Object v12 = new double[]{-5.0367364484297195D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 12;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{0.0D,1.0D,10.142643175441133D};
    Object v7 = new double[]{-32.8443132101778D,0.0D};
    Object v8 = 2.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    Object v7 = new org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator();
    Object v8 = true;
    ((org.apache.commons.math.ode.sampling.StepHandler)v6).handleStep(((org.apache.commons.math.ode.sampling.StepInterpolator)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v6));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{};
    Object v6 = new double[]{};
    Object v7 = new double[]{-28.788471557608364D,1.0D,45.031442271051205D};
    Object v8 = 67.10546783288908D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMaxGrowth();
    org.junit.Assert.assertEquals((Object)(10.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getCurrentStepStart();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 6;
    Object v7 = new double[]{6.263758833729022D};
    Object v8 = 15.271465453829133D;
    Object v9 = new double[]{};
    Object v10 = new double[]{44.52989613296468D};
    Object v11 = new double[]{14.506477914052498D,31.95595645121545D};
    Object v12 = new double[]{16.916034641489244D,-3.4460076328641183D,16.181116404710483D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{1.0D};
    Object v8 = -50.81732047727794D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = -39.034051866891986D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMaxGrowth((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null};
    Object v6 = new double[]{23.494996627757928D};
    Object v7 = new double[]{0.0D,26.60783364436268D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getSafety();
    org.junit.Assert.assertEquals((Object)(0.9D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -2147483648;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 0;
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = new double[]{0.0D,0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = new double[]{3.867027465587953D,-22.90904823842712D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMinStep();
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = new double[][]{};
    Object v8 = new double[]{-27.519753771734884D};
    Object v9 = new double[]{25.60254252260673D,-42.712847868305055D,33.03594723456493D};
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v7),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0.0D;
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
  public void test34() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2.0D;
    Object v6 = new double[]{1.0D,13.715033808100047D,0.0D};
    Object v7 = new double[]{8.770372781511558D,0.0D,-28.662048723627546D};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{};
    Object v6 = new double[]{-8.561006446784083D,2.0D,-17.490316077568206D};
    Object v7 = new double[]{};
    Object v8 = -32.336095251842636D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 26;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 1;
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = new double[]{48.903849841094015D};
    Object v10 = new double[]{-10.778290474804436D};
    Object v11 = new double[]{48.90383906280354D,1.0D};
    Object v12 = new double[]{1.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearEventHandlers();
    Object v5 = null;
    Object v6 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = 25;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 18;
    Object v7 = new double[]{};
    Object v8 = 1.0D;
    Object v9 = new double[]{};
    Object v10 = new double[]{-9.850735202686085D};
    Object v11 = new double[]{30.877283282868493D,14.0D};
    Object v12 = new double[]{0.0D,428.0D,0.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 1;
    Object v7 = new double[]{};
    Object v8 = 86.2856725234186D;
    Object v9 = new double[]{-12.948040722119883D};
    Object v10 = new double[]{39.458983079374704D,0.0D,0.0D};
    Object v11 = new double[]{};
    Object v12 = new double[]{1.0D,46.097333915420705D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    Object v6 = -9.526860779855275D;
    Object v7 = new double[]{};
    Object v8 = new double[]{};
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
    Object v10 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -9.880867096748787D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = -2;
    Object v7 = new double[]{-25.893326317646395D,8.398827885347991D,5.821030809785553D};
    Object v8 = 0.0D;
    Object v9 = new double[]{22.3227676637344D,-54.53036972395418D};
    Object v10 = new double[]{41.873225842904006D,-9.319102954995572D};
    Object v11 = new double[]{0.0D};
    Object v12 = new double[]{0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMinStep();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setSafety((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{-9.05071434550465D,-12.572766021384812D};
    Object v8 = -44.54168162639787D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 26.665031792811792D;
    Object v6 = 3.2630833895529165D;
    Object v7 = Double.NaN;
    Object v8 = 1.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    Object v10 = true;
    Object v11 = -40;
    Object v12 = new double[]{-7.707685728824064D,1.0D};
    Object v13 = 17.001724506912385D;
    Object v14 = new double[]{0.0D,-40.31852074993633D,1.0D};
    Object v15 = new double[]{0.0D};
    Object v16 = new double[]{1.0D};
    Object v17 = new double[]{};
    Object v18 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Integer)v11).intValue()),((double[])v12),(((java.lang.Double)v13).doubleValue()),((double[])v14),((double[])v15),((double[])v16),((double[])v17));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMinReduction((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{1.0D};
    Object v7 = new double[]{1.0D,39.99495298922348D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0.0D;
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
  public void test54() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 9.057025503647255D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 18.868827188710146D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 0;
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = new double[]{-38.86802993999262D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).getMaxStep();
    org.junit.Assert.assertEquals((Object)(48.589278342601325D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 38;
    Object v7 = new double[]{};
    Object v8 = 50.53016187810739D;
    Object v9 = new double[]{9.015548220582955D,-35.98791163342709D};
    Object v10 = new double[]{1.0D,2.416629408295607D};
    Object v11 = new double[]{};
    Object v12 = new double[]{0.0D,50.35382373798969D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 0;
    Object v7 = new double[]{14.274526709510582D,52.0D};
    Object v8 = 0.0D;
    Object v9 = new double[]{};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = new double[]{0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = -30;
    Object v7 = new double[]{14.757700985841863D,12.41580101269027D};
    Object v8 = 0.0D;
    Object v9 = new double[]{0.6095817921471128D,-35.24739419442344D,-2.5489560493606014D};
    Object v10 = new double[]{71.56154334058986D};
    Object v11 = new double[]{-19.786001188064187D,0.0D};
    Object v12 = new double[]{33.58440336247011D,-2.9853001052818544D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setSafety((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new double[]{0.0D};
    Object v8 = 1.0D;
    Object v9 = new double[]{0.0D,13.804392004134186D};
    Object v10 = new double[]{1.0D,-72.78974225447499D};
    Object v11 = new double[]{};
    Object v12 = new double[]{86.62019046202624D,0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    Object v6 = new double[][]{null,null};
    Object v7 = new double[]{-66.12102794081636D,0.0D};
    Object v8 = new double[]{0.0D,-1.1194640428813634D};
    Object v9 = -6.620064771005515D;
    Object v10 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 364;
    Object v7 = new double[]{52.25184590865594D};
    Object v8 = 0.0D;
    Object v9 = new double[]{1.0D,0.0D,-60.26324607661206D};
    Object v10 = new double[]{};
    Object v11 = new double[]{1.0D};
    Object v12 = new double[]{21.770263917678157D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getMinReduction();
    org.junit.Assert.assertEquals((Object)(0.2D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -6;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 6.12190108124D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMaxGrowth((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = new double[][]{null,null};
    Object v8 = new double[]{0.0D,0.0D,-10.731988570332259D};
    Object v9 = new double[]{65.52006654610192D};
    Object v10 = -25.816244668262154D;
    Object v11 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v7),((double[])v8),((double[])v9),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null};
    Object v6 = new double[]{-13.368222138727344D,22.3496205138685D};
    Object v7 = new double[]{2.0D,0.0D,1.0D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 1;
    Object v7 = new double[]{1.0D,1.0D,1.0D};
    Object v8 = -7.213672280208058D;
    Object v9 = new double[]{1.0D,2.0D,0.0D};
    Object v10 = new double[]{1.7425896857192393D,31.328595177279276D,51.099601201476794D};
    Object v11 = new double[]{1.0006498142294926D,2.0116824787286665D,0.019055115644398494D};
    Object v12 = new double[]{1.0757126047328094D,0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getStepHandlers();
    Object v6 = false;
    Object v7 = 2;
    Object v8 = new double[]{1.0D};
    Object v9 = 0.0D;
    Object v10 = new double[]{0.0D,1.0D,-5.728575949265202D};
    Object v11 = new double[]{19.1891551677275D,-22.27674932838867D,0.0D};
    Object v12 = new double[]{-1.91891551677275E-5D,1.0000222767493283D};
    Object v13 = new double[]{27.695488369294466D};
    Object v14 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Integer)v7).intValue()),((double[])v8),(((java.lang.Double)v9).doubleValue()),((double[])v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -4.196980193697524D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 1;
    Object v7 = new double[]{};
    Object v8 = 0.0D;
    Object v9 = new double[]{1.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{0.0D,0.0D,0.0D};
    Object v12 = new double[]{-84.82710890292174D,1.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = true;
    Object v6 = 2;
    Object v7 = new double[]{};
    Object v8 = 2.0D;
    Object v9 = new double[]{-6.200794136546912D,6.083023073686804D};
    Object v10 = new double[]{1.0D,0.0D,1.0D};
    Object v11 = new double[]{-6.2007931365469116D};
    Object v12 = new double[]{0.0D,1.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = -30;
    Object v7 = new double[]{47.008412445446446D,12.577936055876139D,-6.579880298305049D};
    Object v8 = 0.0D;
    Object v9 = new double[]{-26.99925483117844D,-3.183932047257999D,-17.88261549624813D};
    Object v10 = new double[]{-2.5173293915681296D};
    Object v11 = new double[]{};
    Object v12 = new double[]{495.6137740021628D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = 0;
    Object v7 = new double[]{-1.397242611500757D,0.0D};
    Object v8 = -18.246828109422356D;
    Object v9 = new double[]{19.632199739683497D,24.53648242306643D,0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = new double[]{};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{32.035856301088245D,0.0D,-8.137115511667977D};
    Object v8 = 45.89194899345716D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).clearStepHandlers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 4.559808078225231D;
    Object v6 = -19.598111355922665D;
    Object v7 = new double[]{16.49883013898549D,-19.005429342519438D};
    Object v8 = new double[]{11.139985156730997D,1.0D,0.0D};
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
    Object v10 = false;
    Object v11 = 6;
    Object v12 = new double[]{2.7672430506456105D,-16.553481318239022D,-40.61421586860737D};
    Object v13 = 1.0D;
    Object v14 = new double[]{0.0D,33.6512018960343D};
    Object v15 = new double[]{-8.4986884132783D,11.960795176991569D};
    Object v16 = new double[]{28.357290255188637D,0.0D};
    Object v17 = new double[]{38.18154857654238D,1.0D};
    Object v18 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Integer)v11).intValue()),((double[])v12),(((java.lang.Double)v13).doubleValue()),((double[])v14),((double[])v15),((double[])v16),((double[])v17));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -8;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance();
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).addStepHandler(((org.apache.commons.math.ode.sampling.StepHandler)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.AbstractIntegrator)v4).getEventHandlers();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 1;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -1.3439373633070564D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 9.372894608097427D;
    Object v6 = 0.0D;
    Object v7 = 74.760814128366D;
    Object v8 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = false;
    Object v6 = -5;
    Object v7 = new double[]{53.76515912343908D};
    Object v8 = -2.8498051821075805D;
    Object v9 = new double[]{-6.393289901567938D,80.94791214835925D,0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{1.0D};
    Object v12 = new double[]{0.0D};
    Object v13 = ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).initializeStep((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((double[])v7),(((java.lang.Double)v8).doubleValue()),((double[])v9),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = null;
    Object v6 = 1.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).integrate(((org.apache.commons.math.ode.ExpandableStatefulODE)v5),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 2;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null,null};
    Object v6 = new double[]{};
    Object v7 = new double[]{-10.093970667758654D,5.087106600542247D};
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = -58.23620529806119D;
    Object v7 = 1.0D;
    Object v8 = 1.0D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 23.739259309682485D;
    Object v6 = -23.462773358500613D;
    Object v7 = new double[]{1.0D,34.638161066219816D};
    Object v8 = new double[]{};
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setStepSizeControl((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((double[])v7),((double[])v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    Object v6 = new double[][]{null,null};
    Object v7 = new double[]{};
    Object v8 = new double[]{0.0D,-13.415586629315248D,0.0D};
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v6),((double[])v7),((double[])v8),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 25.538820317396578D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setSafety((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = new double[][]{null,null};
    Object v6 = new double[]{1.0D,0.0D};
    Object v7 = new double[]{1.0D,-35.27952914272918D,0.0D};
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).estimateError(((double[][])v5),((double[])v6),((double[])v7),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).computeDerivatives((((java.lang.Double)v5).doubleValue()),((double[])v6),((double[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0.0D;
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
  public void test97() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = -20.733199922901264D;
    ((org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator)v4).setInitialStepSize((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 15;
    ((org.apache.commons.math.ode.AbstractIntegrator)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 48.589278342601325D;
    Object v2 = new double[]{};
    Object v3 = new double[]{};
    Object v4 = new org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((double[])v2),((double[])v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).setMinReduction((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator)v4).getOrder();
    org.junit.Assert.assertEquals((Object)(8), v7);
  }
}
