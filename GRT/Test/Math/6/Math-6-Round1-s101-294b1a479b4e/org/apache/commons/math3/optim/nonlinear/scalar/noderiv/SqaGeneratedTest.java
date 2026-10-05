package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = -9.201062957624352D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = -15.45255681665969D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 44.93786025176168D;
    Object v1 = -37.50532335659224D;
    Object v2 = -37.409648271489395D;
    Object v3 = 12.730385926634657D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = new org.apache.commons.math3.optim.OptimizationData[]{null,null,null};
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer)v8).optimize(((org.apache.commons.math3.optim.OptimizationData[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer)v8).getGoalType();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -2.1203726879327043D;
    Object v1 = 36.63640876740301D;
    Object v2 = 48.45303098182997D;
    Object v3 = 32.83168211855562D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = -76.33220487171837D;
    Object v3 = -11.586569769898245D;
    Object v4 = 2;
    Object v5 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = -8.01209965774624D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -64.03157240958656D;
    Object v1 = 7.192227342396837D;
    Object v2 = -7.981062314754047D;
    Object v3 = 9.041992858490703D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = new org.apache.commons.math3.optim.OptimizationData[]{null};
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer)v8).optimize(((org.apache.commons.math3.optim.OptimizationData[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 60.94833720950099D;
    Object v1 = -8.151816208045444D;
    Object v2 = 0.0D;
    Object v3 = 58.95470125396047D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 4.0799000049917105D;
    Object v2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = new org.apache.commons.math3.optim.OptimizationData[]{null,null};
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer)v8).optimize(((org.apache.commons.math3.optim.OptimizationData[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(2147483647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -22.6188987173421D;
    Object v2 = 13.683625027688564D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 47.948586109572275D;
    Object v3 = -34.392171510545005D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 25.895403440931418D;
    Object v1 = -69.58892975492317D;
    Object v2 = -76.33220487171837D;
    Object v3 = -11.586569769898245D;
    Object v4 = 2;
    Object v5 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getMaxEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = Double.NaN;
    Object v3 = -11.993828786318156D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = -33.750349829372084D;
    Object v1 = 1.0D;
    Object v2 = -5.83734457629302D;
    Object v3 = -2.5824139685523235D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = -19.509131416418484D;
    Object v1 = -25.09941913213286D;
    Object v2 = -31.880786511331344D;
    Object v3 = 16.925365688374715D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 51.10767749156756D;
    Object v1 = 46.00300494141484D;
    Object v2 = 19.219305758508636D;
    Object v3 = 1.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 8.48233048039232D;
    Object v1 = -42.712847868305055D;
    Object v2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 33.03594723456493D;
    Object v2 = -10.137931847765278D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -27.595048700995793D;
    Object v1 = -4.695193633207752D;
    Object v2 = 1.0D;
    Object v3 = -11.506844867360737D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 2.8729056664314383D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = -28.88175373438854D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 50.97514037224551D;
    Object v1 = 0.0D;
    Object v2 = 8.799066493356914D;
    Object v3 = 50.884466386644185D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = -28.88175373438854D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = -28.88175373438854D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = -28.88175373438854D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 2.0D;
    Object v2 = -28.88175373438854D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer)v8).getGoalType();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 40.53887954237718D;
    Object v1 = 0.0D;
    Object v2 = 6.179115498327599D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 4.812871890858367D;
    Object v2 = 17.25106774320145D;
    Object v3 = -8.497404455652363D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 4.812871890858367D;
    Object v2 = 17.25106774320145D;
    Object v3 = -8.497404455652363D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = -37.96231150423918D;
    Object v1 = 1.0D;
    Object v2 = -17.046562184374178D;
    Object v3 = 27.724774384864673D;
    Object v4 = 51.10767749156756D;
    Object v5 = 46.00300494141484D;
    Object v6 = 19.219305758508636D;
    Object v7 = 1.0D;
    Object v8 = -76.33220487171837D;
    Object v9 = -11.586569769898245D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v11));
    Object v13 = ((org.apache.commons.math3.optim.BaseOptimizer)v12).getConvergenceChecker();
    Object v14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v13));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 5.624249160913587D;
    Object v2 = 0.0D;
    Object v3 = -11.935100538073273D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 27.505740438061625D;
    Object v1 = 18.33926446108791D;
    Object v2 = 44.74963687749413D;
    Object v3 = 31.729991864972426D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = -40.09147196217659D;
    Object v3 = -3.760904852013452D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = -34.08447024855601D;
    Object v2 = -18.939739428691063D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getConvergenceChecker();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 62.832585171781226D;
    Object v2 = 9.83336121092186D;
    Object v3 = -6.036496030396123D;
    Object v4 = 9.398827885347991D;
    Object v5 = 5.821030809785553D;
    Object v6 = 0.0D;
    Object v7 = 6.54005496291336D;
    Object v8 = -76.33220487171837D;
    Object v9 = -11.586569769898245D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v11));
    Object v13 = ((org.apache.commons.math3.optim.BaseOptimizer)v12).getConvergenceChecker();
    Object v14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v13));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math3.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 0.0D;
    Object v2 = -43.723896242888515D;
    Object v3 = 4.263083389552916D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 4.812871890858367D;
    Object v2 = 17.25106774320145D;
    Object v3 = -8.497404455652363D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 27.505740438061625D;
    Object v1 = 18.33926446108791D;
    Object v2 = 44.74963687749413D;
    Object v3 = 31.729991864972426D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 4.0D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = -40.42595379520891D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 27.505740438061625D;
    Object v1 = 18.33926446108791D;
    Object v2 = 44.74963687749413D;
    Object v3 = 31.729991864972426D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 66.63591725304238D;
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 4.812871890858367D;
    Object v2 = 17.25106774320145D;
    Object v3 = -8.497404455652363D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 66.63591725304238D;
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    Object v10 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 66.63591725304238D;
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getStartPoint();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 27.505740438061625D;
    Object v1 = 18.33926446108791D;
    Object v2 = 44.74963687749413D;
    Object v3 = 31.729991864972426D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 12.675175000993185D;
    Object v1 = 20.011328413664106D;
    Object v2 = -2.4429613373084935D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 49.53016187810739D;
    Object v4 = 9.398827885347991D;
    Object v5 = 5.821030809785553D;
    Object v6 = 0.0D;
    Object v7 = 6.54005496291336D;
    Object v8 = -76.33220487171837D;
    Object v9 = -11.586569769898245D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v11));
    Object v13 = ((org.apache.commons.math3.optim.BaseOptimizer)v12).getConvergenceChecker();
    Object v14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 66.63591725304238D;
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getLowerBound();
    Object v10 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v8).getUpperBound();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 66.63591725304238D;
    Object v1 = 1.0D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 27.505740438061625D;
    Object v1 = 18.33926446108791D;
    Object v2 = 44.74963687749413D;
    Object v3 = 31.729991864972426D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer)v8).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 12.675175000993185D;
    Object v1 = 20.011328413664106D;
    Object v2 = -2.4429613373084935D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.optim.BaseMultivariateOptimizer)v4).getUpperBound();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 9.398827885347991D;
    Object v1 = 5.821030809785553D;
    Object v2 = 0.0D;
    Object v3 = 6.54005496291336D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    Object v9 = ((org.apache.commons.math3.optim.BaseOptimizer)v8).getEvaluations();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 10.015548220582955D;
    Object v2 = 1.0D;
    Object v3 = -33.07539358765019D;
    Object v4 = 51.10767749156756D;
    Object v5 = 46.00300494141484D;
    Object v6 = 19.219305758508636D;
    Object v7 = 1.0D;
    Object v8 = -76.33220487171837D;
    Object v9 = -11.586569769898245D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v11));
    Object v13 = ((org.apache.commons.math3.optim.BaseOptimizer)v12).getConvergenceChecker();
    Object v14 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 32.41924993745744D;
    Object v1 = 17.362019469554824D;
    Object v2 = 1.0D;
    Object v3 = 0.0D;
    Object v4 = -76.33220487171837D;
    Object v5 = -11.586569769898245D;
    Object v6 = 2;
    Object v7 = new org.apache.commons.math3.optim.SimpleVectorValueChecker((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.optim.ConvergenceChecker)v7));
    org.junit.Assert.assertNotNull(v8);
  }
}
