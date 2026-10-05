package org.apache.commons.math.optimization.direct;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[][]{null,null,null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 50.89112988483847D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = 0.0D;
    Object v2 = 4.09243598010663D;
    Object v3 = new org.apache.commons.math.optimization.SimpleRealPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.RealConvergenceChecker)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 50.89112988483847D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 14;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v0).iterateSimplex(((java.util.Comparator)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{-2.7499531158275237D,-57.95219156632775D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = java.util.Comparator.naturalOrder();
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = ((java.util.Comparator)v1).thenComparing(((java.util.Comparator)v2));
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v0).iterateSimplex(((java.util.Comparator)v1));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = new double[]{1.0D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[][]{null,null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{1.0D,-37.03137830450715D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v3 = new double[]{1.0D,51.02823073030953D};
    Object v4 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v1),((org.apache.commons.math.optimization.GoalType)v2),((double[])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = -43;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Comparator)v3).thenComparing(((java.util.function.Function)v4));
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(2147483647), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[][]{null,null,null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-0.7974077498235307D,1.0D,1.0D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = 30;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{27.078808203196893D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(2147483647), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[][]{null,null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = new double[]{0.0D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = new double[]{1.0D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v0).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = new double[]{-8.833949095140632D,-58.7597304792323D,2.741640726141629D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{50.40523450982213D,-18.435647370921227D,3.658827628619637D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = new double[]{17.878029867710744D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v0).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 4.09243598010663D;
    Object v5 = new org.apache.commons.math.optimization.SimpleRealPointChecker((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setConvergenceChecker(((org.apache.commons.math.optimization.RealConvergenceChecker)v5));
    Object v6 = null;
    Object v7 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = new double[]{0.0D,-9.642247531366282D};
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{61.31483024007956D,-12.902463090055681D,12.54093144243492D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    Object v5 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[][])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = new double[]{1.0D,31.77988404927382D};
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = 0.0D;
    Object v2 = 4.09243598010663D;
    Object v3 = new org.apache.commons.math.optimization.SimpleRealPointChecker((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.RealConvergenceChecker)v3));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = new double[]{0.0D,-18.63771400537312D,0.0D};
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{36.141444528423634D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(2147483647), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 18;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.Comparator.naturalOrder();
    Object v6 = ((java.util.Comparator)v3).thenComparing(((java.util.function.Function)v4),((java.util.Comparator)v5));
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -23;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = java.util.Comparator.naturalOrder();
    Object v6 = ((java.util.Comparator)v5).reversed();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = new double[]{0.0D,38.11961530882972D,0.0D};
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -10.383788034074895D;
    Object v1 = 19.0232963088862D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{4.152079546010852D,8.657122178144915D,0.0D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = new double[]{2.0D,31.782677797448514D};
    Object v7 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    Object v6 = new double[]{26.629058071211126D,0.0D,-18.098204302328156D};
    Object v7 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new double[][]{null,null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 50.89112988483847D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = java.util.Comparator.naturalOrder();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Comparator)v5).thenComparing(((java.util.function.Function)v6));
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{42.79696675142463D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = new double[]{19.011507325852346D,0.0D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{6.179115498327599D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[][]{null,null,null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = new double[]{0.0D,5.812871890858367D};
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = -21;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setMaxEvaluations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{-19.535345094160274D,12.131171101840675D,1.0D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = java.util.Comparator.naturalOrder();
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.Comparator.naturalOrder();
    Object v4 = ((java.util.Comparator)v1).thenComparing(((java.util.function.Function)v2),((java.util.Comparator)v3));
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v0).iterateSimplex(((java.util.Comparator)v1));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.3232560595975904D,-4.31170346300726D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = java.util.Comparator.naturalOrder();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Comparator)v1).thenComparing(((java.util.function.Function)v2));
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v0).iterateSimplex(((java.util.Comparator)v1));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v1 = new double[]{};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v7 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v5),((double[])v6));
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = ((java.lang.Enum)v8).hashCode();
    Object v10 = new double[]{0.0D};
    Object v11 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v10));
      org.junit.Assert.fail("Expected org.apache.commons.math.FunctionEvaluationException");
    } catch (org.apache.commons.math.FunctionEvaluationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{2.0D,53.001524492172635D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,-11.27708838218242D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -13.20163522067055D;
    Object v1 = 32.358725763706474D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v7 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v5),((double[])v6));
    Object v8 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v9 = new double[]{};
    Object v10 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v7),((org.apache.commons.math.optimization.GoalType)v8),((double[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = new double[]{};
    Object v9 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 39.90815069185347D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = new org.apache.commons.math.optimization.direct.NelderMead();
    Object v2 = 0.0D;
    Object v3 = 4.09243598010663D;
    Object v4 = new org.apache.commons.math.optimization.SimpleRealPointChecker((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v1).setConvergenceChecker(((org.apache.commons.math.optimization.RealConvergenceChecker)v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v1).getConvergenceChecker();
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setConvergenceChecker(((org.apache.commons.math.optimization.RealConvergenceChecker)v6));
    Object v7 = null;
    Object v8 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).setStartConfiguration(((double[][])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -13.20163522067055D;
    Object v1 = 32.358725763706474D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
    Object v1 = null;
    Object v2 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v3 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = new double[]{0.0D,1.0D,-16.23022467254423D};
    Object v6 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v0).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v3),((org.apache.commons.math.optimization.GoalType)v4),((double[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 39.90815069185347D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 4.09243598010663D;
    Object v5 = new org.apache.commons.math.optimization.SimpleRealPointChecker((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setConvergenceChecker(((org.apache.commons.math.optimization.RealConvergenceChecker)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -13.20163522067055D;
    Object v1 = 32.358725763706474D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 9;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new double[]{1.0D,1.0D,1.0D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = new double[]{-36.98791163342709D,2.416629408295607D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{92.29965851713511D,0.31514443607109055D,17.332408138081984D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = -13.20163522067055D;
    Object v1 = 32.358725763706474D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 39.90815069185347D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.Comparator.naturalOrder();
    ((org.apache.commons.math.optimization.direct.MultiDirectional)v2).iterateSimplex(((java.util.Comparator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -10.378246673829299D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{35.33355898574431D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -13.20163522067055D;
    Object v1 = 32.358725763706474D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{60.384967450974116D,1.0D};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 39.90815069185347D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = null;
    Object v4 = new double[]{-6.497015306886333D,-57.68884021151937D};
    Object v5 = new org.apache.commons.math.optimization.LeastSquaresConverter(((org.apache.commons.math.analysis.MultivariateVectorialFunction)v3),((double[])v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = new double[]{0.0D,-31.139322826687238D};
    Object v8 = ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).optimize(((org.apache.commons.math.analysis.MultivariateRealFunction)v5),((org.apache.commons.math.optimization.GoalType)v6),((double[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 19;
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setMaxEvaluations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new double[]{};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = -13.20163522067055D;
    Object v1 = 32.358725763706474D;
    Object v2 = new org.apache.commons.math.optimization.direct.MultiDirectional((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[][]{null};
    ((org.apache.commons.math.optimization.direct.DirectSearchOptimizer)v2).setStartConfiguration(((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
