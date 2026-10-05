package org.apache.commons.math.optimization.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = false;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).createTableau((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSolution();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = -22.57633006376898D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v11));
    Object v13 = 1;
    Object v14 = 2;
    Object v15 = 20.25173360343224D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Double)v15).doubleValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).discardArtificialVariables();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1;
    Object v11 = 4;
    Object v12 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = -48.42181005884372D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).hashCode();
    Object v11 = 0;
    Object v12 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumVariables();
    org.junit.Assert.assertEquals((Object)(2), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 5;
    Object v11 = 42.37627502777264D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).createTableau((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = -5;
    Object v11 = -35;
    Object v12 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.Double[]{21.48995406798818D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = new double[]{0.0D,-13.12555844723884D,1.0D};
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.ArrayRealVector)v1),((double[])v2));
    Object v4 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v3));
    org.junit.Assert.assertEquals((Object)(-9.36439562074934D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).discardArtificialVariables();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = -14;
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getEntry((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.Double[]{21.48995406798818D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(-21.48995406798818D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -26.276036513982792D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = -16;
    Object v11 = 1;
    Object v12 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSolution();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -26.276036513982792D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getHeight();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSolution();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).hashCode();
    Object v11 = 2;
    Object v12 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).hashCode();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getRhsOffset();
    org.junit.Assert.assertEquals((Object)(4), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 2.0D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = false;
    Object v17 = -0.8266892810730571D;
    Object v18 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Double)v17).doubleValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -26.276036513982792D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).hashCode();
    Object v11 = 1;
    Object v12 = 34;
    Object v13 = -30.748102585568525D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumVariables();
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).discardArtificialVariables();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 2.0D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = false;
    Object v17 = -0.8266892810730571D;
    Object v18 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = 73;
    Object v20 = -11;
    Object v21 = -42.09380641095198D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v18).subtractRow((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Double)v21).doubleValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumVariables();
    org.junit.Assert.assertEquals((Object)(2), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = false;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).createTableau((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getArtificialVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v11 = 1.0D;
    Object v12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = java.util.function.Function.identity();
    Object v14 = java.util.Comparator.comparing(((java.util.function.Function)v13));
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v17 = false;
    Object v18 = 2.0D;
    Object v19 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v12),((java.util.Collection)v15),((org.apache.commons.math.optimization.GoalType)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = true;
    Object v21 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v19).createTableau((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumVariables();
    Object v11 = -14;
    Object v12 = 0;
    Object v13 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getArtificialVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNegativeDecisionVariableOffset();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getRhsOffset();
    org.junit.Assert.assertEquals((Object)(3), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 71.48014658350743D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).hashCode();
    org.junit.Assert.assertEquals((Object)(-2119219525), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = -39;
    Object v19 = 14;
    Object v20 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).subtractRow((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Double)v20).doubleValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = false;
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).createTableau((((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 0;
    Object v19 = -61;
    Object v20 = -14.521392446136796D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).setEntry((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Double)v20).doubleValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).hashCode();
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = false;
    Object v8 = -26.276036513982792D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSolution();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).hashCode();
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v19 = 1.0D;
    Object v20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v18),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v22 = 1.0D;
    Object v23 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v21),(((java.lang.Double)v22).doubleValue()));
    Object v24 = java.util.function.Function.identity();
    Object v25 = java.util.Comparator.comparing(((java.util.function.Function)v24));
    Object v26 = new java.util.TreeSet(((java.util.Comparator)v25));
    Object v27 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v28 = false;
    Object v29 = 24.362569762411084D;
    Object v30 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v23),((java.util.Collection)v26),((org.apache.commons.math.optimization.GoalType)v27),(((java.lang.Boolean)v28).booleanValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v30).getNormalizedConstraints();
    Object v32 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v33 = true;
    Object v34 = 2.0D;
    Object v35 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v20),((java.util.Collection)v31),((org.apache.commons.math.optimization.GoalType)v32),(((java.lang.Boolean)v33).booleanValue()),(((java.lang.Double)v34).doubleValue()));
    Object v36 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).equals(((java.lang.Object)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getSolution();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getData();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getHeight();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = 33.32293273682968D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v11 = 1.0D;
    Object v12 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = java.util.function.Function.identity();
    Object v14 = java.util.Comparator.comparing(((java.util.function.Function)v13));
    Object v15 = new java.util.TreeSet(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v17 = false;
    Object v18 = 24.362569762411084D;
    Object v19 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v12),((java.util.Collection)v15),((org.apache.commons.math.optimization.GoalType)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v19).getNumObjectiveFunctions();
    Object v21 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 2.0D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = ((java.lang.Enum)v14).getDeclaringClass();
    Object v16 = false;
    Object v17 = -0.8266892810730571D;
    Object v18 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Double)v17).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v18).discardArtificialVariables();
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getNumVariables();
    Object v19 = false;
    Object v20 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).createTableau((((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1;
    Object v11 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 4;
    Object v11 = 30;
    Object v12 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.lang.Double[]{21.48995406798818D};
    Object v11 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v10));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = -11;
    Object v12 = -6.727756438216798D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new java.lang.Double[]{21.48995406798818D};
    Object v11 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v10));
    Object v12 = new double[]{0.0D,-13.12555844723884D,1.0D};
    Object v13 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.ArrayRealVector)v11),((double[])v12));
    Object v14 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).equals(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = false;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).createTableau((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).discardArtificialVariables();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = true;
    Object v8 = 17.966133190804886D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2).hashCode();
    Object v4 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v8 = 1.0D;
    Object v9 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.Comparator.comparing(((java.util.function.Function)v10));
    Object v12 = new java.util.TreeSet(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v14 = false;
    Object v15 = 24.362569762411084D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v9),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).getNormalizedConstraints();
    Object v18 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v19 = true;
    Object v20 = 2.0D;
    Object v21 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v17),((org.apache.commons.math.optimization.GoalType)v18),(((java.lang.Boolean)v19).booleanValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v21).hashCode();
    Object v23 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v21).getNormalizedConstraints();
    Object v24 = new java.lang.Double[]{21.48995406798818D};
    Object v25 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v24));
    Object v26 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v25));
    Object v27 = java.util.function.Predicate.isEqual(((java.lang.Object)v26));
    Object v28 = ((java.util.Collection)v23).removeIf(((java.util.function.Predicate)v27));
    Object v29 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v30 = false;
    Object v31 = -10.214249282896779D;
    Object v32 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v23),((org.apache.commons.math.optimization.GoalType)v29),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Double)v31).doubleValue()));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = 34.702688442870084D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).discardArtificialVariables();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = new java.lang.Double[]{21.48995406798818D};
    Object v7 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v6));
    Object v8 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v7));
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v9));
    Object v11 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v12 = true;
    Object v13 = 0.0D;
    Object v14 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Double)v13).doubleValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = 34.702688442870084D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumVariables();
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = 34.702688442870084D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).hashCode();
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = true;
    Object v16 = 2.0D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v19 = 1.0D;
    Object v20 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v18),(((java.lang.Double)v19).doubleValue()));
    Object v21 = java.util.function.Function.identity();
    Object v22 = java.util.Comparator.comparing(((java.util.function.Function)v21));
    Object v23 = new java.util.TreeSet(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v25 = true;
    Object v26 = 56.85639913862648D;
    Object v27 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v20),((java.util.Collection)v23),((org.apache.commons.math.optimization.GoalType)v24),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v27).getHeight();
    Object v29 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).equals(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = 34.702688442870084D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getSolution();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getNormalizedConstraints();
    Object v11 = 18;
    Object v12 = -46;
    Object v13 = -0.6751559007950663D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).subtractRow((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.Comparator.comparing(((java.util.function.Function)v9));
    Object v11 = new java.util.TreeSet(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v13 = false;
    Object v14 = 24.362569762411084D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v8),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getNormalizedConstraints();
    Object v17 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v18 = true;
    Object v19 = 2.0D;
    Object v20 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v16),((org.apache.commons.math.optimization.GoalType)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v20).hashCode();
    Object v22 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v20).getNormalizedConstraints();
    Object v23 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v24 = ((java.lang.Enum)v23).getDeclaringClass();
    Object v25 = false;
    Object v26 = 0.0D;
    Object v27 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v22),((org.apache.commons.math.optimization.GoalType)v23),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Double)v26).doubleValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1;
    Object v11 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = 34.702688442870084D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.function.Function.identity();
    Object v7 = java.util.Comparator.comparing(((java.util.function.Function)v6));
    Object v8 = new java.util.TreeSet(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v10 = false;
    Object v11 = 24.362569762411084D;
    Object v12 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v8),((org.apache.commons.math.optimization.GoalType)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v12).getNormalizedConstraints();
    Object v14 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v15 = false;
    Object v16 = 34.702688442870084D;
    Object v17 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v13),((org.apache.commons.math.optimization.GoalType)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 0;
    Object v19 = 66;
    Object v20 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v17).subtractRow((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Double)v20).doubleValue()));
    Object v21 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v7 = true;
    Object v8 = 56.85639913862648D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = 29;
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).getEntry((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeSet(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v7 = false;
    Object v8 = 24.362569762411084D;
    Object v9 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v5),((org.apache.commons.math.optimization.GoalType)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = true;
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v9).createTableau((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }
}
