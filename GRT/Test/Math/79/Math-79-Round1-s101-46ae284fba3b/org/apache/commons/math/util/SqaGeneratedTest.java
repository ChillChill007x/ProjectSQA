package org.apache.commons.math.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 48.589278342601325D;
    Object v1 = 24.10733809825744D;
    Object v2 = 0;
    Object v3 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{0.0D,31.778116563086225D,1.7215537136911236D};
    Object v1 = -7.008858340028162D;
    Object v2 = org.apache.commons.math.util.MathUtils.normalizeArray(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = Byte.valueOf((byte)-25);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new double[]{-3.0518911168377927D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math.util.MathUtils.distance1(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = -8;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new double[]{0.0D,15.570401158451869D,-16.258640241123967D};
    Object v1 = new double[]{1.0D,35.18052173682364D};
    Object v2 = org.apache.commons.math.util.MathUtils.distanceInf(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 2L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.9E-324D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{-7.676226873527821D,3.544115318261426D,0.0D};
    Object v2 = org.apache.commons.math.util.MathUtils.distanceInf(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -48;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new int[]{4,1,0};
    Object v1 = new int[]{10,-29,0};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(30.59411708155671D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 31.401564F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new double[]{-13.913013995983176D,0.0D};
    Object v1 = new double[]{-22.75713859648941D};
    Object v2 = org.apache.commons.math.util.MathUtils.distance1(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new int[]{1};
    Object v1 = new int[]{};
    Object v2 = org.apache.commons.math.util.MathUtils.distance1(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1L;
    Object v1 = 2L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = -3L;
    Object v1 = 2;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(9L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 5L;
    Object v1 = 19L;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(95L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -32.1943022870341D;
    Object v1 = -22;
    Object v2 = 0;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1.0E22D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new int[]{35};
    Object v1 = new int[]{-37,20,0};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(72.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new double[]{1.0D,1.0D,0.0D};
    Object v1 = new double[]{24.77910034981141D};
    Object v2 = org.apache.commons.math.util.MathUtils.distanceInf(((double[])v0),((double[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -19.347992739279672D;
    Object v2 = -11.115330965134529D;
    Object v3 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 51;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(51), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = -3.9143336F;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.round((((java.lang.Float)v0).floatValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-4.0F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 1.0D;
    Object v2 = -21.154699496179795D;
    Object v3 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 4L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{-29};
    Object v2 = org.apache.commons.math.util.MathUtils.distance1(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -22L;
    Object v1 = -15L;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(330L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 0;
    Object v1 = -34;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 4;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -33.76261332781048D;
    Object v1 = 16.368570889099495D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-33.76261332781047D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 2.2597294F;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = Short.valueOf((short)27);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -29.872570543391518D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 20.809045806634938D;
    Object v1 = 2;
    Object v2 = -5;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -22.93810982062337D;
    Object v1 = 29.066703402487395D;
    Object v2 = org.apache.commons.math.util.MathUtils.log((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1L;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new double[]{18.289317132469623D,0.0D,0.0D};
    Object v1 = new double[]{-39.245295413751045D,0.0D,-7.290613189711397D};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(57.99469528780824D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 41;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{38,30};
    Object v2 = org.apache.commons.math.util.MathUtils.distanceInf(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 17;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(3.55687428096E14D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.sinh((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.1752011936438014D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new double[]{-7.085987704667711D,-63.674121399934116D,17.005471118771194D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -16.46281781393216D;
    Object v1 = 65.7021590798824D;
    Object v2 = 18.890636727257416D;
    Object v3 = org.apache.commons.math.util.MathUtils.compareTo((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = -27;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-27), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 3L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -13.761389618187541D;
    Object v1 = -39.97863093937301D;
    Object v2 = -61.90844479702332D;
    Object v3 = org.apache.commons.math.util.MathUtils.compareTo((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 44;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = 66;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-65), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 69.20354F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -36;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 22;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new double[]{-6.831160885212972D,49.13413776577596D,0.0D};
    Object v1 = -34.00110654385528D;
    Object v2 = org.apache.commons.math.util.MathUtils.normalizeArray(((double[])v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 46.4306445140991D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{0.0D,-13.528769031678866D,0.0D};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new double[]{1.0D,0.0D};
    Object v1 = new double[]{0.0D,0.0D,4.503599627370474E15D};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = Byte.valueOf((byte)19);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = Short.valueOf((short)9);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -53.33733836310566D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-53.33733836310565D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -38;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new double[]{};
    Object v1 = new double[]{14.205005783801067D,1.0D};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -30L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -1.6332312955191441D;
    Object v1 = 47;
    Object v2 = 0;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1.6332312955191441D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 39;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new double[]{-53.81573326170762D};
    Object v1 = new double[]{0.3403328494801192D};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(54.15606611118774D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 2L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = -53.29573570574929D;
    Object v1 = 9;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-27287.416681343635D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 17;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = -31;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -37.07404139218156D;
    Object v2 = -11.533787178304781D;
    Object v3 = org.apache.commons.math.util.MathUtils.compareTo((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(2.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = 42;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new int[]{0};
    Object v1 = new int[]{18};
    Object v2 = org.apache.commons.math.util.MathUtils.distance(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(18.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new int[]{1,-13};
    Object v1 = new int[]{};
    Object v2 = org.apache.commons.math.util.MathUtils.distanceInf(((int[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 62.17001128732755D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Integer)v0).intValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 86;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Integer)v0).intValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -12;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.pow((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 27.939014872127938D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.normalizeAngle((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.806273643409593D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 14;
    Object v1 = -13;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{};
    Object v2 = org.apache.commons.math.util.MathUtils.distanceInf(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 0.1663568543761701D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new double[]{-10.585071832950971D};
    Object v1 = org.apache.commons.math.util.MathUtils.hash(((double[])v0));
    org.junit.Assert.assertEquals((Object)(1227718704), v1);
  }
}
