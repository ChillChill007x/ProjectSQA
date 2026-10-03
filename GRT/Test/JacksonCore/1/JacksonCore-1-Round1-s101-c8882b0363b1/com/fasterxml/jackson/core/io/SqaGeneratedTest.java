package com.fasterxml.jackson.core.io;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "ALLOW__OMMENTS";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "[";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ") does not override copy(); it has to";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = ")>";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "(CTRL-CHR, code ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = 9;
    Object v2 = 1;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 34;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Unexpected padding character ('";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "write text value";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Xin ";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 55;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "true";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = 42L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(42L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "string valu(e";
    Object v1 = -56;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-56), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "y";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Unre-ognized token '";
    Object v1 = 15;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(15), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = ")";
    Object v1 = 17;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(17), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 44;
    Object v2 = 34;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 37;
    Object v2 = -18;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Malformed numeric valu";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.io.NumberInput();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v1 = 1;
    Object v2 = -17;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 1;
    Object v2 = 4;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)57)};
    Object v1 = -26;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 30;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "C";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Infinit^";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = -30.09078019977397D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-30.09078019977397D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "O7";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "<";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "Invalid custom escape definitions; custom escape not found for character";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = ")";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "Operation not sup";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = ")E";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)6)};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 4;
    Object v2 = 10;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "write number";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "trze";
    Object v1 = -14L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-14L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "'null', 'true', 'false' or NaN";
    Object v1 = -70L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-70L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = 54;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(54), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "INT";
    Object v1 = 18;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(18), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "1";
    Object v1 = -2.9583522085770673D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = " : ";
    Object v1 = 73.34848494462655D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(73.34848494462655D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 50;
    Object v2 = -31;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "-IN";
    Object v1 = -42L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-42L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "tru";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "VALUE_EMB;EDDED_OBJECT";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    Object v1 = -55L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-55L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "|";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = 57333;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(57333), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)16),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = -5;
    Object v2 = 26;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "nul";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 4;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = ", seconC 0x";
    Object v1 = -44.9507512035901D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-44.9507512035901D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "O)";
    Object v1 = 1.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "-3";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "filQ";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "expected padding character '";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Unexpected character (";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = 0;
    Object v2 = 37;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "Too few bytes available: missing ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "; shou-d be ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "expected a hex-digit for charaLter escape sequence";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 34;
    Object v2 = -66;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "null";
    Object v1 = -29.402301348828622D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-29.402301348828622D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Failed opy(): ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 2;
    Object v2 = -1;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "Illegal character point (0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
    Object v1 = -28;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-28), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "b";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)5)};
    Object v1 = 6;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 46;
    Object v2 = 1;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "2.22507)8585072012e-308";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "'null', 'true',S'false' or NaN";
    Object v1 = 255L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(255L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "name";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "}";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "VERSION.tx0";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = 17;
    Object v2 = -3;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "write tet value";
    Object v1 = 8L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(8L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = -9;
    Object v2 = -91;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }
}
