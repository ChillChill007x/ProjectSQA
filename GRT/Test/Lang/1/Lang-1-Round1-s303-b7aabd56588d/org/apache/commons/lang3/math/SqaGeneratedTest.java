package org.apache.commons.lang3.math;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "'; the SystemUtils property value will defau{t to null.";
    Object v1 = Short.valueOf((short)20);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)20)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new float[]{0.0F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "(nBytes-1)*8+dstPos is greather or equal to than 32";
    Object v1 = Short.valueOf((short)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((double[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "&centL";
    Object v1 = Byte.valueOf((byte)44);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)44)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new short[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "-#";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -16L;
    Object v1 = 47L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(-16L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = Byte.valueOf((byte)-1);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "The Arraycmust not be null";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "\u03c0";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = 10.12466308813371D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(10.12466308813371D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "s";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = " locale does not support dates before 1868 AD)\nUnparseable date: \"";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 3;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)18)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 2.0F;
    Object v1 = 0.0F;
    Object v2 = 1.0F;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Float)v0),((java.lang.Float)v1),((java.lang.Float)v2));
    org.junit.Assert.assertEquals((Object)(2.0F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new long[]{26L,24L,0L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "p";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "&ccedil;";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new int[]{-40};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(-40), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new int[]{0,0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "0";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = Byte.valueOf((byte)2);
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)2)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)45),Byte.valueOf((byte)-83)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-83)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0L;
    Object v1 = -49L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(-49L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "]";
    Object v1 = -23L;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toLong(((java.lang.String)v0),((java.lang.Long)v1));
    org.junit.Assert.assertEquals((Object)(-23L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Z";
    Object v1 = 12.604867F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(12.604867F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new int[]{-16};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(-16), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "(nBytes-1)*8+srcPos is greather or equal to thEn 16";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new double[]{0.0D,-6.836722875219665D,39.6918592277438D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(-6.836722875219665D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -10;
    Object v1 = 0;
    Object v2 = 46;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(-10), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1L;
    Object v1 = -17L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "The Array musc not be null";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = 39.92404675674193D;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Double)v0),((java.lang.Double)v1),((java.lang.Double)v2));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new float[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = " ";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Byte.valueOf((byte)32);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)3);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)32)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)11),Short.valueOf((short)1)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "3";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(3), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new int[]{113,0,0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(113), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "=\u0178";
    Object v1 = 44.424644F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(44.424644F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "G";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 40L;
    Object v1 = -24L;
    Object v2 = 28L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(40L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = Short.valueOf((short)-52);
    Object v1 = Short.valueOf((short)0);
    Object v2 = Short.valueOf((short)2);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-52)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new long[]{0L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -6;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(-6), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "&lrm";
    Object v1 = Short.valueOf((short)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "u";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)0),Short.valueOf((short)0),Short.valueOf((short)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new long[]{3L,8L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(8L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "1.4";
    Object v1 = -13;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(-13), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "s";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)-7),Short.valueOf((short)0),Short.valueOf((short)22)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-7)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "W";
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "y";
    Object v1 = Byte.valueOf((byte)20);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)20)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "h";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 6;
    Object v1 = 49;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(49), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = ".";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "\\";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "javauvm.name";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 15.697908705957946D;
    Object v2 = -7.680990447757225D;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Double)v0),((java.lang.Double)v1),((java.lang.Double)v2));
    org.junit.Assert.assertEquals((Object)(-7.680990447757225D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -23L;
    Object v1 = 1L;
    Object v2 = 25L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(25L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = 57L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "#";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new long[]{0L,0L,1L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Short.valueOf((short)-43);
    Object v1 = Short.valueOf((short)-24);
    Object v2 = Short.valueOf((short)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-43)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "`";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = 44.31177F;
    Object v2 = 1.0F;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Float)v0),((java.lang.Float)v1),((java.lang.Float)v2));
    org.junit.Assert.assertEquals((Object)(44.31177F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = Short.valueOf((short)22);
    Object v1 = Short.valueOf((short)1);
    Object v2 = Short.valueOf((short)-5);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-5)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 26;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(26), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)19),Byte.valueOf((byte)31)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)31)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new float[]{0.0F,1.0F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "java.awt.graphicenv";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new float[]{-4.355356F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(-4.355356F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 58L;
    Object v1 = 32L;
    Object v2 = 1L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "\\n";
    Object v1 = Short.valueOf((short)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = " locale does not support dates before 1868 AD)\nUnparseable date: \"";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new double[]{0.0D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = 0.0F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(0.0F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "#";
    Object v1 = -21L;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toLong(((java.lang.String)v0),((java.lang.Long)v1));
    org.junit.Assert.assertEquals((Object)(-21L), v2);
  }
}
