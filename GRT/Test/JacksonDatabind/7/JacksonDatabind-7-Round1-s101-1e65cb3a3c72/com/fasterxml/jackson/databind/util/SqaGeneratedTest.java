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
    Object v10 = 1.0D;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber((((java.lang.Double)v10).doubleValue()));
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
    Object v7 = "string";
    Object v8 = "(";
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeStringField(((java.lang.String)v7),((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
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
    org.junit.Assert.assertNotNull(v9);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeNumber((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
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
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
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
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeBinary(((byte[])v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: ]"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v12),((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonGenerator)v18).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v21).writeFieldName(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v25 = ((java.lang.Enum)v24).getDeclaringClass();
    Object v26 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v21).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v24));
    Object v27 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
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
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = false;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v10),((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).hasCurrentToken();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
    Object v10 = "local/";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeNumber(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v12),((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonGenerator)v18).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v21).writeFieldName(((java.lang.String)v22));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v25 = ((java.lang.Enum)v24).getDeclaringClass();
    Object v26 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v21).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v24));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).serialize(((com.fasterxml.jackson.core.JsonGenerator)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
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
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeEndObject();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v15 = ")";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeString(((java.lang.String)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
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
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v15 = -2.718532222660201D;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeNumber((((java.lang.Double)v15).doubleValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v8 = 1;
    Object v9 = 15;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeUTF8String(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).writeEndObject();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
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
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeEndObject();
    Object v15 = null;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeEndObject();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
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
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v9).canUseSchema(((com.fasterxml.jackson.core.FormatSchema)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
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
    Object v10 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)12)};
    Object v11 = 5;
    Object v12 = -17;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeRawUTF8String(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
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
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = false;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v10),((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).writeTypeId(((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.core.JsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).serialize(((com.fasterxml.jackson.core.JsonGenerator)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
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
    Object v7 = ")";
    Object v8 = -34.001106F;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeNumberField(((java.lang.String)v7),(((java.lang.Float)v8).floatValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v8 = 47;
    Object v9 = -13;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeRawUTF8String(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v12),((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "`";
    Object v4 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBooleanField(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = false;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v7),((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._appendRaw((((java.lang.Integer)v6).intValue()),((java.lang.Object)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).writeRaw((((java.lang.Character)v12).charValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
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
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = false;
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v10),((com.fasterxml.jackson.core.ObjectCodec)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v18).getArrayBuilders();
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
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
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeNumber((((java.lang.Short)v3).shortValue()));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).firstToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v11).canOmitFields();
    org.junit.Assert.assertEquals((Object)(true), v12);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v12),((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonGenerator)v18).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v21));
    org.junit.Assert.assertNotNull(v22);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).writeNumber((((java.lang.Short)v18).shortValue()));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).firstToken();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14)._append(((com.fasterxml.jackson.core.JsonToken)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeEndArray();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = ")";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeFieldName(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v6 = new com.fasterxml.jackson.core.JsonFactory();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = false;
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v5),((com.fasterxml.jackson.core.ObjectCodec)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.core.JsonFactory();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v18).writeNumber((((java.lang.Short)v19).shortValue()));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v18).firstToken();
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).mappingException(((java.lang.Class)v15),((com.fasterxml.jackson.core.JsonToken)v21));
    Object v23 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
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
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v15 = "USE_BIG_DECIMAL_FOR_FLOATS";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeString(((java.lang.String)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v18 = new com.fasterxml.jackson.core.JsonFactory();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = false;
    Object v21 = false;
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v17),((com.fasterxml.jackson.core.ObjectCodec)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeStartArray();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = -37;
    Object v5 = 0;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeRaw(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeObject(((java.lang.Object)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).canWriteTypeId();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeStartArray((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.core.JsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).asParser(((com.fasterxml.jackson.core.ObjectCodec)v15));
    org.junit.Assert.assertNotNull(v16);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v16 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).firstToken();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = ")Y";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeString(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).close();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
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
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v9).getHighestEscapedChar();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)7)};
    Object v4 = 0;
    Object v5 = -24;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinary(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).asParser();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v6).canOmitFields();
    org.junit.Assert.assertEquals((Object)(true), v7);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.core.JsonFactory();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeNumber((((java.lang.Short)v15).shortValue()));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).firstToken();
    Object v18 = ((java.lang.Enum)v17).hashCode();
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11)._append(((com.fasterxml.jackson.core.JsonToken)v17),((java.lang.Object)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).close();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v5));
    Object v8 = java.util.Map.of();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeObject(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
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
    Object v10 = "string";
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeObjectField(((java.lang.String)v10),((java.lang.Object)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
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
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeStartObject();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "No content to map due to end-of-inpu";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeFieldName(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v13 = ((java.lang.Enum)v12).getDeclaringClass();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v12));
    Object v15 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeBoolean((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).writeNumber((((java.lang.Short)v6).shortValue()));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).firstToken();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._append(((com.fasterxml.jackson.core.JsonToken)v8),((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
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
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).asParser();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeObject(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
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
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = "s^tring";
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeObjectFieldStart(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "";
    Object v4 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)12)};
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBinaryField(((java.lang.String)v3),((byte[])v4));
    Object v5 = null;
    Object v6 = "]";
    Object v7 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v11).getOutputTarget();
    org.junit.Assert.assertNull(v12);
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
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = 0.0F;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).writeNumber((((java.lang.Float)v12).floatValue()));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = java.util.Map.of();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11)._appendRaw((((java.lang.Integer)v14).intValue()),((java.lang.Object)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ")";
    ((com.fasterxml.jackson.core.JsonGenerator)v11).writeObjectFieldStart(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeStartObject();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v5 = new com.fasterxml.jackson.core.JsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = false;
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v4),((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).toString();
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "Object id [%s] (for %s) at %s";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArrayFieldStart(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = "strin";
    Object v4 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v3));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeTree(((com.fasterxml.jackson.core.TreeNode)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
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
    Object v10 = new com.fasterxml.jackson.core.JsonFactory();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).asParser();
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getTextLength();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "strin";
    Object v7 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v6));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).writeTree(((com.fasterxml.jackson.core.TreeNode)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "strin";
    Object v7 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v6));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).writeTree(((com.fasterxml.jackson.core.TreeNode)v7));
    Object v8 = null;
    Object v9 = ")";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).writeString(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeNull();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = "]";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).writeString(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -77;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).setFeatureMask((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.core.JsonFactory();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).asParser();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.JsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber((((java.lang.Short)v7).shortValue()));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).firstToken();
    Object v10 = "V";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = true;
    Object v14 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),(((java.lang.Boolean)v13).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3)._append(((com.fasterxml.jackson.core.JsonToken)v9),((java.lang.Object)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeObject(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
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
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = false;
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v12),((com.fasterxml.jackson.core.ObjectCodec)v14),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonGenerator)v18).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v22).writeObject(((java.lang.Object)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ") decorated with @JsonCreator 6(for Enum type ";
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeBinaryField(((java.lang.String)v4),((byte[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = " properties (in JSON Array)";
    Object v4 = ",";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStringField(((java.lang.String)v3),((java.lang.String)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = false;
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v6),((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeObjectRef(((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonGenerationException");
    } catch (com.fasterxml.jackson.core.JsonGenerationException expected) { }
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
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.JsonFactory();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = Short.valueOf((short)-20);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).writeNumber((((java.lang.Short)v13).shortValue()));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v12).firstToken();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9)._append(((com.fasterxml.jackson.core.JsonToken)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeBoolean((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).close();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v5));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v9 = new com.fasterxml.jackson.core.JsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = false;
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v8),((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).close();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v5));
    Object v8 = "";
    Object v9 = ",";
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStringField(((java.lang.String)v8),((java.lang.String)v9));
    Object v10 = null;
    Object v11 = ")";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((java.lang.String)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeObject(((java.lang.Object)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
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
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).canWriteObjectId();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).writeEndArray();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.core.JsonFactory();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).asParser();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new com.fasterxml.jackson.core.JsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).asParser(((com.fasterxml.jackson.core.ObjectCodec)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
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
    Object v10 = "strin";
    Object v11 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v10));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeTree(((com.fasterxml.jackson.core.TreeNode)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory();
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(((com.fasterxml.jackson.databind.util.TokenBuffer.Segment)v0),((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = "ites";
    Object v8 = -50;
    Object v9 = -15;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeRaw(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeNumber((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new char[]{Character.valueOf((char)0)};
    Object v7 = 24;
    Object v8 = 46;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeString(((char[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v2).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeArrayFieldStart(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = false;
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "}";
    Object v5 = 0L;
    ((com.fasterxml.jackson.core.JsonGenerator)v3).writeNumberField(((java.lang.String)v4),(((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }
}
