package org.apache.commons.math.optimization.univariate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 1.0D;
    Object v7 = 20.75636778599376D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.816299548704071D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    Object v2 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-9D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 0.0D;
    Object v7 = -76.33220487171837D;
    Object v8 = 14.933704987793641D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-23.0660845840386D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 48.589278342601325D;
    Object v4 = 24.10733809825744D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = 31.78268722840289D;
    Object v9 = 2.0D;
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getGoalType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = -20.717405929079668D;
    Object v7 = -19.833414209732787D;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
    org.junit.Assert.assertEquals((Object)(-2.7066438794976315E-10D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = 1.0D;
    Object v7 = 31.401564072077253D;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
    org.junit.Assert.assertEquals((Object)(1.9214354114784897E-11D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    Object v2 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(1000), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -13.913013995983176D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = 19.17369301629926D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getRelativeAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-9D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 0;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getAbsoluteAccuracy();
    org.junit.Assert.assertEquals((Object)(1.0E-11D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -45.998804159614544D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = -85.63033074899917D;
    Object v8 = 0.0D;
    Object v9 = -24.792968977091732D;
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-74.41092821225179D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 50.40523450982213D;
    Object v7 = -18.435647370921227D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(18.11404382308176D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 2;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = -27.697321007682028D;
    Object v7 = 1.0D;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
    org.junit.Assert.assertEquals((Object)(-3.4899649527663684E-11D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -40;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -72.52476594651095D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = -55.98789438685358D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 13.017783820047667D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(1000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 28;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = 1.0D;
    Object v7 = 1.0D;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
    org.junit.Assert.assertEquals((Object)(1.7765931850481667E-11D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 32;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    Object v2 = 48.589278342601325D;
    Object v3 = 24.10733809825744D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = 2.0D;
    Object v8 = 0.11382324131596004D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.4334854823961662D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = -19.92318615651906D;
    Object v7 = 1.0D;
    Object v8 = -24.333610792255108D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(-48.58927834260132D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetRelativeAccuracy();
    Object v1 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 0.0D;
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 48.589278342601325D;
    Object v10 = 24.10733809825744D;
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = -17.046562184374178D;
    Object v15 = 27.724774384864673D;
    Object v16 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(5.342991344468823D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 2.0D;
    Object v7 = -55.0109839898666D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
    org.junit.Assert.assertEquals((Object)(-37.40093941128401D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 1.0D;
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 48.589278342601325D;
    Object v10 = 24.10733809825744D;
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v14 = 89.707690401267D;
    Object v15 = -57.37123430167255D;
    Object v16 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14.59548855084837D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    Object v2 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -2;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = 1.0D;
    Object v7 = 0.0D;
    Object v8 = -9.82564901266286D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-3.127604689398569D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = 0.0D;
    Object v7 = -9.525678699314433D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-5.733941930627458D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getIterationCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -24.456809093142855D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -24.68592637806001D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 20;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -2.4429613373084935D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = 48.589278342601325D;
    Object v4 = 24.10733809825744D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = -26.391458232060966D;
    Object v9 = 0.0D;
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -23;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = -16.108283361797376D;
    Object v7 = 32.05016982956377D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(7.167427412130873D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -62;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 0;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -11.09076529930797D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.13031686164884965D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -16.739245372844003D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -19.02994688734465D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getGoalType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -21.19425022659757D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetAbsoluteAccuracy();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).resetMaximalIterationCount();
    Object v1 = null;
    Object v2 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -41.66999934655001D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 2.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getResult();
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 31;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 1;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setMaximalIterationCount((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 0.0D;
    Object v7 = -15.253450710514933D;
    Object v8 = 5.328166847978686D;
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.univariate.BrentOptimizer)v0).doOptimize();
    org.junit.Assert.assertEquals((Object)(5.328166847978686D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = 7.672802344963755D;
    Object v8 = 0.0D;
    Object v9 = 100.0D;
    Object v10 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(59.424489099714826D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -58.783301450404146D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 34;
    ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 0.0D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setRelativeAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = 48.589278342601325D;
    Object v2 = 24.10733809825744D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.optimization.fitting.HarmonicFunction((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v6 = 17.727561652598112D;
    Object v7 = 36.44498204780637D;
    Object v8 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).optimize(((org.apache.commons.math.analysis.UnivariateRealFunction)v4),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer)v0).getFunctionValue();
    org.junit.Assert.assertEquals((Object)(-48.589278342601304D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
    Object v1 = -47.29333634736472D;
    ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).setAbsoluteAccuracy((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.ConvergingAlgorithmImpl)v0).getMaximalIterationCount();
    org.junit.Assert.assertEquals((Object)(100), v3);
  }
}
