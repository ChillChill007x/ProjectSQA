package org.apache.commons.math3.optimization.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -33;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 23;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = false;
    Object v20 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 2;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).normalizeConstraints(((java.util.Collection)v14));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.Double[]{1.0D};
    Object v9 = -19.830007380211804D;
    Object v10 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7).equals(((java.lang.Object)v12));
    Object v14 = new java.util.HashSet();
    Object v15 = ((java.util.Collection)v14).hashCode();
    Object v16 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v17 = false;
    Object v18 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v14),((org.apache.commons.math3.optimization.GoalType)v16),(((java.lang.Boolean)v17).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.HashSet();
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v15).normalizeConstraints(((java.util.Collection)v16));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 39;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -70;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).normalizeConstraints(((java.util.Collection)v14));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 41;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = true;
    Object v20 = 1.0D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v22));
    Object v24 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 4;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.lang.Double[]{1.0D};
    Object v15 = -19.830007380211804D;
    Object v16 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).equals(((java.lang.Object)v18));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v20 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.HashSet();
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v12));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).normalizeConstraints(((java.util.Collection)v14));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -18.954440206844456D;
    Object v13 = 0;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v14).getMaxIterations();
    Object v16 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v15));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).normalizeConstraints(((java.util.Collection)v14));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 2;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v13 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v12).getMaxIterations();
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v13));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = -18.954440206844456D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v11).getMaxIterations();
    Object v13 = ((java.util.Collection)v8).add(((java.lang.Object)v12));
    Object v14 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = true;
    Object v20 = 1.0D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v15 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v14).getIterations();
    Object v16 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).equals(((java.lang.Object)v15));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = -3;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v13 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v12).getMaxIterations();
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v13));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v16));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 13;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = -31;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 27;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 8;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = false;
    Object v13 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 6;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0.0D;
    Object v15 = 0;
    Object v16 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v14).doubleValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).equals(((java.lang.Object)v16));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -29;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 13;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0.0D;
    Object v13 = 0;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v14));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 23;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{1.0D};
    Object v2 = -19.830007380211804D;
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v1 = 23;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -46;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new java.lang.Double[]{1.0D};
    Object v6 = -19.830007380211804D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.HashSet();
    Object v11 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 1.0D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v10),((org.apache.commons.math3.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = -18.954440206844456D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7).hashCode();
    Object v9 = new java.util.HashSet();
    Object v10 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = true;
    Object v13 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = true;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = true;
    Object v20 = 1.0D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new java.util.HashSet();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v23));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 39.35606842056916D;
    Object v1 = -6;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -3;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.util.HashSet();
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).normalizeConstraints(((java.util.Collection)v14));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = true;
    Object v20 = 1.0D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).equals(((java.lang.Object)v23));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 2;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v10 = true;
    Object v11 = 1.0D;
    Object v12 = 1;
    Object v13 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v13).hashCode();
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doIteration(((org.apache.commons.math3.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.optimization.linear.UnboundedSolutionException");
    } catch (org.apache.commons.math3.optimization.linear.UnboundedSolutionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new java.lang.Double[]{1.0D};
    Object v4 = -19.830007380211804D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v10 = false;
    Object v11 = ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).optimize(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v8),((org.apache.commons.math3.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new java.lang.Double[]{1.0D};
    Object v13 = -19.830007380211804D;
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.HashSet();
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = true;
    Object v20 = 1.0D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new java.util.HashSet();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v23));
    ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).solvePhase1(((org.apache.commons.math3.optimization.linear.SimplexTableau)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 56.76574508718038D;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 40;
    ((org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer)v2).setMaxIterations((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.math3.optimization.linear.SimplexSolver)v2).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
