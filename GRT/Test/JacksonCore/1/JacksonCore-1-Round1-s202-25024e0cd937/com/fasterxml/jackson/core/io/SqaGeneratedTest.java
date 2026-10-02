package com.fasterxml.jackson.core.io;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "ROOT";
    Object v1 = 149L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(149L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Failed to decode VALUE_STRING as bae64 (";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ")";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "wriGte number";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.io.NumberInput();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = " bvytes";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = ")";
    Object v1 = -21L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-21L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "Too ew bytes available: missing ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Illegal white space character (code 0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Currnt token (";
    Object v1 = -4;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-4), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)2),Character.valueOf((char)0)};
    Object v1 = -60;
    Object v2 = 7;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "write binary value";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 14;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "null";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "N)";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "string va";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-48), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = -5;
    Object v2 = 1;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "U";
    Object v1 = 1.0581597792345137D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0581597792345137D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "expected padding charater '";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "NaN";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 52;
    Object v2 = 255;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = ").";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = ", atcchar #";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "expected a digit for number exponent";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "Missing integer part (next char ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "Illegal character point (0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "Value \"";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "BACSE64_CODEC_BUFFER";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "'L";
    Object v1 = 14.140714456808725D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(14.140714456808725D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = -27;
    Object v2 = 5;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = " e";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "CaL not write a field name, expecting a value";
    Object v1 = 0L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "START_ARRAY";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "write num";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = ":";
    Object v1 = 4.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(4.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "Trying to release buffer not owned by the context";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = -53;
    Object v2 = 4;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)65534)};
    Object v1 = 57;
    Object v2 = -16;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "'";
    Object v1 = 24;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(24), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Failed to decode VALUE_S";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "write text value";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = -31;
    Object v2 = 11;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "e<xpected padding character '";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Na3";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "write bin";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "string value";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "G";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Non-standard token '";
    Object v1 = -10;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-10), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = ")";
    Object v1 = -17.52225334718274D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-17.52225334718274D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = " ytes";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "write numbe";
    Object v1 = -24L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-24L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 2;
    Object v2 = -31;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = -10;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Unexpected padding character ('";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)12),Character.valueOf((char)1)};
    Object v1 = 34;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Decimal point not followed by a digit";
    Object v1 = -26;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-26), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Unexpected end-of-input within/between ";
    Object v1 = 24.856244252921417D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(24.856244252921417D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "N/A";
    Object v1 = 8;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(8), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " (rom ";
    Object v1 = -48.232487539484D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-48.232487539484D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = ")";
    Object v1 = 0L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = -30;
    Object v2 = 8;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = ") in ba";
    Object v1 = 0L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "; should be ";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "Illegal white spac character (code 0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = -22;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)65535),Character.valueOf((char)65535)};
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "No Obj`ectCodec defined for the parser, can not deserialize JSON into Java objects";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = " of 4-char ";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "-6";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(-6L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Missing integer part (next char ";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "m";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = ") as charac6ter #";
    Object v1 = 46L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(46L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 3;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)2),Character.valueOf((char)0)};
    Object v1 = 0;
    Object v2 = 3;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = ")";
    Object v1 = -8;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-8), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "') as character #";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = ": was expecting closing quote for a string value";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "Invalid UTF-8 start byte 0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "Crrent token (";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "expected padding character '";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = -7;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-7), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Leading zeroes not aldowed";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = -26;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Illegal character point (0x";
    Object v1 = 42L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(42L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }
}
