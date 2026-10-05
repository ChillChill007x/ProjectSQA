package org.apache.commons.math3.optim.nonlinear.vector.jacobian;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 29.67419927060944D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 31.778116563086225D;
    Object v6 = 1.7215537136911236D;
    Object v7 = -7.008858340028162D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 29.67419927060944D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 31.778116563086225D;
    Object v6 = 1.7215537136911236D;
    Object v7 = -7.008858340028162D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{};
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeCovariances(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 29.67419927060944D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 31.778116563086225D;
    Object v6 = 1.7215537136911236D;
    Object v7 = -7.008858340028162D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 29.67419927060944D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 31.778116563086225D;
    Object v6 = 1.7215537136911236D;
    Object v7 = -7.008858340028162D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 29.67419927060944D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 31.778116563086225D;
    Object v6 = 1.7215537136911236D;
    Object v7 = -7.008858340028162D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 29.67419927060944D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 31.778116563086225D;
    Object v6 = 1.7215537136911236D;
    Object v7 = -7.008858340028162D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.optim.OptimizationData[]{null,null,null};
    Object v5 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).optimize(((org.apache.commons.math3.optim.OptimizationData[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    Object v5 = new double[]{50.198474460085386D,-20.56007482731805D};
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeCovariances(((double[])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{1.0D,1.0D};
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 34.660181436868655D;
    Object v1 = 1.0D;
    Object v2 = 3.1117649474149527D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).getRMS();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 34.660181436868655D;
    Object v1 = 1.0D;
    Object v2 = 3.1117649474149527D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    Object v5 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).getWeightSquareRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = new double[]{0.0D};
    Object v11 = 1.0D;
    Object v12 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v10),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)v3).getWeight();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    Object v5 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = new double[]{0.0D,15.261963705523216D,-8.500222355916177D};
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v10),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)v3).getTarget();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)v3).getTargetSize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{};
    Object v10 = 5.842533562818952D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{-40.44353123032426D};
    Object v10 = 23.343264599052247D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    Object v5 = new double[]{-6.715689784086813D};
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 34.660181436868655D;
    Object v1 = 1.0D;
    Object v2 = 3.1117649474149527D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{};
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    Object v5 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 48.32923987137933D;
    Object v1 = 25.255865352309883D;
    Object v2 = 1.0D;
    Object v3 = 1.0D;
    Object v4 = -1.7758884814639742D;
    Object v5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).getWeightSquareRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)v8).getTarget();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{-23.93810982062337D,-5.454412219829374D,0.0D};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(2147483647), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    Object v5 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).getChiSquare();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.optim.OptimizationData[]{null};
    Object v5 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).optimize(((org.apache.commons.math3.optim.OptimizationData[])v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
    Object v1 = new double[]{};
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v0).computeSigma(((double[])v1),(((java.lang.Double)v2).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
    Object v1 = new org.apache.commons.math3.optim.OptimizationData[]{null,null,null};
    Object v2 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v0).optimize(((org.apache.commons.math3.optim.OptimizationData[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 30.433352210135375D;
    Object v1 = 0.0D;
    Object v2 = 23.86634999203361D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{};
    Object v10 = 14.882461256246339D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    Object v5 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v0).getLowerBound();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D,-18.397214566025255D,1.0D};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v0).getLowerBound();
    Object v2 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)v3).getWeight();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = -25.346139212645614D;
    Object v1 = 18.129466414543938D;
    Object v2 = -6.600479267601105D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{-8.726815567997496D,2.0D};
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer)v3).getTargetSize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{1.0D,0.0D,25.60254252260673D};
    Object v5 = -10.137931847765278D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    Object v5 = new double[]{0.0D,1.0D};
    Object v6 = 5.624249160913587D;
    Object v7 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v5),(((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 48.32923987137933D;
    Object v1 = 25.255865352309883D;
    Object v2 = 1.0D;
    Object v3 = 1.0D;
    Object v4 = -1.7758884814639742D;
    Object v5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v5).getLowerBound();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer();
    Object v1 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v0).getStartPoint();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    Object v5 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getUpperBound();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getStartPoint();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{};
    Object v5 = -53.33733836310566D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 17.95981696904689D;
    Object v2 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(((org.apache.commons.math3.optim.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = -41.99494266484885D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 12.371730012257887D;
    Object v6 = -2.9583522085770673D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{0.0D,0.0D};
    Object v10 = -56.15477250922633D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 48.32923987137933D;
    Object v1 = 25.255865352309883D;
    Object v2 = 1.0D;
    Object v3 = 1.0D;
    Object v4 = -1.7758884814639742D;
    Object v5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{};
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v5).computeSigma(((double[])v6),(((java.lang.Double)v7).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -56.709121616067364D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 281.3187997873075D;
    Object v5 = -107.50107432756708D;
    Object v6 = 0.0D;
    Object v7 = -5.132359395577625D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -56.709121616067364D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 281.3187997873075D;
    Object v5 = -107.50107432756708D;
    Object v6 = 0.0D;
    Object v7 = -5.132359395577625D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 31.401564072077253D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 36.3125370504319D;
    Object v6 = 23.552834024912976D;
    Object v7 = -17.64643895003902D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{0.0D,0.0D,0.0D};
    Object v10 = 46.968728102151324D;
    Object v11 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v8).computeSigma(((double[])v9),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 21.809045806634938D;
    Object v1 = 1.9185457856373338D;
    Object v2 = -5.765785059692132D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{};
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).computeSigma(((double[])v4),(((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -56.709121616067364D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 281.3187997873075D;
    Object v5 = -107.50107432756708D;
    Object v6 = 0.0D;
    Object v7 = -5.132359395577625D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = -56.709121616067364D;
    Object v1 = 0.0D;
    Object v2 = 17.95981696904689D;
    Object v3 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 281.3187997873075D;
    Object v5 = -107.50107432756708D;
    Object v6 = 0.0D;
    Object v7 = -5.132359395577625D;
    Object v8 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31.401564072077253D;
    Object v2 = 0.0D;
    Object v3 = 17.95981696904689D;
    Object v4 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 36.3125370504319D;
    Object v7 = 23.552834024912976D;
    Object v8 = -17.64643895003902D;
    Object v9 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.optim.BaseOptimizer)v9).getConvergenceChecker();
    Object v11 = 0.0D;
    Object v12 = 48.50048191407134D;
    Object v13 = 0.0D;
    Object v14 = 21.545639451051983D;
    Object v15 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 31.401564072077253D;
    Object v2 = 0.0D;
    Object v3 = 17.95981696904689D;
    Object v4 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 36.3125370504319D;
    Object v7 = 23.552834024912976D;
    Object v8 = -17.64643895003902D;
    Object v9 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.optim.BaseOptimizer)v9).getConvergenceChecker();
    Object v11 = 0.0D;
    Object v12 = 48.50048191407134D;
    Object v13 = 0.0D;
    Object v14 = 21.545639451051983D;
    Object v15 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math3.optim.BaseOptimizer)v15).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v3).getLowerBound();
    Object v5 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v3).getWeightSquareRoot();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 36.8092467736826D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 0.8131264140287053D;
    Object v5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 17.95981696904689D;
    Object v2 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer(((org.apache.commons.math3.optim.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optim.BaseOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -28.519753771734884D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 36.8092467736826D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 0.8131264140287053D;
    Object v5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v5).getStartPoint();
    Object v7 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v5).getUpperBound();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -22.611547311966802D;
    Object v1 = -1.3388190822816715D;
    Object v2 = -48.061866460220834D;
    Object v3 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 36.8092467736826D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = 0.8131264140287053D;
    Object v5 = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v5).getStartPoint();
    Object v7 = new double[]{0.0D,0.0D,0.0D};
    Object v8 = 4.990719821328952D;
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer)v5).computeCovariances(((double[])v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
