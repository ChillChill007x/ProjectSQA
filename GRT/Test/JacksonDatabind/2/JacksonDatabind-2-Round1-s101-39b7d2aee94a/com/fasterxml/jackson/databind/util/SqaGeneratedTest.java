package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1L;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber((((java.lang.Long)v10).longValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = 0.0D;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber((((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = ")";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeString(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v7),((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).serialize(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = "strin";
    Object v8 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v7));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeTree(((com.fasterxml.jackson.core.TreeNode)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeStartArray((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v7),((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).hasCurrentToken();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v7),((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v5 = new com.fasterxml.jackson.core.JsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = false;
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v4),((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v9));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).serialize(((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v5 = new com.fasterxml.jackson.core.JsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = false;
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v4),((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).readValueAsTree();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v5 = new com.fasterxml.jackson.core.JsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = false;
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v4),((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeEndArray();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).serialize(((com.fasterxml.jackson.core.JsonGenerator)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeEndObject();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "boOlean";
    Object v14 = "strin";
    Object v15 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v14));
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeObjectField(((java.lang.String)v13),((java.lang.Object)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = "";
    Object v7 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeNumberField(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).version();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = false;
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v6),((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = " bytes";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeFieldName(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: FIELD_NAME( bytes)]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ")";
    Object v14 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v12).writeBooleanField(((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    Object v16 = "strin";
    Object v17 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v16));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).writeTypeId(((java.lang.Object)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v5).getPrettyPrinter();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).firstToken();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v6).getHighestEscapedChar();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "";
    Object v10 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeBinaryField(((java.lang.String)v9),((byte[])v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._appendRaw((((java.lang.Integer)v7).intValue()),((java.lang.Object)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = false;
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v13),((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v20 = new com.fasterxml.jackson.core.JsonFactory();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v19).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v21));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).writeObject(((java.lang.Object)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeEndArray();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = Character.valueOf((char)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeRaw((((java.lang.Character)v10).charValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v7),((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).asParser(((com.fasterxml.jackson.core.JsonParser)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).firstToken();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = "overflow, value can not be represented as 16-bit value";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeString(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v9).getCharacterEscapes();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v8 = 0;
    Object v9 = 12;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeRaw(((char[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeBoolean((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = 1.0D;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeNumber((((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).getFeatureMask();
    org.junit.Assert.assertEquals((Object)(79), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "strin";
    Object v11 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v10));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeTree(((com.fasterxml.jackson.core.TreeNode)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = false;
    Object v24 = false;
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v20),((com.fasterxml.jackson.core.ObjectCodec)v22),(((java.lang.Boolean)v23).booleanValue()),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v19).asParser(((com.fasterxml.jackson.core.JsonParser)v25));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeNumberField(((java.lang.String)v7),(((java.lang.Float)v8).floatValue()));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._appendRaw((((java.lang.Integer)v10).intValue()),((java.lang.Object)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = 12;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: ]"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = "string";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeString(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5)._appendRaw((((java.lang.Integer)v6).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).getFeatureMask();
    org.junit.Assert.assertEquals((Object)(13), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "columnNZ";
    Object v10 = -28.582565F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v14 = ((java.lang.Enum)v13).getDeclaringClass();
    Object v15 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeStartArray((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v8).useDefaultPrettyPrinter();
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v8).getCharacterEscapes();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "columnNZ";
    Object v10 = -28.582565F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v14 = new com.fasterxml.jackson.core.JsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = 0;
    Object v19 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).setFeatureMask((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v19).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = "strin";
    Object v24 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v23));
    ((com.fasterxml.jackson.core.JsonGenerator)v22).writeObject(((java.lang.Object)v24));
    Object v25 = null;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v13).serialize(((com.fasterxml.jackson.core.JsonGenerator)v22));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).getOutputContext();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v7),((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v14).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.core.JsonGenerator)v14).getSchema();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8)._append(((com.fasterxml.jackson.core.JsonToken)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "columnNZ";
    Object v10 = -28.582565F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v13).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new byte[]{};
    Object v8 = 0;
    Object v9 = -19;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeBinary(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "Can not pass null resoXlver";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeNumber(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v12).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "columnNZ";
    Object v17 = -28.582565F;
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeNumberField(((java.lang.String)v16),(((java.lang.Float)v17).floatValue()));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v15).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3)._append(((com.fasterxml.jackson.core.JsonToken)v6),((java.lang.Object)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "columnNZ";
    Object v10 = -28.582565F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v13).useDefaultPrettyPrinter();
    Object v15 = false;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeBoolean((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "D";
    Object v11 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)1),Byte.valueOf((byte)16)};
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeBinaryField(((java.lang.String)v10),((byte[])v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).canWriteObjectId();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.JsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).serialize(((com.fasterxml.jackson.core.JsonGenerator)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v7));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeObject(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v8 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1)};
    Object v9 = new java.io.ByteArrayInputStream(((byte[])v8));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._append(((com.fasterxml.jackson.core.JsonToken)v7),((java.lang.Object)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).setFeatureMask((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.core.JsonGenerator)v12).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "";
    Object v17 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    ((com.fasterxml.jackson.core.JsonGenerator)v15).writeBinaryField(((java.lang.String)v16),((byte[])v17));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v15).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeObject(((java.lang.Object)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "Should not call set() on ObjectIdProperty that has no SettableBeanProperty";
    Object v8 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeNumberField(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeStartArray();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    Object v12 = 1;
    Object v13 = 0;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeRaw(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v3).useDefaultPrettyPrinter();
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)31)};
    Object v6 = 1;
    Object v7 = 31;
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeBinary(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "columnNZ";
    Object v10 = -28.582565F;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Float)v10).floatValue()));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v14 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = 0;
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v18).setFeatureMask((((java.lang.Integer)v19).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v13)._append(((com.fasterxml.jackson.core.JsonToken)v14),((java.lang.Object)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = "overflow, value can not be represented as 16-'bit value";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeRaw(((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.JsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).asParser(((com.fasterxml.jackson.core.ObjectCodec)v5));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeEndArray();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v9).version();
    Object v11 = -30;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v9).setHighestNonEscapedChar((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "2.2250738585072012e-308";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeFieldName(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v5 = ((java.lang.Enum)v4).hashCode();
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v5 = ((java.lang.Enum)v4).getDeclaringClass();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3)._append(((com.fasterxml.jackson.core.JsonToken)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).getFeatureMask();
    org.junit.Assert.assertEquals((Object)(79), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -23;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = false;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v10),((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeEndArray();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "Can not use FormatSchema of type ";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeString(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = false;
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v11),((com.fasterxml.jackson.core.ObjectCodec)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v16));
    Object v18 = new com.fasterxml.jackson.core.JsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = 1.0D;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v20).writeNumber((((java.lang.Double)v21).doubleValue()));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v20).getFeatureMask();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeObject(((java.lang.Object)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -23;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -23;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).getCodec();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeEndArray();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 7;
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeStartArray((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).close();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).asParser();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).writeEndObject();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -23;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).writeEndObject();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 13;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).asParser();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -23;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).firstToken();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7));
    Object v9 = " string";
    Object v10 = 42.919700446665686D;
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeNumberField(((java.lang.String)v9),(((java.lang.Double)v10).doubleValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }
}
