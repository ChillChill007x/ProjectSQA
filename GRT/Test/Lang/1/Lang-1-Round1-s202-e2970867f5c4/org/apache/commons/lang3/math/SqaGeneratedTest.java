package org.apache.commons.lang3.math;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new int[]{-20};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(-20), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "&oplus;";
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = -11;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(-11), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new int[]{0,1,0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "&inus;";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "q";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Short.valueOf((short)-25);
    Object v1 = Short.valueOf((short)1);
    Object v2 = Short.valueOf((short)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)-11),Short.valueOf((short)-40)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-11)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = 40.60568F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(40.60568F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = 23;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(23), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "z";
    Object v1 = -13.081478487850774D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(-13.081478487850774D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new double[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((double[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new float[]{-22.042984F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(-22.042984F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)102)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)102)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = Byte.valueOf((byte)15);
    Object v1 = Byte.valueOf((byte)-17);
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-17)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "&omega;";
    Object v1 = Short.valueOf((short)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = Byte.valueOf((byte)12);
    Object v1 = Byte.valueOf((byte)0);
    Object v2 = Byte.valueOf((byte)-59);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)12)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = Short.valueOf((short)-19);
    Object v1 = Short.valueOf((short)-21);
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)2),Short.valueOf((short)-38)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-38)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new float[]{5.3568664F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(5.3568664F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "The validated map is emp";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "{";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new double[]{-21.84139492478772D,42.5861790987514D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(-21.84139492478772D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new float[]{36.167088F,22.18577F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(22.18577F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new float[]{-24.57392F,0.0F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((float[])v0));
    org.junit.Assert.assertEquals((Object)(-24.57392F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Stopwatch must be splitu to get the split time. ";
    Object v1 = -41.543524049712495D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(-41.543524049712495D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "The field must not be ";
    Object v1 = 41.95537F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(41.95537F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new double[]{0.0D,45.31651019610698D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((double[])v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)-32)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)-32)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "The Array mus not be null";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new double[]{-31.233949359239674D,0.0D};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((double[])v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = -26L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(-26L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "The Array mus not be null";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "8";
    Object v1 = 0.0D;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0),((java.lang.Double)v1));
    org.junit.Assert.assertEquals((Object)(8.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.lang3.math.NumberUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = Short.valueOf((short)2);
    Object v2 = Short.valueOf((short)0);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 15L;
    Object v1 = 0L;
    Object v2 = -29L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(15L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = 0.0F;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toFloat(((java.lang.String)v0),((java.lang.Float)v1));
    org.junit.Assert.assertEquals((Object)(0.0F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new long[]{0L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new int[]{1,11,8};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((int[])v0));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0L;
    Object v1 = -58L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new long[]{31L,-54L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(31L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 9L;
    Object v1 = -1L;
    Object v2 = 0L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(9L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "T";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-48)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-48)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = Short.valueOf((short)1);
    Object v1 = Short.valueOf((short)1);
    Object v2 = Short.valueOf((short)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "The validated state is false";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)12),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new int[]{0,0};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((int[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = 11;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(11), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "HashCodeBuilder requres an odd initial value";
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "The dGate must not be null";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = " ";
    Object v1 = Byte.valueOf((byte)-32);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-32)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)55);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)55)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "&ium;";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0L;
    Object v1 = -65L;
    Object v2 = -31L;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Long)v0),((java.lang.Long)v1),((java.lang.Long)v2));
    org.junit.Assert.assertEquals((Object)(-65L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = Short.valueOf((short)0);
    Object v1 = Short.valueOf((short)-10);
    Object v2 = Short.valueOf((short)21);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Short)v0),((java.lang.Short)v1),((java.lang.Short)v2));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)21)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "m";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isDigits(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "&not;";
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toLong(((java.lang.String)v0),((java.lang.Long)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "The String did not match any specified value";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "\u0192";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -79.62096985349982D;
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Double)v0),((java.lang.Double)v1),((java.lang.Double)v2));
    org.junit.Assert.assertEquals((Object)(-79.62096985349982D), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)-15)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new float[]{-36.87922F,0.0F};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((float[])v0));
    org.junit.Assert.assertEquals((Object)(0.0F), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "/";
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toByte(((java.lang.String)v0),((java.lang.Byte)v1));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "&sup2;";
    Object v1 = Short.valueOf((short)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)58),Short.valueOf((short)0),Short.valueOf((short)1)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)58)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = Short.valueOf((short)0);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = " is not a vaid number.";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "&copy:;";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = Byte.valueOf((byte)1);
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Byte)v0),((java.lang.Byte)v1),((java.lang.Byte)v2));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "m";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -18;
    Object v1 = 7;
    Object v2 = -49;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.max(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(7), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -14.163904F;
    Object v1 = 1.0F;
    Object v2 = 22.763279F;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Float)v0),((java.lang.Float)v1),((java.lang.Float)v2));
    org.junit.Assert.assertEquals((Object)(-14.163904F), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "(nHexs-1)*4+srcPos is greather or equal to than 32";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.toDouble(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "i";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new short[]{Short.valueOf((short)1),Short.valueOf((short)26)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((short[])v0));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "@";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.isNumber(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new long[]{-18L,0L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
    org.junit.Assert.assertEquals((Object)(0L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new long[]{-23L,1L,1L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
    org.junit.Assert.assertEquals((Object)(-23L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = 33;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.math.NumberUtils.min(((java.lang.Integer)v0),((java.lang.Integer)v1),((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "os.name";
    Object v1 = 15;
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toInt(((java.lang.String)v0),((java.lang.Integer)v1));
    org.junit.Assert.assertEquals((Object)(15), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new long[]{};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.max(((long[])v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "8";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createDouble(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(8.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new long[]{-10L};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((long[])v0));
    org.junit.Assert.assertEquals((Object)(-10L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "...Q";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createNumber(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "*";
    Object v1 = org.apache.commons.lang3.math.NumberUtils.createFloat(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "p";
    Object v1 = Short.valueOf((short)1);
    Object v2 = org.apache.commons.lang3.math.NumberUtils.toShort(((java.lang.String)v0),((java.lang.Short)v1));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)1)), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = org.apache.commons.lang3.math.NumberUtils.min(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(Byte.valueOf((byte)0)), v1);
  }
}
