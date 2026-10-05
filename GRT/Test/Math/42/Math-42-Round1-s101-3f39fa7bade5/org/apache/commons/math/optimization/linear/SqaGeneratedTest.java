package org.apache.commons.math.optimization.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getSolution();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-30.778116563086225D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).isOptimal();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = new java.util.TreeSet(((java.util.SortedSet)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).dropPhase1Objective();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{30.778116563086225D};
    Object v12 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 1.7215537136911236D;
    Object v14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v18 = false;
    Object v19 = -0.8492778303122474D;
    Object v20 = 14;
    Object v21 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math.optimization.GoalType)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.util.TreeSet();
    Object v23 = new java.util.TreeSet(((java.util.SortedSet)v22));
    Object v24 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v21).normalizeConstraints(((java.util.Collection)v23));
    Object v25 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v11));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).initializeColumnLabels();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{30.778116563086225D};
    Object v12 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math.linear.RealVector)v12));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v13));
    Object v15 = 1;
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getBasicRow((((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).createTableau((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 17;
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getBasicRow((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -34;
    Object v13 = -3.7032107537348247D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1;
    Object v11 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).createTableau((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.TreeSet();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).normalizeConstraints(((java.util.Collection)v10));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).dropPhase1Objective();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).isOptimal();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -31;
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getBasicRow((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -0.8492778303122474D;
    Object v9 = 14;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.util.TreeSet();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).normalizeConstraints(((java.util.Collection)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 51;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getBasicRow((((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = "CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N";
    Object v7 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf(((java.lang.String)v6));
    Object v8 = ((java.util.Collection)v5).remove(((java.lang.Object)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v10 = false;
    Object v11 = 0.0D;
    Object v12 = -57;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -55;
    Object v13 = -0.6332312955191441D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).createTableau((((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{30.778116563086225D};
    Object v13 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 1.7215537136911236D;
    Object v15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet(((java.util.SortedSet)v16));
    Object v18 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v19 = false;
    Object v20 = -0.8492778303122474D;
    Object v21 = 14;
    Object v22 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v17),((org.apache.commons.math.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new java.util.TreeSet();
    Object v24 = new java.util.TreeSet(((java.util.SortedSet)v23));
    Object v25 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v22).normalizeConstraints(((java.util.Collection)v24));
    Object v26 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v25));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).isOptimal();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).hashCode();
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).dropPhase1Objective();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).isOptimal();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSolution();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).initializeColumnLabels();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 12;
    Object v13 = -19.405660372862428D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).subtractRow((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.util.TreeSet();
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = 16.311296311594138D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).divideRow((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N";
    Object v12 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).hashCode();
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(3), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{30.778116563086225D};
    Object v11 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getSolution();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(2234502), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).initializeColumnLabels();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).hashCode();
    Object v13 = new double[]{30.778116563086225D};
    Object v14 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v13));
    Object v15 = 1.7215537136911236D;
    Object v16 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new java.util.TreeSet();
    Object v18 = new java.util.TreeSet(((java.util.SortedSet)v17));
    Object v19 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v20 = false;
    Object v21 = -0.8492778303122474D;
    Object v22 = 14;
    Object v23 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v16),((java.util.Collection)v18),((org.apache.commons.math.optimization.GoalType)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = new java.util.TreeSet();
    Object v25 = new java.util.TreeSet(((java.util.SortedSet)v24));
    Object v26 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v23).normalizeConstraints(((java.util.Collection)v25));
    Object v27 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getRhsOffset();
    org.junit.Assert.assertEquals((Object)(2), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getSolution();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N";
    Object v12 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v12));
    Object v14 = false;
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).createTableau((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{30.778116563086225D};
    Object v13 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 1.7215537136911236D;
    Object v15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet(((java.util.SortedSet)v16));
    Object v18 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v19 = false;
    Object v20 = 47.4012118402668D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v17),((org.apache.commons.math.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getHeight();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 8;
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getBasicRow((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).initializeColumnLabels();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = "CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N";
    Object v12 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(-1953228228), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{30.778116563086225D};
    Object v12 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 1.7215537136911236D;
    Object v14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = ((java.util.Collection)v16).spliterator();
    Object v18 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v19 = false;
    Object v20 = -1.3696600675879383E18D;
    Object v21 = 2;
    Object v22 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 26;
    Object v11 = 0;
    Object v12 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getData();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet(((java.util.SortedSet)v12));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).normalizeConstraints(((java.util.Collection)v13));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).dropPhase1Objective();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).setEntry((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = -2;
    Object v13 = -29.362345927339433D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).setEntry((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getSolution();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).createTableau((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 0.0D;
    Object v9 = -9;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getHeight();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 9.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = -7.085987704667711D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).hashCode();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getData();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = "CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N";
    Object v7 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf(((java.lang.String)v6));
    Object v8 = ((java.util.Collection)v5).remove(((java.lang.Object)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v10 = false;
    Object v11 = 0.0D;
    Object v12 = -57;
    Object v13 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v13).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getHeight();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3).hashCode();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet(((java.util.SortedSet)v5));
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{30.778116563086225D};
    Object v13 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v13));
    Object v15 = false;
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).createTableau((((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 47.4012118402668D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).isOptimal();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = false;
    Object v9 = 33.32403303908154D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = -24.09941913213286D;
    Object v10 = -31;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getArtificialVariableOffset();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new double[]{30.778116563086225D};
    Object v13 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v12));
    Object v14 = 1.7215537136911236D;
    Object v15 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet(((java.util.SortedSet)v16));
    Object v18 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v19 = false;
    Object v20 = 47.4012118402668D;
    Object v21 = 1;
    Object v22 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v15),((java.util.Collection)v17),((org.apache.commons.math.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{30.778116563086225D};
    Object v12 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 1.7215537136911236D;
    Object v14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = true;
    Object v20 = -24.09941913213286D;
    Object v21 = -31;
    Object v22 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math.optimization.GoalType)v17),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v22).getSolution();
    Object v24 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).equals(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).initializeColumnLabels();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = -25.456809093142855D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).divideRow((((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = 1.0D;
    Object v9 = 1;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new double[]{30.778116563086225D};
    Object v12 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v11));
    Object v13 = 1.7215537136911236D;
    Object v14 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet(((java.util.SortedSet)v15));
    Object v17 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v18 = false;
    Object v19 = 47.4012118402668D;
    Object v20 = 1;
    Object v21 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v14),((java.util.Collection)v16),((org.apache.commons.math.optimization.GoalType)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.util.TreeSet();
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v21).normalizeConstraints(((java.util.Collection)v22));
    Object v24 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).normalizeConstraints(((java.util.Collection)v23));
    Object v25 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getWidth();
    org.junit.Assert.assertEquals((Object)(4), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -23;
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getBasicRow((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = ((java.lang.Enum)v6).hashCode();
    Object v8 = true;
    Object v9 = 0.0D;
    Object v10 = 1;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v4),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet(((java.util.SortedSet)v12));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = new double[]{30.778116563086225D};
    Object v3 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealVector)v1).getL1Distance(((org.apache.commons.math.linear.RealVector)v3));
    Object v5 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-30.778116563086225D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new double[]{30.778116563086225D};
    Object v1 = org.apache.commons.math.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 1.7215537136911236D;
    Object v3 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)v1),(((java.lang.Double)v2).doubleValue()));
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet(((java.util.SortedSet)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v8 = false;
    Object v9 = -1.3696600675879383E18D;
    Object v10 = 2;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v3),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 78;
    Object v14 = 46.86083517262437D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).subtractRow((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }
}
