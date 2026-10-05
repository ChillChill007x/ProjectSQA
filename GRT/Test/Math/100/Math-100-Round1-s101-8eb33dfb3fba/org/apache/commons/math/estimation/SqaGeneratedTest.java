package org.apache.commons.math.estimation;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -17;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getMeasurements();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getMeasurements();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getUnboundParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getUnboundParameters();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 27;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getAllParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getUnboundParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).incrementJacobianEvaluationsCounter();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getAllParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getUnboundParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCostEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getAllParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 1;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getMeasurements();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getMeasurements();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).initializeEstimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getAllParameters();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).initializeEstimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getUnboundParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getUnboundParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).incrementJacobianEvaluationsCounter();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -50;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getMeasurements();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getAllParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -6;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 59;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getUnboundParameters();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 30;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -23;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 26;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getMeasurements();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 1;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getUnboundParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getAllParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getMeasurements();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).guessParametersErrors(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getMeasurements();
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -21;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 1;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).incrementJacobianEvaluationsCounter();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getAllParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 2;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v1));
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getMeasurements();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getUnboundParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getAllParameters();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).initializeEstimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 16;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getUnboundParameters();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 19;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 21;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -32;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getMeasurements();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getMeasurements();
    Object v5 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getChiSquare(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -6;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 36;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.EstimationProblem)v1).getAllParameters();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -29;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 1;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getJacobianEvaluations();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -17;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = -6;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 0;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.estimation.EstimationException");
    } catch (org.apache.commons.math.estimation.EstimationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 62;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 32;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateResidualsAndCost();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 19;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).updateJacobian();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v2 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getRMS(((org.apache.commons.math.estimation.EstimationProblem)v1));
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.EstimationProblem)v3).getAllParameters();
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).estimate(((org.apache.commons.math.estimation.EstimationProblem)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.estimation.LevenbergMarquardtEstimator();
    Object v1 = 27;
    ((org.apache.commons.math.estimation.AbstractEstimator)v0).setMaxCostEval((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.math.estimation.SimpleEstimationProblem();
    Object v4 = ((org.apache.commons.math.estimation.AbstractEstimator)v0).getCovariances(((org.apache.commons.math.estimation.EstimationProblem)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
