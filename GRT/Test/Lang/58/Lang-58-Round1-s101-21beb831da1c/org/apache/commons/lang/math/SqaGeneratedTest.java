package org.apache.commons.lang.math;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30L;
    Object v1 = 12L;
    Object v2 = 15L;
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(12L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new double[]{0.0D,-20.751418469356224D};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((double[])v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new long[]{0L,1L,0L};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new float[]{1.0F,10.818437F,1.0F};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(10.818437F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "EEE, dd MMM yyyy HH:mm:ss Z";
    Object v1 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "ne";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new float[]{1.0F,0.0F};
    Object v1 = new float[]{-15.452557F};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = Short.valueOf((short)43);
    Object v2 = Short.valueOf((short)-1);
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Short)v0).shortValue()),(((java.lang.Short)v1).shortValue()),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new int[]{8,1};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(8), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new float[]{-10.622688F,0.0F};
    Object v1 = new float[]{1.0F};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)0),Short.valueOf((short)1),Short.valueOf((short)0)};
    Object v1 = new short[]{Short.valueOf((short)0)};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((short[])v0),((short[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new long[]{0L,-5L};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 2L;
    Object v1 = 0L;
    Object v2 = 7L;
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(7L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "prim4";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Range[";
    Object v1 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -15.926003F;
    Object v1 = 34.22593F;
    Object v2 = org.apache.commons.lang.math.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 2.0D;
    Object v1 = 1.0D;
    Object v2 = org.apache.commons.lang.math.NumberUtils.compare((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)-26),Short.valueOf((short)0)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-26)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "219";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(219.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "(";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "y";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new float[]{1.0F};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = -10;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-10), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)-17);
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Byte)v0).byteValue()),(((java.lang.Byte)v1).byteValue()),(((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -26;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-26), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "\\u00";
    Object v1 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -30.903011827881166D;
    Object v2 = -8.500222355916177D;
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-30.903011827881166D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new int[]{};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((int[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "The Array must nCt be null";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new float[]{0.0F};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new float[]{};
    Object v1 = new float[]{0.0F,-26.099022F,1.0F};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "x";
    Object v1 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new int[]{1,-3};
    Object v1 = new int[]{-26};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Rmnge[";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = ",@";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new int[]{0,-16,0};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new short[]{};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((short[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new long[]{1L,5L,0L};
    Object v1 = new long[]{};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((long[])v0),((long[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new double[]{1.0D,0.0D,13.888367720739394D};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((double[])v0));
    org.junit.Assert.assertEquals((Object)(13.888367720739394D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = -33.76261332781048D;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-33.76261332781048D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "94";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(94.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)16),Short.valueOf((short)0)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)16)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Short.valueOf((short)-31);
    Object v1 = Short.valueOf((short)-36);
    Object v2 = Short.valueOf((short)8);
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Short)v0).shortValue()),(((java.lang.Short)v1).shortValue()),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-36)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Short.valueOf((short)46);
    Object v1 = Short.valueOf((short)50);
    Object v2 = Short.valueOf((short)-18);
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Short)v0).shortValue()),(((java.lang.Short)v1).shortValue()),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)50)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new long[]{-25L,5L};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((long[])v0));
    org.junit.Assert.assertEquals((Object)(-25L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "The Enum Class must no+ be null";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -39;
    Object v1 = 0;
    Object v2 = -15;
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "a";
    Object v1 = 93.0D;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(93.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)71)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)71)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new float[]{1.0F};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(1.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "H:mm:\"s.SSS";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -1L;
    Object v1 = 0L;
    Object v2 = -46L;
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Byte)v0).byteValue()),(((java.lang.Byte)v1).byteValue()),(((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "I\"valid length: ";
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Byte.valueOf((byte)23);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)14);
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Byte)v0).byteValue()),(((java.lang.Byte)v1).byteValue()),(((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -42.266743F;
    Object v1 = 1.0F;
    Object v2 = org.apache.commons.lang.math.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "185";
    Object v1 = 10L;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(185L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Byte)v0).byteValue()),(((java.lang.Byte)v1).byteValue()),(((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new float[]{};
    Object v1 = new float[]{-40.22253F,1.0F,0.0F};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 0.0F;
    Object v2 = org.apache.commons.lang.math.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new float[]{};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((float[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "B";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new long[]{-21L};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(-21L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 16.707672258337624D;
    Object v1 = 2.170337905360191D;
    Object v2 = 0.0D;
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(16.707672258337624D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = Short.valueOf((short)0);
    Object v2 = Short.valueOf((short)-25);
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Short)v0).shortValue()),(((java.lang.Short)v1).shortValue()),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 82.68574F;
    Object v1 = 1.0F;
    Object v2 = org.apache.commons.lang.math.NumberUtils.compare((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = Short.valueOf((short)39);
    Object v2 = Short.valueOf((short)1);
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Short)v0).shortValue()),(((java.lang.Short)v1).shortValue()),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = -23.047792F;
    Object v2 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)v0),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertEquals((Object)(-23.047792F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new int[]{-14,0,0};
    Object v1 = org.apache.commons.lang.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D};
    Object v1 = new double[]{0.0D,0.0D,35.134966170074705D};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = ":";
    Object v1 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new double[]{1.0D};
    Object v1 = new double[]{};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((double[])v0),((double[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = new byte[]{Byte.valueOf((byte)-11)};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])v0),((byte[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new double[]{1.0D,1.0D};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(1.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new int[]{};
    Object v1 = new int[]{0,-7};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((int[])v0),((int[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Byte)v0).byteValue()),(((java.lang.Byte)v1).byteValue()),(((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "25\"";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)0),Short.valueOf((short)-54)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-54)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -0.6596671505198808D;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 1.0D;
    Object v2 = 17.12257816734043D;
    Object v3 = org.apache.commons.lang.math.NumberUtils.min((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new float[]{};
    Object v1 = new float[]{};
    Object v2 = org.apache.commons.lang.math.NumberUtils.equals(((float[])v0),((float[])v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "Z";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-31)};
    Object v1 = org.apache.commons.lang.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-31)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "Unexpected IllegalAccessException";
    Object v1 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = Short.valueOf((short)61);
    Object v1 = Short.valueOf((short)0);
    Object v2 = Short.valueOf((short)1);
    Object v3 = org.apache.commons.lang.math.NumberUtils.max((((java.lang.Short)v0).shortValue()),(((java.lang.Short)v1).shortValue()),(((java.lang.Short)v2).shortValue()));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)61)), v3);
  }
}
