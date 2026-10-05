package org.apache.commons.math3.optimization.direct;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v0).getStatisticsSigmaHistory();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{0.0D};
    Object v2 = -9;
    Object v3 = -22.123136540295505D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{0.0D};
    Object v2 = -9;
    Object v3 = -22.123136540295505D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{0.0D};
    Object v2 = -9;
    Object v3 = -22.123136540295505D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 0;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = new double[]{};
    Object v20 = new double[]{1.0D};
    Object v21 = new double[]{-56.12832566766406D,1.0D,0.0D};
    Object v22 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19),((double[])v20),((double[])v21));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 35;
    Object v1 = new double[]{};
    Object v2 = 28;
    Object v3 = -39.51422694984473D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 2;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{0.0D};
    Object v2 = -9;
    Object v3 = -22.123136540295505D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 2;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = new double[]{41.67554857559526D,0.0D,1.0D};
    Object v20 = new double[]{-21.851791746181416D};
    Object v21 = new double[]{};
    Object v22 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19),((double[])v20),((double[])v21));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 35;
    Object v1 = new double[]{};
    Object v2 = 28;
    Object v3 = -39.51422694984473D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 2;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 2;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = new double[]{4.323453995549326D,0.0D,-39.906694095779976D};
    Object v20 = new double[]{35.02603043367589D};
    Object v21 = new double[]{1.0D,1.0D};
    Object v22 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19),((double[])v20),((double[])v21));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 35;
    Object v1 = new double[]{};
    Object v2 = 28;
    Object v3 = -39.51422694984473D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 2;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{0.0D};
    Object v2 = -9;
    Object v3 = -22.123136540295505D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).getStatisticsFitnessHistory();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,1.0D,-20.154699496179795D};
    Object v2 = 5;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,1.0D,-20.154699496179795D};
    Object v2 = 5;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 3;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = new double[]{0.0D,-3.9333457176472484D,1.0D};
    Object v20 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{0.0D};
    Object v2 = -9;
    Object v3 = -22.123136540295505D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 0;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = new double[]{0.0D,0.0D,26.294521727017877D};
    Object v20 = new double[]{};
    Object v21 = new double[]{15.00533613855921D,0.0D};
    Object v22 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19),((double[])v20),((double[])v21));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 35;
    Object v1 = new double[]{};
    Object v2 = 28;
    Object v3 = -39.51422694984473D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 2;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v13).getGoalType();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = new double[]{};
    Object v9 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsFitnessHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 6;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = new double[]{15.271465453829133D,50.40523450982213D,-18.435647370921227D};
    Object v9 = new double[]{-5.765785059692132D,-23.93810982062337D,0.0D};
    Object v10 = new double[]{55.62100905787023D};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -7;
    Object v1 = new double[]{-50.81732047727794D};
    Object v2 = 0;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 30;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,1.0D,-20.154699496179795D};
    Object v2 = 5;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 16;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new double[]{0.0D,22.170921184551304D,-36.18005112325593D};
    Object v19 = ((org.apache.commons.math3.analysis.MultivariateFunction)v17).value(((double[])v18));
    Object v20 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v21 = new double[]{};
    Object v22 = new double[]{73.71356153507249D,0.0D,-61.911733981749705D};
    Object v23 = new double[]{-14.521392446136796D};
    Object v24 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v20),((double[])v21),((double[])v22),((double[])v23));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 35;
    Object v1 = new double[]{};
    Object v2 = 28;
    Object v3 = -39.51422694984473D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 2;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v13).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = new double[]{1.0D,22.6177351743273D};
    Object v10 = new double[]{-0.6799640078209918D,1.0D};
    Object v11 = new double[]{1.0D};
    Object v12 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 8;
    Object v1 = new double[]{0.0D};
    Object v2 = 1;
    Object v3 = 1.5469504317089564D;
    Object v4 = false;
    Object v5 = -10;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,-34.00110654385528D,0.0D};
    Object v2 = 1;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 46;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.math3.random.RandomGenerator)v8).nextGaussian();
    Object v10 = true;
    Object v11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).getUpperBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 29;
    Object v1 = new double[]{25.629058071211126D,0.0D,-9.256466788758798D};
    Object v2 = 1;
    Object v3 = 0.0D;
    Object v4 = true;
    Object v5 = -16;
    Object v6 = -1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsMeanHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{2.0D,0.0D,48.4012118402668D};
    Object v2 = 1;
    Object v3 = 1.0D;
    Object v4 = false;
    Object v5 = -52;
    Object v6 = 9;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,1.0D,-20.154699496179795D};
    Object v2 = 5;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).getUpperBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 17;
    Object v1 = new double[]{1.8394078923012958D,-19.92318615651906D,0.0D};
    Object v2 = -24;
    Object v3 = 0.0D;
    Object v4 = true;
    Object v5 = -13;
    Object v6 = 10;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = 31;
    ((org.apache.commons.math3.random.RandomGenerator)v8).setSeed((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = false;
    Object v12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = new double[]{17.993245196684075D,33.1088609505892D,0.0D};
    Object v9 = new double[]{20.09599005031571D};
    Object v10 = new double[]{41.458983079374704D,0.0D,0.0D};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = -7;
    Object v1 = new double[]{-50.81732047727794D};
    Object v2 = 0;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 30;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,1.0D,-20.154699496179795D};
    Object v2 = 5;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).getStatisticsSigmaHistory();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 29;
    Object v1 = new double[]{25.629058071211126D,0.0D,-9.256466788758798D};
    Object v2 = 1;
    Object v3 = 0.0D;
    Object v4 = true;
    Object v5 = -16;
    Object v6 = -1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{1.0D,-23.955796603603805D,-20.70703743853697D};
    Object v2 = 1;
    Object v3 = 0.0D;
    Object v4 = false;
    Object v5 = 2;
    Object v6 = -10;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = 1L;
    ((org.apache.commons.math3.random.RandomGenerator)v8).setSeed((((java.lang.Long)v9).longValue()));
    Object v10 = null;
    Object v11 = true;
    Object v12 = -36.36984231045736D;
    Object v13 = 3.0D;
    Object v14 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 8;
    Object v1 = new double[]{0.0D};
    Object v2 = 1;
    Object v3 = 1.5469504317089564D;
    Object v4 = false;
    Object v5 = -10;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v10).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{-2.475402353339831D};
    Object v2 = 0;
    Object v3 = -7.718237427624977D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{-25.167967012353483D,Double.NaN,-13.598387508437705D};
    Object v2 = -32;
    Object v3 = -29.684626825177293D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 2;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = new double[]{};
    Object v9 = new double[]{};
    Object v10 = new double[]{0.0D};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = -29;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = new double[]{0.0D,50.74367855929191D};
    Object v9 = new double[]{};
    Object v10 = new double[]{1.0D,51.35382373798969D};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 15;
    Object v1 = new double[]{0.0D,0.0D};
    Object v2 = 0;
    Object v3 = -0.25129154389178465D;
    Object v4 = false;
    Object v5 = 0;
    Object v6 = 39;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = new double[]{6.572216246456455D,Double.NaN,-21.956850883129427D};
    Object v9 = new double[]{-48.52145217142688D,Double.NaN,1.0D};
    Object v10 = new double[]{0.0D,69.56154334058986D};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -19;
    Object v1 = new double[]{17.095190264312635D};
    Object v2 = 1;
    Object v3 = -34.27946626922266D;
    Object v4 = true;
    Object v5 = -58;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 0.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,-9.23357475557783D};
    Object v2 = 1;
    Object v3 = -21.765098334133576D;
    Object v4 = true;
    Object v5 = 16;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)-86),Byte.valueOf((byte)3)};
    ((org.apache.commons.math3.random.RandomGenerator)v8).nextBytes(((byte[])v9));
    Object v10 = null;
    Object v11 = true;
    Object v12 = -36.36984231045736D;
    Object v13 = 3.0D;
    Object v14 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v11).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
    Object v1 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -16;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = -20;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = 0;
    Object v3 = 5.550573518832039D;
    Object v4 = false;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,1.0D,-20.154699496179795D};
    Object v2 = 5;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsDHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 12;
    Object v1 = new double[]{0.0D};
    Object v2 = -28;
    Object v3 = 0.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getGoalType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.696107051865973D,0.0D};
    Object v2 = -67;
    Object v3 = 0.0D;
    Object v4 = false;
    Object v5 = 2;
    Object v6 = -6;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = 0;
    Object v3 = 5.550573518832039D;
    Object v4 = false;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v13).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsFitnessHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 53;
    Object v1 = new double[]{-34.42735182390328D,0.0D,-30.264857161740757D};
    Object v2 = -15;
    Object v3 = -34.72273874915635D;
    Object v4 = true;
    Object v5 = 10;
    Object v6 = -23;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 8;
    Object v1 = new double[]{0.0D};
    Object v2 = 1;
    Object v3 = 1.5469504317089564D;
    Object v4 = false;
    Object v5 = -10;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v10).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsMeanHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -58;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 33.63952249165655D;
    Object v4 = false;
    Object v5 = 24;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,1.0D,-30.819288336347487D};
    Object v2 = 50;
    Object v3 = 41.449833268692515D;
    Object v4 = true;
    Object v5 = 4;
    Object v6 = -7;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -58;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 33.63952249165655D;
    Object v4 = false;
    Object v5 = 24;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).getStatisticsSigmaHistory();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = 0;
    Object v3 = 5.550573518832039D;
    Object v4 = false;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -17;
    Object v1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,1.0D,-30.819288336347487D};
    Object v2 = 50;
    Object v3 = 41.449833268692515D;
    Object v4 = true;
    Object v5 = 4;
    Object v6 = -7;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 20;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = new double[]{48.24824890042065D};
    Object v20 = new double[]{};
    Object v21 = new double[]{18.458361874068583D,0.0D,0.0D};
    Object v22 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19),((double[])v20),((double[])v21));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{};
    Object v2 = 1;
    Object v3 = 0.0D;
    Object v4 = true;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -31;
    Object v1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -31;
    Object v1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v1).getStatisticsMeanHistory();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsSigmaHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,0.8778544277223498D};
    Object v2 = 0;
    Object v3 = 2.122794973333228D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -13;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 4.74642285362955D;
    Object v4 = false;
    Object v5 = 51;
    Object v6 = -39;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = 0;
    Object v11 = new double[]{1.0D,0.0D};
    Object v12 = 0;
    Object v13 = 5.550573518832039D;
    Object v14 = false;
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = 28L;
    Object v18 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v17).longValue()));
    Object v19 = false;
    Object v20 = -36.36984231045736D;
    Object v21 = 3.0D;
    Object v22 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v10).intValue()),((double[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),((org.apache.commons.math3.random.RandomGenerator)v18),(((java.lang.Boolean)v19).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v22));
    Object v24 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v23).getConvergenceChecker();
    Object v25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = -31;
    Object v1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,0.8778544277223498D};
    Object v2 = 0;
    Object v3 = 2.122794973333228D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = new double[]{};
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{1.0D,1.0D,6.993751070881854D};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -25;
    Object v1 = new double[]{};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsDHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -17;
    Object v1 = new double[]{0.0D,32.588964880686916D,0.0D};
    Object v2 = 0;
    Object v3 = 34.302572553537075D;
    Object v4 = true;
    Object v5 = 20;
    Object v6 = -7;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 2;
    Object v1 = new double[]{35.92512853842733D};
    Object v2 = -6;
    Object v3 = 30.645012256736685D;
    Object v4 = true;
    Object v5 = 2;
    Object v6 = 3;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = -20;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = 0;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = new double[]{-14.667842758991291D};
    Object v20 = new double[]{-11.415611691348804D,15.185171836196785D,-2.8963041931896747D};
    Object v21 = new double[]{26.890325126695586D};
    Object v22 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v18),((double[])v19),((double[])v20),((double[])v21));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v2).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v2).getStatisticsSigmaHistory();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{1.0D,0.0D};
    Object v2 = 0;
    Object v3 = 5.550573518832039D;
    Object v4 = false;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 32;
    Object v1 = new double[]{0.0D,-39.17770329414347D};
    Object v2 = 0;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = -27;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = 0;
    Object v11 = new double[]{0.0D,8.965343892474875D};
    Object v12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v10).intValue()),((double[])v11));
    Object v13 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer)v12).getConvergenceChecker();
    Object v14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = new double[]{35.92512853842733D};
    Object v2 = -6;
    Object v3 = 30.645012256736685D;
    Object v4 = true;
    Object v5 = 2;
    Object v6 = 3;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = false;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = new double[]{};
    Object v2 = 0;
    Object v3 = 1.0D;
    Object v4 = true;
    Object v5 = 0;
    Object v6 = -20;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = ((org.apache.commons.math3.optimization.direct.CMAESOptimizer)v13).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new double[]{0.0D,8.965343892474875D};
    Object v2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1));
    Object v3 = 0;
    Object v4 = new org.apache.commons.math3.analysis.function.Divide();
    Object v5 = 9.410872512512459D;
    Object v6 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = new double[]{0.0D,-7.645603369641307D};
    Object v9 = new double[]{0.0D,0.1780795754470089D,3.786282606263579D};
    Object v10 = new double[]{};
    Object v11 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v2).optimize((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v6),((org.apache.commons.math3.optimization.GoalType)v7),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 53;
    Object v1 = new double[]{-34.42735182390328D,0.0D,-30.264857161740757D};
    Object v2 = -15;
    Object v3 = -34.72273874915635D;
    Object v4 = true;
    Object v5 = 10;
    Object v6 = -23;
    Object v7 = 28L;
    Object v8 = new org.apache.commons.math3.random.Well19937a((((java.lang.Long)v7).longValue()));
    Object v9 = true;
    Object v10 = -36.36984231045736D;
    Object v11 = 3.0D;
    Object v12 = new org.apache.commons.math3.optimization.SimpleValueChecker((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()),((double[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.random.RandomGenerator)v8),(((java.lang.Boolean)v9).booleanValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v12));
    Object v14 = -35;
    Object v15 = new org.apache.commons.math3.analysis.function.Divide();
    Object v16 = 9.410872512512459D;
    Object v17 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new double[]{-15.145127118453406D};
    Object v19 = ((org.apache.commons.math3.analysis.MultivariateFunction)v17).value(((double[])v18));
    Object v20 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v21 = new double[]{48.504746496238994D};
    Object v22 = new double[]{};
    Object v23 = new double[]{Double.POSITIVE_INFINITY};
    Object v24 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v13).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v17),((org.apache.commons.math3.optimization.GoalType)v20),((double[])v21),((double[])v22),((double[])v23));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = -31;
    Object v1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = 23;
    Object v3 = new org.apache.commons.math3.analysis.function.Divide();
    Object v4 = 9.410872512512459D;
    Object v5 = org.apache.commons.math3.analysis.FunctionUtils.collector(((org.apache.commons.math3.analysis.BivariateFunction)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = new double[]{0.0D,-7.322946999332979D,1.0D};
    Object v8 = new double[]{13.641030045652379D,0.0D};
    Object v9 = new double[]{1.0D};
    Object v10 = ((org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math3.analysis.MultivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),((double[])v7),((double[])v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }
}
