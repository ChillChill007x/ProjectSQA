package com.fasterxml.jackson.core.io;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.io.NumberInput();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)8),Character.valueOf((char)0)};
    Object v1 = 0;
    Object v2 = -27;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "Current token (";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = ", at char #";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)3),Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-47), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "FLUSH_PvASSED_TO_STREAM";
    Object v1 = 76;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(76), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 32;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "was expecting either '*' or '/' for a comment";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "1";
    Object v1 = -37L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "N/A";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Failed to instantiate ";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "write nuber";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = ")";
    Object v1 = 18L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(18L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = -19;
    Object v2 = 1;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = -41;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-41), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-48), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = ") out of >range of Java short";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = -24;
    Object v2 = -28;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = 1.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "version";
    Object v1 = 0L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = 37;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "ABCDEFGHIJKLMNOPQRSTUVW(XYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 2;
    Object v2 = -21;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = ") Hn base64 content";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)48),Character.valueOf((char)1)};
    Object v1 = 51;
    Object v2 = 1;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "string value";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = ")";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Generatr of type ";
    Object v1 = 2L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(2L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "-1";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(-1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to alluw";
    Object v1 = -44.11318160304D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-44.11318160304D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = ")";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = ")";
    Object v1 = 0L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "null";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = ")";
    Object v1 = 18;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(18), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "BASE64_CODEXC_BUFFER";
    Object v1 = -29;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-29), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "sexpected padding character '";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = ")m";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "write number";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "Current token(";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Too few bytes available: missing ";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = ")T";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Non-standard tken '";
    Object v1 = 45L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(45L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = 1;
    Object v2 = 14;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v1 = 0;
    Object v2 = 29;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "Illegal white space character (code 0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = " by(es";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = ": was expecting closing '\"' for name";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = -28;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = ") in ase64 content";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "Illegald white space character (code 0x";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)255),Character.valueOf((char)0)};
    Object v1 = 32;
    Object v2 = 125;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = -38;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-38), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v1 = 136;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "Illegal character (code 0x,";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "nul";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = -10;
    Object v2 = -8;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "string value";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseLong(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "false";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = " entrieu";
    Object v1 = false;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "x";
    Object v1 = 13L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(13L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Too few bytes availablH: missing ";
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "G)";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "null";
    Object v1 = 10.693245842461724D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(10.693245842461724D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1)};
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "'";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new char[]{};
    Object v1 = 49;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "'";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Broken surrogate pair: firt char 0x";
    Object v1 = -18;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-18), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "IntNrnal error";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "-InfinitQ";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)0),Character.valueOf((char)255)};
    Object v1 = 0;
    Object v2 = -68;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)0)};
    Object v1 = -38;
    Object v2 = 16;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects";
    Object v1 = 8;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(8), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new char[]{};
    Object v1 = 63;
    Object v2 = 2;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)10),Character.valueOf((char)3)};
    Object v1 = -5;
    Object v2 = 53;
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = " entries";
    Object v1 = 1.0D;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble(((java.lang.String)v0),(((java.lang.Double)v1).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "write number";
    Object v1 = 1L;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.parseAsLong(((java.lang.String)v0),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)2)};
    Object v1 = 2;
    Object v2 = 15;
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = ")";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)1),Character.valueOf((char)6)};
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-47), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)2),Character.valueOf((char)255),Character.valueOf((char)0)};
    Object v1 = 47;
    Object v2 = 16;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseInt(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Illegal character code 0x";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Current token (";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "ALLW_NON_NUMERIC_NUMBERS";
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new char[]{Character.valueOf((char)1),Character.valueOf((char)102),Character.valueOf((char)0)};
    Object v1 = 21;
    Object v2 = -31;
    Object v3 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(((char[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }
}
