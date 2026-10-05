package com.fasterxml.jackson.databind.node;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).currentNode();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 0.0D;
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsDouble((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsLong();
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getText();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getCurrentName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getValueAsDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getBinaryValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v9).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).clearCurrentToken();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getNumberValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).currentNumericNode();
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
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new byte[]{};
    Object v11 = "nll";
    ((com.fasterxml.jackson.core.JsonParser)v9).setRequestPayloadOnError(((byte[])v10),((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextFieldName();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).getFormatFeatures();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "[";
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsString(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getCurrentName();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).getValueAsString(((java.lang.String)v10));
    Object v12 = 26;
    Object v13 = new java.io.StringWriter((((java.lang.Integer)v12).intValue()));
    ((java.io.Writer)v13).flush();
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v9).releaseBuffered(((java.io.Writer)v13));
    org.junit.Assert.assertEquals((Object)(-1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getCurrentTokenId();
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextBooleanValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 1;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 27L;
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsLong((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(27L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).clearCurrentToken();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).getCurrentName();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    ((com.fasterxml.jackson.core.JsonParser)v9).setCurrentValue(((java.lang.Object)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).getCurrentValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).getFeatureMask();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = "org.apache.openjpa.ee.RegistryManagedRuntime";
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v8).overrideCurrentName(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getInputSource();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0L;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsLong((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).nextBooleanValue();
    Object v10 = -6L;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsLong((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(-6L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).getShortValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v8).isNaN();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).getValueAsDouble();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).requiresCustomCodec();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 0;
    Object v8 = -9;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).hasCurrentToken();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).readValueAsTree();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v8).currentNode();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = java.util.Comparator.naturalOrder();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getEnumConstants();
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v11).readValuesAs(((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v11).getIntValue();
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
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).requiresCustomCodec();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getCurrentToken();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getCodec();
    Object v8 = new byte[]{Byte.valueOf((byte)22)};
    Object v9 = "-";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((byte[])v8),((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).clearCurrentToken();
    Object v7 = null;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsBoolean((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsString(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).nextFieldName();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v10 = "overflow,W value cannot be represented as 16-bit value";
    ((com.fasterxml.jackson.core.JsonParser)v8).setRequestPayloadOnError(((byte[])v9),((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getTextOffset();
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).nextValue();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v8).getLongValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsInt((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).nextTextValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = -8;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).hasTokenId((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v9).nextToken();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).nextTextValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = java.util.Comparator.naturalOrder();
    Object v15 = new java.util.TreeMap(((java.util.Comparator)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13),((java.util.Map)v15));
    ((com.fasterxml.jackson.core.JsonParser)v11).setCurrentValue(((java.lang.Object)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).isExpectedStartArrayToken();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v11).readValueAs(((com.fasterxml.jackson.core.type.TypeReference)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).getCurrentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeMap(((java.util.Comparator)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),((java.util.Map)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).nextValue();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).hasToken(((com.fasterxml.jackson.core.JsonToken)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).canReadTypeId();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v6).getValueAsString();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 9.048224853259555D;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsDouble((((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertEquals((Object)(9.048224853259555D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v10).readValuesAs(((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v8).getIntValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = "Unexpected JSON values; expcted at most %d properties (in JSON Array)";
    ((com.fasterxml.jackson.core.JsonParser)v10).setRequestPayloadOnError(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsString();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).version();
    Object v12 = 0;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v10).getValueAsInt((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeMap(((java.util.Comparator)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),((java.util.Map)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).getTextOffset();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).nextValue();
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v8).hasToken(((com.fasterxml.jackson.core.JsonToken)v19));
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v8).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonParser)v6).setRequestPayloadOnError(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1.0D;
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v11).getValueAsDouble((((java.lang.Double)v12).doubleValue()));
    org.junit.Assert.assertEquals((Object)(1.0D), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    ((com.fasterxml.jackson.core.JsonParser)v8).finishToken();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).nextBooleanValue();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).close();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).nextFieldName();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = 26;
    Object v12 = new java.io.StringWriter((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v10).releaseBuffered(((java.io.Writer)v12));
    org.junit.Assert.assertEquals((Object)(-1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = 26L;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).nextLongValue((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(26L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsBoolean((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).nextToken();
    Object v10 = 0;
    Object v11 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).getValueAsInt((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.Comparator.naturalOrder();
    Object v12 = new java.util.TreeMap(((java.util.Comparator)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),((java.util.Map)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v15).skipChildren();
    Object v17 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v15).skipChildren();
    Object v18 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v17).nextValue();
    Object v19 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).hasToken(((com.fasterxml.jackson.core.JsonToken)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v12).currentTokenId();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).getNumberType();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getBooleanValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = ")";
    ((com.fasterxml.jackson.core.JsonParser)v10).setRequestPayloadOnError(((byte[])v11),((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getValueAsBoolean();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = "AnnotationIntrospector returned Class ";
    ((com.fasterxml.jackson.core.JsonParser)v8).setRequestPayloadOnError(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    ((com.fasterxml.jackson.core.JsonParser)v10).setRequestPayloadOnError(((java.lang.String)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v10).nextToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.START_OBJECT), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v12).getFloatValue();
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 1;
    Object v10 = ((com.fasterxml.jackson.core.base.ParserMinimalBase)v8).hasTokenId((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = "";
    ((com.fasterxml.jackson.core.JsonParser)v10).setRequestPayloadOnError(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v11));
    Object v13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v12).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = java.util.Comparator.naturalOrder();
    Object v3 = new java.util.TreeMap(((java.util.Comparator)v2));
    Object v4 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1),((java.util.Map)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v8 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v6).skipChildren();
    Object v9 = ((com.fasterxml.jackson.databind.node.TreeTraversingParser)v8).version();
    org.junit.Assert.assertNotNull(v9);
  }
}
