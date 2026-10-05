package org.apache.commons.math.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30.902282905771397D;
    Object v1 = 13;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(253151.50156407928D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -15;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(15), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -35.401607254737215D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -7;
    Object v1 = -24;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(168), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = 12;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -19.30323433667601D;
    Object v1 = -64;
    Object v2 = -1;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 29.678596F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 34.82748498467269D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialLog((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 35.18052173682364D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.9E-324D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -57L;
    Object v1 = -36L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-21L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.normalizeAngle((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -19.25307813025634D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 2;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(2L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -0.03138235570848158D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-0.03138235570848157D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 2;
    Object v1 = 56;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(58), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 42L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = -8;
    Object v1 = -64;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(512), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 7;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0L;
    Object v1 = 27L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-27L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -3.7561311138592224D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-3.756131113859222D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new double[]{55.04071251543197D,49.060802987636215D,0.0D};
    Object v1 = new double[]{1.0D};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = Byte.valueOf((byte)49);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = -29;
    Object v1 = -21;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 2;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -1.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 14;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 41L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(41L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 3;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = -50;
    Object v1 = 11;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -3.7185323F;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 8.901661F;
    Object v1 = 42;
    Object v2 = org.apache.commons.math.util.MathUtils.round((((java.lang.Float)v0).floatValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(Float.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 21.47081584479693D;
    Object v1 = org.apache.commons.math.util.MathUtils.hash((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(590000111), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 53L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 13.930083536706247D;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(13.930083536706247D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 5;
    Object v1 = -29;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(145), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -22;
    Object v1 = -14;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(308), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.round((((java.lang.Float)v0).floatValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = 7;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(8), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -35;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 49L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(49L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -13;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 46L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(46L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -9;
    Object v1 = -21;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(12), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = Byte.valueOf((byte)33);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 50L;
    Object v1 = -18L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(68L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 2147483647;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 55;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(55), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new double[]{-7.210802509736783D};
    Object v1 = new double[]{-9.635268235655554D};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -30;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -13.607716F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -2L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 36;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(36), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 2;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 22;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 25;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialLog((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(58.003605222980525D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 23.925365688374715D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0L;
    Object v1 = 7L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-7L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 3.9029309846878935D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -13.021411399702899D;
    Object v1 = 65.7021590798824D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 18.890636727257416D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.normalizeAngle((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.04108080571865713D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 11.508708411573878D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.log((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Short.valueOf((short)3);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = -3;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new double[]{9.675672341740007D,1.0D};
    Object v1 = org.apache.commons.math.util.MathUtils.hash(((double[])v0));
    org.junit.Assert.assertEquals((Object)(2000150818), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = 2;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = 75;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 12L;
    Object v1 = -7L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(19L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new double[]{-29.49181280400925D,26.511216049912104D,9.429025435345947D};
    Object v1 = new double[]{24.87469333489406D,1.0D};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -4.77802789816411D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -17.22526108517294D;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-17.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = -33;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -5.511455833023255D;
    Object v1 = org.apache.commons.math.util.MathUtils.cosh((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(123.75762005035217D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -65;
    Object v1 = -33;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-98), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = -47;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = -42;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = -24.71586745394082D;
    Object v2 = org.apache.commons.math.util.MathUtils.normalizeAngle((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-25.132741228718345D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = Byte.valueOf((byte)-23);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Float)v0).floatValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0.1F), v3);
  }
}
