package com.fasterxml.jackson.core.base;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "write a strin";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeFieldName(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new long[]{0L,0L};
    Object v4 = 0;
    Object v5 = 13;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((long[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)1)};
    Object v4 = -4;
    Object v5 = 21;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getCharacterEscapes();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getHighestEscapedChar();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.core.base.GeneratorBase)v0).getCurrentValue();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 1L;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Long)v3).longValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new int[]{-20,0,8};
    Object v4 = 1;
    Object v5 = 37;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((int[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeEndArray();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)48)};
    Object v4 = 0;
    Object v5 = 111;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw((((java.lang.Character)v3).charValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new double[]{};
    Object v4 = -5;
    Object v5 = -29;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v4 = new byte[]{Byte.valueOf((byte)49)};
    Object v5 = 0;
    Object v6 = 91;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v3),((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStartObject();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v3));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStartArray();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw((((java.lang.Character)v3).charValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 1.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).canWriteTypeId();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v2).setPrettyPrinter(((com.fasterxml.jackson.core.PrettyPrinter)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v4 = ((java.lang.Enum)v3).hashCode();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 74.58152302616307D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new long[]{};
    Object v4 = 4;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((long[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "M";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArrayFieldStart(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v2 = ((com.fasterxml.jackson.core.base.GeneratorBase)v0).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "2143";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "was expecting comma to separate ";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBoolean((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "ARRAY";
    Object v4 = false;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBooleanField(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v3));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new double[]{1000.0D,17.881624124304068D};
    Object v4 = 1;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getPrettyPrinter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNull();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-29)};
    Object v4 = -34;
    Object v5 = 2;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRawUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Unreognized token '";
    Object v4 = "/";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStringField(((java.lang.String)v3),((java.lang.String)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "was expecting comma to separate ";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = 47;
    Object v5 = -54;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{};
    Object v4 = 63;
    Object v5 = -26;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = 42;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new double[]{-1.7213796002410784D};
    Object v4 = 10;
    Object v5 = 21;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((double[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new int[]{238,-12,-5};
    Object v4 = 48;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((int[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v4 = 3;
    Object v5 = 3;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRawUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeEndObject();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = false;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBoolean((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v4 = new byte[]{};
    Object v5 = 0;
    Object v6 = 28;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v3),((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new int[]{0,7,34};
    Object v4 = -1;
    Object v5 = 30;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((int[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getFormatFeatures();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 41.677097F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = java.lang.ClassLoader.getSystemClassLoader();
    ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setCurrentValue(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v7).flush();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 14;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -6;
    Object v9 = 0;
    ((com.fasterxml.jackson.core.base.GeneratorBase)v7)._checkStdFeatureChanges((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "'";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -71L;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Long)v3).longValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = 1;
    Object v13 = 1;
    ((com.fasterxml.jackson.core.base.GeneratorBase)v11)._checkStdFeatureChanges((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
    Object v4 = -41;
    Object v5 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = ")";
    ((com.fasterxml.jackson.core.base.GeneratorBase)v11)._verifyValueWrite(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = -14;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRawUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = new com.fasterxml.jackson.core.util.BufferRecycler();
    ((com.fasterxml.jackson.core.base.GeneratorBase)v9).writeObject(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeNumber((((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = "Duplicate field '";
    ((com.fasterxml.jackson.core.base.GeneratorBase)v11)._verifyValueWrite(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v2).setHighestNonEscapedChar((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeFieldName(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = new byte[]{Byte.valueOf((byte)-23)};
    Object v13 = -4;
    Object v14 = -34;
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeUTF8String(((byte[])v12),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = "falsF";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new java.io.ByteArrayOutputStream();
    Object v15 = ((com.fasterxml.jackson.core.SerializableString)v13).writeQuotedUTF8(((java.io.OutputStream)v14));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v11).writeRawValue(((com.fasterxml.jackson.core.SerializableString)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.util.JsonParserDelegate(((com.fasterxml.jackson.core.JsonParser)v12));
    ((com.fasterxml.jackson.core.JsonGenerator)v11).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 35;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new char[]{Character.valueOf((char)1)};
    Object v4 = 53;
    Object v5 = 11;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeString(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = 14;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "INTERN_FIELD_NMES";
    Object v4 = 1.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)109)};
    Object v4 = 29;
    Object v5 = 16;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v7).getCurrentValue();
    Object v9 = -15;
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v7).overrideFormatFeatures((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Current token (";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((com.fasterxml.jackson.core.base.GeneratorBase)v11).writeObject(((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v9)._releaseBuffers();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).canWriteFormattedNumbers();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getSchema();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getOutputBuffered();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 5.804270028850552D;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "wri";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeOmittedField(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "X";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumber(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "Illegal character '";
    Object v4 = 22;
    Object v5 = 36;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRaw(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    Object v10 = 47;
    Object v11 = -33;
    Object v12 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).overrideStdFeatures((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = new long[]{0L,0L,-25L};
    Object v9 = 236;
    Object v10 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeArray(((long[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeNull();
    Object v10 = null;
    Object v11 = 0;
    Object v12 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).setFeatureMask((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeNull();
    Object v10 = null;
    Object v11 = 0;
    Object v12 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-15),Byte.valueOf((byte)1)};
    Object v14 = 8;
    Object v15 = 10;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeRawUTF8String(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new long[]{8L,1L,17L};
    Object v4 = -7;
    Object v5 = -3;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArray(((long[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeNull();
    Object v10 = null;
    Object v11 = 0;
    Object v12 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v12).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    Object v10 = 47;
    Object v11 = -33;
    Object v12 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).overrideStdFeatures((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v12).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeNull();
    Object v10 = null;
    Object v11 = 0;
    Object v12 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = ((com.fasterxml.jackson.core.base.GeneratorBase)v12).setFeatureMask((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.core.base.GeneratorBase)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    ((com.fasterxml.jackson.core.base.GeneratorBase)v11)._releaseBuffers();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)40)};
    Object v4 = 1;
    Object v5 = 34;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v1 = new com.fasterxml.jackson.core.util.BufferRecycler();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.core.io.IOContext(((com.fasterxml.jackson.core.util.BufferRecycler)v0),((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(((com.fasterxml.jackson.core.io.IOContext)v3),(((java.lang.Integer)v4).intValue()),((com.fasterxml.jackson.core.ObjectCodec)v5),((java.io.Writer)v6));
    Object v8 = -20;
    Object v9 = ((com.fasterxml.jackson.core.base.GeneratorBase)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeEndObject();
    Object v10 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = "JSON";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNullField(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.core.util.JsonGeneratorDelegate(((com.fasterxml.jackson.core.JsonGenerator)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)47),Byte.valueOf((byte)47),Byte.valueOf((byte)-17)};
    Object v4 = 1;
    Object v5 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeRawUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
