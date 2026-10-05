package com.fasterxml.jackson.databind.node;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 32;
    Object v9 = -47;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextIntValue((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).hasToken(((com.fasterxml.jackson.core.JsonToken)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).getEmbeddedObject();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextLongValue((((java.lang.Long)v8).longValue()));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.Comparator.naturalOrder();
    Object v13 = new java.util.TreeMap(((java.util.Comparator)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),((java.util.Map)v13));
    ((com.fasterxml.jackson.core.JsonParser)v7).setCurrentValue(((java.lang.Object)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 41;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsInt((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).getText();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).clearCurrentToken();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "'";
    ((com.fasterxml.jackson.core.JsonParser)v7).setRequestPayloadOnError(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).currentToken();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextLongValue((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).getCurrentName();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).nextValue();
    Object v9 = new byte[]{Byte.valueOf((byte)-21)};
    Object v10 = "format";
    ((com.fasterxml.jackson.core.JsonParser)v7).setRequestPayloadOnError(((byte[])v9),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsBoolean((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).currentNode();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).clearCurrentToken();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).clearCurrentToken();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsString();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 6;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsInt((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(6), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).nextBooleanValue();
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).close();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartObjectToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = "X";
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).overrideCurrentName(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).readValueAs(((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    ((com.fasterxml.jackson.core.JsonParser)v9).setCurrentValue(((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = -50.11441951078256D;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsDouble((((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(-50.11441951078256D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "AnnotationIntrospector returned ";
    ((com.fasterxml.jackson.core.JsonParser)v7).setRequestPayloadOnError(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getFormatFeatures();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).skipChildren();
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).getBigIntegerValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = "type to register key deserializer for";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = "f+alse";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getCodec();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "Cannot find OUT type parameter for Converter of type ";
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsString(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).currentNumericNode();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "Failed to parse date";
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).overrideCurrentName(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).getCurrentName();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)67)};
    Object v13 = "";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((byte[])v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).currentName();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextBooleanValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).setFeatureMask((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v9).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).getEmbeddedObject();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.Comparator.naturalOrder();
    Object v13 = new java.util.TreeMap(((java.util.Comparator)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),((java.util.Map)v13));
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v19).nextToken();
    Object v21 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).isExpectedStartArrayToken();
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).getByteValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v7).getText();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).canParseAsync();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = "sctring";
    ((com.fasterxml.jackson.core.JsonParser)v10).setRequestPayloadOnError(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getBinaryValue();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 0L;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextLongValue((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).getEmbeddedObject();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ") as a Bea";
    ((com.fasterxml.jackson.core.JsonParser)v7).setRequestPayloadOnError(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBinaryValue();
    Object v12 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).skipChildren();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextTextValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextIntValue((((java.lang.Integer)v10).intValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)-47)};
    Object v13 = ", ";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((byte[])v12),((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsString();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = "propertQy";
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).overrideCurrentName(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextFieldName();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = 0.0D;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsDouble((((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBinaryValue();
    Object v12 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).skipChildren();
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v12).getText(((java.io.Writer)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 2.3933899285244147D;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsDouble((((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertEquals((Object)(2.3933899285244147D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsBoolean((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentToken();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 0.0D;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsDouble((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBinaryValue();
    Object v12 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).skipChildren();
    Object v13 = 48L;
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsLong((((java.lang.Long)v13).longValue()));
    org.junit.Assert.assertEquals((Object)(48L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.Comparator.naturalOrder();
    Object v13 = new java.util.TreeMap(((java.util.Comparator)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),((java.util.Map)v13));
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v17).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v18));
    Object v20 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v19).skipChildren();
    Object v21 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v20).nextToken();
    Object v22 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasToken(((com.fasterxml.jackson.core.JsonToken)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getValueAsInt();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).currentNumericNode();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).currentNode();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).hasTokenId((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    ((com.fasterxml.jackson.core.JsonParser)v10).setCurrentValue(((java.lang.Object)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getBinaryValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).nextFieldName();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).hasTextCharacters();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = 1;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextIntValue((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBinaryValue();
    Object v12 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).skipChildren();
    Object v13 = "no int/Int-argument constructor/fact";
    Object v14 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).getValueAsString(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)("no int/Int-argument constructor/fact"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v9).skipChildren();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBinaryValue();
    Object v12 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).skipChildren();
    Object v13 = ")]";
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v12).overrideCurrentName(((java.lang.String)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 96.60460588328853D;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsDouble((((java.lang.Double)v8).doubleValue()));
    Object v10 = -28;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v7).getValueAsInt((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(-28), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = "array";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getBinaryValue();
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).getText(((java.io.Writer)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
