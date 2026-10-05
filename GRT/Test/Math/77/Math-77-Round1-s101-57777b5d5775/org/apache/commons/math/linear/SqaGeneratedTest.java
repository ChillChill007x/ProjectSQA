package org.apache.commons.math.linear;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new double[]{0.0D,1.1470110955499822D};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{0.0D,0.6760660889684624D};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapAsinToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{Double.NEGATIVE_INFINITY,-1.6607778967810454D};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).hashCode();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapSubtractToSelf((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v4).subtract(((org.apache.commons.math.linear.RealVector)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapSinToSelf();
    Object v7 = 1.0D;
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapDivideToSelf((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapCeil();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapFloorToSelf();
    Object v11 = new double[]{};
    Object v12 = ((org.apache.commons.math.linear.RealVector)v10).append(((double[])v11));
    Object v13 = ((org.apache.commons.math.linear.ArrayRealVector)v4).getDistance(((org.apache.commons.math.linear.RealVector)v10));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapLog10ToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = new double[]{Double.NaN,Double.NaN};
    Object v6 = false;
    Object v7 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v7).mapLog1pToSelf();
    Object v9 = new double[]{10.399128709225772D,0.0D};
    Object v10 = ((org.apache.commons.math.linear.RealVector)v8).dotProduct(((double[])v9));
    ((org.apache.commons.math.linear.ArrayRealVector)v4).checkVectorDimensions(((org.apache.commons.math.linear.RealVector)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = new double[]{Double.NaN,Double.NaN};
    Object v5 = false;
    Object v6 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v6).mapLog1pToSelf();
    Object v8 = 1.0D;
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v7).mapSubtractToSelf((((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.RealVector)v3),((org.apache.commons.math.linear.ArrayRealVector)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapSinh();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapAsinToSelf();
    Object v11 = ((org.apache.commons.math.linear.RealVector)v10).mapInv();
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v4).getL1Distance(((org.apache.commons.math.linear.RealVector)v10));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapCbrtToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    ((org.apache.commons.math.linear.ArrayRealVector)v4).unitize();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapCbrtToSelf();
    Object v11 = new double[]{Double.NaN,Double.NaN};
    Object v12 = false;
    Object v13 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.math.linear.ArrayRealVector)v13).mapLog1pToSelf();
    Object v15 = ((org.apache.commons.math.linear.ArrayRealVector)v14).mapAsinToSelf();
    Object v16 = ((org.apache.commons.math.linear.RealVector)v10).getL1Distance(((org.apache.commons.math.linear.RealVector)v15));
    Object v17 = ((org.apache.commons.math.linear.ArrayRealVector)v5).getLInfDistance(((org.apache.commons.math.linear.RealVector)v10));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.lang.Double[]{-20.64170195363249D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCeilToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).hashCode();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapSubtractToSelf((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v4).subtract(((org.apache.commons.math.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math.linear.ArrayRealVector)v12).isInfinite();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.Double[]{-20.64170195363249D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.ArrayRealVector)v1).mapAtanToSelf();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapExpm1ToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.Double[]{-20.64170195363249D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = new double[]{1.0D};
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v1).ebeMultiply(((double[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapExpm1();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v4).isNaN();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = 26.60254252260673D;
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapMultiply((((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSubtractToSelf((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.RealVector)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCeilToSelf();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapFloorToSelf();
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v10).hashCode();
    Object v12 = new double[]{Double.NaN,Double.NaN};
    Object v13 = false;
    Object v14 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.apache.commons.math.linear.ArrayRealVector)v14).mapLog1pToSelf();
    Object v16 = 1.0D;
    Object v17 = ((org.apache.commons.math.linear.ArrayRealVector)v15).mapSubtractToSelf((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math.linear.ArrayRealVector)v10).subtract(((org.apache.commons.math.linear.RealVector)v17));
    Object v19 = ((org.apache.commons.math.linear.ArrayRealVector)v5).getL1Distance(((org.apache.commons.math.linear.RealVector)v18));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapExpm1ToSelf();
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapCeilToSelf();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).getLInfNorm();
    Object v6 = new double[]{};
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v4).getDistance(((double[])v6));
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).hashCode();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapSubtractToSelf((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v4).subtract(((org.apache.commons.math.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math.linear.RealVector)v12).mapAcosToSelf();
    Object v14 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.RealVector)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapCbrtToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapInvToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapCbrtToSelf();
    Object v5 = 10;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapRintToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapLog1pToSelf();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapSinhToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapExpm1ToSelf();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapSubtract((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapAsinToSelf();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapSignumToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new double[]{-27.519753771734884D,0.0D};
    Object v5 = 2;
    Object v6 = 0;
    Object v7 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v7).mapTanhToSelf();
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).getLInfNorm();
    Object v10 = new double[]{};
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v8).getDistance(((double[])v10));
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v3).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapExpm1ToSelf();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).getNorm();
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapCoshToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapCbrtToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapInvToSelf();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).isInfinite();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapCoshToSelf();
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapSignum();
    Object v5 = -1.5621412053220771D;
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new java.lang.Double[]{39.559015271519016D,-67.02644500339669D,0.0D};
    Object v1 = -30;
    Object v2 = -56;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = new double[]{-27.519753771734884D,0.0D};
    Object v4 = 2;
    Object v5 = 0;
    Object v6 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v6).isNaN();
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v2).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapCoshToSelf();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapSinToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapSinhToSelf();
    Object v7 = new double[]{25.957276364025557D,3.064006071880099D};
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v6).ebeDivide(((double[])v7));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v6).mapExpToSelf();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = 1.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSubtractToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapSignumToSelf();
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v6).getNorm();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCeilToSelf();
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapAcos();
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v5).getLInfNorm();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapLog();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSinhToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v6).intValue()),(((java.lang.Double)v7).doubleValue()));
    ((org.apache.commons.math.linear.ArrayRealVector)v5).checkVectorDimensions(((org.apache.commons.math.linear.RealVector)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapLog();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCbrtToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new double[]{-27.519753771734884D,0.0D};
    Object v5 = 2;
    Object v6 = 0;
    Object v7 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.math.linear.AbstractRealVector)v7).mapLog();
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapCbrtToSelf();
    Object v10 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.ArrayRealVector)v3),((org.apache.commons.math.linear.RealVector)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new java.lang.Double[]{-20.64170195363249D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.ArrayRealVector)v1).mapAtanToSelf();
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog10ToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapAcosToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new double[]{0.0D};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapLogToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).hashCode();
    Object v6 = new double[]{Double.NaN,Double.NaN};
    Object v7 = false;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapLog1pToSelf();
    Object v10 = 1.0D;
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapSubtractToSelf((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v4).subtract(((org.apache.commons.math.linear.RealVector)v11));
    Object v13 = 0;
    Object v14 = 1.0D;
    Object v15 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v13).intValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.apache.commons.math.linear.ArrayRealVector)v15).mapSinToSelf();
    Object v17 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.RealVector)v12),((org.apache.commons.math.linear.ArrayRealVector)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.RealVector)v4));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapCbrt();
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapCosToSelf();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapLog();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapAbsToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = 10;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCosToSelf();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSubtractToSelf((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = 10;
    Object v6 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v6));
    Object v8 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v9 = 2;
    Object v10 = 0;
    Object v11 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v7).dotProduct(((org.apache.commons.math.linear.ArrayRealVector)v11));
    org.junit.Assert.assertEquals((Object)(0.0D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapSinToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapUlpToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapSinToSelf();
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapAddToSelf((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapSignum();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapExpm1ToSelf();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapSubtract((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapAsinToSelf();
    Object v9 = ((org.apache.commons.math.linear.AbstractRealVector)v8).mapCeil();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapRintToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapExpm1ToSelf();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapTanhToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapSinToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapCosToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSignumToSelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCosToSelf();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSubtractToSelf((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v7).mapCbrtToSelf();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.lang.Double[]{-20.64170195363249D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.ArrayRealVector)v1).mapAtanToSelf();
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapAcosToSelf();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.Double[]{0.0D,1.0D};
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapRintToSelf();
    Object v6 = -30.38459005626355D;
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapMultiplyToSelf((((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.Double[]{-20.64170195363249D};
    Object v1 = new org.apache.commons.math.linear.ArrayRealVector(((java.lang.Double[])v0));
    Object v2 = ((org.apache.commons.math.linear.ArrayRealVector)v1).mapAtanToSelf();
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapAcosToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapRintToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapRintToSelf();
    Object v6 = 0;
    Object v7 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v8 = 2;
    Object v9 = 0;
    Object v10 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v10).mapSinToSelf();
    ((org.apache.commons.math.linear.ArrayRealVector)v5).setSubVector((((java.lang.Integer)v6).intValue()),((org.apache.commons.math.linear.RealVector)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.ArrayRealVector)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSignumToSelf();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapTanhToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapAbs();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSignumToSelf();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapInvToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).getData();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapCosToSelf();
    Object v6 = 0.0D;
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSubtractToSelf((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v7).mapCoshToSelf();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -7.958163500142637D;
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v3).mapSubtract((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.AbstractRealVector)v4).mapSignum();
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).getL1Norm();
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D,-23.549634361125715D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapSinToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapRintToSelf();
    Object v6 = -30.38459005626355D;
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapMultiplyToSelf((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.AbstractRealVector)v7).mapAsin();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapCoshToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapRintToSelf();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapSignumToSelf();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = 0;
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v6).intValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math.linear.ArrayRealVector)v8).mapSinToSelf();
    Object v10 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapUlpToSelf();
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v9).mapTanToSelf();
    Object v12 = ((org.apache.commons.math.linear.ArrayRealVector)v5).projection(((org.apache.commons.math.linear.RealVector)v11));
    Object v13 = ((org.apache.commons.math.linear.ArrayRealVector)v5).mapUlpToSelf();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0.0D;
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapPowToSelf((((java.lang.Double)v4).doubleValue()));
    Object v6 = new double[]{-6.087249588069038D,17.372447468608357D};
    Object v7 = ((org.apache.commons.math.linear.ArrayRealVector)v5).append(((double[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{Double.NaN,Double.NaN};
    Object v1 = false;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapLog1pToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapFloorToSelf();
    Object v5 = new org.apache.commons.math.linear.ArrayRealVector(((org.apache.commons.math.linear.RealVector)v4));
    Object v6 = 10;
    Object v7 = org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial((((java.lang.Integer)v6).intValue()));
    Object v8 = 6.032940198518672D;
    Object v9 = ((org.apache.commons.math.analysis.UnivariateRealFunction)v7).value((((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapToSelf(((org.apache.commons.math.analysis.UnivariateRealFunction)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0;
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v0).intValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math.linear.ArrayRealVector)v2).mapSinToSelf();
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapExpToSelf();
    Object v5 = 0;
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math.linear.ArrayRealVector((((java.lang.Integer)v5).intValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math.linear.ArrayRealVector)v7).mapSinToSelf();
    Object v9 = 0.0D;
    Object v10 = ((org.apache.commons.math.linear.RealVector)v8).mapPow((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math.linear.ArrayRealVector)v3).dotProduct(((org.apache.commons.math.linear.RealVector)v8));
    org.junit.Assert.assertEquals((Object)(0.0D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{-27.519753771734884D,0.0D};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new org.apache.commons.math.linear.ArrayRealVector(((double[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.math.linear.ArrayRealVector)v3).mapTanhToSelf();
    Object v5 = ((org.apache.commons.math.linear.ArrayRealVector)v4).mapSignumToSelf();
    Object v6 = ((org.apache.commons.math.linear.AbstractRealVector)v5).mapCos();
    org.junit.Assert.assertNotNull(v6);
  }
}
