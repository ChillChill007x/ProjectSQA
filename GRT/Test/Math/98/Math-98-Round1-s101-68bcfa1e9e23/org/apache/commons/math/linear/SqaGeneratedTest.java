package org.apache.commons.math.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math.linear.RealMatrixImpl();
    Object v1 = new double[]{-11.145549761066928D,1.0D,2.0D};
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v0).preMultiply(((double[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(29569657), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1514457745), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).transpose();
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = new double[]{47.94785017358135D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = new double[]{2.0D};
    Object v8 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v7));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).getTrace();
    Object v10 = new double[]{2.0D};
    Object v11 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v10));
    Object v12 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).add(((org.apache.commons.math.linear.RealMatrixImpl)v11));
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).subtract(((org.apache.commons.math.linear.RealMatrix)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 3;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getColumnMatrix((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).isSquare();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).getTrace();
    Object v5 = new double[]{2.0D};
    Object v6 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v5));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrixImpl)v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v7).transpose();
    Object v9 = new double[]{2.0D};
    Object v10 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v9));
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v10).getTrace();
    Object v12 = new double[]{2.0D};
    Object v13 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v12));
    Object v14 = ((org.apache.commons.math.linear.RealMatrixImpl)v10).add(((org.apache.commons.math.linear.RealMatrixImpl)v13));
    Object v15 = ((org.apache.commons.math.linear.RealMatrixImpl)v7).subtract(((org.apache.commons.math.linear.RealMatrix)v14));
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{46.115522277252026D};
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).preMultiply(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getDeterminant();
    org.junit.Assert.assertEquals((Object)(47.94785017358135D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).getTrace();
    Object v5 = new double[]{2.0D};
    Object v6 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v5));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrixImpl)v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).solve(((org.apache.commons.math.linear.RealMatrix)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = new double[]{2.0D};
    Object v8 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v7));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).getTrace();
    Object v10 = new double[]{2.0D};
    Object v11 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v10));
    Object v12 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).add(((org.apache.commons.math.linear.RealMatrixImpl)v11));
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).subtract(((org.apache.commons.math.linear.RealMatrix)v12));
    Object v14 = new double[]{2.0D};
    Object v15 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v14));
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v15).transpose();
    Object v17 = ((org.apache.commons.math.linear.RealMatrixImpl)v13).add(((org.apache.commons.math.linear.RealMatrixImpl)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new double[][]{};
    Object v1 = true;
    Object v2 = new org.apache.commons.math.linear.RealMatrixImpl(((double[][])v0),(((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).transpose();
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = new double[]{47.94785017358135D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v7));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).hashCode();
    ((org.apache.commons.math.linear.RealMatrixImpl)v8).luDecompose();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).isSingular();
    Object v3 = new double[]{};
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).solve(((double[])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = 6;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).getColumnMatrix((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = 28;
    Object v7 = -17;
    Object v8 = 21;
    Object v9 = 0;
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).getSubMatrix((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = -13.20338967611464D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = new double[]{47.94785017358135D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = 22.77910034981141D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarAdd((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.RealMatrix)v6).getColumnDimension();
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).inverse();
    Object v3 = new int[]{0,11};
    Object v4 = new int[]{4};
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getSubMatrix(((int[])v3),((int[])v4));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{0.0D};
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).operate(((double[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.linear.RealMatrixImpl((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = new double[]{47.94785017358135D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = 22.77910034981141D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarAdd((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.RealMatrix)v6).getColumnDimension();
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v6));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).toString();
    org.junit.Assert.assertEquals((Object)("RealMatrixImpl{{-22.779100349811408}}"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).transpose();
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = new double[]{47.94785017358135D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v7));
    Object v9 = new double[]{13.388367720739394D};
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).operate(((double[])v9));
    Object v11 = new double[]{2.0D};
    Object v12 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v11));
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v12).getTrace();
    Object v14 = new double[]{2.0D};
    Object v15 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v14));
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v12).add(((org.apache.commons.math.linear.RealMatrixImpl)v15));
    Object v17 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).toString();
    org.junit.Assert.assertEquals((Object)("RealMatrixImpl{{47.94785017358135}}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).getTrace();
    org.junit.Assert.assertEquals((Object)(2.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).subtract(((org.apache.commons.math.linear.RealMatrix)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v3));
    ((org.apache.commons.math.linear.RealMatrixImpl)v4).luDecompose();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).isSingular();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = -13.20338967611464D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{47.94785017358135D};
    Object v6 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v5));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).solve(((org.apache.commons.math.linear.RealMatrix)v6));
    Object v8 = 0;
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).getRowMatrix((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[][]{};
    Object v3 = 1;
    Object v4 = 2;
    ((org.apache.commons.math.linear.RealMatrixImpl)v1).setSubMatrix(((double[][])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = -15;
    Object v5 = -97;
    Object v6 = 0;
    Object v7 = -8;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).getSubMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 28;
    Object v1 = -1;
    Object v2 = new org.apache.commons.math.linear.RealMatrixImpl((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).transpose();
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = new int[]{1,3};
    Object v7 = new int[]{-13,4};
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getSubMatrix(((int[])v6),((int[])v7));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{47.94785017358135D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrix)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = new double[]{47.94785017358135D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = 22.77910034981141D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarAdd((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.RealMatrix)v6).getColumnDimension();
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v6));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).toString();
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).inverse();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 3;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = 12;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getSubMatrix((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = new double[]{-30.987639393701443D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).add(((org.apache.commons.math.linear.RealMatrix)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).transpose();
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v4));
    Object v6 = new double[]{47.94785017358135D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v7));
    Object v9 = new double[]{13.388367720739394D};
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).operate(((double[])v9));
    Object v11 = new double[]{2.0D};
    Object v12 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v11));
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v12).getTrace();
    Object v14 = new double[]{2.0D};
    Object v15 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v14));
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v12).add(((org.apache.commons.math.linear.RealMatrixImpl)v15));
    Object v17 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v16));
    Object v18 = new double[]{47.94785017358135D};
    Object v19 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v18));
    Object v20 = ((org.apache.commons.math.linear.RealMatrixImpl)v19).transpose();
    Object v21 = ((org.apache.commons.math.linear.RealMatrixImpl)v17).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v20));
    Object v22 = new double[]{47.94785017358135D};
    Object v23 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v22));
    Object v24 = 22.77910034981141D;
    Object v25 = ((org.apache.commons.math.linear.RealMatrixImpl)v23).scalarAdd((((java.lang.Double)v24).doubleValue()));
    Object v26 = new double[]{2.0D};
    Object v27 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v26));
    Object v28 = ((org.apache.commons.math.linear.RealMatrixImpl)v27).transpose();
    Object v29 = -13.20338967611464D;
    Object v30 = ((org.apache.commons.math.linear.RealMatrixImpl)v28).scalarMultiply((((java.lang.Double)v29).doubleValue()));
    Object v31 = ((org.apache.commons.math.linear.RealMatrixImpl)v25).subtract(((org.apache.commons.math.linear.RealMatrix)v30));
    Object v32 = ((org.apache.commons.math.linear.RealMatrixImpl)v17).multiply(((org.apache.commons.math.linear.RealMatrix)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrix)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[][]{null};
    Object v3 = 6;
    Object v4 = 1;
    ((org.apache.commons.math.linear.RealMatrixImpl)v1).setSubMatrix(((double[][])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getColumn((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1514457745), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = new double[]{-30.987639393701443D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).getLUMatrix();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = 17;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).getColumn((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrix)v3));
    Object v5 = 2;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).getSubMatrix((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{-29.88175373438854D,0.0D,29.782677797448514D};
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).operate(((double[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).toString();
    org.junit.Assert.assertEquals((Object)("RealMatrixImpl{{2.0}}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = Double.NaN;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{47.94785017358135D};
    Object v10 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v9));
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).solve(((org.apache.commons.math.linear.RealMatrix)v10));
    Object v12 = 0;
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).getRowMatrix((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{47.94785017358135D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = new double[]{47.94785017358135D};
    Object v8 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v7));
    Object v9 = 22.77910034981141D;
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).scalarAdd((((java.lang.Double)v9).doubleValue()));
    Object v11 = new double[]{47.94785017358135D};
    Object v12 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v11));
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v10).add(((org.apache.commons.math.linear.RealMatrix)v12));
    Object v14 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = -13.20338967611464D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{-30.987639393701443D};
    Object v6 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v5));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).add(((org.apache.commons.math.linear.RealMatrix)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v3));
    Object v5 = new int[]{0};
    Object v6 = new int[]{0,-45,1};
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).getSubMatrix(((int[])v5),((int[])v6));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{2.0D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).transpose();
    Object v5 = -13.20338967611464D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarMultiply((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = 22.77910034981141D;
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).scalarAdd((((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{47.94785017358135D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).add(((org.apache.commons.math.linear.RealMatrix)v7));
    Object v9 = new double[]{2.0D};
    Object v10 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v9));
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v10).transpose();
    Object v12 = -13.20338967611464D;
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = new double[]{-30.987639393701443D};
    Object v15 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v14));
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v13).add(((org.apache.commons.math.linear.RealMatrix)v15));
    Object v17 = ((org.apache.commons.math.linear.RealMatrix)v8).preMultiply(((org.apache.commons.math.linear.RealMatrix)v16));
    Object v18 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrix)v8));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).subtract(((org.apache.commons.math.linear.RealMatrix)v8));
    Object v10 = new double[]{2.0D};
    Object v11 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v10));
    Object v12 = ((org.apache.commons.math.linear.RealMatrixImpl)v11).transpose();
    Object v13 = new double[]{-30.987639393701443D};
    Object v14 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v13));
    Object v15 = ((org.apache.commons.math.linear.RealMatrixImpl)v12).add(((org.apache.commons.math.linear.RealMatrixImpl)v14));
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v12).getLUMatrix();
    Object v17 = ((org.apache.commons.math.linear.RealMatrixImpl)v9).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getLUMatrix();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 1;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getRow((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{-38.509532256728306D};
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).preMultiply(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).isSquare();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).subtract(((org.apache.commons.math.linear.RealMatrix)v8));
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v9).getDeterminant();
    org.junit.Assert.assertEquals((Object)(97.13372987562204D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 1;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getRowMatrix((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = -13.20338967611464D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = -8.848618204045842D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarMultiply((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = -78;
    Object v1 = 0;
    Object v2 = new org.apache.commons.math.linear.RealMatrixImpl((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new double[][]{null};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.RealMatrixImpl(((double[][])v0),(((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = -48.17449184240025D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = -32;
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getColumnMatrix((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = -13.20338967611464D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = -8.848618204045842D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarMultiply((((java.lang.Double)v5).doubleValue()));
    Object v7 = new double[]{-30.987639393701443D};
    Object v8 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v7));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).multiply(((org.apache.commons.math.linear.RealMatrix)v8));
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).getNorm();
    org.junit.Assert.assertEquals((Object)(233.66350848635784D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    org.junit.Assert.assertEquals((Object)(47.94785017358135D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = Double.NaN;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{47.94785017358135D};
    Object v10 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v9));
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).solve(((org.apache.commons.math.linear.RealMatrix)v10));
    Object v12 = 0;
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).getRowMatrix((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrixImpl)v13));
    Object v15 = 6;
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v14).getRow((((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new int[]{26,-57};
    Object v5 = new int[]{-2,0};
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).getSubMatrix(((int[])v4),((int[])v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).getColumn((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getTrace();
    Object v3 = new double[]{2.0D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).add(((org.apache.commons.math.linear.RealMatrixImpl)v4));
    Object v6 = new double[]{-30.987639393701443D};
    Object v7 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).add(((org.apache.commons.math.linear.RealMatrix)v7));
    Object v9 = new double[]{1.0D};
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).solve(((double[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{47.94785017358135D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).getColumnDimension();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarAdd((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{};
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).solve(((double[])v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new double[][]{};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[][])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getLUMatrix();
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarAdd((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{47.94785017358135D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = new double[]{47.94785017358135D};
    Object v8 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v7));
    Object v9 = 22.77910034981141D;
    Object v10 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).scalarAdd((((java.lang.Double)v9).doubleValue()));
    Object v11 = new double[]{47.94785017358135D};
    Object v12 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v11));
    Object v13 = ((org.apache.commons.math.linear.RealMatrixImpl)v10).add(((org.apache.commons.math.linear.RealMatrix)v12));
    Object v14 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v13));
    Object v15 = new double[]{22.619938631957655D,21.47967247934809D,-6.665264225853898D};
    Object v16 = ((org.apache.commons.math.linear.RealMatrixImpl)v14).preMultiply(((double[])v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 40.90815069185347D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{47.94785017358135D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).solve(((org.apache.commons.math.linear.RealMatrix)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).subtract(((org.apache.commons.math.linear.RealMatrix)v8));
    Object v10 = 2.0D;
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v9).scalarMultiply((((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{47.94785017358135D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).getLUMatrix();
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).add(((org.apache.commons.math.linear.RealMatrixImpl)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = -13.20338967611464D;
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{2.0D};
    Object v6 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v5));
    Object v7 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).equals(((java.lang.Object)v6));
    Object v8 = -17;
    Object v9 = -14;
    Object v10 = 2;
    Object v11 = -13;
    Object v12 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).getSubMatrix((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).subtract(((org.apache.commons.math.linear.RealMatrix)v8));
    Object v10 = 1;
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v9).getRow((((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{2.0D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrixImpl)v3));
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).getColumnDimension();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).isSquare();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = -32.907027103241035D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = new double[]{47.94785017358135D};
    Object v4 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v3));
    Object v5 = 22.77910034981141D;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v4).scalarAdd((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.RealMatrix)v6).getColumnDimension();
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).subtract(((org.apache.commons.math.linear.RealMatrix)v6));
    Object v9 = new double[]{2.0D};
    Object v10 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v9));
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v10).transpose();
    Object v12 = ((org.apache.commons.math.linear.RealMatrixImpl)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = new double[]{47.94785017358135D};
    Object v3 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v2));
    Object v4 = 22.77910034981141D;
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).scalarAdd((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).multiply(((org.apache.commons.math.linear.RealMatrix)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = -25;
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).getSubMatrix((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).transpose();
    Object v3 = new double[]{33.14236567925692D,0.0D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v2).preMultiply(((double[])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 22.77910034981141D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{2.0D};
    Object v5 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v4));
    Object v6 = ((org.apache.commons.math.linear.RealMatrixImpl)v5).transpose();
    Object v7 = -13.20338967611464D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrixImpl)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).subtract(((org.apache.commons.math.linear.RealMatrix)v8));
    Object v10 = 2.0D;
    Object v11 = ((org.apache.commons.math.linear.RealMatrixImpl)v9).scalarMultiply((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.RealMatrixImpl)v11).copy();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).getLUMatrix();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new double[]{47.94785017358135D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = -32.907027103241035D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).getNorm();
    Object v5 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).toString();
    org.junit.Assert.assertEquals((Object)("RealMatrixImpl{{-1577.8212052041818}}"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{-30.987639393701443D};
    Object v1 = new org.apache.commons.math.linear.RealMatrixImpl(((double[])v0));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math.linear.RealMatrixImpl)v1).scalarMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.linear.RealMatrixImpl)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(748787269), v4);
  }
}
