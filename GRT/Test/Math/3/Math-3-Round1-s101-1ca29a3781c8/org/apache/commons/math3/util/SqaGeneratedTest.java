package org.apache.commons.math3.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 11.757739335434012D;
    Object v2 = 16.933995723163434D;
    Object v3 = -19.751418469356224D;
    Object v4 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(28.87055138940885D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{-6.19220497251351D,0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance1(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.safeNorm(((double[])v0));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new double[]{0.0D,21.057001350853334D,0.0D};
    Object v1 = new double[]{1.0D,1.0D,0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new float[]{-64.17849F,-1.0734655F};
    Object v1 = new float[]{1.0F,1.0F,0.0F};
    Object v2 = org.apache.commons.math3.util.MathArrays.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new double[]{14.933704987793641D,0.0D,0.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.safeNorm(((double[])v0));
    org.junit.Assert.assertEquals((Object)(14.933704987793641D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{32.78268722840289D};
    Object v2 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new double[]{0.0D,2.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.scale((((java.lang.Double)v0).doubleValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,0.0D,0.0D};
    Object v1 = new double[]{0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance1(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new double[]{0.0D,7.410872512512459D};
    Object v1 = new double[]{0.0D,1.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new long[][]{null};
    org.apache.commons.math3.util.MathArrays.checkRectangular(((long[][])v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new double[]{-57.12832566766406D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeMultiply(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 42.84387528185432D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = -57.26655481260994D;
    Object v5 = 27.678586811820857D;
    Object v6 = 22.08442666421565D;
    Object v7 = 1.0D;
    Object v8 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1562.9728821305062D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null,null};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = true;
    Object v3 = org.apache.commons.math3.util.MathArrays.isMonotonic(((java.lang.Comparable[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new double[]{31.401564072077253D};
    Object v1 = new double[]{0.0D,-12.913013995983176D,Double.NEGATIVE_INFINITY};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeAdd(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new double[]{23.59837451457785D,2.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.scale((((java.lang.Double)v0).doubleValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeMultiply(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new float[]{41.67555F,0.0F,0.0F};
    Object v1 = new float[]{-21.851791F};
    Object v2 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new double[]{2.0D,-4.0367364484297195D};
    org.apache.commons.math3.util.MathArrays.checkPositive(((double[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new long[][]{null,null};
    org.apache.commons.math3.util.MathArrays.checkNonNegative(((long[][])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 12.415360966528525D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = 30.38943304481019D;
    Object v4 = 0.0D;
    Object v5 = 11.62259984439757D;
    Object v6 = 0.0D;
    Object v7 = -8.09420964612316D;
    Object v8 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(12.415360966528525D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.math3.complex.ComplexField.getInstance();
    Object v1 = 0;
    Object v2 = 8;
    Object v3 = org.apache.commons.math3.util.MathArrays.buildArray(((org.apache.commons.math3.Field)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{-26.09902161881137D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeSubtract(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new double[]{-3.732944593997179D,-29.09078019977397D,5.986485427952595D};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = new double[][]{null,null};
    org.apache.commons.math3.util.MathArrays.sortInPlace(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),((double[][])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 6.819778100333033D;
    Object v1 = new double[]{};
    org.apache.commons.math3.util.MathArrays.scaleInPlace((((java.lang.Double)v0).doubleValue()),((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new double[]{-10.116355866751888D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{-18.143087638776308D,0.0D,0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.linearCombination(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new double[]{-1.210851531260589D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeDivide(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new double[]{-54.89280441524242D,1.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = ((java.lang.Enum)v1).getDeclaringClass();
    Object v3 = true;
    Object v4 = false;
    Object v5 = org.apache.commons.math3.util.MathArrays.checkOrder(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new long[][]{null,null};
    org.apache.commons.math3.util.MathArrays.checkRectangular(((long[][])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -18.37452805420237D;
    Object v1 = -5.571355662206221D;
    Object v2 = -11.343561066243648D;
    Object v3 = 1.0D;
    Object v4 = -22.523692507176012D;
    Object v5 = 3.0D;
    Object v6 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(23.456392327375738D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new long[][]{null};
    org.apache.commons.math3.util.MathArrays.checkNonNegative(((long[][])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{38.608192781604146D,0.45351936529798775D};
    Object v1 = new double[]{0.0D,11.926591083914564D,1.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(40.27684104447654D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Comparable[]{null};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = true;
    Object v3 = org.apache.commons.math3.util.MathArrays.isMonotonic(((java.lang.Comparable[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.math3.complex.ComplexField.getInstance();
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.math3.util.MathArrays.buildArray(((org.apache.commons.math3.Field)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -32.70127676338317D;
    Object v1 = new double[]{-37776.372691152326D,-12159.737237046838D};
    org.apache.commons.math3.util.MathArrays.scaleInPlace((((java.lang.Double)v0).doubleValue()),((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 17.906193589048023D;
    Object v1 = new double[]{-4377.109419665832D,16266.419761780922D};
    org.apache.commons.math3.util.MathArrays.scaleInPlace((((java.lang.Double)v0).doubleValue()),((double[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new float[]{8.885565F,Float.NaN,34.918278F};
    Object v1 = new float[]{56.733658F,-10.639225F};
    Object v2 = org.apache.commons.math3.util.MathArrays.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{1.0D,10.55450833593373D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeSubtract(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new double[]{-9.59820470523509D,-38.245295413751045D,0.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = ((java.lang.Enum)v1).hashCode();
    Object v3 = new double[][]{null,null,null};
    org.apache.commons.math3.util.MathArrays.sortInPlace(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),((double[][])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,0.0D,-6.290613189711397D};
    Object v1 = new double[]{1.0D,-0.10107464852530017D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new int[]{11};
    Object v1 = new int[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new long[]{0L};
    org.apache.commons.math3.util.MathArrays.checkNonNegative(((long[])v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,0.0D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.convolve(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new double[]{3.6450590037428654D,0.0D};
    Object v1 = new double[]{2.737005327334784D,-25.45884476897713D};
    Object v2 = org.apache.commons.math3.util.MathArrays.convolve(((double[])v0),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{12,25};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -22.37159897597234D;
    Object v1 = -57.13292797256905D;
    Object v2 = -16.284322702080264D;
    Object v3 = 29.209619643094303D;
    Object v4 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(802.4960806522571D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 12.817968430576895D;
    Object v1 = -11.955064052960338D;
    Object v2 = 0.0D;
    Object v3 = 7.279256248775402D;
    Object v4 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-153.2396336163703D), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,1.0D,-9.547158355416538D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new int[]{-12,0,19};
    Object v1 = new int[]{0};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new double[]{28.408235773929096D,11.71682238801929D,6.307566732052312D};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
    Object v2 = new double[][]{};
    org.apache.commons.math3.util.MathArrays.sortInPlace(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),((double[][])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new double[]{-1.1037766214609777D,-6.763825803099209D};
    org.apache.commons.math3.util.MathArrays.checkPositive(((double[])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new double[]{27.163009251606947D,-18.741028138784312D,60.43692774270934D};
    Object v1 = new double[]{-7.206478087738193D,0.2280174095284856D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new double[]{53.405170497659306D,0.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.safeNorm(((double[])v0));
    org.junit.Assert.assertEquals((Object)(53.405170497659306D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new double[]{0.0D};
    Object v1 = new double[]{0.0D,-2.475402353339831D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeAdd(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{-6,1,24};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new float[]{};
    Object v1 = new float[]{0.0F,19.621765F,26.745464F};
    Object v2 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new double[]{0.0D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeSubtract(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new double[]{-6.262572521404157D};
    Object v1 = new double[]{0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.linearCombination(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(-0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.apache.commons.math3.complex.ComplexField.getInstance();
    Object v1 = 1;
    Object v2 = 8;
    Object v3 = org.apache.commons.math3.util.MathArrays.buildArray(((org.apache.commons.math3.Field)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new double[]{17.868827188710146D,-22.460576976587607D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.convolve(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.NoDataException");
    } catch (org.apache.commons.math3.exception.NoDataException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new double[]{5.0D};
    Object v1 = new double[]{-81.50331877360502D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(86.50331877360502D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{-38};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = org.apache.commons.math3.util.MathArrays.safeNorm(((double[])v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 37.484498586077905D;
    Object v1 = -62.17679908582147D;
    Object v2 = 2.6473381573456485D;
    Object v3 = 0.0D;
    Object v4 = 1.6568432380817177D;
    Object v5 = 0.0D;
    Object v6 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-2330.666137419325D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{0.0D,13.015053312231265D,-29.512045742041018D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeAdd(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new double[]{50.74367855929191D,0.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = false;
    Object v3 = false;
    Object v4 = org.apache.commons.math3.util.MathArrays.checkOrder(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{92.29965851713511D,2.3151444360710904D,17.332408138081984D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeDivide(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new int[]{-43};
    Object v1 = new int[]{0};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(43), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new double[]{7.514880124612269D,0.0D,0.0D};
    Object v1 = new double[]{0.0D,0.0D,1.639802559014735D};
    Object v2 = org.apache.commons.math3.util.MathArrays.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new int[]{-26,22,10};
    Object v1 = new int[]{2,1,0};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(36.40054944640259D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{1,0};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new double[]{-61.554459056657166D,67.58111138219964D,1.0D};
    Object v1 = org.apache.commons.math3.util.MathArrays.safeNorm(((double[])v0));
    org.junit.Assert.assertEquals((Object)(91.41749310395116D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new long[][]{null,null,null};
    org.apache.commons.math3.util.MathArrays.checkRectangular(((long[][])v0));
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new double[]{51.70709748710677D};
    Object v1 = new double[]{1.0D,2.0D,26.492892161025207D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance1(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(50.70709748710677D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{0};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance1(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new double[]{-41.33156455024935D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeAdd(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new int[]{4};
    Object v1 = new int[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.distanceInf(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new float[]{};
    Object v1 = new float[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math3.util.MathArrays.normalizeArray(((double[])v0),(((java.lang.Double)v1).doubleValue()));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -25.297243850759457D;
    Object v1 = new double[]{0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.scale((((java.lang.Double)v0).doubleValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null,null};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
    Object v2 = false;
    Object v3 = org.apache.commons.math3.util.MathArrays.isMonotonic(((java.lang.Comparable[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.apache.commons.math3.complex.ComplexField.getInstance();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.math3.util.MathArrays.buildArray(((org.apache.commons.math3.Field)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new double[]{29.088225704913285D,-30.814083880564482D};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = false;
    Object v3 = false;
    Object v4 = org.apache.commons.math3.util.MathArrays.checkOrder(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,1.0D,2.0D};
    Object v1 = new double[]{1.0D,27.13249458096906D};
    Object v2 = org.apache.commons.math3.util.MathArrays.linearCombination(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{62.28390190175838D};
    Object v2 = org.apache.commons.math3.util.MathArrays.ebeDivide(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new double[]{-3.1454950261850145D};
    Object v1 = -3.2684954551469616D;
    Object v2 = org.apache.commons.math3.util.MathArrays.normalizeArray(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -56.46917556973024D;
    Object v1 = 0.0D;
    Object v2 = -54.27705235676064D;
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    Object v5 = -31.94528513447014D;
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = org.apache.commons.math3.util.MathArrays.linearCombination((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-54.27705235676064D), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new int[]{0,-34,0};
    Object v1 = new int[]{0,25};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance1(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new long[]{};
    org.apache.commons.math3.util.MathArrays.checkNonNegative(((long[])v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = new double[]{-13.196258304094565D};
    Object v2 = org.apache.commons.math3.util.MathArrays.scale((((java.lang.Double)v0).doubleValue()),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new double[]{0.0D,38.46215278558125D,17.292575222914635D};
    Object v1 = new double[]{-1.6171404880459004D,-23.864538912797517D,4.578191159691178D};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(63.63086675136513D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new double[]{-19.801860100657443D,0.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.convolve(((double[])v0),((double[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = new double[]{0.696107051865973D,0.0D};
    Object v2 = org.apache.commons.math3.util.MathArrays.linearCombination(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.DimensionMismatchException");
    } catch (org.apache.commons.math3.exception.DimensionMismatchException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new int[]{0};
    Object v1 = new int[]{};
    Object v2 = org.apache.commons.math3.util.MathArrays.distance(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new int[]{0};
    Object v1 = 1;
    Object v2 = org.apache.commons.math3.util.MathArrays.copyOf(((int[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
    Object v2 = false;
    Object v3 = org.apache.commons.math3.util.MathArrays.isMonotonic(((double[])v0),((org.apache.commons.math3.util.MathArrays.OrderDirection)v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
