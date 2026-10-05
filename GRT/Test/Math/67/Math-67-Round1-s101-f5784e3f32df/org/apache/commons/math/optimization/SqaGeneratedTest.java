package org.apache.commons.math.optimization;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 20.75636778599376D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = 1.0D;
    Object v11 = -1.2059729329734485D;
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.4005344617810822D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetMaximalIterationCount();
    Object v5 = null;
    Object v6 = 0;
    Object v7 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = -36.402450350182946D;
    Object v10 = 12.730385926634657D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(12.73038592648008D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 1.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v6).value((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = 30.530766195955575D;
    Object v11 = 33.44869174623708D;
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(32.59006618702145D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetRelativeAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 18.454455821901522D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getOptimaValues();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v6).value((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = 31.401564072077253D;
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(15.065469204068865D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -14.913013995983176D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getRelativeAccuracy();
    Object v6 = 0;
    Object v7 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = 51.211885462731395D;
    Object v10 = 25.925596333506792D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(38.05715160523062D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetAbsoluteAccuracy();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = 13.73691903078789D;
    Object v10 = 0.0D;
    Object v11 = 20.48995406798818D;
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(13.736919030601452D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v10 = 0.0D;
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getAbsoluteAccuracy();
    Object v6 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaximalIterationCount((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -26;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -17;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 18.376067285211157D;
    Object v9 = 0.0D;
    Object v10 = 30.61250058627419D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getIterationCount();
    org.junit.Assert.assertEquals((Object)(1929), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getResult();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetMaximalIterationCount();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getFunctionValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-10D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 22;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetRelativeAccuracy();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -66.44734593586877D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -10.651515055373448D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetAbsoluteAccuracy();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 49.73240190827342D;
    Object v9 = -15.647202187328878D;
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(49.73240190816445D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 1.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).setAbsoluteAccuracy((((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = 0.7350023554085959D;
    Object v13 = -18.198585879199232D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.7350023552516374D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).setMaxEvaluations((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = 0.0D;
    Object v10 = -39.03350879657651D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0235084350360003E-10D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-14D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).resetRelativeAccuracy();
    Object v9 = null;
    Object v10 = 0;
    Object v11 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = ((java.lang.Enum)v12).hashCode();
    Object v14 = 1.0D;
    Object v15 = 1.0D;
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).resetAbsoluteAccuracy();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getFunctionValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = -3.241388581421979D;
    Object v13 = 8.31748836890985D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(5.600194073075004D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = 0.0D;
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v6).value((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v10 = 42.25424921314953D;
    Object v11 = -19.010401955176295D;
    Object v12 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(42.25424921295325D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getFunctionValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = ((java.lang.Enum)v7).hashCode();
    Object v9 = 0.0D;
    Object v10 = -36.75720368065437D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.9055041165723903E-10D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = 9.83336121092186D;
    Object v12 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v10).value((((java.lang.Double)v11).doubleValue()));
    Object v13 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v14 = 1.0D;
    Object v15 = 0.0D;
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.4829367955026428D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = ((java.lang.Enum)v11).hashCode();
    Object v13 = 0.0D;
    Object v14 = -6.036496030396123D;
    Object v15 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-3.1212499804165112D), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = 0.0D;
    Object v9 = 54.40873239172807D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getOptimaValues();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-10D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = 0.0D;
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = 8.846772495809512D;
    Object v13 = 16.989322205008044D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(15.075148018873836D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).resetMaximalIterationCount();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).resetAbsoluteAccuracy();
    Object v9 = null;
    Object v10 = 0;
    Object v11 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = ((java.lang.Enum)v12).hashCode();
    Object v14 = 29.30571840300657D;
    Object v15 = 11.376546356702713D;
    Object v16 = 1.0D;
    Object v17 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertEquals((Object)(29.30571840286353D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = 0.0D;
    Object v13 = 0.0D;
    Object v14 = -32.55661649247917D;
    Object v15 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getOptima();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = 23.951091202046292D;
    Object v10 = 4.0D;
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(23.951091201878942D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 0.0D;
    Object v9 = 24.249706557017397D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(24.249706556914237D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = 31.64164131647253D;
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(15.280912867821582D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = 2.995567562363316D;
    Object v9 = -47.10192744875166D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.995567562203639D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -59;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).setAbsoluteAccuracy((((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getResult();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 26.492892161025207D;
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(26.492892160903253D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -16;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaxEvaluations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = 0.0D;
    Object v13 = 0.1D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.09999999983307589D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = 2.0D;
    Object v13 = 15.475517009252751D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(12.30765341314381D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).resetRelativeAccuracy();
    Object v9 = null;
    Object v10 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).setMaxEvaluations((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).resetRelativeAccuracy();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 3.6720088505721797D;
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getOptimaValues();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 1.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 27.990062009969442D;
    Object v9 = 30.969903215311795D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(30.96990321514048D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setAbsoluteAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = 1.0D;
    Object v12 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v10).value((((java.lang.Double)v11).doubleValue()));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = 1.0D;
    Object v15 = -30.59205237108616D;
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.9999999998362259D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = 25.957276364025557D;
    Object v9 = -12.93739295228506D;
    Object v10 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(25.957276363924183D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = -52.03661172427247D;
    Object v12 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v10).value((((java.lang.Double)v11).doubleValue()));
    Object v13 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v14 = 100.0D;
    Object v15 = -8.270266703485952D;
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(44.01742896725116D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = 2.0D;
    Object v13 = 0.0D;
    Object v14 = 0.0D;
    Object v15 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getOptimaValues();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetMaximalIterationCount();
    Object v5 = null;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).resetAbsoluteAccuracy();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-10D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getAbsoluteAccuracy();
    Object v6 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-10D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = -42.24567731972576D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 0.0D;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setRelativeAccuracy((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = 0.0D;
    Object v13 = 6.551867257110843D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(6.55186725697811D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 29;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v4).setMaximalIterationCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = -18.315270992257588D;
    Object v13 = 32.507776357753215D;
    Object v14 = 0.0D;
    Object v15 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).getOptimaValues();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    Object v14 = 0;
    Object v15 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v17 = 0.0D;
    Object v18 = 36.03582609893379D;
    Object v19 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v15),((org.apache.commons.math.optimization.GoalType)v16),(((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = 1.0D;
    Object v13 = 1.0D;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = 84.43251019548919D;
    Object v13 = Double.NaN;
    Object v14 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    Object v14 = 0;
    Object v15 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v17 = ((java.lang.Enum)v16).hashCode();
    Object v18 = 0.0D;
    Object v19 = -23.590966569266268D;
    Object v20 = -24.97279591796108D;
    Object v21 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v15),((org.apache.commons.math.optimization.GoalType)v16),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    Object v14 = 0;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).setMaxEvaluations((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = 0;
    Object v17 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v19 = 0.0D;
    Object v20 = 0.0D;
    Object v21 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v17),((org.apache.commons.math.optimization.GoalType)v18),(((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).resetMaximalIterationCount();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 8;
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v8).setMaximalIterationCount((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 39;
    Object v2 = -7L;
    Object v3 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v2).longValue()));
    Object v4 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v0),(((java.lang.Integer)v1).intValue()),((org.apache.commons.math.random.RandomGenerator)v3));
    Object v5 = 71;
    Object v6 = -7L;
    Object v7 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v4),(((java.lang.Integer)v5).intValue()),((org.apache.commons.math.random.RandomGenerator)v7));
    Object v9 = 0;
    Object v10 = -7L;
    Object v11 = new org.apache.commons.math.random.MersenneTwister((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.apache.commons.math.random.RandomGenerator)v11).nextGaussian();
    Object v13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(((org.apache.commons.math.optimization.UnivariateRealOptimizer)v8),(((java.lang.Integer)v9).intValue()),((org.apache.commons.math.random.RandomGenerator)v11));
    ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).resetRelativeAccuracy();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v18 = 5.1216990203957735D;
    Object v19 = -31.782992852780026D;
    Object v20 = ((org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer)v13).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v16),((org.apache.commons.math.optimization.GoalType)v17),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
