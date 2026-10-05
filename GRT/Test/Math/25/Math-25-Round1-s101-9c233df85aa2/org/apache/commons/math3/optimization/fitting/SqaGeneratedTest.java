package org.apache.commons.math3.optimization.fitting;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-76.33220487171837D,-14.25215977021947D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new double[]{1.0D,1.0D,0.0D};
    Object v3 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit(((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 16;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint(((org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{0.0D,1.0D,-9.909109511268754D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).clearObservations();
    Object v2 = null;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-1.3443345715255686D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).clearObservations();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-39.51422694984473D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 2;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{22.59837451457785D,7.192227342396837D,-7.981062314754047D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 41.67554857559526D;
    Object v3 = 0.0D;
    Object v4 = 1.0D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -20.851791746181416D;
    Object v3 = -14.906902650847318D;
    Object v4 = 29.352117581238296D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v8 = 1.0D;
    Object v9 = new double[]{0.0D,1.0D};
    Object v10 = ((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v7).gradient((((java.lang.Double)v8).doubleValue()),((double[])v9));
    Object v11 = new double[]{0.0D,0.0D,1.0D};
    Object v12 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v7),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 12;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -2;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new double[]{1.0D,0.0D};
    Object v3 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit(((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).getObservations();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).getObservations();
    Object v3 = 1;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{0.0D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = 1.0D;
    Object v5 = new double[]{0.0D,27.450857050273125D};
    Object v6 = ((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3).value((((java.lang.Double)v4).doubleValue()),((double[])v5));
    Object v7 = new double[]{32.46552339506196D,0.0D};
    Object v8 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{1.0D,1.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0.0D;
    Object v3 = 2.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint(((org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).getObservations();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new double[]{-47.199739879057816D};
    Object v3 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit(((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 10019;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{1.0D,-4.765785059692132D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-22.93810982062337D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 14;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-3.9520529828088504D,-14.298997358938472D,1.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).clearObservations();
    Object v2 = null;
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{37.11381545744283D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{-34.25608029813995D,2.0D,-1.7860705126058525D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0.0D;
    Object v3 = 14.296745411809008D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 1.0D;
    Object v6 = 31.77988404927382D;
    Object v7 = 0.0D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -19.63771400537312D;
    Object v3 = -36.18005112325593D;
    Object v4 = 73.71356153507249D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -16;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -64;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new double[]{8.680843822572392D,-21.033698117821853D};
    Object v3 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit(((double[])v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -72;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -55;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-1.6911091234585658D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -35.66985574167622D;
    Object v3 = 3.4507804447780104D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{1.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -20;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{-46.670147786744636D,1.7445507649608838D,1.0D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new double[]{};
    Object v3 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v1).fit(((double[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -11;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D,22.50335865287138D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{0.0D,0.0D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).clearObservations();
    Object v2 = null;
    Object v3 = 29;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{8.31748836890985D,0.0D,42.25424921314953D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D,2.0D,-51.93787963802281D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 0.0D;
    Object v4 = 25.302439385295685D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).addObservedPoint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v2).fit();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).getObservations();
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v2).fit(((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -9.334060132980714D;
    Object v3 = -91.62335035819171D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).clearObservations();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = new double[]{1.0D,3.353071141940009D,0.0D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v2).fit(((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{59.96617296875334D,-18.59978178652442D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).getObservations();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v2).fit(((double[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 35;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{1.0D,-19.098083933314424D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 4;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = 44.74963687749413D;
    Object v6 = new double[]{31.729991864972426D,23.36300561122763D};
    Object v7 = ((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4).gradient((((java.lang.Double)v5).doubleValue()),((double[])v6));
    Object v8 = new double[]{0.0D,1.0D,8.693440667124307D};
    Object v9 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).addObservedPoint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = -14;
    Object v7 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v8 = new double[]{27.924892163875324D};
    Object v9 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v7),((double[])v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 2;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-16.851391447772926D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 4;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D,-2.475402353339831D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 2;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-8.718237427624977D,16.989322205008044D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 29.30571840300657D;
    Object v3 = -5.596312033222256D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -43;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{2.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 1.0D;
    Object v3 = 8.057025503647255D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 17;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{2.0D,0.0D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = 49.53016187810739D;
    Object v5 = new double[]{9.015548220582955D,-36.98791163342709D};
    Object v6 = ((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3).gradient((((java.lang.Double)v4).doubleValue()),((double[])v5));
    Object v7 = new double[]{0.0D,3.416629408295607D};
    Object v8 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 17;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{1.0D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{0.0D,-42.98520500341846D,0.0D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 0.0D;
    Object v4 = 2.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.optimization.fitting.WeightedObservedPoint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).addObservedPoint(((org.apache.commons.math3.optimization.fitting.WeightedObservedPoint)v6));
    Object v7 = null;
    Object v8 = 2;
    Object v9 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v10 = new double[]{0.0D};
    Object v11 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v8).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 55.95126113160423D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 28;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{2.0D,-6.133678973398377D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -60;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).getObservations();
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v6 = new double[]{0.0D,0.0D,1.0D};
    Object v7 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).clearObservations();
    Object v3 = null;
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v6 = new double[]{0.0D,12.689778611555719D};
    Object v7 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 4;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{0.0D,0.0D,1.0D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0.0D;
    Object v3 = 72.07852809417746D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = 46;
    Object v6 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v7 = new double[]{11.921843379757949D,1.0D};
    Object v8 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v5).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-45.803645260467334D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 71;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{-12.673793134621741D,0.0D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{1.0D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).getObservations();
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{-19.056989223905052D,-94.02338441741774D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 13;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{1.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 3;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{12.20058289641924D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 12;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{29.826572290521053D,52.72963386029168D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 1;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{-17.649848158864035D,-68.16614705258877D,28.046652194132925D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{1.0D,1.0D,0.0D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).addObservedPoint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 26;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{1.545885807746771D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).getObservations();
    Object v4 = new double[]{7.399045706535284D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.HarmonicFitter)v2).fit(((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 1;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{-35.159702937667774D,0.3967963775301744D,0.0D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{0.0D,0.48186616836419244D,30.497929213881452D};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getMaxEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 20;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = -15;
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getMaxEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v4 = new double[]{27.00890453898444D,0.0D};
    Object v5 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new org.apache.commons.math3.optimization.fitting.CurveFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v2 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v3 = new double[]{8.0E298D};
    Object v4 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v1).fit(((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v2),((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.ConvergenceException");
    } catch (org.apache.commons.math3.exception.ConvergenceException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.BaseOptimizer)v0).getEvaluations();
    Object v2 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(((org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer)v0));
    Object v3 = 16;
    Object v4 = new org.apache.commons.math3.analysis.function.Logit.Parametric();
    Object v5 = new double[]{};
    Object v6 = ((org.apache.commons.math3.optimization.fitting.CurveFitter)v2).fit((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.ParametricUnivariateFunction)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
