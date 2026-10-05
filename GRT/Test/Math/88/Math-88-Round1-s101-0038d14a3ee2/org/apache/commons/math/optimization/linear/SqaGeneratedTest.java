package org.apache.commons.math.optimization.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 27;
    Object v12 = 54.84792226060818D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = -0.7722068080313118D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(1412690181), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getSolution();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new java.lang.Double[]{-3.1203726879327043D};
    Object v2 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v1));
    Object v3 = new org.apache.commons.math.linear.RealVectorImpl(((double[])v0),((org.apache.commons.math.linear.RealVectorImpl)v2));
    Object v4 = 4.0D;
    Object v5 = ((org.apache.commons.math.linear.RealVector)v3).mapDivideToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v3));
    org.junit.Assert.assertEquals((Object)(0.7800931719831761D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = -0.7722068080313118D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = -0.7722068080313118D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    Object v9 = false;
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = -0.7722068080313118D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getArtificialVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 7.574283783216543D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.Double[]{-3.1203726879327043D};
    Object v9 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v8));
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).discardArtificialVariables();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getSolution();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).hashCode();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).discardArtificialVariables();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = false;
    Object v9 = 36.63640876740301D;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNormalizedConstraints();
    ((java.util.Collection)v11).clear();
    Object v12 = null;
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = false;
    Object v15 = -0.68881128143139D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getSlackVariableOffset();
    org.junit.Assert.assertEquals((Object)(4), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 13;
    Object v9 = 73;
    Object v10 = -6.537282227070387D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.1203726879327043D};
    Object v1 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v0));
    Object v2 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(3.1203726879327043D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).hashCode();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.1203726879327043D};
    Object v1 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealVector)v1).mapSinToSelf();
    Object v3 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(0.021218373180700374D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumArtificialVariables();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).hashCode();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new java.lang.Double[]{-3.1203726879327043D};
    Object v2 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v1));
    Object v3 = new org.apache.commons.math.linear.RealVectorImpl(((double[])v0),((org.apache.commons.math.linear.RealVectorImpl)v2));
    Object v4 = -15.647202187328878D;
    Object v5 = ((org.apache.commons.math.linear.RealVector)v3).mapDivideToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v3));
    org.junit.Assert.assertEquals((Object)(-0.19942048748239385D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = -0.7722068080313118D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getWidth();
    org.junit.Assert.assertEquals((Object)(5), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-1886602652), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.util.HashSet();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v8));
    Object v10 = 71;
    Object v11 = 0;
    Object v12 = 36.864540402074304D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.1203726879327043D};
    Object v1 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v0));
    Object v2 = new double[]{0.11112783920145253D};
    Object v3 = ((org.apache.commons.math.linear.RealVector)v1).ebeDivide(((double[])v2));
    Object v4 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(3.1203726879327043D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    Object v9 = 0;
    Object v10 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getData();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = false;
    Object v14 = 7.574283783216543D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getOriginalNumDecisionVariables();
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    Object v9 = true;
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = -42;
    Object v9 = 34;
    Object v10 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = 6.736785547808875D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).discardArtificialVariables();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 17;
    Object v9 = -23;
    Object v10 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    Object v9 = 0;
    Object v10 = -3;
    Object v11 = -32.36483048015489D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).setEntry((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = ((java.util.Collection)v3).isEmpty();
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = false;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.1203726879327043D};
    Object v1 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealVector)v1).mapAcosToSelf();
    Object v3 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v1));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = ((java.util.Collection)v3).isEmpty();
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = false;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v8).getNumSlackVariables();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = -8;
    Object v9 = 1;
    Object v10 = 21.907634134578842D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    Object v9 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v10 = 1.0D;
    Object v11 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new java.util.HashSet();
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = false;
    Object v15 = 7.574283783216543D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v11),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v16).getOriginalNumDecisionVariables();
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = ((java.util.Collection)v3).isEmpty();
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = false;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = 38.115276216438495D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v8).subtractRow((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 4;
    Object v9 = 35.28090363648506D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = ((java.util.Collection)v3).isEmpty();
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = false;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v8).getSolution();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 2;
    Object v9 = 0;
    Object v10 = 48.50048191407134D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    Object v9 = false;
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 19;
    Object v9 = 0;
    Object v10 = -11.788759316612802D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = ((java.util.Collection)v3).isEmpty();
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = false;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v8).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new java.lang.Double[]{-3.1203726879327043D};
    Object v2 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v1));
    Object v3 = new org.apache.commons.math.linear.RealVectorImpl(((double[])v0),((org.apache.commons.math.linear.RealVectorImpl)v2));
    Object v4 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v3));
    org.junit.Assert.assertEquals((Object)(3.1203726879327043D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).hashCode();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(3), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v13 = false;
    Object v14 = 1.0D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getNormalizedConstraints();
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getRhsOffset();
    org.junit.Assert.assertEquals((Object)(4), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    Object v9 = 22;
    Object v10 = -46;
    Object v11 = -0.6751559007950663D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.util.HashSet();
    Object v7 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v8 = false;
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v5),((java.util.Collection)v6),((org.apache.commons.math.optimization.GoalType)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v10).getNormalizedConstraints();
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = false;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 1;
    Object v9 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = 66;
    Object v10 = 1.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).subtractRow((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = 29;
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getEntry((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = -0.7722068080313118D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = true;
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).discardArtificialVariables();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = true;
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0;
    Object v9 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = ((java.util.Collection)v3).isEmpty();
    Object v5 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v6 = false;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v8).getOriginalNumDecisionVariables();
    org.junit.Assert.assertEquals((Object)(2), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getWidth();
    org.junit.Assert.assertEquals((Object)(5), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v13 = false;
    Object v14 = 1.0D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getWidth();
    org.junit.Assert.assertEquals((Object)(5), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 36.63640876740301D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 1;
    Object v9 = 21.281468114050128D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getWidth();
    org.junit.Assert.assertEquals((Object)(5), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = false;
    Object v14 = -0.7722068080313118D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getNormalizedConstraints();
    Object v17 = false;
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).createTableau((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumVariables();
    Object v9 = new java.lang.Double[]{-3.1203726879327043D};
    Object v10 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v9));
    Object v11 = ((org.apache.commons.math.linear.RealVector)v10).mapSinToSelf();
    Object v12 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v10));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2).hashCode();
    Object v4 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.util.HashSet();
    Object v8 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v9 = false;
    Object v10 = 1.0D;
    Object v11 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v6),((java.util.Collection)v7),((org.apache.commons.math.optimization.GoalType)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v11).getNormalizedConstraints();
    Object v13 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v14 = false;
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v12),((org.apache.commons.math.optimization.GoalType)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Double)v15).doubleValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getSolution();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNumObjectiveFunctions();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v5 = false;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v13 = false;
    Object v14 = 1.0D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getOriginalNumDecisionVariables();
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.lang.Double[]{-3.1203726879327043D};
    Object v9 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v8));
    Object v10 = new double[]{0.11112783920145253D};
    Object v11 = ((org.apache.commons.math.linear.RealVector)v9).ebeDivide(((double[])v10));
    Object v12 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v9));
    Object v13 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v12));
    Object v14 = false;
    Object v15 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).createTableau((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getArtificialVariableOffset();
    org.junit.Assert.assertEquals((Object)(3), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 8;
    Object v9 = 0.0D;
    ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).divideRow((((java.lang.Integer)v8).intValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getNormalizedConstraints();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new java.lang.Double[]{-3.1203726879327043D};
    Object v2 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v1));
    Object v3 = new org.apache.commons.math.linear.RealVectorImpl(((double[])v0),((org.apache.commons.math.linear.RealVectorImpl)v2));
    Object v4 = new java.lang.Double[]{-3.1203726879327043D};
    Object v5 = new org.apache.commons.math.linear.RealVectorImpl(((java.lang.Double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealVector)v3).dotProduct(((org.apache.commons.math.linear.RealVector)v5));
    Object v7 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(((org.apache.commons.math.linear.RealVector)v3));
    org.junit.Assert.assertEquals((Object)(3.1203726879327043D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
    Object v13 = false;
    Object v14 = 0.0D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getOriginalNumDecisionVariables();
    Object v17 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = true;
    Object v6 = -53.55612954354302D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 18;
    Object v9 = 9;
    Object v10 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).getEntry((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.util.HashSet();
    Object v4 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v5 = false;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v2),((java.util.Collection)v3),((org.apache.commons.math.optimization.GoalType)v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{12.264513308387349D,-29.149332491441704D};
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new java.util.HashSet();
    Object v12 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
    Object v13 = false;
    Object v14 = 1.0D;
    Object v15 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)v10),((java.util.Collection)v11),((org.apache.commons.math.optimization.GoalType)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).getNormalizedConstraints();
    Object v17 = true;
    Object v18 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v15).createTableau((((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((org.apache.commons.math.optimization.linear.SimplexTableau)v7).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }
}
