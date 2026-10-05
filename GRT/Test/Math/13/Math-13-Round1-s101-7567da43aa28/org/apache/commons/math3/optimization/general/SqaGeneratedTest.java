package org.apache.commons.math3.optimization.general;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-6.19220497251351D,0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 0;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = new double[]{32.75869696158654D};
    Object v6 = new double[]{0.0D,0.0D,0.0D};
    Object v7 = new double[]{0.0D};
    Object v8 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4),((double[])v5),((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D,1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).updateResidualsAndCost();
    Object v1 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{14.833322024552803D};
    Object v3 = Double.NaN;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 23;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new org.apache.commons.math3.optimization.OptimizationData[]{null,null};
    Object v5 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimizeInternal((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((org.apache.commons.math3.optimization.OptimizationData[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getWeightSquareRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{};
    Object v2 = -39.71166192067471D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,-42.76927416826459D,2.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{2.0D,1.0D,1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeCost(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).setCost((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{};
    Object v2 = -76.10804750390423D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeCovariances(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeCovariances(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer)v0).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 0.0D;
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances((((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{10.696062562706038D,1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).setUp();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{};
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 26;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4));
    Object v6 = new double[]{};
    Object v7 = new double[]{2.0D,0.0D,-47.199739879057816D};
    Object v8 = new double[]{20.85948798598467D};
    Object v9 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v5),((double[])v6),((double[])v7),((double[])v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{30.95595645121545D,0.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,14.916034641489244D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-8.635268235655554D};
    Object v2 = -0.5D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).guessParametersErrors();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-35.505034035587414D,-3.0727703098476926D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer)v0).getWeight();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,0.0D,0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeCost(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 0;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new double[]{-20.343653722087947D,-6.831160885212972D};
    Object v5 = new double[]{49.13413776577596D};
    Object v6 = new double[]{-24.34863808930069D,1.0D};
    Object v7 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((double[])v4),((double[])v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = -76.47051391351305D;
    ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).setCost((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{40.115276216438495D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{};
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer)v0).getTarget();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{31.729991864972426D,23.36300561122763D};
    Object v3 = 8.693440667124307D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = -40.010487503460716D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances((((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).updateJacobian();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0E-14D,3.0071806950777082D,1.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,2.4076613107674745D,0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-60.254669806858494D};
    Object v2 = -18.49953069820141D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 0;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new org.apache.commons.math3.optimization.OptimizationData[]{null,null};
    Object v5 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimizeInternal((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((org.apache.commons.math3.optimization.OptimizationData[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 0;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4));
    Object v6 = ((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v5).jacobian();
    Object v7 = new double[]{0.0D,0.0D};
    Object v8 = new double[]{27.90715041725065D,-21.238491948505743D};
    Object v9 = new double[]{};
    Object v10 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v5),((double[])v7),((double[])v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-3.097730410335225D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 1;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new double[]{0.0D,-22.715992013550263D};
    Object v5 = new double[]{1.0D,-79.17113297731971D,1.0D};
    Object v6 = new double[]{0.0D,12.689778611555719D};
    Object v7 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((double[])v4),((double[])v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1143.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{1.0D,2.0D};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-3.6260119670833326D,11.056927645155534D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 53;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toDifferentiableMultivariateVectorFunction(((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3));
    Object v5 = new double[]{};
    Object v6 = new double[]{};
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v4),((double[])v5),((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{1.0D};
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = -30.264857161740757D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances((((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{1.0D,-85.82710890292174D,13.486688669218392D};
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.13553435298970362D,-26.42941744789104D,0.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{17.22392845145007D,3.373821182724995D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D,2.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-16.620087763258624D,-12.676913400254795D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 1;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = new double[]{126.97321136636947D,1.0D};
    Object v6 = new double[]{47.008412445446446D,13.577936055876139D,-5.579880298305049D};
    Object v7 = new double[]{-27.99925483117844D};
    Object v8 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4),((double[])v5),((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 28;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new org.apache.commons.math3.optimization.OptimizationData[]{null};
    Object v5 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimizeInternal((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((org.apache.commons.math3.optimization.OptimizationData[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-12.259082381985952D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{1.0D,-13.616185586142024D,0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,0.0D,-1.2772112266319975D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-47.34530925742287D,0.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = 5.541480873921297D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeCovariances(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{2.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,1.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{-16.49579554159054D,1.0D};
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getCovariances();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,-24.123520283252404D,30.385819279456356D};
    Object v2 = 6.27232517761897D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 0;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new double[]{0.0D,0.0D,65.04256144735416D};
    Object v5 = new double[]{1.0D,0.0D,0.0D};
    Object v6 = new double[]{13.46769150955004D,33.55471598396099D,0.0D};
    Object v7 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((double[])v4),((double[])v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{-4.547771274997611D};
    Object v3 = 50.468429991710615D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{3.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{78.11948449029578D,1.0D,0.0D};
    Object v2 = -7.50816120015709D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-1.0D,-5.186510407173391D,-2.6679415639117807D};
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 26;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new double[]{0.0D};
    Object v5 = new double[]{};
    Object v6 = new double[]{4.921847778940911D};
    Object v7 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((double[])v4),((double[])v5),((double[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,22.610029247905793D,2.0D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 1;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = new org.apache.commons.math3.optimization.OptimizationData[]{null,null,null};
    Object v6 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimizeInternal((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4),((org.apache.commons.math3.optimization.OptimizationData[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = 1;
    Object v2 = null;
    Object v3 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v2));
    Object v4 = new org.apache.commons.math3.optimization.OptimizationData[]{};
    Object v5 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimizeInternal((((java.lang.Integer)v1).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v3),((org.apache.commons.math3.optimization.OptimizationData[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{-28.521362252430762D};
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{11.66577988998108D};
    Object v2 = 8.429932672240156D;
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 20;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = new double[]{-2.147483648E9D};
    Object v6 = new double[]{-2.121916390277172D,3.0D,-19.174426899058922D};
    Object v7 = new double[]{1.0D,-8.409479992481387D};
    Object v8 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4),((double[])v5),((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{0.0D,23.774842151506302D,45.47440594634895D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeResiduals(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = 0;
    Object v3 = null;
    Object v4 = org.apache.commons.math3.analysis.FunctionUtils.toMultivariateDifferentiableVectorFunction(((org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction)v3));
    Object v5 = new double[]{32.10749371117717D,1.0D};
    Object v6 = new double[]{-33.44967693305513D,1.0D,-18.859537393060574D};
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)v4),((double[])v5),((double[])v6),((double[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{0.0D};
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).getRMS();
    Object v2 = new double[]{};
    Object v3 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeCost(((double[])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.general.GaussNewtonOptimizer();
    Object v1 = new double[]{-16.928789263034D};
    Object v2 = ((org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer)v0).computeWeightedJacobian(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
