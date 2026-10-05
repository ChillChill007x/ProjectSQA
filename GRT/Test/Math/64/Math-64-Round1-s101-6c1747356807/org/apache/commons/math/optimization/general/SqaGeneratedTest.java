package org.apache.commons.math.optimization.general;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.3960511640851618D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setQRRankingThreshold((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -6;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 13.669433084285407D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 6.055009605444549D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 25;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{0.0D,0.0D,0.0D};
    Object v3 = new double[]{-30.874352815066114D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 17.181862185075556D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setQRRankingThreshold((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -0.68881128143139D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setQRRankingThreshold((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 13;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 73.44262497418649D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setQRRankingThreshold((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -6;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = -54;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -19.37452805420237D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -33.750349829372084D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -61;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -13;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 3;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = null;
    Object v4 = new double[]{1.0D};
    Object v5 = new double[]{52.31548550172087D,-4.259160074962057D};
    Object v6 = new double[]{22.04674031240533D};
    Object v7 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v3),((double[])v4),((double[])v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = -31.364830480154893D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -8.606862537231663D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -28;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -4.322815798092728D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 10;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 26;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 60.01864048695945D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 23;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 38.79001985153091D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 61.43692774270934D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -7.206478087738193D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -8.659221685301066D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -14;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 7;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setQRRankingThreshold((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -32;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(-32), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 43.01596576214651D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -5;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 17;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 26.957276364025557D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -12.9359939281199D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -7;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -21;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 5;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -19.07716062389183D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    Object v2 = 2;
    Object v3 = new double[]{};
    Object v4 = new double[]{2.0D,10.0762114293742D,1.0038883962567447E18D};
    Object v5 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v3),((double[])v4));
    Object v6 = new double[]{};
    Object v7 = new double[]{2.0D,10.0762114293742D,1.0038883962567447E18D};
    Object v8 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v6),((double[])v7));
    Object v9 = ((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1).converged((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.optimization.VectorialPointValuePair)v5),((org.apache.commons.math.optimization.VectorialPointValuePair)v8));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -8;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 4.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 4.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 24.942419716872212D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{-0.0841209646477985D};
    Object v3 = new double[]{1.0D,0.0D};
    Object v4 = new double[]{-55.014880684000815D};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{-15.286545148660366D};
    Object v3 = new double[]{1.0D,23.575906046728853D};
    Object v4 = new double[]{37.67147823939466D};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 3;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }
}
