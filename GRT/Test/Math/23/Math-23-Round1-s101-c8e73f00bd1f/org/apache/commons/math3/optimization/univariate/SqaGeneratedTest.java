package org.apache.commons.math3.optimization.univariate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = -1.2307700629756966D;
    Object v1 = -30.979213940347215D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = -53;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 51.67303217334339D;
    Object v8 = -39.50532335659224D;
    Object v9 = -37.409648271489395D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = -11.622687879568035D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = -4.532126959261191D;
    Object v1 = -7.676226873527821D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 34;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v9 = -38.01090806546706D;
    Object v10 = -33.698980516326195D;
    Object v11 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 21.25324477250766D;
    Object v1 = -18.78960318267724D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = -6.180857591697286D;
    Object v8 = -23.809271088449336D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 14.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = 8.765952674254489D;
    Object v11 = 4.906553660854702D;
    Object v12 = 2.2180277969642628D;
    Object v13 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = -16.65780009349602D;
    Object v1 = 59.09618067524392D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 55.03758953985345D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 2;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = 0.0D;
    Object v8 = 2.0D;
    Object v9 = -12.3567466773875D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 2;
    Object v12 = new org.apache.commons.math3.analysis.function.Abs();
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = 57.70331509744498D;
    Object v15 = 26.594267927171444D;
    Object v16 = 4.152079546010852D;
    Object v17 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v11).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = 8.657122178144915D;
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 29;
    Object v11 = new org.apache.commons.math3.analysis.function.Abs();
    Object v12 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v13 = 0.0D;
    Object v14 = 0.0D;
    Object v15 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v10).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v11),((org.apache.commons.math3.optimization.GoalType)v12),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 25;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = 16.256162386905338D;
    Object v8 = -15.977506902265244D;
    Object v9 = 22.104290054649905D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 32;
    Object v12 = new org.apache.commons.math3.analysis.function.Abs();
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = 13.005993573171851D;
    Object v15 = 1.0D;
    Object v16 = 3.585231196166634D;
    Object v17 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v11).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 2;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v9 = 1.0D;
    Object v10 = 0.0D;
    Object v11 = 2.0D;
    Object v12 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = -18;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = 0.0D;
    Object v8 = -20.052418980547873D;
    Object v9 = 12.819691822970752D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = -64.49386761697906D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v9 = 3.0D;
    Object v10 = -22.412448200661924D;
    Object v11 = 8.712356850018192D;
    Object v12 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = -4.0662549548479205D;
    Object v8 = 1.0D;
    Object v9 = -17.046562184374178D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 27;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = -79.38236206729786D;
    Object v8 = -10.561525021882183D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMax();
    org.junit.Assert.assertEquals((Object)(-10.561525021882183D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 12.757739335434012D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = -53.53036972395418D;
    Object v1 = -14.224049903570505D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = 28.924892163875324D;
    Object v9 = 0.0D;
    Object v10 = 4.660442573986439D;
    Object v11 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -44.49259932082133D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 4.275206117576477D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = 22.20721973658181D;
    Object v8 = 44.0D;
    Object v9 = -30.94528513447014D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -35.484548418267345D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = 1;
    Object v9 = new org.apache.commons.math3.analysis.function.Abs();
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = 0.0D;
    Object v12 = 0.0D;
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).optimize((((java.lang.Integer)v8).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v7).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 36.46215278558125D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v7).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 4.275206117576477D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v2).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 18.292575222914635D;
    Object v1 = 0.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -25.816244668262154D;
    Object v2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 1.0D;
    Object v8 = -12.368222138727344D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = -26;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = 1.0D;
    Object v9 = 2.0D;
    Object v10 = -15.642723685990346D;
    Object v11 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 53.61819999654096D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 4.275206117576477D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v2).getGoalType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -34.42735182390328D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 53.07307418208157D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 7.069409974650858D;
    Object v1 = 69.1457607426515D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getGoalType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = 50;
    Object v9 = new org.apache.commons.math3.analysis.function.Abs();
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = 39.949833268692515D;
    Object v12 = 4.2535191411495425D;
    Object v13 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).optimize((((java.lang.Integer)v8).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = -7;
    Object v15 = new org.apache.commons.math3.analysis.function.Abs();
    Object v16 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v17 = 26.955039976956133D;
    Object v18 = -19.383615292770482D;
    Object v19 = -17.577669103591717D;
    Object v20 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).optimize((((java.lang.Integer)v14).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v15),((org.apache.commons.math3.optimization.GoalType)v16),(((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 7.069409974650858D;
    Object v1 = 69.1457607426515D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 20;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 14.486688669218392D;
    Object v8 = -0.8644656470102964D;
    Object v9 = 2.0D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).getGoalType();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 45.66377980601723D;
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.analysis.function.Abs();
    Object v12 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v13 = 3.0D;
    Object v14 = 0.0D;
    Object v15 = 0.0D;
    Object v16 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v10).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v11),((org.apache.commons.math3.optimization.GoalType)v12),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = -8.73040586204569D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = -14.777365053106504D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 0.08289459082058392D;
    Object v1 = 0.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 2;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 1.0D;
    Object v8 = -13.573734029324742D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 9.398827885347991D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = 1;
    Object v9 = new org.apache.commons.math3.analysis.function.Abs();
    Object v10 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v11 = 0.0D;
    Object v12 = 0.0D;
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).optimize((((java.lang.Integer)v8).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v7).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BrentOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 53.07307418208157D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 4;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = 26.16153376058448D;
    Object v9 = 53.67751748629195D;
    Object v10 = -11.089373080093052D;
    Object v11 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -43.48926840766726D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 4;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 32.588964880686916D;
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 35;
    Object v12 = new org.apache.commons.math3.analysis.function.Abs();
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = -15.553481318239022D;
    Object v15 = -41.61421586860737D;
    Object v16 = 0.0D;
    Object v17 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v11).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 27.658883572341626D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 30.254507751958954D;
    Object v1 = 2.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 3.5059084642153637D;
    Object v1 = 0.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 58.70306526797719D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = -39.410881467378466D;
    Object v1 = -31.95391377771014D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 30.254507751958954D;
    Object v1 = 2.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = 0;
    Object v9 = new org.apache.commons.math3.analysis.function.Abs();
    Object v10 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v11 = 22.765234488269105D;
    Object v12 = 0.0D;
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).optimize((((java.lang.Integer)v8).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 4;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v9 = 0.0D;
    Object v10 = -14.482266839176198D;
    Object v11 = 11.57835779318961D;
    Object v12 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 24;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = 24.879652523125348D;
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 74;
    Object v11 = new org.apache.commons.math3.analysis.function.Abs();
    Object v12 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v13 = 0.0D;
    Object v14 = -5.547771274997611D;
    Object v15 = 0.0D;
    Object v16 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v10).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v11),((org.apache.commons.math3.optimization.GoalType)v12),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 30.254507751958954D;
    Object v1 = 2.0D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
    Object v8 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v7).getStartValue();
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMax();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = 0.0D;
    Object v11 = 10.218414287586551D;
    Object v12 = -7.349991876940532D;
    Object v13 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = -33.29046384831481D;
    Object v8 = -28.64079288444977D;
    Object v9 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getStartValue();
    org.junit.Assert.assertEquals((Object)(-30.96562836638229D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 7.069409974650858D;
    Object v1 = 69.1457607426515D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = 17.746755956954452D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v9 = -83.78637693742984D;
    Object v10 = 8.882631041740428D;
    Object v11 = 51.838340616887514D;
    Object v12 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = Double.NaN;
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = -15.231603322666885D;
    Object v8 = 0.0D;
    Object v9 = 45.78044231887779D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = 0.0D;
    Object v9 = 1.0D;
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 41.91387306086511D;
    Object v1 = -4.476424371868388D;
    Object v2 = 30.902282905771397D;
    Object v3 = 12.757739335434012D;
    Object v4 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v5 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v4));
    Object v6 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v5).getConvergenceChecker();
    Object v7 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = -3;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = -34.11859776673721D;
    Object v7 = ((org.apache.commons.math3.analysis.UnivariateFunction)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v9 = 7.569283695907458D;
    Object v10 = 46.85010916997503D;
    Object v11 = 1.0D;
    Object v12 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).getMin();
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 7.295800081927902D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = -3.1033623087956723D;
    Object v8 = 0.0D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -66.91696763935371D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 4.973211366369475D;
    Object v1 = 4.372782321483361D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = -48;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = 0.0D;
    Object v8 = 34.91609073195271D;
    Object v9 = 1.0D;
    Object v10 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 5.821030809785553D;
    Object v1 = 21.3227676637344D;
    Object v2 = new org.apache.commons.math3.optimization.SimpleVectorValueChecker();
    Object v3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optimization.ConvergenceChecker)v2));
    Object v4 = -33;
    Object v5 = new org.apache.commons.math3.analysis.function.Abs();
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = -39.65256648428315D;
    Object v9 = 64.9024413982728D;
    Object v10 = 0.5D;
    Object v11 = ((org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math3.analysis.UnivariateFunction)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.TooManyEvaluationsException");
    } catch (org.apache.commons.math3.exception.TooManyEvaluationsException expected) { }
  }
}
