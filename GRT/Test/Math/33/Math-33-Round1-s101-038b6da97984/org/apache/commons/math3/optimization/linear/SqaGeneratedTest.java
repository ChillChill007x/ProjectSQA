package org.apache.commons.math3.optimization.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getSolution();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-31.778116563086225D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).isOptimal();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).dropPhase1Objective();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 2.7215537136911236D;
    Object v14 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v11));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).initializeColumnLabels();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v12));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v13));
    Object v15 = 0;
    Object v16 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getBasicRow((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 13;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).createTableau((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 16;
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getBasicRow((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -33;
    Object v13 = -3.7032107537348247D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 0.0D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{31.778116563086225D};
    Object v13 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 2.7215537136911236D;
    Object v15 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15).hashCode();
    Object v17 = new java.util.TreeSet();
    Object v18 = new java.util.TreeSet(((java.util.SortedSet)v17));
    Object v19 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v20 = true;
    Object v21 = 1.0D;
    Object v22 = 0;
    Object v23 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v18),((org.apache.commons.math3.optimization.GoalType)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.TreeSet();
    Object v25 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v23).normalizeConstraints(((java.util.Collection)v24));
    Object v26 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 11;
    Object v13 = 1.0D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).dropPhase1Objective();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getData();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).createTableau((((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).createTableau((((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getWidth();
    org.junit.Assert.assertEquals((Object)(3), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).isOptimal();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).hashCode();
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).isOptimal();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getBasicRow((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 2;
    Object v12 = -10;
    Object v13 = -6.727756438216798D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).setEntry((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).hashCode();
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).isOptimal();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).createTableau((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).dropPhase1Objective();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getSolution();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getHeight();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(2), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 13;
    Object v12 = 2;
    Object v13 = 48.81521194978201D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).subtractRow((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 2.7215537136911236D;
    Object v14 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v18 = false;
    Object v19 = -0.8492778303122474D;
    Object v20 = 13;
    Object v21 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math3.optimization.GoalType)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.util.TreeSet();
    Object v23 = new java.util.TreeSet(((java.util.SortedSet)v22));
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v21).normalizeConstraints(((java.util.Collection)v23));
    Object v25 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v24));
    Object v26 = new double[]{31.778116563086225D};
    Object v27 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v26));
    Object v28 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v27));
    Object v29 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v12));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = -3.700093880146082D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet(((java.util.SortedSet)v12));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{31.778116563086225D};
    Object v13 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 2.7215537136911236D;
    Object v15 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15).hashCode();
    Object v17 = new java.util.TreeSet();
    Object v18 = new java.util.TreeSet(((java.util.SortedSet)v17));
    Object v19 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v20 = true;
    Object v21 = 1.0D;
    Object v22 = 0;
    Object v23 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v18),((org.apache.commons.math3.optimization.GoalType)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v23).getSolution();
    Object v25 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 12;
    Object v12 = -13.8657816915961D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).divideRow((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 10.852468955562808D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).divideRow((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).hashCode();
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(2), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet(((java.util.SortedSet)v12));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).hashCode();
    org.junit.Assert.assertEquals((Object)(113225693), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getRhsOffset();
    org.junit.Assert.assertEquals((Object)(2), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{31.778116563086225D};
    Object v13 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 2.7215537136911236D;
    Object v15 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet(((java.util.SortedSet)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = true;
    Object v20 = 1.0D;
    Object v21 = -18;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).getSlackVariableOffset();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).initializeColumnLabels();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).hashCode();
    Object v13 = new double[]{31.778116563086225D};
    Object v14 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v13));
    Object v15 = 2.7215537136911236D;
    Object v16 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.TreeSet();
    Object v18 = new java.util.TreeSet(((java.util.SortedSet)v17));
    Object v19 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v20 = false;
    Object v21 = -0.8492778303122474D;
    Object v22 = 13;
    Object v23 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v18),((org.apache.commons.math3.optimization.GoalType)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.TreeSet();
    Object v25 = new java.util.TreeSet(((java.util.SortedSet)v24));
    Object v26 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v23).normalizeConstraints(((java.util.Collection)v25));
    Object v27 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).getValue(((org.apache.commons.math3.linear.RealVector)v5));
    Object v7 = new double[]{31.778116563086225D};
    Object v8 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v7));
    Object v9 = 2.7215537136911236D;
    Object v10 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = ((java.lang.Enum)v13).hashCode();
    Object v15 = true;
    Object v16 = -4.933510528947715D;
    Object v17 = 1;
    Object v18 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.TreeSet();
    Object v20 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v18).normalizeConstraints(((java.util.Collection)v19));
    Object v21 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v22 = ((java.lang.Enum)v21).getDeclaringClass();
    Object v23 = false;
    Object v24 = 0.0D;
    Object v25 = -9;
    Object v26 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v20),((org.apache.commons.math3.optimization.GoalType)v21),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getBasicRow((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = true;
    Object v13 = -4.933510528947715D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v15).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).getDeclaringClass();
    Object v20 = true;
    Object v21 = -11.466663217807517D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).getValue(((org.apache.commons.math3.linear.RealVector)v5));
    Object v7 = new double[]{31.778116563086225D};
    Object v8 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v7));
    Object v9 = 2.7215537136911236D;
    Object v10 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = ((java.lang.Enum)v13).hashCode();
    Object v15 = true;
    Object v16 = -4.933510528947715D;
    Object v17 = 1;
    Object v18 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.TreeSet();
    Object v20 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v18).normalizeConstraints(((java.util.Collection)v19));
    Object v21 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v22 = false;
    Object v23 = 1.0D;
    Object v24 = 4;
    Object v25 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v20),((org.apache.commons.math3.optimization.GoalType)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getWidth();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v12));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -25;
    Object v13 = 0;
    Object v14 = 13.941032272319092D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).subtractRow((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 0.0D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapSubtractToSelf((((java.lang.Double)v2).doubleValue()));
    Object v4 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-31.778116563086225D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.0D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-31.778116563086225D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getData();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new java.util.TreeSet();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).getValue(((org.apache.commons.math3.linear.RealVector)v5));
    Object v7 = new double[]{31.778116563086225D};
    Object v8 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v7));
    Object v9 = 2.7215537136911236D;
    Object v10 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = ((java.lang.Enum)v13).hashCode();
    Object v15 = true;
    Object v16 = -4.933510528947715D;
    Object v17 = 1;
    Object v18 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.TreeSet();
    Object v20 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v18).normalizeConstraints(((java.util.Collection)v19));
    Object v21 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v22 = false;
    Object v23 = 1.0D;
    Object v24 = 4;
    Object v25 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v20),((org.apache.commons.math3.optimization.GoalType)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v25).dropPhase1Objective();
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -8;
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getBasicRow((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v12));
    Object v14 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v12));
    Object v14 = true;
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).createTableau((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 2.7215537136911236D;
    Object v14 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = true;
    Object v20 = -4.933510528947715D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math3.optimization.GoalType)v17),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).getData();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v23));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).initializeColumnLabels();
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 2.7215537136911236D;
    Object v14 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v18 = true;
    Object v19 = 1.0D;
    Object v20 = -18;
    Object v21 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math3.optimization.GoalType)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v21).isOptimal();
    Object v23 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v22));
    Object v24 = new double[]{31.778116563086225D};
    Object v25 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v24));
    Object v26 = 2.7215537136911236D;
    Object v27 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v25),(((java.lang.Double)v26).doubleValue()));
    Object v28 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v27).hashCode();
    Object v29 = new java.util.TreeSet();
    Object v30 = new java.util.TreeSet(((java.util.SortedSet)v29));
    Object v31 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v32 = true;
    Object v33 = 1.0D;
    Object v34 = 0;
    Object v35 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v27),((java.util.Collection)v30),((org.apache.commons.math3.optimization.GoalType)v31),(((java.lang.Boolean)v32).booleanValue()),(((java.lang.Double)v33).doubleValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v35).isOptimal();
    Object v37 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v36));
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 1.0D;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math3.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{31.778116563086225D};
    Object v13 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 2.7215537136911236D;
    Object v15 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15).hashCode();
    Object v17 = new java.util.TreeSet();
    Object v18 = new java.util.TreeSet(((java.util.SortedSet)v17));
    Object v19 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v20 = true;
    Object v21 = 1.0D;
    Object v22 = 0;
    Object v23 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v18),((org.apache.commons.math3.optimization.GoalType)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.TreeSet();
    Object v25 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v23).equals(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new double[]{31.778116563086225D};
    Object v24 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v23));
    Object v25 = 2.7215537136911236D;
    Object v26 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v24),(((java.lang.Double)v25).doubleValue()));
    Object v27 = new java.util.TreeSet();
    Object v28 = new java.util.TreeSet(((java.util.SortedSet)v27));
    Object v29 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v30 = ((java.lang.Enum)v29).hashCode();
    Object v31 = true;
    Object v32 = -4.933510528947715D;
    Object v33 = 1;
    Object v34 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v26),((java.util.Collection)v28),((org.apache.commons.math3.optimization.GoalType)v29),(((java.lang.Boolean)v31).booleanValue()),(((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new java.util.TreeSet();
    Object v36 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v34).normalizeConstraints(((java.util.Collection)v35));
    Object v37 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v36));
    Object v38 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).hashCode();
    org.junit.Assert.assertEquals((Object)(-1755517010), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = -46;
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getBasicRow((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).getValue(((org.apache.commons.math3.linear.RealVector)v5));
    Object v7 = new double[]{31.778116563086225D};
    Object v8 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v7));
    Object v9 = 2.7215537136911236D;
    Object v10 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = ((java.lang.Enum)v13).hashCode();
    Object v15 = true;
    Object v16 = -4.933510528947715D;
    Object v17 = 1;
    Object v18 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.TreeSet();
    Object v20 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v18).normalizeConstraints(((java.util.Collection)v19));
    Object v21 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v22 = false;
    Object v23 = 1.0D;
    Object v24 = 4;
    Object v25 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v20),((org.apache.commons.math3.optimization.GoalType)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Double)v23).doubleValue()),(((java.lang.Integer)v24).intValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v25).initializeColumnLabels();
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = new double[]{31.778116563086225D};
    Object v3 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.RealVector)v1).getL1Distance(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math3.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-31.778116563086225D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = -26;
    Object v13 = -7.78888277752335D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).subtractRow((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).hashCode();
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).hashCode();
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).getSolution();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).isOptimal();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{31.778116563086225D};
    Object v12 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 2.7215537136911236D;
    Object v14 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v18 = true;
    Object v19 = 1.0D;
    Object v20 = -18;
    Object v21 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math3.optimization.GoalType)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.util.TreeSet();
    Object v23 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v21).equals(((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v23));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).dropPhase1Objective();
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).initializeColumnLabels();
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v11));
    Object v13 = new java.util.TreeSet();
    Object v14 = new java.util.TreeSet(((java.util.SortedSet)v13));
    Object v15 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 4;
    Object v12 = 0.0D;
    ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).divideRow((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = -26;
    Object v24 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).getBasicRow((((java.lang.Integer)v23).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = true;
    Object v13 = -4.933510528947715D;
    Object v14 = 1;
    Object v15 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v15).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).getDeclaringClass();
    Object v20 = true;
    Object v21 = -11.466663217807517D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new double[]{31.778116563086225D};
    Object v24 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v23));
    Object v25 = 2.7215537136911236D;
    Object v26 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v24),(((java.lang.Double)v25).doubleValue()));
    Object v27 = new java.util.TreeSet();
    Object v28 = new java.util.TreeSet(((java.util.SortedSet)v27));
    Object v29 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v30 = true;
    Object v31 = 1.0D;
    Object v32 = -18;
    Object v33 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v26),((java.util.Collection)v28),((org.apache.commons.math3.optimization.GoalType)v29),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Double)v31).doubleValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = new java.util.TreeSet();
    Object v35 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v33).normalizeConstraints(((java.util.Collection)v34));
    Object v36 = new java.util.TreeSet();
    Object v37 = new java.util.TreeSet(((java.util.SortedSet)v36));
    Object v38 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v33).normalizeConstraints(((java.util.Collection)v37));
    Object v39 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = 2.7215537136911236D;
    Object v7 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet(((java.util.SortedSet)v8));
    Object v10 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v11 = false;
    Object v12 = -0.8492778303122474D;
    Object v13 = 13;
    Object v14 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v7),((java.util.Collection)v9),((org.apache.commons.math3.optimization.GoalType)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v14).normalizeConstraints(((java.util.Collection)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = false;
    Object v21 = -2.475402353339831D;
    Object v22 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new double[]{31.778116563086225D};
    Object v24 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v23));
    Object v25 = 2.7215537136911236D;
    Object v26 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v24),(((java.lang.Double)v25).doubleValue()));
    Object v27 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v26).hashCode();
    Object v28 = new java.util.TreeSet();
    Object v29 = new java.util.TreeSet(((java.util.SortedSet)v28));
    Object v30 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v31 = true;
    Object v32 = 1.0D;
    Object v33 = 0;
    Object v34 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v26),((java.util.Collection)v29),((org.apache.commons.math3.optimization.GoalType)v30),(((java.lang.Boolean)v31).booleanValue()),(((java.lang.Double)v32).doubleValue()),(((java.lang.Integer)v33).intValue()));
    Object v35 = new java.util.TreeSet();
    Object v36 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v34).normalizeConstraints(((java.util.Collection)v35));
    Object v37 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).getBasicRow((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -4.933510528947715D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{31.778116563086225D};
    Object v13 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 2.7215537136911236D;
    Object v15 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet(((java.util.SortedSet)v16));
    Object v18 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v19 = ((java.lang.Enum)v18).hashCode();
    Object v20 = true;
    Object v21 = -4.933510528947715D;
    Object v22 = 1;
    Object v23 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v17),((org.apache.commons.math3.optimization.GoalType)v18),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.TreeSet();
    Object v25 = new java.util.TreeSet(((java.util.SortedSet)v24));
    Object v26 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v23).equals(((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 1.0D;
    Object v9 = -18;
    Object v10 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math3.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 22;
    Object v12 = -35;
    Object v13 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v10).getEntry((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{31.778116563086225D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 2.7215537136911236D;
    Object v3 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{31.778116563086225D};
    Object v5 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v4));
    Object v6 = ((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3).getValue(((org.apache.commons.math3.linear.RealVector)v5));
    Object v7 = new double[]{31.778116563086225D};
    Object v8 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v7));
    Object v9 = 2.7215537136911236D;
    Object v10 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
    Object v14 = ((java.lang.Enum)v13).hashCode();
    Object v15 = true;
    Object v16 = -4.933510528947715D;
    Object v17 = 1;
    Object v18 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v12),((org.apache.commons.math3.optimization.GoalType)v13),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new java.util.TreeSet();
    Object v20 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v18).normalizeConstraints(((java.util.Collection)v19));
    Object v21 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
    Object v22 = ((java.lang.Enum)v21).getDeclaringClass();
    Object v23 = false;
    Object v24 = 0.0D;
    Object v25 = -9;
    Object v26 = new org.apache.commons.math3.optimization.linear.SimplexTableau(((org.apache.commons.math3.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v20),((org.apache.commons.math3.optimization.GoalType)v21),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Double)v24).doubleValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.math3.optimization.linear.SimplexTableau)v26).getData();
    org.junit.Assert.assertNotNull(v27);
  }
}
