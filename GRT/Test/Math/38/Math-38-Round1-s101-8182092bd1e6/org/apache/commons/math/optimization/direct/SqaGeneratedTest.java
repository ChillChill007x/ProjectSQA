package org.apache.commons.math.optimization.direct;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{0.0D,1.0D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = new double[]{-32.401607254737215D,1.0D,-9.517227601271408D};
    Object v12 = new double[]{0.0D,0.0D,-2.0518911168377927D};
    Object v13 = new double[]{0.0D,1.0D,1.0D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 19;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{3.6397728814591948D,2.6760354909808934D};
    Object v10 = new double[]{};
    Object v11 = new double[]{0.0D,2.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getUpperBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = -7.209035027246509D;
    Object v2 = -15.11889672826828D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 50;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{0.0D,1.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getGoalType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -12;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{0.0D,0.0D,0.0D};
    Object v11 = new double[]{-14.132865935114854D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{0.0D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = new double[]{};
    Object v12 = new double[]{0.0D,28.546105304647437D,-1.684676864310371D};
    Object v13 = new double[]{4.307515311158044D,1.0D,0.0D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 40;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{10.399128709225772D,1.0D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = new double[]{0.0D,1.0D,-10.231204904309239D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -8;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{-36.80852901539695D,35.979188106135055D,0.0D};
    Object v10 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{-2.383811419687738D,-28.03923832022797D};
    Object v11 = new double[]{0.0D,31.30903015198001D,-43.58809139446111D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getUpperBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{7.765952674254488D,5.906553660854702D};
    Object v10 = new double[]{-44.56747457800534D,-32.659453119482215D};
    Object v11 = new double[]{60.09618067524392D,1.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 56;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new double[]{-33.200363917931156D};
    Object v11 = new double[]{1.0D};
    Object v12 = new double[]{-6.511455833023255D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new double[]{1.0D,2.0D};
    Object v11 = new double[]{0.0D};
    Object v12 = new double[]{1.0D,0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -43;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{1.0D,53.405170497659306D};
    Object v10 = new double[]{0.0D,-40.31852074993633D,1.0D};
    Object v11 = new double[]{0.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 39;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{-2.376803381701893D,0.014908738257925602D,0.0D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = new double[]{-5.596312033222256D,-42.628646953505815D,1.0D};
    Object v12 = new double[]{0.0D,2.0D,1.0D};
    Object v13 = new double[]{0.0D,9.057025503647255D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 17;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{13.0D};
    Object v10 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 11;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{-29.079660565625844D,1.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{2.423236742660201D,0.0D,0.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -42;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{0.0D,50.35382373798969D};
    Object v11 = new double[]{0.0D,0.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{0.0D,0.0D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = new double[]{15.274526709510582D};
    Object v13 = new double[]{};
    Object v14 = new double[]{2.0D,-29.264857161740757D,-16.68406890559555D};
    Object v15 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v12),((double[])v13),((double[])v14));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{33.820967170056505D,1.0D};
    Object v12 = new double[]{30.086504121085444D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -13;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{1.0D};
    Object v10 = new double[]{1.0D,0.0D};
    Object v11 = new double[]{0.0D,47.7616595187967D,1.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = new double[]{};
    Object v11 = new double[]{0.0D,11.066034769210303D,1.0D};
    Object v12 = new double[]{};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{3.0D};
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{0.0D,-75.81835903079607D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 3;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{0.0D,0.0D,24.23799017022555D};
    Object v10 = new double[]{};
    Object v11 = new double[]{1.0D,1.0D,30.849631954701252D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -16;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{45.44562008061996D,0.0D,74.760814128366D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = new double[]{-4.547771274997611D};
    Object v12 = new double[]{3.7775748431375704D,-32.40345812032844D,1.0D};
    Object v13 = new double[]{0.0D,93.6767403464871D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getGoalType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new double[]{0.0D};
    Object v11 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 5;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{-57.69028059758177D,30.078038648544847D,1.0D};
    Object v10 = new double[]{0.0D,43.96708113012942D,0.0D};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getStartPoint();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getUpperBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 2;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{-40.466686686439324D};
    Object v10 = new double[]{-14.521062603010442D,24.15421875964186D,0.0D};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getGoalType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 2;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{0.0D,40.67776062541422D};
    Object v12 = new double[]{1.0D,1.0D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -14;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{10.896273536441827D};
    Object v11 = new double[]{0.0D,-10.684388921170662D,14.806894232043819D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 8;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new double[]{42.01034020918991D,Double.POSITIVE_INFINITY};
    Object v11 = new double[]{2.0D};
    Object v12 = new double[]{1.0D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getUpperBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{41.055824218237255D,49.044023636213375D,-12.254849192614367D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.function.Max();
    Object v4 = 1.0D;
    Object v5 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{-9.894369058740937D,0.0D};
    Object v8 = new double[]{};
    Object v9 = new double[]{28.79362979215251D,0.0D,23.747427487701785D};
    Object v10 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7),((double[])v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -28;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = new double[]{-35.8081756992363D,0.0D};
    Object v11 = new double[]{};
    Object v12 = new double[]{0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 3;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{1.0D,2.0D};
    Object v10 = new double[]{};
    Object v11 = new double[]{12.303139317161802D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 2;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{-19.77209138350173D,1.0D};
    Object v10 = new double[]{11.777961699055764D};
    Object v11 = new double[]{14.390572922128134D,-29.655928419510992D,0.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.analysis.function.Max();
    Object v4 = 1.0D;
    Object v5 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,79.9080908733555D,0.0D};
    Object v7 = ((org.apache.commons.math.analysis.MultivariateFunction)v5).value(((double[])v6));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{2.2789426099357897D,1.0D,35.5522960637307D};
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{31.725695801840686D,0.0D,-39.18770562486598D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v5),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getGoalType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 185.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -25;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{1.0D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = new double[]{};
    Object v12 = new double[]{0.0D};
    Object v13 = new double[]{12.555858991243642D,0.0D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 40;
    Object v1 = -3.1766024976716554D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{1.0D};
    Object v11 = new double[]{-56.346712882642535D,1.0D,51.54941327946778D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = 50;
    Object v3 = new org.apache.commons.math.analysis.function.Max();
    Object v4 = 1.0D;
    Object v5 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{39.87303395163366D,43.19450781340934D,-6.366756520143013D};
    Object v8 = new double[]{-38.73155233236267D};
    Object v9 = new double[]{};
    Object v10 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7),((double[])v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -2;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{};
    Object v11 = new double[]{-10.743300603669947D,0.0D,51.588550538597694D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.566759516141804D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = new double[]{-18.867147466422395D,2.0D,0.0D};
    Object v12 = new double[]{0.0D};
    Object v13 = new double[]{0.0D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = -70;
    Object v3 = new org.apache.commons.math.analysis.function.Max();
    Object v4 = 1.0D;
    Object v5 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new double[]{13.047412482011177D};
    Object v9 = new double[]{0.0D};
    Object v10 = new double[]{2.0D};
    Object v11 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v8),((double[])v9),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 4;
    Object v1 = -7.170353479478981D;
    Object v2 = -21.5799290823247D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = -7.170353479478981D;
    Object v2 = -21.5799290823247D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{1.0D,0.0D,-0.4631300948954478D};
    Object v9 = ((org.apache.commons.math.analysis.MultivariateFunction)v7).value(((double[])v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = new double[]{0.0D};
    Object v12 = new double[]{0.0D};
    Object v13 = new double[]{-71.38007325955608D,-30.528395213110493D};
    Object v14 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v10),((double[])v11),((double[])v12),((double[])v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = -3.1766024976716554D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).getLowerBound();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 2147483647;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -2;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = -7.170353479478981D;
    Object v2 = -21.5799290823247D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{8.102206339840759D};
    Object v10 = new double[]{0.0D,0.0D};
    Object v11 = new double[]{0.11450040441490184D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 24.925596333506792D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -26;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{};
    Object v10 = new double[]{-26.150741082864446D,-1.7886450569202874D,0.0D};
    Object v11 = new double[]{-25.844573829643437D,2.0D};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.math.analysis.function.Max();
    Object v4 = 1.0D;
    Object v5 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = new double[]{1.0D,35.63485080097661D,1.0D};
    Object v8 = new double[]{2.0D,0.0D,0.0D};
    Object v9 = new double[]{14.615421070272385D,19.426649400559636D,2.0D};
    Object v10 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v1).optimize((((java.lang.Integer)v2).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7),((double[])v8),((double[])v9));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 4;
    Object v1 = -7.170353479478981D;
    Object v2 = -21.5799290823247D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{37.853578163062295D,1.0D};
    Object v10 = new double[]{0.0D};
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9),((double[])v10),((double[])v11));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 32;
    Object v1 = 4.0D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 24;
    Object v5 = new org.apache.commons.math.analysis.function.Max();
    Object v6 = 1.0D;
    Object v7 = org.apache.commons.math.analysis.FunctionUtils.collector(((org.apache.commons.math.analysis.BivariateRealFunction)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new double[]{13.094268039213834D};
    Object v11 = new double[]{};
    Object v12 = new double[]{1.0D,0.0D,0.0D};
    Object v13 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer)v3).optimize((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.analysis.MultivariateFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10),((double[])v11),((double[])v12));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 4;
    Object v1 = -7.170353479478981D;
    Object v2 = -21.5799290823247D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer)v3).getGoalType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 40;
    Object v1 = -3.1766024976716554D;
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.direct.BOBYQAOptimizer)v3).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
