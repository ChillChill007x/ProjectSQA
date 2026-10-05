package org.apache.commons.math.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = 14;
    Object v5 = 3;
    Object v6 = 1;
    Object v7 = 40;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = 11;
    Object v5 = 0;
    Object v6 = -57;
    Object v7 = -37;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).toString();
    Object v4 = -19.717405929079668D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarAdd((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).copy();
    Object v4 = -20;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getRowVector((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getEntry((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v7 = 22;
    Object v8 = 1;
    Object v9 = -23;
    Object v10 = 0;
    Object v11 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).hashCode();
    Object v4 = new double[]{16.181862185075556D,0.0D};
    Object v5 = true;
    Object v6 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).preMultiply(((org.apache.commons.math.linear.RealVector)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 25;
    Object v4 = -15;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = new double[][]{null,null,null};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).copySubMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((double[][])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInOptimizedOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    Object v5 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v5));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -3;
    Object v4 = new double[]{-20.536180157165237D,8.490599180815435D,0.0D};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setRow((((java.lang.Integer)v3).intValue()),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).toString();
    Object v4 = -19.717405929079668D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarAdd((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = new double[]{16.181862185075556D,0.0D};
    Object v8 = true;
    Object v9 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v7),(((java.lang.Boolean)v8).booleanValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v5).setRowVector((((java.lang.Integer)v6).intValue()),((org.apache.commons.math.linear.RealVector)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixDimensionMismatchException");
    } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = -8;
    Object v5 = -37.80852901539695D;
    ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).addToEntry((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    Object v5 = 2;
    Object v6 = 12;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = ((org.apache.commons.math.linear.AbstractRealMatrix)v7).getColumnVector((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).toString();
    Object v4 = -19.717405929079668D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarAdd((((java.lang.Double)v4).doubleValue()));
    Object v6 = 1;
    Object v7 = new double[]{16.181862185075556D,0.0D};
    Object v8 = true;
    Object v9 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v7),(((java.lang.Boolean)v8).booleanValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v5).setColumnVector((((java.lang.Integer)v6).intValue()),((org.apache.commons.math.linear.RealVector)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getRow((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v6 = 14;
    Object v7 = -3;
    Object v8 = 0;
    Object v9 = 11;
    Object v10 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = -8;
    Object v5 = 1;
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3).visit((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 0.0D;
    ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).multiplyEntry((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 29;
    Object v4 = new double[]{26.629058071211126D,1.0D,-9.256466788758798D};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumn((((java.lang.Integer)v3).intValue()),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = new double[][]{null};
    Object v5 = -16;
    Object v6 = 15;
    ((org.apache.commons.math.linear.AbstractRealMatrix)v3).setSubMatrix(((double[][])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).getTrace();
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getColumn((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = -14;
    Object v5 = -2;
    Object v6 = -4.823230760588268D;
    ((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3).visit((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = -6;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = 52;
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getSubMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).power((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 32;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getRow((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).multiply(((org.apache.commons.math.linear.OpenMapRealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getData();
    Object v4 = 18;
    Object v5 = 15;
    Object v6 = 1;
    Object v7 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setRowMatrix((((java.lang.Integer)v4).intValue()),((org.apache.commons.math.linear.RealMatrix)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -31;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getRowMatrix((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{1.0D,32.0D};
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).preMultiply(((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = 0;
    Object v5 = 27;
    Object v6 = 0;
    Object v7 = -18;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getData();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = 2;
    Object v10 = 12;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1.0D;
    Object v13 = ((org.apache.commons.math.linear.AbstractRealMatrix)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v8).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getRow((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new double[]{16.181862185075556D,0.0D};
    Object v7 = true;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumnVector((((java.lang.Integer)v5).intValue()),((org.apache.commons.math.linear.RealVector)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixDimensionMismatchException");
    } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).isSquare();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).equals(((java.lang.Object)v5));
    Object v7 = 53;
    Object v8 = 0;
    Object v9 = 2;
    Object v10 = -24;
    Object v11 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getSubMatrix((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = -12;
    Object v10 = new double[]{16.181862185075556D,0.0D};
    Object v11 = true;
    Object v12 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v10),(((java.lang.Boolean)v11).booleanValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v8).setRowVector((((java.lang.Integer)v9).intValue()),((org.apache.commons.math.linear.RealVector)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v10 = -31;
    Object v11 = 0;
    Object v12 = 40.4218160197708D;
    Object v13 = ((org.apache.commons.math.linear.RealMatrixChangingVisitor)v9).visit((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = 2;
    Object v15 = -36;
    Object v16 = 0;
    Object v17 = -13;
    Object v18 = ((org.apache.commons.math.linear.AbstractRealMatrix)v8).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v9),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).toString();
    Object v4 = -19.717405929079668D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarAdd((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v5).getData();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{0.0D,43.980568473501116D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).operate(((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 15;
    Object v5 = 1;
    Object v6 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumnMatrix((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealMatrix)v6));
    Object v7 = null;
    Object v8 = 2;
    Object v9 = new double[]{-8.78888277752335D,0.0D,4.577854265690794D};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumn((((java.lang.Integer)v8).intValue()),((double[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = 15;
    Object v5 = 1;
    Object v6 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.linear.RealMatrix)v6).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumnMatrix((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealMatrix)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    org.junit.Assert.assertEquals((Object)(0.0D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -17;
    Object v4 = new double[]{16.181862185075556D,0.0D};
    Object v5 = true;
    Object v6 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Boolean)v5).booleanValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumnVector((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealVector)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixDimensionMismatchException");
    } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{16.181862185075556D,0.0D};
    Object v4 = true;
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).operate(((org.apache.commons.math.linear.RealVector)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = -27.799922917781068D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).scalarMultiply((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = 2;
    Object v10 = 12;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1.0D;
    Object v13 = ((org.apache.commons.math.linear.AbstractRealMatrix)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v8).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v11));
    Object v15 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v16 = 82;
    Object v17 = 2;
    Object v18 = -2;
    Object v19 = 1;
    Object v20 = ((org.apache.commons.math.linear.AbstractRealMatrix)v14).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{16.181862185075556D,0.0D};
    Object v4 = true;
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getNorm();
    Object v4 = new double[]{16.181862185075556D,0.0D};
    Object v5 = true;
    Object v6 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new double[]{16.181862185075556D,0.0D};
    Object v8 = true;
    Object v9 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.math.linear.RealVector)v6).getL1Distance(((org.apache.commons.math.linear.RealVector)v9));
    Object v11 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).operate(((org.apache.commons.math.linear.RealVector)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 3;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).power((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-953305199), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarAdd((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).isSquare();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = -50;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = new int[]{};
    Object v10 = new int[]{71};
    Object v11 = new double[][]{null,null};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v8).copySubMatrix(((int[])v9),((int[])v10),((double[][])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{};
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).operate(((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).toString();
    org.junit.Assert.assertEquals((Object)("Array2DRowRealMatrix{{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0},{0.0}}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = 15;
    Object v5 = 1;
    Object v6 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v3).multiply(((org.apache.commons.math.linear.RealMatrix)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getColumnMatrix((((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 12;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 2;
    Object v9 = 12;
    Object v10 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.linear.AbstractRealMatrix)v7).add(((org.apache.commons.math.linear.RealMatrix)v10));
    Object v12 = 2.0D;
    Object v13 = ((org.apache.commons.math.linear.AbstractRealMatrix)v7).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).multiply(((org.apache.commons.math.linear.RealMatrix)v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getTrace();
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.NonSquareMatrixException");
    } catch (org.apache.commons.math.linear.NonSquareMatrixException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 15;
    Object v5 = 1;
    Object v6 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v8 = ((org.apache.commons.math.linear.RealMatrix)v6).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v7));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumnMatrix((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealMatrix)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = 2;
    Object v10 = 12;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1.0D;
    Object v13 = ((org.apache.commons.math.linear.AbstractRealMatrix)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v8).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v11));
    Object v15 = -4;
    Object v16 = ((org.apache.commons.math.linear.AbstractRealMatrix)v14).getRowMatrix((((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 17;
    Object v4 = 15;
    Object v5 = 1;
    Object v6 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setRowMatrix((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealMatrix)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getFrobeniusNorm();
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = 2;
    Object v5 = 12;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = 12;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).add(((org.apache.commons.math.linear.RealMatrix)v9));
    Object v11 = 2.0D;
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).scalarMultiply((((java.lang.Double)v11).doubleValue()));
    Object v13 = 2;
    Object v14 = 12;
    Object v15 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1.0D;
    Object v17 = ((org.apache.commons.math.linear.AbstractRealMatrix)v15).scalarMultiply((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v12).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v15));
    Object v19 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).add(((org.apache.commons.math.linear.RealMatrix)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new double[]{16.181862185075556D,0.0D};
    Object v5 = true;
    Object v6 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Boolean)v5).booleanValue()));
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setColumnVector((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealVector)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[][]{};
    Object v4 = -14;
    Object v5 = -67;
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setSubMatrix(((double[][])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v4 = 2;
    Object v5 = 0;
    Object v6 = 7.6346609235607445D;
    ((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3).visit((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = -22;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixPreservingVisitor)v3),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = 1;
    Object v5 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v5).toString();
    Object v7 = -19.717405929079668D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v5).scalarAdd((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.AbstractRealMatrix)v8).getData();
    Object v10 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-953305199), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -26.559616676873844D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarAdd((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = -27.799922917781068D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).scalarMultiply((((java.lang.Double)v4).doubleValue()));
    Object v6 = 13;
    Object v7 = ((org.apache.commons.math.linear.AbstractRealMatrix)v5).getRow((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{16.181862185075556D,0.0D};
    Object v4 = true;
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).preMultiply(((org.apache.commons.math.linear.RealVector)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{16.181862185075556D,0.0D};
    Object v4 = true;
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = -12;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = -2;
    Object v8 = 1;
    Object v9 = 3;
    ((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3).start((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = 2;
    Object v12 = 1;
    Object v13 = 1;
    Object v14 = 20;
    Object v15 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NumberIsTooSmallException");
    } catch (org.apache.commons.math.exception.NumberIsTooSmallException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = 2;
    Object v5 = 12;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = 12;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).add(((org.apache.commons.math.linear.RealMatrix)v9));
    Object v11 = 2.0D;
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).scalarMultiply((((java.lang.Double)v11).doubleValue()));
    Object v13 = 2;
    Object v14 = 12;
    Object v15 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1.0D;
    Object v17 = ((org.apache.commons.math.linear.AbstractRealMatrix)v15).scalarMultiply((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v12).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v15));
    Object v19 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).add(((org.apache.commons.math.linear.RealMatrix)v18));
    Object v20 = new int[]{};
    Object v21 = new int[]{0,10,20};
    Object v22 = new double[][]{null};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v19).copySubMatrix(((int[])v20),((int[])v21),((double[][])v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3));
    Object v5 = 2;
    Object v6 = 12;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 9;
    Object v9 = ((org.apache.commons.math.linear.AbstractRealMatrix)v7).getColumnVector((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v7));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v10).getRow((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v5).copy();
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -16;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getColumnMatrix((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).toString();
    Object v4 = new int[]{};
    Object v5 = new int[]{};
    Object v6 = new double[][]{null};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).copySubMatrix(((int[])v4),((int[])v5),((double[][])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NoDataException");
    } catch (org.apache.commons.math.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new double[]{-25.259806497736033D};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v2).setRow((((java.lang.Integer)v3).intValue()),((double[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixDimensionMismatchException");
    } catch (org.apache.commons.math.linear.MatrixDimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v4 = -8;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInColumnOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).add(((org.apache.commons.math.linear.RealMatrix)v5));
    Object v7 = 2.0D;
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).scalarMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = 2;
    Object v10 = 12;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1.0D;
    Object v13 = ((org.apache.commons.math.linear.AbstractRealMatrix)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v8).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v11));
    Object v15 = -27;
    Object v16 = new double[]{};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v14).setRow((((java.lang.Integer)v15).intValue()),((double[])v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v5));
    Object v7 = new org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor();
    Object v8 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).equals(((java.lang.Object)v7));
    Object v9 = -14;
    Object v10 = 18;
    Object v11 = 0.0D;
    ((org.apache.commons.math.linear.OpenMapRealMatrix)v6).multiplyEntry((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v5));
    Object v7 = 1;
    Object v8 = -42;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = new double[][]{null};
    ((org.apache.commons.math.linear.AbstractRealMatrix)v6).copySubMatrix((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),((double[][])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 38;
    Object v4 = 0;
    Object v5 = -22;
    Object v6 = -17;
    Object v7 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getSubMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v5).copy();
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v6));
    Object v8 = 38.035970389212586D;
    Object v9 = ((org.apache.commons.math.linear.AbstractRealMatrix)v7).scalarMultiply((((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = -3;
    Object v12 = 0.0D;
    ((org.apache.commons.math.linear.OpenMapRealMatrix)v7).setEntry((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Double)v12).doubleValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new double[]{-6.078135225961807D,29.645012256736685D,0.5D};
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).preMultiply(((double[])v3));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = 12;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v5));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).toString();
    org.junit.Assert.assertEquals((Object)("OpenMapRealMatrix{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}}"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 15;
    Object v1 = 1;
    Object v2 = new org.apache.commons.math.linear.Array2DRowRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).getRowMatrix((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor();
    Object v6 = 21;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = 3;
    Object v10 = ((org.apache.commons.math.linear.AbstractRealMatrix)v2).walkInRowOrder(((org.apache.commons.math.linear.RealMatrixChangingVisitor)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.OutOfRangeException");
    } catch (org.apache.commons.math.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = -27.799922917781068D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).scalarMultiply((((java.lang.Double)v4).doubleValue()));
    Object v6 = 2;
    Object v7 = 12;
    Object v8 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 2;
    Object v10 = 12;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = 12;
    Object v14 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v14).copy();
    Object v16 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v11).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v15));
    Object v17 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v8).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v16));
    Object v18 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v5).multiply(((org.apache.commons.math.linear.OpenMapRealMatrix)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = 2;
    Object v5 = 12;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = 12;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v9).copy();
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v6).add(((org.apache.commons.math.linear.OpenMapRealMatrix)v10));
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).add(((org.apache.commons.math.linear.RealMatrix)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 12;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v2).copy();
    Object v4 = 2;
    Object v5 = 12;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = 12;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).add(((org.apache.commons.math.linear.RealMatrix)v9));
    Object v11 = 2.0D;
    Object v12 = ((org.apache.commons.math.linear.AbstractRealMatrix)v6).scalarMultiply((((java.lang.Double)v11).doubleValue()));
    Object v13 = 2;
    Object v14 = 12;
    Object v15 = new org.apache.commons.math.linear.OpenMapRealMatrix((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1.0D;
    Object v17 = ((org.apache.commons.math.linear.AbstractRealMatrix)v15).scalarMultiply((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.linear.OpenMapRealMatrix)v12).subtract(((org.apache.commons.math.linear.OpenMapRealMatrix)v15));
    Object v19 = ((org.apache.commons.math.linear.AbstractRealMatrix)v3).add(((org.apache.commons.math.linear.RealMatrix)v18));
    Object v20 = new double[]{16.181862185075556D,0.0D};
    Object v21 = true;
    Object v22 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((org.apache.commons.math.linear.AbstractRealMatrix)v19).operate(((org.apache.commons.math.linear.RealVector)v22));
      org.junit.Assert.fail("Expected org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException expected) { }
  }
}
