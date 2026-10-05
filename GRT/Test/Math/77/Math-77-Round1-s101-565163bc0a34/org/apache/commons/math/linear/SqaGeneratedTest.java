package org.apache.commons.math.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 24;
    Object v4 = 3;
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getSubVector((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).getSparcity();
    org.junit.Assert.assertEquals((Object)(1.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v4 = -6.875326932324382D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{-11.586569769898245D,1.0D};
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealVector)v5).append(((double[])v6));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -44;
    Object v4 = 49.43176325605783D;
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).setEntry((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 2.0D;
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(11.586569769898245D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v4 = -6.875326932324382D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{-11.586569769898245D,1.0D};
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealVector)v5).append(((double[])v6));
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v7).mapAddToSelf((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.linear.AbstractRealVector)v9).mapSqrt();
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((org.apache.commons.math.linear.OpenMapRealVector)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0;
    Object v4 = new double[]{0.0D,29.4961285836148D};
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).setSubVector((((java.lang.Integer)v3).intValue()),((double[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v8 = -6.875326932324382D;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{-11.586569769898245D,1.0D};
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v9).append(((double[])v10));
    Object v12 = ((org.apache.commons.math.linear.RealVector)v11).mapSignumToSelf();
    Object v13 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).getL1Distance(((org.apache.commons.math.linear.RealVector)v11));
    org.junit.Assert.assertEquals((Object)(11.982620933983407D), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 27;
    Object v6 = new double[]{-28.18265980379726D};
    ((org.apache.commons.math.linear.OpenMapRealVector)v4).setSubVector((((java.lang.Integer)v5).intValue()),((double[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapDivideToSelf((((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).unitize();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = -0.7023496770502893D;
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).mapAddToSelf((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v6 = -6.875326932324382D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{-11.586569769898245D,1.0D};
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v7).append(((double[])v8));
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v9).mapAddToSelf((((java.lang.Double)v10).doubleValue()));
    Object v12 = -0.7023496770502893D;
    Object v13 = ((org.apache.commons.math.linear.OpenMapRealVector)v11).mapAddToSelf((((java.lang.Double)v12).doubleValue()));
    Object v14 = new double[]{0.0D,23.86634999203361D,0.0D};
    Object v15 = ((org.apache.commons.math.linear.OpenMapRealVector)v13).append(((double[])v14));
    Object v16 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).append(((org.apache.commons.math.linear.OpenMapRealVector)v13));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 14;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).getData();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapPow((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{2.0D,0.0D};
    Object v6 = 2.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).add(((org.apache.commons.math.linear.RealVector)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,-23.98252504856051D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).add(((double[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 23.38882380061899D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapMultiplyToSelf((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapRint();
    Object v4 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v5 = -6.875326932324382D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new double[]{-11.586569769898245D,1.0D};
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).append(((double[])v7));
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.linear.OpenMapRealVector)v8).mapAddToSelf((((java.lang.Double)v9).doubleValue()));
    Object v11 = -0.7023496770502893D;
    Object v12 = ((org.apache.commons.math.linear.OpenMapRealVector)v10).mapAddToSelf((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.linear.OpenMapRealVector)v12).hashCode();
    Object v14 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((org.apache.commons.math.linear.OpenMapRealVector)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = new double[]{2.0D,0.0D};
    Object v6 = 2.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).getDistance(((org.apache.commons.math.linear.OpenMapRealVector)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = new double[]{2.0D,0.0D};
    Object v6 = 2.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = ((org.apache.commons.math.linear.AbstractRealVector)v7).mapPow((((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{2.0D,0.0D};
    Object v11 = 2.0D;
    Object v12 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math.linear.OpenMapRealVector)v7).add(((org.apache.commons.math.linear.RealVector)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.math.linear.OpenMapRealVector)v13).getEntry((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).getL1Distance(((org.apache.commons.math.linear.OpenMapRealVector)v13));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).isInfinite();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).isInfinite();
    Object v4 = new double[]{2.0D,0.0D};
    Object v5 = 2.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getLInfDistance(((org.apache.commons.math.linear.RealVector)v6));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = -0.7023496770502893D;
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).mapAddToSelf((((java.lang.Double)v7).doubleValue()));
    Object v9 = 0;
    Object v10 = new double[]{-39.200370327547404D,-7.785625833760516D};
    ((org.apache.commons.math.linear.OpenMapRealVector)v8).setSubVector((((java.lang.Integer)v9).intValue()),((double[])v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v6 = -6.875326932324382D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new double[]{-11.586569769898245D,1.0D};
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v7).append(((double[])v8));
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v9).mapAddToSelf((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).add(((org.apache.commons.math.linear.OpenMapRealVector)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 23.38882380061899D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapMultiplyToSelf((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{2.0D,0.0D};
    Object v6 = 2.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).subtract(((org.apache.commons.math.linear.OpenMapRealVector)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = -0.7023496770502893D;
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).mapAddToSelf((((java.lang.Double)v7).doubleValue()));
    Object v9 = 14;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.linear.AbstractRealVector)v8).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapPow((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{2.0D,0.0D};
    Object v6 = 2.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).add(((org.apache.commons.math.linear.RealVector)v7));
    Object v9 = new double[]{2.0D,0.0D};
    Object v10 = 2.0D;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.OpenMapRealVector)v8).getL1Distance(((org.apache.commons.math.linear.OpenMapRealVector)v11));
    org.junit.Assert.assertEquals((Object)(2.0D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).getL1Norm();
    org.junit.Assert.assertEquals((Object)(2.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = -0.7023496770502893D;
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).mapAddToSelf((((java.lang.Double)v7).doubleValue()));
    Object v9 = new double[]{2.0D,0.0D};
    Object v10 = 2.0D;
    Object v11 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.OpenMapRealVector)v8).append(((org.apache.commons.math.linear.RealVector)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog();
    Object v4 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v5 = -6.875326932324382D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new double[]{-11.586569769898245D,1.0D};
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).append(((double[])v7));
    Object v9 = ((org.apache.commons.math.linear.AbstractRealVector)v3).outerProduct(((org.apache.commons.math.linear.RealVector)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog1p();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getData();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((org.apache.commons.math.linear.OpenMapRealVector)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).getNorm();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog10ToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).set((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-117441515), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).ebeMultiply(((org.apache.commons.math.linear.RealVector)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{3.416629408295607D,0.0D,0.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getL1Distance(((double[])v3));
    org.junit.Assert.assertEquals((Object)(5.4166294082956075D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).ebeMultiply(((org.apache.commons.math.linear.RealVector)v5));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v6).mapAcosToSelf();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapSinh();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,0.0D,0.0D};
    Object v1 = -10.70217652413953D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).unitVector();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).isInfinite();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,-17.194322721657784D,0.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).ebeMultiply(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).isDefaultValue((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).add(((org.apache.commons.math.linear.RealVector)v5));
    Object v7 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v8 = -6.875326932324382D;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new double[]{-11.586569769898245D,1.0D};
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v9).append(((double[])v10));
    Object v12 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getDistance(((org.apache.commons.math.linear.OpenMapRealVector)v11));
    org.junit.Assert.assertEquals((Object)(11.91594143211663D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).getNorm();
    Object v4 = 3.6720088505721797D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog1p();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).getNorm();
    org.junit.Assert.assertEquals((Object)(1.0986122886681096D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.lang.Double[]{27.990062009969442D,0.0D,0.0D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = -6.435085055386265D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{2.0D,0.0D};
    Object v4 = 2.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v5).getL1Norm();
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -51;
    Object v4 = new double[]{0.0D,1.0D,1.0D};
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).unitVector();
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).setSubVector((((java.lang.Integer)v3).intValue()),((org.apache.commons.math.linear.RealVector)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog();
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapMultiplyToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapAcos();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = 0.0D;
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).mapAddToSelf((((java.lang.Double)v5).doubleValue()));
    Object v7 = -0.7023496770502893D;
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).mapAddToSelf((((java.lang.Double)v7).doubleValue()));
    Object v9 = 14;
    Object v10 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.linear.AbstractRealVector)v8).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v10));
    Object v12 = ((org.apache.commons.math.linear.AbstractRealVector)v11).mapLog1pToSelf();
    Object v13 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v14 = 1.0D;
    Object v15 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.linear.RealVector)v15).mapCeil();
    Object v17 = ((org.apache.commons.math.linear.OpenMapRealVector)v11).append(((org.apache.commons.math.linear.RealVector)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).set((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
    Object v5 = new double[]{0.0D,1.0D,1.0D};
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.AbstractRealVector)v7).getLInfNorm();
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).dotProduct(((org.apache.commons.math.linear.OpenMapRealVector)v7));
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.lang.Double[]{27.990062009969442D,0.0D,0.0D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0));
    Object v2 = new double[]{0.0D,1.0D,1.0D};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{0.0D,1.0D,1.0D};
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).ebeMultiply(((org.apache.commons.math.linear.RealVector)v7));
    Object v9 = -10.684566733557189D;
    Object v10 = ((org.apache.commons.math.linear.AbstractRealVector)v8).mapSubtractToSelf((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v1).append(((org.apache.commons.math.linear.OpenMapRealVector)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 44;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getSubVector((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math.linear.MatrixIndexException");
    } catch (org.apache.commons.math.linear.MatrixIndexException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapCeilToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapCeil();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapCeilToSelf();
    Object v7 = ((org.apache.commons.math.linear.RealVector)v6).mapAcos();
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getDistance(((org.apache.commons.math.linear.RealVector)v6));
    org.junit.Assert.assertEquals((Object)(0.0D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((org.apache.commons.math.linear.OpenMapRealVector)v5));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v6).mapInvToSelf();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.Double[]{2.396051164085162D,1.0D,0.0D};
    Object v1 = -6.875326932324382D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-11.586569769898245D,1.0D};
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((double[])v3));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapLog10();
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v4).getNorm();
    org.junit.Assert.assertEquals((Object)(11.91594143211663D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{0.0D,1.0D,1.0D};
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v5).ebeMultiply(((org.apache.commons.math.linear.RealVector)v8));
    Object v10 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).dotProduct(((org.apache.commons.math.linear.OpenMapRealVector)v9));
    org.junit.Assert.assertEquals((Object)(12.598896925073714D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.Double[]{27.990062009969442D,0.0D,0.0D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.AbstractRealVector)v1).getNorm();
    Object v3 = 0;
    Object v4 = 0.0D;
    ((org.apache.commons.math.linear.OpenMapRealVector)v1).setEntry((((java.lang.Integer)v3).intValue()),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v3).getData();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v4 = 1.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).add(((org.apache.commons.math.linear.OpenMapRealVector)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.lang.Double[]{27.990062009969442D,0.0D,0.0D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0));
    Object v2 = new double[]{0.0D,1.0D,1.0D};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{0.0D,1.0D,1.0D};
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).ebeMultiply(((org.apache.commons.math.linear.RealVector)v7));
    Object v9 = -10.684566733557189D;
    Object v10 = ((org.apache.commons.math.linear.AbstractRealVector)v8).mapSubtractToSelf((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v1).append(((org.apache.commons.math.linear.OpenMapRealVector)v8));
    Object v12 = ((org.apache.commons.math.linear.AbstractRealVector)v11).copy();
    Object v13 = ((org.apache.commons.math.linear.AbstractRealVector)v11).getNorm();
    org.junit.Assert.assertEquals((Object)(34.214934416241015D), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog();
    Object v4 = new double[]{-4.967408563489135D,-21.052657375344573D};
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v3).outerProduct(((double[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D};
    Object v1 = 44.9909866901463D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapCeil();
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v3).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.OpenMapRealVector)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).getDimension();
    org.junit.Assert.assertEquals((Object)(3), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{10.185470010712498D,0.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{0.0D,31.926418212317383D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{10.185470010712498D,0.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).getL1Norm();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapInv();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapLog10();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{0.0D,1.0D,1.0D};
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append(((org.apache.commons.math.linear.OpenMapRealVector)v5));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v6).mapInvToSelf();
    Object v8 = ((org.apache.commons.math.linear.AbstractRealVector)v7).mapExp();
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(1269420679), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.Double[]{9.113836654465903D,1.0D,11.598896925073714D};
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(11.598896925073714D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).append((((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{0.0D,1.0D,1.0D};
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.RealVector)v7).mapAbsToSelf();
    Object v9 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).getDistance(((org.apache.commons.math.linear.RealVector)v7));
    org.junit.Assert.assertEquals((Object)(2.449489742783178D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 2;
    Object v1 = 0;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 13.507284191968774D;
    Object v5 = ((org.apache.commons.math.linear.OpenMapRealVector)v3).mapAddToSelf((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D};
    Object v1 = 44.9909866901463D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v2).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new double[]{10.185470010712498D,0.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new org.apache.commons.math.linear.OpenMapRealVector(((org.apache.commons.math.linear.RealVector)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.Double[]{27.990062009969442D,0.0D,0.0D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0));
    Object v2 = new double[]{0.0D,1.0D,1.0D};
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new double[]{0.0D,1.0D,1.0D};
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.OpenMapRealVector)v4).ebeMultiply(((org.apache.commons.math.linear.RealVector)v7));
    Object v9 = -10.684566733557189D;
    Object v10 = ((org.apache.commons.math.linear.AbstractRealVector)v8).mapSubtractToSelf((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v1).append(((org.apache.commons.math.linear.OpenMapRealVector)v8));
    Object v12 = ((org.apache.commons.math.linear.AbstractRealVector)v11).mapRintToSelf();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new double[]{10.185470010712498D,0.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 53.559049617662765D;
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapPow((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapExpm1ToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new double[]{0.0D,1.0D,1.0D};
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    ((org.apache.commons.math.linear.OpenMapRealVector)v2).unitize();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.lang.Double[]{27.990062009969442D,0.0D,0.0D};
    Object v1 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0));
    Object v2 = new double[]{};
    Object v3 = ((org.apache.commons.math.linear.OpenMapRealVector)v1).append(((double[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{2.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapLog();
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapMultiplyToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapAcos();
    Object v7 = new double[]{2.0D,0.0D};
    Object v8 = 2.0D;
    Object v9 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0.0D;
    Object v11 = ((org.apache.commons.math.linear.OpenMapRealVector)v9).append((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.OpenMapRealVector)v6).getDistance(((org.apache.commons.math.linear.OpenMapRealVector)v11));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new double[]{10.185470010712498D,0.0D,0.0D};
    Object v1 = 2.0D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 14;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v2).map(((org.apache.commons.math.analysis.UnivariateRealFunction)v4));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v2).getL1Norm();
    org.junit.Assert.assertEquals((Object)(10.185470010712498D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D};
    Object v1 = 44.9909866901463D;
    Object v2 = new org.apache.commons.math.linear.OpenMapRealVector(((java.lang.Double[])v0),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 14;
    Object v4 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v2).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v4));
    org.junit.Assert.assertNotNull(v5);
  }
}
