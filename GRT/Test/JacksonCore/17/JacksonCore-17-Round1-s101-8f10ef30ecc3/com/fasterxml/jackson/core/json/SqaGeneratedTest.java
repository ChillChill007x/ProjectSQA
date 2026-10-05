package com.fasterxml.jackson.core.json;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0L;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v0).writeNumber((((java.lang.Long)v1).longValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.core.Base64Variants.getDefaultVariant();
    Object v2 = new byte[]{Byte.valueOf((byte)21),Byte.valueOf((byte)-27),Byte.valueOf((byte)1)};
    Object v3 = 0;
    Object v4 = -2;
    ((com.fasterxml.jackson.core.json.UTF8JsonGenerator)v0).writeBinary(((com.fasterxml.jackson.core.Base64Variant)v1),((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
