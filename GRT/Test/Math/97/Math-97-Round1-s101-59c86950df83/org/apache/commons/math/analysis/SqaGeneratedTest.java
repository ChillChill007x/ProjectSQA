package org.apache.commons.math.analysis;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setAbsoluteAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -37.467954304225366D;
    Object v5 = 15.86892549109002D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011645D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetFunctionValueAccuracy();
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getIterationCount();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -15.653601483195626D;
    Object v5 = 16.28263117573392D;
    Object v6 = -12.487431673724748D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011647D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setMaximalIterationCount((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetMaximalIterationCount();
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getIterationCount();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetAbsoluteAccuracy();
    Object v4 = null;
    Object v5 = 0.0D;
    Object v6 = -6.656675023456614D;
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetMaximalIterationCount();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 7.743118009648195D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 7.357517644639742D;
    Object v5 = -6.457924853857742D;
    Object v6 = -14.628500510542775D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetRelativeAccuracy();
    Object v4 = null;
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = -8.01209965774624D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = Double.NaN;
    Object v5 = 7.192227342396837D;
    Object v6 = -7.981062314754047D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(7.192227342396837D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 41.67554857559526D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getIterationCount();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -20.851791746181416D;
    Object v5 = -33.1943022870341D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetRelativeAccuracy();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -22.300849088532516D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 26.539401408592173D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = -22.22387910518186D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -2.5226088467690313D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 26;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setMaximalIterationCount((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 24.612485323710207D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetMaximalIterationCount();
    Object v4 = null;
    Object v5 = 11.0D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetRelativeAccuracy();
    Object v4 = null;
    Object v5 = 2.0D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setAbsoluteAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 24.87860650407334D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetAbsoluteAccuracy();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -24.3271176696025D;
    Object v5 = 4.195304735167672D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -15.647202187328878D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 71.48014658350743D;
    Object v5 = 0.8616773924345943D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -8.48643928705609D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setAbsoluteAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-6D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 4.867027465587952D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setAbsoluteAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetAbsoluteAccuracy();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -22.90904823842712D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    Object v5 = 18.987443046628325D;
    Object v6 = 1.8452169947788215D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011648D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setMaximalIterationCount((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -28.49181280400925D;
    Object v5 = 27.511216049912104D;
    Object v6 = 9.429025435345947D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011647D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetRelativeAccuracy();
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getIterationCount();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 24.87469333489406D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011647D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -32.24159569937701D;
    Object v5 = 5.703966546882023D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -45.73098550757553D;
    Object v5 = 10.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetRelativeAccuracy();
    Object v4 = null;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetFunctionValueAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 2.243271351014722D;
    Object v5 = 7.372978553337197D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setMaximalIterationCount((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = -21.183720255435997D;
    Object v7 = 14.205005783801067D;
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -30.99862836846286D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 16.256162386905338D;
    Object v5 = -15.977506902265244D;
    Object v6 = 22.104290054649905D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 33.54936789323728D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -7.677009866829908D;
    Object v5 = 2.0D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setFunctionValueAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 52.11846449303282D;
    Object v7 = 0.0D;
    Object v8 = -42.6096975394474D;
    Object v9 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getFunctionValueAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-15D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetMaximalIterationCount();
    Object v4 = null;
    Object v5 = 1.0D;
    Object v6 = -29.50590304025685D;
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -30.77335840043071D;
    Object v5 = 19.676099440873326D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.analysis.UnivariateRealSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
    org.junit.Assert.assertEquals((Object)(10.286236218011647D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -21.80529274778344D;
    Object v5 = 0.0D;
    Object v6 = 2.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 7;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setMaximalIterationCount((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 5.136372480700336D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 41.77325537598745D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 59.68064432579146D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = 30.891285203297834D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -12.398913722706766D;
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 21.82807892017247D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = -42.273822449331504D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetFunctionValueAccuracy();
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 1.0D;
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -1.4614690091384603D;
    Object v5 = 34.802100523540005D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011645D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -0.13224421043491486D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -28.13813240439962D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 22.87824645264836D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetFunctionValueAccuracy();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 39.29942442672663D;
    Object v6 = 51.35382373798969D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetAbsoluteAccuracy();
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getResult();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetAbsoluteAccuracy();
    Object v4 = null;
    Object v5 = 0.0D;
    Object v6 = 16.27452670951058D;
    Object v7 = -53.49167320200403D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    Object v5 = -29.3240739677881D;
    Object v6 = 55.33853124682837D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getIterationCount();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 1.0D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setAbsoluteAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = 49.929143829946604D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.286236218011647D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 4.9471030921867465D;
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetFunctionValueAccuracy();
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetAbsoluteAccuracy();
    Object v4 = null;
    Object v5 = 1.0D;
    Object v6 = 0.0D;
    Object v7 = -48.19413920708863D;
    Object v8 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 13.976342342813018D;
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = -15.739245372844003D;
    Object v6 = -20.02994688734465D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).resetRelativeAccuracy();
    Object v4 = null;
    Object v5 = 3.0D;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = 0.0D;
    Object v5 = -19.155438261155552D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -41;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setMaximalIterationCount((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = -31.72252166696866D;
    Object v7 = 0.0D;
    Object v8 = 40.66966925944234D;
    Object v9 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.BrentSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -1.6171404880459004D;
    Object v5 = -23.864538912797517D;
    Object v6 = ((org.apache.commons.math.analysis.BrentSolver)v3).solve((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new double[]{-18.572472436023293D,2.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = new org.apache.commons.math.analysis.PolynomialFunctionNewtonForm(((double[])v0),((double[])v1));
    Object v3 = new org.apache.commons.math.analysis.RiddersSolver(((org.apache.commons.math.analysis.UnivariateRealFunction)v2));
    Object v4 = -25.816244668262154D;
    ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).setRelativeAccuracy((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.analysis.UnivariateRealSolverImpl)v3).getIterationCount();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
