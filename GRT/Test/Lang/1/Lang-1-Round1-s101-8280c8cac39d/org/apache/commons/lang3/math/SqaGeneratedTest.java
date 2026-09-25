package org.apache.commons.lang3.math;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new float[]{39.356068F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(39.356068F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new int[]{1,0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-6)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "]G";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 26L;
    Object v1 = 16L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = Byte.valueOf((byte)-21);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-21)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "C[wrapped] ";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = Short.valueOf((short)-1);
    Object v1 = Short.valueOf((short)1);
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(3L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "\u221e";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -43L;
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 9;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new int[]{0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = Short.valueOf((short)34);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)34)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)2),Short.valueOf((short)-6)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-6)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = Short.valueOf((short)-14);
    Object v1 = Short.valueOf((short)43);
    Object v2 = Short.valueOf((short)23);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)43)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = Byte.valueOf((byte)32);
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)32)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Short.valueOf((short)-14);
    Object v1 = Short.valueOf((short)0);
    Object v2 = Short.valueOf((short)7);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)7)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "y";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{25.95615182979268D,1.0D,0.0D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -25;
    Object v1 = 5;
    Object v2 = -32;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(5), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = -21L;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toLong(((java.lang.String)v0),((java.lang.Long)v1));
    org.junit.Assert.assertEquals((Object)(-21L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new long[]{-14L,28L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(28L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = Short.valueOf((short)-12);
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-12)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "getLinkedExcepti";
    Object v1 = -13.132865935114854D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(-13.132865935114854D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "&iota2;";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = Short.valueOf((short)-1);
    Object v1 = Short.valueOf((short)1);
    Object v2 = Short.valueOf((short)14);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new double[]{50.915641048949986D,0.0D,-4.914333526342675D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(-4.914333526342675D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "\u2021";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Aborting to protect against StackOverflowError - output of one loop is the input of another";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new int[]{7,0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new int[]{0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = 26.388428937252538D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(26.388428937252538D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -9;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(-9), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "s";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Byte.valueOf((byte)19);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)19)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = Short.valueOf((short)2);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)2)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new float[]{0.0F,1.0F,28.294521F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(28.294521F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = " 0 dQays";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = Short.valueOf((short)11);
    Object v1 = Short.valueOf((short)0);
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "?";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "$";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "l";
    Object v1 = 7L;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toLong(((java.lang.String)v0),((java.lang.Long)v1));
    org.junit.Assert.assertEquals((Object)(7L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new float[]{16.271465F,14.211946F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(14.211946F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = Short.valueOf((short)-3);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-3)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = 4L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 55;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(55), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = Byte.valueOf((byte)-6);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "c";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = Short.valueOf((short)16);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)16)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new float[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new float[]{-53.02517F,-4.66822F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(-4.66822F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new int[]{0,-2,-43};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(-43), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 32;
    Object v1 = -36;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(32), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)1),Short.valueOf((short)-9),Short.valueOf((short)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "&s0up3;";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)-35),Short.valueOf((short)74)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)74)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "user.ir";
    Object v1 = -61.911736F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(-61.911736F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)1),Byte.valueOf((byte)-38)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 14.234487F;
    Object v1 = -3.9335105F;
    Object v2 = 0.0F;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Float)v0),((java.lang.Float)v1),((java.lang.Float)v2));
    org.junit.Assert.assertEquals((Object)(-3.9335105F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "null";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "s";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new long[]{-29L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(-29L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)26),Byte.valueOf((byte)60)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)60)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = Short.valueOf((short)55);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)55)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)11);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = Byte.valueOf((byte)14);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = 56.70331509744498D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(56.70331509744498D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.lang3.math.NumberUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new int[]{27,-3,2};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(27), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = Short.valueOf((short)-10);
    Object v1 = Short.valueOf((short)23);
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)23)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "nBools-1+srcPos is greather or equal to than 32";
    Object v1 = Byte.valueOf((byte)2);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)2)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new float[]{0.0F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)0),Short.valueOf((short)47)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "StopwaTtch has not been split. ";
    Object v1 = 13L;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toLong(((java.lang.String)v0),((java.lang.Long)v1));
    org.junit.Assert.assertEquals((Object)(13L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = Short.valueOf((short)48);
    Object v2 = Short.valueOf((short)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)48)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "Invalid locale format: ";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = -46.837734F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(-46.837734F), v2);
  }
}
