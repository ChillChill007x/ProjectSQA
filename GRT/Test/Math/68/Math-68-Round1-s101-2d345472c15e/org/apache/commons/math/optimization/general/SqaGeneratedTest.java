package org.apache.commons.math.optimization.general;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 63.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
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
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
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
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 13.669433084285407D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -14.762306992934473D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 8.011087561606166D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -13;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 15;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 28.772706018570236D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 16;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -57;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -39;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = null;
    Object v4 = new double[]{14.052830940913662D,0.0D};
    Object v5 = new double[]{};
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v3),((double[])v4),((double[])v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -4;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 7;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 14.715033808100047D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 9;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = -19;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -37.75720368065437D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 33;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 20;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -14;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
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
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 27;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 26;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = 0.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 10;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setParRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 10.888802674939143D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -46;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 3;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 15.796197536992594D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -27;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{};
    Object v3 = new double[]{Double.POSITIVE_INFINITY,0.0D,-46.57193168094123D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 36.01859799988455D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setInitialStepBoundFactor((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
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
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{0.0D};
    Object v3 = new double[]{1.0D,1.0D,-7.334207200319899D};
    Object v4 = new double[]{1.0D,-10.441133949274697D};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 4;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = -16;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    Object v2 = 0;
    Object v3 = new double[]{0.0D,-40.61421586860737D};
    Object v4 = new double[]{0.0D,19.035959512035074D};
    Object v5 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v3),((double[])v4));
    Object v6 = new double[]{0.0D,-40.61421586860737D};
    Object v7 = new double[]{0.0D,19.035959512035074D};
    Object v8 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v6),((double[])v7));
    Object v9 = ((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1).converged((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.optimization.VectorialPointValuePair)v5),((org.apache.commons.math.optimization.VectorialPointValuePair)v8));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{0.0D};
    Object v3 = new double[]{0.0D};
    Object v4 = new double[]{22.94854208935188D};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -19;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math.optimization.SimpleVectorialValueChecker();
    Object v2 = 1;
    Object v3 = new double[]{0.0D,-40.61421586860737D};
    Object v4 = new double[]{0.0D,19.035959512035074D};
    Object v5 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v3),((double[])v4));
    Object v6 = new double[]{0.0D,-40.61421586860737D};
    Object v7 = new double[]{0.0D,19.035959512035074D};
    Object v8 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v6),((double[])v7));
    Object v9 = ((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1).converged((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.optimization.VectorialPointValuePair)v5),((org.apache.commons.math.optimization.VectorialPointValuePair)v8));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v1));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0.9141606719073496D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setCostRelativeTolerance((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 1.0D;
    ((org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer)v0).setOrthoTolerance((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }
}
