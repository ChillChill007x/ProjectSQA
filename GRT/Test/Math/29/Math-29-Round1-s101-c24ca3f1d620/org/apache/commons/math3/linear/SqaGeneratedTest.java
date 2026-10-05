package org.apache.commons.math3.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.RealVector)v1).getL1Norm();
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.RealVector)v1).getMaxIndex();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = new double[]{1.0D};
    Object v11 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = 29.678596228562725D;
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v11).mapMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = new double[]{1.0D};
    Object v16 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v15));
    Object v17 = 29.678596228562725D;
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v16).mapMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v14).append(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = ((org.apache.commons.math3.linear.OpenMapRealVector)v9).dotProduct(((org.apache.commons.math3.linear.RealVector)v19));
    org.junit.Assert.assertEquals((Object)(1761.6381481961153D), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = new double[]{1.0D};
    Object v11 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = 29.678596228562725D;
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v11).mapMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = new double[]{1.0D};
    Object v16 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v15));
    Object v17 = 29.678596228562725D;
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v16).mapMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v14).append(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = 0;
    Object v21 = new double[]{1.0D};
    Object v22 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v21));
    Object v23 = 29.678596228562725D;
    Object v24 = ((org.apache.commons.math3.linear.RealVector)v22).mapMultiply((((java.lang.Double)v23).doubleValue()));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v19).setSubVector((((java.lang.Integer)v20).intValue()),((org.apache.commons.math3.linear.RealVector)v24));
    Object v25 = null;
    Object v26 = ((org.apache.commons.math3.linear.OpenMapRealVector)v9).add(((org.apache.commons.math3.linear.OpenMapRealVector)v19));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v2).getMinIndex();
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = -5.568977394203685D;
    Object v3 = 0.0D;
    Object v4 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v7));
    Object v9 = ((org.apache.commons.math3.linear.RealVector)v6).ebeDivide(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = ((org.apache.commons.math3.linear.RealVector)v1).combineToSelf((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.linear.RealVector)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v2).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(35.12059176396606D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = -5.568977394203685D;
    Object v6 = 0.0D;
    Object v7 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v11 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10));
    Object v12 = ((org.apache.commons.math3.linear.RealVector)v9).ebeDivide(((org.apache.commons.math3.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v4).combineToSelf((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.linear.RealVector)v9));
    Object v14 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).ebeDivide(((org.apache.commons.math3.linear.RealVector)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).projection(((org.apache.commons.math3.linear.RealVector)v4));
    Object v6 = -15;
    Object v7 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v7));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v2).setSubVector((((java.lang.Integer)v6).intValue()),((org.apache.commons.math3.linear.RealVector)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).getL1Distance(((org.apache.commons.math3.linear.OpenMapRealVector)v3));
    Object v5 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v6 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v5));
    Object v7 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).dotProduct(((org.apache.commons.math3.linear.OpenMapRealVector)v6));
    org.junit.Assert.assertEquals((Object)(700.4390660700382D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1;
    Object v4 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v4));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v2).setSubVector((((java.lang.Integer)v3).intValue()),((org.apache.commons.math3.linear.RealVector)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = 0;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).getEntry((((java.lang.Integer)v2).intValue()));
    Object v4 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v4));
    Object v6 = -5.568977394203685D;
    Object v7 = 0.0D;
    Object v8 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v12 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v11));
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v10).ebeDivide(((org.apache.commons.math3.linear.RealVector)v12));
    Object v14 = ((org.apache.commons.math3.linear.RealVector)v5).combineToSelf((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.linear.RealVector)v10));
    Object v15 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).getDistance(((org.apache.commons.math3.linear.RealVector)v14));
    org.junit.Assert.assertEquals((Object)(173.85330352802802D), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).isInfinite();
    Object v4 = -30.748102585568525D;
    ((org.apache.commons.math3.linear.OpenMapRealVector)v2).set((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v2).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = new double[]{1.0D};
    Object v11 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = 29.678596228562725D;
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v11).mapMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = new double[]{1.0D};
    Object v16 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v15));
    Object v17 = 29.678596228562725D;
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v16).mapMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v14).append(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = 0;
    Object v21 = new double[]{1.0D};
    Object v22 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v21));
    Object v23 = 29.678596228562725D;
    Object v24 = ((org.apache.commons.math3.linear.RealVector)v22).mapMultiply((((java.lang.Double)v23).doubleValue()));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v19).setSubVector((((java.lang.Integer)v20).intValue()),((org.apache.commons.math3.linear.RealVector)v24));
    Object v25 = null;
    Object v26 = ((org.apache.commons.math3.linear.OpenMapRealVector)v9).add(((org.apache.commons.math3.linear.OpenMapRealVector)v19));
    Object v27 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v28 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v27));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v28).unitize();
    Object v29 = null;
    Object v30 = ((org.apache.commons.math3.linear.OpenMapRealVector)v26).subtract(((org.apache.commons.math3.linear.OpenMapRealVector)v28));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new double[]{72.955982950573D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.RealVector)v1).getMinIndex();
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.RealVector)v1).getMaxValue();
    org.junit.Assert.assertEquals((Object)(26.42799776884428D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = -5.568977394203685D;
    Object v6 = 0.0D;
    Object v7 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v11 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10));
    Object v12 = ((org.apache.commons.math3.linear.RealVector)v9).ebeDivide(((org.apache.commons.math3.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v4).combineToSelf((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.linear.RealVector)v9));
    Object v14 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).getDistance(((org.apache.commons.math3.linear.RealVector)v13));
    org.junit.Assert.assertEquals((Object)(186.58906274470547D), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new double[]{72.955982950573D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 100;
    Object v4 = -25;
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).getSubVector((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.RealVector)v1).getNorm();
    org.junit.Assert.assertEquals((Object)(26.465809378706673D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).isInfinite();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = -44.43448332097926D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapSubtract((((java.lang.Double)v2).doubleValue()));
    Object v4 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v4));
    Object v6 = -5.568977394203685D;
    Object v7 = 0.0D;
    Object v8 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v12 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v11));
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v10).ebeDivide(((org.apache.commons.math3.linear.RealVector)v12));
    Object v14 = ((org.apache.commons.math3.linear.RealVector)v5).combineToSelf((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.linear.RealVector)v10));
    Object v15 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).ebeDivide(((org.apache.commons.math3.linear.RealVector)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = -5.568977394203685D;
    Object v6 = 0.0D;
    Object v7 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v11 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10));
    Object v12 = ((org.apache.commons.math3.linear.RealVector)v9).ebeDivide(((org.apache.commons.math3.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v4).combineToSelf((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.linear.RealVector)v9));
    Object v14 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).ebeDivide(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = 0;
    Object v16 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.math3.linear.RealVector)v14).map(((org.apache.commons.math3.analysis.UnivariateFunction)v16));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v14).unitize();
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new double[]{72.955982950573D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.lang.Double[]{0.0D,1.0D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).ebeMultiply(((org.apache.commons.math3.linear.RealVector)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v2).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v4));
    Object v6 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 0;
    Object v10 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math3.linear.RealVector)v8).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v10));
    Object v12 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).getLInfDistance(((org.apache.commons.math3.linear.RealVector)v11));
    org.junit.Assert.assertEquals((Object)(0.0D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v2).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v4));
    Object v6 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6));
    Object v8 = -44.43448332097926D;
    Object v9 = ((org.apache.commons.math3.linear.RealVector)v7).mapSubtract((((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v11 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10));
    Object v12 = -5.568977394203685D;
    Object v13 = 0.0D;
    Object v14 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v15 = 0.0D;
    Object v16 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v18 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v17));
    Object v19 = ((org.apache.commons.math3.linear.RealVector)v16).ebeDivide(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = ((org.apache.commons.math3.linear.RealVector)v11).combineToSelf((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),((org.apache.commons.math3.linear.RealVector)v16));
    Object v21 = ((org.apache.commons.math3.linear.OpenMapRealVector)v7).ebeDivide(((org.apache.commons.math3.linear.RealVector)v20));
    Object v22 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).dotProduct(((org.apache.commons.math3.linear.RealVector)v21));
    org.junit.Assert.assertEquals((Object)(-0.5386985415172392D), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = -13.623772550923633D;
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = new double[]{1.0D};
    Object v11 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = 29.678596228562725D;
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v11).mapMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.apache.commons.math3.linear.OpenMapRealVector)v9).append(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = new double[]{1.0D};
    Object v16 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v15));
    Object v17 = 29.678596228562725D;
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v16).mapMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = new double[]{1.0D};
    Object v21 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v20));
    Object v22 = 29.678596228562725D;
    Object v23 = ((org.apache.commons.math3.linear.RealVector)v21).mapMultiply((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((org.apache.commons.math3.linear.OpenMapRealVector)v19).append(((org.apache.commons.math3.linear.RealVector)v23));
    Object v25 = 0;
    Object v26 = new double[]{1.0D};
    Object v27 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v26));
    Object v28 = 29.678596228562725D;
    Object v29 = ((org.apache.commons.math3.linear.RealVector)v27).mapMultiply((((java.lang.Double)v28).doubleValue()));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v24).setSubVector((((java.lang.Integer)v25).intValue()),((org.apache.commons.math3.linear.RealVector)v29));
    Object v30 = null;
    Object v31 = ((org.apache.commons.math3.linear.OpenMapRealVector)v14).add(((org.apache.commons.math3.linear.OpenMapRealVector)v24));
    Object v32 = ((org.apache.commons.math3.linear.RealVector)v2).combineToSelf((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),((org.apache.commons.math3.linear.RealVector)v31));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -61.94390311632415D;
    Object v4 = ((org.apache.commons.math3.linear.RealVector)v2).mapMultiplyToSelf((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).isDefaultValue((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v1).unitize();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).append(((org.apache.commons.math3.linear.RealVector)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = 21.97078667739862D;
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v3).mapMultiply((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.linear.RealVector)v3).getNorm();
    org.junit.Assert.assertEquals((Object)(29.678596228562725D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = new double[]{1.0D};
    Object v11 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = 29.678596228562725D;
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v11).mapMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = new double[]{1.0D};
    Object v16 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v15));
    Object v17 = 29.678596228562725D;
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v16).mapMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v14).append(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = 0;
    Object v21 = new double[]{1.0D};
    Object v22 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v21));
    Object v23 = 29.678596228562725D;
    Object v24 = ((org.apache.commons.math3.linear.RealVector)v22).mapMultiply((((java.lang.Double)v23).doubleValue()));
    ((org.apache.commons.math3.linear.OpenMapRealVector)v19).setSubVector((((java.lang.Integer)v20).intValue()),((org.apache.commons.math3.linear.RealVector)v24));
    Object v25 = null;
    Object v26 = ((org.apache.commons.math3.linear.OpenMapRealVector)v9).add(((org.apache.commons.math3.linear.OpenMapRealVector)v19));
    Object v27 = 11.754798909885519D;
    Object v28 = ((org.apache.commons.math3.linear.OpenMapRealVector)v26).isDefaultValue((((java.lang.Double)v27).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{72.955982950573D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v2).getNorm();
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).toArray();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v2));
    Object v4 = -44.43448332097926D;
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v3).mapSubtract((((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6));
    Object v8 = -5.568977394203685D;
    Object v9 = 0.0D;
    Object v10 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v13));
    Object v15 = ((org.apache.commons.math3.linear.RealVector)v12).ebeDivide(((org.apache.commons.math3.linear.RealVector)v14));
    Object v16 = ((org.apache.commons.math3.linear.RealVector)v7).combineToSelf((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),((org.apache.commons.math3.linear.RealVector)v12));
    Object v17 = ((org.apache.commons.math3.linear.OpenMapRealVector)v3).ebeDivide(((org.apache.commons.math3.linear.RealVector)v16));
    Object v18 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).add(((org.apache.commons.math3.linear.RealVector)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).toArray();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v5).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v7));
    Object v9 = ((org.apache.commons.math3.linear.RealVector)v2).outerProduct(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = 1;
    Object v11 = -40.630291659652016D;
    ((org.apache.commons.math3.linear.OpenMapRealVector)v2).setEntry((((java.lang.Integer)v10).intValue()),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = new double[]{1.0D};
    Object v3 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append(((org.apache.commons.math3.linear.RealVector)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v2));
    Object v4 = -44.43448332097926D;
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v3).mapSubtract((((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6));
    Object v8 = -5.568977394203685D;
    Object v9 = 0.0D;
    Object v10 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v13));
    Object v15 = ((org.apache.commons.math3.linear.RealVector)v12).ebeDivide(((org.apache.commons.math3.linear.RealVector)v14));
    Object v16 = ((org.apache.commons.math3.linear.RealVector)v7).combineToSelf((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),((org.apache.commons.math3.linear.RealVector)v12));
    Object v17 = ((org.apache.commons.math3.linear.OpenMapRealVector)v3).ebeDivide(((org.apache.commons.math3.linear.RealVector)v16));
    Object v18 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).add(((org.apache.commons.math3.linear.RealVector)v17));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v18).hashCode();
    org.junit.Assert.assertEquals((Object)(1520856625), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).getDistance(((org.apache.commons.math3.linear.RealVector)v5));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = -4.556913105000419D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapAddToSelf((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = 49.46685238054669D;
    Object v6 = new java.lang.Double[]{0.0D,1.0D};
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.RealVector)v8).getDimension();
    Object v10 = ((org.apache.commons.math3.linear.RealVector)v1).combine((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),((org.apache.commons.math3.linear.RealVector)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 1.0D;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).mapAddToSelf((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = 92;
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).getSubVector((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math3.linear.OpenMapRealVector)v9).add(((org.apache.commons.math3.linear.RealVector)v12));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.lang.Double[]{0.0D,1.0D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6));
    Object v8 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).append(((org.apache.commons.math3.linear.RealVector)v7));
    Object v9 = 1.7885778871631932D;
    Object v10 = ((org.apache.commons.math3.linear.RealVector)v8).mapDivide((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).subtract(((org.apache.commons.math3.linear.RealVector)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{72.955982950573D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v2).getMaxValue();
    org.junit.Assert.assertEquals((Object)(72.955982950573D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).toArray();
    Object v3 = 2.232298011980333D;
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = -27;
    Object v3 = 34.228256068746916D;
    ((org.apache.commons.math3.linear.OpenMapRealVector)v1).setEntry((((java.lang.Integer)v2).intValue()),(((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D};
    Object v4 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v3));
    Object v5 = 29.678596228562725D;
    Object v6 = ((org.apache.commons.math3.linear.RealVector)v4).mapMultiply((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 15.253896366613686D;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = new double[]{1.0D};
    Object v3 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v7).mapAdd((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).getL1Distance(((org.apache.commons.math3.linear.OpenMapRealVector)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v1 = new double[]{1.0D};
    Object v2 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v1));
    Object v3 = 29.678596228562725D;
    Object v4 = ((org.apache.commons.math3.linear.RealVector)v2).mapMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v4));
    Object v6 = new double[]{1.0D};
    Object v7 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v6));
    Object v8 = 29.678596228562725D;
    Object v9 = ((org.apache.commons.math3.linear.RealVector)v7).mapMultiply((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).append(((org.apache.commons.math3.linear.RealVector)v9));
    Object v11 = ((org.apache.commons.math3.linear.OpenMapRealVector)v0).ebeMultiply(((org.apache.commons.math3.linear.RealVector)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 23;
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v3).intValue()));
    Object v5 = 15.253896366613686D;
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).append(((org.apache.commons.math3.linear.OpenMapRealVector)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Double[]{0.0D,1.0D};
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v6 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v5));
    Object v7 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v6));
    Object v8 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).getDistance(((org.apache.commons.math3.linear.OpenMapRealVector)v7));
    org.junit.Assert.assertEquals((Object)(26.48469494009773D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v2).getNorm();
    org.junit.Assert.assertEquals((Object)(48.76222622316804D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v1 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v1));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v0).getL1Distance(((org.apache.commons.math3.linear.OpenMapRealVector)v2));
    org.junit.Assert.assertEquals((Object)(28.42799776884428D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v2).map(((org.apache.commons.math3.analysis.UnivariateFunction)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 22.87824645264836D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapDivide((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).mapAddToSelf((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v6 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v5));
    Object v7 = -44.43448332097926D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapSubtract((((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v10 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v9));
    Object v11 = -5.568977394203685D;
    Object v12 = 0.0D;
    Object v13 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v14 = 0.0D;
    Object v15 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v17 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v16));
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v15).ebeDivide(((org.apache.commons.math3.linear.RealVector)v17));
    Object v19 = ((org.apache.commons.math3.linear.RealVector)v10).combineToSelf((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),((org.apache.commons.math3.linear.RealVector)v15));
    Object v20 = ((org.apache.commons.math3.linear.OpenMapRealVector)v6).ebeDivide(((org.apache.commons.math3.linear.RealVector)v19));
    Object v21 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).add(((org.apache.commons.math3.linear.RealVector)v20));
    Object v22 = 39.29942442672663D;
    Object v23 = ((org.apache.commons.math3.linear.RealVector)v21).mapAddToSelf((((java.lang.Double)v22).doubleValue()));
    Object v24 = ((org.apache.commons.math3.linear.RealVector)v2).outerProduct(((org.apache.commons.math3.linear.RealVector)v21));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.74886831199306D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.74886831199306D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{72.955982950573D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).append(((org.apache.commons.math3.linear.RealVector)v8));
    Object v10 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).add(((org.apache.commons.math3.linear.OpenMapRealVector)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.74886831199306D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(1801866231), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6));
    Object v8 = -5.568977394203685D;
    Object v9 = 0.0D;
    Object v10 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v13));
    Object v15 = ((org.apache.commons.math3.linear.RealVector)v12).ebeDivide(((org.apache.commons.math3.linear.RealVector)v14));
    Object v16 = ((org.apache.commons.math3.linear.RealVector)v7).combineToSelf((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),((org.apache.commons.math3.linear.RealVector)v12));
    Object v17 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).ebeDivide(((org.apache.commons.math3.linear.RealVector)v16));
    Object v18 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).getDistance(((org.apache.commons.math3.linear.OpenMapRealVector)v17));
    org.junit.Assert.assertEquals((Object)(53.31439469963963D), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = new double[]{1.0D};
    Object v3 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = -36.284263111910455D;
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).isDefaultValue((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v1 = -33.44636977831684D;
    Object v2 = ((org.apache.commons.math3.linear.OpenMapRealVector)v0).mapAdd((((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).append(((org.apache.commons.math3.linear.RealVector)v4));
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).mapAddToSelf((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v2).iterator();
    Object v4 = -3;
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).getEntry((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).toArray();
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 15.253896366613686D;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(195333416), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{-3.74886831199306D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v5).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v7));
    Object v9 = 0;
    Object v10 = new double[]{1.0D};
    Object v11 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v10));
    Object v12 = 29.678596228562725D;
    Object v13 = ((org.apache.commons.math3.linear.RealVector)v11).mapMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v13));
    Object v15 = new double[]{1.0D};
    Object v16 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v15));
    Object v17 = 29.678596228562725D;
    Object v18 = ((org.apache.commons.math3.linear.RealVector)v16).mapMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v14).append(((org.apache.commons.math3.linear.RealVector)v18));
    ((org.apache.commons.math3.linear.RealVector)v8).setSubVector((((java.lang.Integer)v9).intValue()),((org.apache.commons.math3.linear.RealVector)v19));
    Object v20 = null;
    Object v21 = ((org.apache.commons.math3.linear.RealVector)v2).cosine(((org.apache.commons.math3.linear.RealVector)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).isInfinite();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{-22.715992013550263D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new java.lang.Double[]{-3.74886831199306D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 23;
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v3).intValue()));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).append(((org.apache.commons.math3.linear.RealVector)v6));
    Object v8 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).getL1Distance(((org.apache.commons.math3.linear.OpenMapRealVector)v7));
    org.junit.Assert.assertEquals((Object)(4.748868311993061D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v2 = -33.44636977831684D;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).mapAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v0).ebeDivide(((org.apache.commons.math3.linear.RealVector)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).append(((org.apache.commons.math3.linear.RealVector)v4));
    Object v6 = new java.lang.Double[]{0.0D,1.0D};
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).append(((org.apache.commons.math3.linear.OpenMapRealVector)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 23;
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).dotProduct(((org.apache.commons.math3.linear.RealVector)v4));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,26.12016036330641D,-9.961132949603941D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.lang.Double[]{0.0D,1.0D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v7 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v6));
    Object v8 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).append(((org.apache.commons.math3.linear.RealVector)v7));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).dotProduct(((org.apache.commons.math3.linear.OpenMapRealVector)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{-22.715992013550263D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = new double[]{-22.715992013550263D};
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).add(((org.apache.commons.math3.linear.RealVector)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 22.87824645264836D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapDivide((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).mapAddToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v7 = -33.44636977831684D;
    Object v8 = ((org.apache.commons.math3.linear.OpenMapRealVector)v6).mapAdd((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.RealVector)v8).isInfinite();
    Object v10 = ((org.apache.commons.math3.linear.OpenMapRealVector)v5).add(((org.apache.commons.math3.linear.RealVector)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{-22.715992013550263D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = new double[]{-22.715992013550263D};
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v2));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).add(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = 1.0D;
    Object v6 = ((org.apache.commons.math3.linear.RealVector)v4).mapDivide((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).toArray();
    Object v3 = 2.232298011980333D;
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{1.0D};
    Object v6 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v5));
    Object v7 = 29.678596228562725D;
    Object v8 = ((org.apache.commons.math3.linear.RealVector)v6).mapMultiply((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).subtract(((org.apache.commons.math3.linear.RealVector)v8));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new double[]{-22.715992013550263D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-1747942891), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(((double[])v0));
    Object v2 = 29.678596228562725D;
    Object v3 = ((org.apache.commons.math3.linear.RealVector)v1).mapMultiply((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).copy();
    ((org.apache.commons.math3.linear.OpenMapRealVector)v4).unitize();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v1 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v1));
    Object v3 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v4 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v3));
    Object v5 = -44.43448332097926D;
    Object v6 = ((org.apache.commons.math3.linear.RealVector)v4).mapSubtract((((java.lang.Double)v5).doubleValue()));
    Object v7 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v8 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v7));
    Object v9 = -5.568977394203685D;
    Object v10 = 0.0D;
    Object v11 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v12 = 0.0D;
    Object v13 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v11),(((java.lang.Double)v12).doubleValue()));
    Object v14 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v15 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v14));
    Object v16 = ((org.apache.commons.math3.linear.RealVector)v13).ebeDivide(((org.apache.commons.math3.linear.RealVector)v15));
    Object v17 = ((org.apache.commons.math3.linear.RealVector)v8).combineToSelf((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),((org.apache.commons.math3.linear.RealVector)v13));
    Object v18 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).ebeDivide(((org.apache.commons.math3.linear.RealVector)v17));
    Object v19 = ((org.apache.commons.math3.linear.OpenMapRealVector)v2).add(((org.apache.commons.math3.linear.RealVector)v18));
    Object v20 = ((org.apache.commons.math3.linear.OpenMapRealVector)v0).ebeMultiply(((org.apache.commons.math3.linear.RealVector)v19));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new double[]{33.82748498467269D,35.12059176396606D,0.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v4 = -33.44636977831684D;
    Object v5 = ((org.apache.commons.math3.linear.OpenMapRealVector)v3).mapAdd((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.linear.RealVector)v2).outerProduct(((org.apache.commons.math3.linear.RealVector)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v2 = -33.44636977831684D;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).mapAdd((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.linear.OpenMapRealVector)v0).ebeDivide(((org.apache.commons.math3.linear.RealVector)v3));
    Object v5 = new org.apache.commons.math3.linear.OpenMapRealVector();
    Object v6 = ((org.apache.commons.math3.linear.OpenMapRealVector)v4).getDistance(((org.apache.commons.math3.linear.OpenMapRealVector)v5));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 23;
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()));
    Object v2 = 15.253896366613686D;
    Object v3 = ((org.apache.commons.math3.linear.OpenMapRealVector)v1).append((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.linear.RealVector)v3).unitVector();
    Object v5 = ((org.apache.commons.math3.linear.RealVector)v3).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(15.253896366613686D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{1.0D,26.42799776884428D,1.0D};
    Object v1 = new org.apache.commons.math3.linear.OpenMapRealVector(((double[])v0));
    Object v2 = 0;
    Object v3 = org.apache.commons.math3.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math3.linear.RealVector)v1).mapToSelf(((org.apache.commons.math3.analysis.UnivariateFunction)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
