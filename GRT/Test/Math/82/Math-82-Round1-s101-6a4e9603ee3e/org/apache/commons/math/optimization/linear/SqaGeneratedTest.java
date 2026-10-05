package org.apache.commons.math.optimization.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.lang.Double[]{};
    Object v16 = 0.0D;
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v17));
    Object v19 = -7.209035027246509D;
    Object v20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v18),(((java.lang.Double)v19).doubleValue()));
    Object v21 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).equals(((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7).hashCode();
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.Comparator.comparing(((java.util.function.Function)v9));
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v13 = true;
    Object v14 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -28;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 40.35606842056916D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -22;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 37;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).getNumVariables();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -42;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -14;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).hashCode();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNormalizedConstraints();
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 7;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = new java.lang.Double[]{};
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v18));
    Object v20 = -7.209035027246509D;
    Object v21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v19),(((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.Comparator.comparing(((java.util.function.Function)v22));
    Object v24 = new java.util.TreeSet(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v26 = true;
    Object v27 = 0.0D;
    Object v28 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v21),((java.util.Collection)v24),((org.apache.commons.math.optimization.GoalType)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Double)v27).doubleValue()));
    Object v29 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = new java.lang.Double[]{};
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v18));
    Object v20 = -7.209035027246509D;
    Object v21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v19),(((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.Comparator.comparing(((java.util.function.Function)v22));
    Object v24 = new java.util.TreeSet(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v26 = true;
    Object v27 = 0.0D;
    Object v28 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v21),((java.util.Collection)v24),((org.apache.commons.math.optimization.GoalType)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Double)v27).doubleValue()));
    Object v29 = 0.0D;
    Object v30 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v30).getIterations();
    Object v32 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v28).equals(((java.lang.Object)v31));
    Object v33 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v28));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 9;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v26).hashCode();
    Object v28 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = ((java.util.Collection)v9).removeAll(((java.util.Collection)v12));
    Object v14 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v15 = false;
    Object v16 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = false;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v26).getNormalizedConstraints();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = java.util.function.Function.identity();
    Object v16 = java.util.Comparator.comparing(((java.util.function.Function)v15));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -31;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNumVariables();
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -2;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = new java.lang.Double[]{};
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v18));
    Object v20 = -7.209035027246509D;
    Object v21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v19),(((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.Comparator.comparing(((java.util.function.Function)v22));
    Object v24 = new java.util.TreeSet(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v26 = true;
    Object v27 = 0.0D;
    Object v28 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v21),((java.util.Collection)v24),((org.apache.commons.math.optimization.GoalType)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Double)v27).doubleValue()));
    Object v29 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v28).getNumVariables();
    Object v30 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v28));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -42;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 3;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v13).getNormalizedConstraints();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).hashCode();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNormalizedConstraints();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = false;
    Object v12 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new java.lang.Double[]{};
    Object v14 = 0.0D;
    Object v15 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v15));
    Object v17 = -7.209035027246509D;
    Object v18 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = java.util.function.Function.identity();
    Object v20 = java.util.Comparator.comparing(((java.util.function.Function)v19));
    Object v21 = new java.util.TreeSet(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v23 = true;
    Object v24 = 0.0D;
    Object v25 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v18),((java.util.Collection)v21),((org.apache.commons.math.optimization.GoalType)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Double)v24).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v26).getNumVariables();
    Object v28 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 12;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).hashCode();
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 14.296745411809008D;
    Object v18 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v18).getMaxIterations();
    Object v20 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).equals(((java.lang.Object)v19));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = false;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v18).getMaxIterations();
    Object v20 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).equals(((java.lang.Object)v19));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v21 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNumVariables();
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = ((java.lang.Enum)v13).getDeclaringClass();
    Object v15 = false;
    Object v16 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = new java.lang.Double[]{};
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v18));
    Object v20 = -7.209035027246509D;
    Object v21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v19),(((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.Comparator.comparing(((java.util.function.Function)v22));
    Object v24 = new java.util.TreeSet(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v26 = true;
    Object v27 = 0.0D;
    Object v28 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v21),((java.util.Collection)v24),((org.apache.commons.math.optimization.GoalType)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Double)v27).doubleValue()));
    Object v29 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNormalizedConstraints();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = new java.lang.Double[]{};
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v18));
    Object v20 = -7.209035027246509D;
    Object v21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v19),(((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.Comparator.comparing(((java.util.function.Function)v22));
    Object v24 = new java.util.TreeSet(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v26 = true;
    Object v27 = 0.0D;
    Object v28 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v21),((java.util.Collection)v24),((org.apache.commons.math.optimization.GoalType)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Double)v27).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = false;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = -4;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(-4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -53;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19).hashCode();
    Object v21 = java.util.function.Function.identity();
    Object v22 = java.util.Comparator.comparing(((java.util.function.Function)v21));
    Object v23 = new java.util.TreeSet(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v25 = ((java.lang.Enum)v24).getDeclaringClass();
    Object v26 = false;
    Object v27 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v23),((org.apache.commons.math.optimization.GoalType)v24),(((java.lang.Boolean)v26).booleanValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).equals(((java.lang.Object)v18));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v13).getNormalizedConstraints();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = java.util.function.Function.identity();
    Object v16 = java.util.Comparator.comparing(((java.util.function.Function)v15));
    Object v17 = new java.util.TreeSet(((java.util.Comparator)v16));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).equals(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    Object v15 = new java.lang.Double[]{};
    Object v16 = 0.0D;
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v15),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v17));
    Object v19 = -7.209035027246509D;
    Object v20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v18),(((java.lang.Double)v19).doubleValue()));
    Object v21 = java.util.function.Function.identity();
    Object v22 = java.util.Comparator.comparing(((java.util.function.Function)v21));
    Object v23 = new java.util.TreeSet(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v25 = true;
    Object v26 = 0.0D;
    Object v27 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v20),((java.util.Collection)v23),((org.apache.commons.math.optimization.GoalType)v24),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Double)v26).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = new java.lang.Double[]{};
    Object v17 = 0.0D;
    Object v18 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v16),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v18));
    Object v20 = -7.209035027246509D;
    Object v21 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v19),(((java.lang.Double)v20).doubleValue()));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.Comparator.comparing(((java.util.function.Function)v22));
    Object v24 = new java.util.TreeSet(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v26 = true;
    Object v27 = 0.0D;
    Object v28 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v21),((java.util.Collection)v24),((org.apache.commons.math.optimization.GoalType)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Double)v27).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNumVariables();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v11 = false;
    Object v12 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doOptimize();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.lang.Double[]{};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v16));
    Object v18 = -7.209035027246509D;
    Object v19 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = java.util.function.Function.identity();
    Object v21 = java.util.Comparator.comparing(((java.util.function.Function)v20));
    Object v22 = new java.util.TreeSet(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = true;
    Object v25 = 0.0D;
    Object v26 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v19),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v26));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).optimize(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).getMaxIterations();
    org.junit.Assert.assertEquals((Object)(100), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doOptimize();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = 0;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = -15;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.optimization.OptimizationException");
    } catch (org.apache.commons.math.optimization.OptimizationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = -26;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).setMaxIterations((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new java.lang.Double[]{};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v5));
    Object v7 = -7.209035027246509D;
    Object v8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.Comparator.comparing(((java.util.function.Function)v9));
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = true;
    Object v14 = 0.0D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v8),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).solvePhase1(((org.apache.commons.math.optimization.linear.SimplexTableau)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v0).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = 4;
    ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).setMaxIterations((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.lang.Double[]{};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v6));
    Object v8 = -7.209035027246509D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = true;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.apache.commons.math.optimization.linear.AbstractLinearOptimizer)v1).getIterations();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 14.296745411809008D;
    Object v1 = new org.apache.commons.math.optimization.linear.SimplexSolver((((java.lang.Double)v0).doubleValue()));
    Object v2 = new java.lang.Double[]{};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v4));
    Object v6 = -7.209035027246509D;
    Object v7 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.Comparator.comparing(((java.util.function.Function)v8));
    Object v10 = new java.util.TreeSet(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v10),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v14).getNormalizedConstraints();
    ((org.apache.commons.math.optimization.linear.SimplexSolver)v1).doIteration(((org.apache.commons.math.optimization.linear.SimplexTableau)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
    Object v1 = new java.lang.Double[]{};
    Object v2 = 0.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v3));
    Object v5 = -7.209035027246509D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.comparing(((java.util.function.Function)v7));
    Object v9 = new java.util.TreeSet(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v11 = true;
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v9),((org.apache.commons.math.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = java.util.function.Function.identity();
    Object v15 = java.util.Comparator.comparing(((java.util.function.Function)v14));
    Object v16 = new java.util.TreeSet(((java.util.Comparator)v15));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v13).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexSolver)v0).isOptimal(((org.apache.commons.math.optimization.linear.SimplexTableau)v13));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }
}
