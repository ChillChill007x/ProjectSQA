package org.apache.commons.math.optimization.general;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 22;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 30;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = -38.5799245316541D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 12;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -31;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
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
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
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
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 16;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{0.0D};
    Object v3 = new double[]{0.0D,-49.02516812685844D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 4;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -21;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 33;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 21;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 10;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 5;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -30;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new double[]{};
    Object v6 = new double[]{};
    Object v7 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v5),((double[])v6));
    Object v8 = new double[]{};
    Object v9 = new double[]{};
    Object v10 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v8),((double[])v9));
    Object v11 = ((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3).converged((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.optimization.VectorialPointValuePair)v7),((org.apache.commons.math.optimization.VectorialPointValuePair)v10));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -6;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 28;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 48;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -33;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(1000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -16;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 100;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -20;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 17;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 5;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -7;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{};
    Object v3 = new double[]{Double.POSITIVE_INFINITY,0.0D,31.124068715187583D};
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 7;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 4;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = null;
    Object v2 = new double[]{0.0D};
    Object v3 = new double[]{1.0D,1.0D,-18.246828109422356D};
    Object v4 = new double[]{1.0D,-10.441133949274697D};
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)v1),((double[])v2),((double[])v3),((double[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 4;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -6;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 29;
    Object v5 = new double[]{};
    Object v6 = new double[]{};
    Object v7 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v5),((double[])v6));
    Object v8 = new double[]{};
    Object v9 = new double[]{};
    Object v10 = new org.apache.commons.math.optimization.VectorialPointValuePair(((double[])v8),((double[])v9));
    Object v11 = ((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3).converged((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.optimization.VectorialPointValuePair)v7),((org.apache.commons.math.optimization.VectorialPointValuePair)v10));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 3;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).incrementIterationsCounter();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 16;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -29;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = -38.5799245316541D;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -44;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -38.5799245316541D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.SimpleVectorialPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.VectorialConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = -1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 47;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 40;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
