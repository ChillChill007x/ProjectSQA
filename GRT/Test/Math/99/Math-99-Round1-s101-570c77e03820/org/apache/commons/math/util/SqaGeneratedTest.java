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
    try {
    Object v0 = -15;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialLog((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialLog((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -36.401607254737215D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.9999999999999999D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 13;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -37L;
    Object v1 = 1L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-38L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -2.0518911168377927D;
    Object v1 = 13.10028217218288D;
    Object v2 = 4.037973005709474D;
    Object v3 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -17;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 16;
    Object v1 = -26;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = Byte.valueOf((byte)26);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
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
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -19.253078F;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new double[]{-0.03138235570848158D};
    Object v1 = new double[]{-26.16573626665666D,1.0D};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new double[]{0.0D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.math.util.MathUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -1;
    Object v1 = -44;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(44), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 49.93176325605783D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -14;
    Object v1 = 33;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(19), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(2L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 31L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -14.913013995983176D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -2.3256631877422214D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 49;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = Short.valueOf((short)49);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -32.1943022870341D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = -19;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(20), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = Short.valueOf((short)28);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = Short.valueOf((short)-10);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 7;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(5040.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 3;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = -50;
    Object v1 = 11;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -3.718532222660201D;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 8.901660730577028D;
    Object v1 = 42;
    Object v2 = 3;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(8.901660730577028D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.factorial((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 8;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 26.38843F;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1L;
    Object v1 = -29L;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -22L;
    Object v1 = -14L;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(308L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0;
    Object v1 = -34;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 52.51630253764957D;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.scalb((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(52.51630253764957D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 3;
    Object v1 = -28;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 44L;
    Object v1 = 1L;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(44L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 28;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 25;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 10;
    Object v1 = org.apache.commons.math.util.MathUtils.factorialDouble((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(3628800.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -2;
    Object v1 = 8;
    Object v2 = org.apache.commons.math.util.MathUtils.gcd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 47L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -16;
    Object v1 = 50;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-66), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.apache.commons.math.util.MathUtils.round((((java.lang.Double)v0).doubleValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
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
    Object v0 = 0;
    Object v1 = -7;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -2.5824139685523235D;
    Object v1 = org.apache.commons.math.util.MathUtils.sinh((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-6.576721405014615D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -20.50913F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -15L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -96.42183443896883D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-96.42183443896882D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Short.valueOf((short)-58);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -9;
    Object v1 = -28;
    Object v2 = org.apache.commons.math.util.MathUtils.addAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-37), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 31.30903015198001D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1L;
    Object v1 = -24L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(25L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 4;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = Byte.valueOf((byte)-6);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 25;
    Object v1 = 1;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(25), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = -41;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1L;
    Object v1 = 11L;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-10L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -61L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{-12.521392446136796D,0.0D,-40.378201752074794D};
    Object v1 = org.apache.commons.math.util.MathUtils.hash(((double[])v0));
    org.junit.Assert.assertEquals((Object)(-1407160900), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 13;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.mulAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -19.591744877224404D;
    Object v1 = -95.08783067050099D;
    Object v2 = org.apache.commons.math.util.MathUtils.nextAfter((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-19.591744877224407D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 66;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-65), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 69L;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -36;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 21.899428594142545D;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = Short.valueOf((short)3);
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Short)v0).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -34;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-34), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.math.util.MathUtils.equals((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 46;
    Object v1 = -20;
    Object v2 = org.apache.commons.math.util.MathUtils.subAndCheck((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(66), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 2L;
    Object v1 = org.apache.commons.math.util.MathUtils.indicator((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = org.apache.commons.math.util.MathUtils.cosh((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -21;
    Object v1 = 4;
    Object v2 = org.apache.commons.math.util.MathUtils.lcm((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(84), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 8;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -12;
    Object v1 = org.apache.commons.math.util.MathUtils.sign((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }
}
