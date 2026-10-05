package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeEndObject();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: ]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = false;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeBoolean((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).getCurrentValue();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).firstToken();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonGenerator)v1).getCurrentValue();
    Object v3 = new char[]{Character.valueOf((char)0)};
    Object v4 = -27;
    Object v5 = -22;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeString(((char[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).toString();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeObjectId(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v3));
    Object v5 = 1;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).writeBinary(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeStartArray();
    Object v2 = null;
    Object v3 = 1;
    Object v4 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeObject(((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).canWriteObjectId();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getValueAsString();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    Object v5 = "not a valid represe5tation";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeString(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeNull();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = 1.0F;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeNumber((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v7));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._append(((com.fasterxml.jackson.core.JsonToken)v5),((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ")J";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeFieldName(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeBoolean((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).setCurrentValue(((java.lang.Object)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: ]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeEndObject();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "properties";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeString(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).getOutputContext();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "Can not update Map.Entry values";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeNumber(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v6 = false;
    Object v7 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v6).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._appendValue(((com.fasterxml.jackson.core.JsonToken)v5),((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).getCodec();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeTree(((com.fasterxml.jackson.core.TreeNode)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeEndObject();
    Object v3 = null;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeEndArray();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonGenerator)v1).getPrettyPrinter();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeBoolean((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1)._appendValue(((com.fasterxml.jackson.core.JsonToken)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = ((com.fasterxml.jackson.core.ObjectCodec)v3).createArrayNode();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).serialize(((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    Object v5 = "items";
    Object v6 = -20;
    Object v7 = -10;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeRaw(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).canOmitFields();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = "No defaul constructor found";
    Object v9 = new byte[]{};
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBinaryField(((java.lang.String)v8),((byte[])v9));
    Object v10 = null;
    Object v11 = false;
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "boolean";
    Object v20 = new java.lang.Object[]{};
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v18).mappingException(((java.lang.String)v19),((java.lang.Object[])v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = "Failed to parse JSON String as XML: ";
    Object v9 = 0;
    Object v10 = 11;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeRawValue(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7)._append(((com.fasterxml.jackson.core.JsonToken)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = false;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v4).getCurrentValue();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._append(((com.fasterxml.jackson.core.JsonToken)v7),((java.lang.Object)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).firstToken();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).getCodec();
    Object v10 = ((com.fasterxml.jackson.core.ObjectCodec)v9).createArrayNode();
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).asParser(((com.fasterxml.jackson.core.ObjectCodec)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeObjectField(((java.lang.String)v5),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = ((com.fasterxml.jackson.core.ObjectCodec)v7).createArrayNode();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v9));
    Object v11 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._appendValue(((com.fasterxml.jackson.core.JsonToken)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = ")";
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeArrayFieldStart(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeStartObject();
    Object v3 = null;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v2).canOmitFields();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber((((java.lang.Short)v7).shortValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -12;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v6).setHighestNonEscapedChar((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = 0;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeNumber((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "'";
    Object v4 = 27;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = new byte[]{Byte.valueOf((byte)23),Byte.valueOf((byte)9)};
    Object v4 = 40;
    Object v5 = 1;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeUTF8String(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeEndObject();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = "GMT";
    Object v9 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBinaryField(((java.lang.String)v8),((byte[])v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = false;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v4));
    Object v6 = ")";
    Object v7 = ((com.fasterxml.jackson.core.TreeNode)v5).get(((java.lang.String)v6));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeTree(((com.fasterxml.jackson.core.TreeNode)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = 0;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7)._appendRaw((((java.lang.Integer)v8).intValue()),((java.lang.Object)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._appendValue(((com.fasterxml.jackson.core.JsonToken)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "i";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeString(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v4).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).getCodec();
    Object v13 = ((com.fasterxml.jackson.core.ObjectCodec)v12).createArrayNode();
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).asParser(((com.fasterxml.jackson.core.ObjectCodec)v12));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = 1.0F;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeNumber((((java.lang.Float)v8).floatValue()));
    Object v9 = null;
    Object v10 = 0L;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeNumber((((java.lang.Long)v10).longValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = false;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeBoolean((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v2).getCharacterEscapes();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeStartObject();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeNumber((((java.lang.Short)v8).shortValue()));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).firstToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.FIELD_NAME), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = -19;
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._appendRaw((((java.lang.Integer)v3).intValue()),((java.lang.Object)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).asParser(((com.fasterxml.jackson.core.JsonParser)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = ((com.fasterxml.jackson.core.ObjectCodec)v8).createArrayNode();
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v11 = "string";
    Object v12 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v10).writeNumberField(((java.lang.String)v11),(((java.lang.Float)v12).floatValue()));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v15 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14));
    Object v16 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v15).writeNumber((((java.lang.Short)v16).shortValue()));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v15).firstToken();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = ((com.fasterxml.jackson.core.ObjectCodec)v19).createArrayNode();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v22 = "string";
    Object v23 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v21).writeNumberField(((java.lang.String)v22),(((java.lang.Float)v23).floatValue()));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v26 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v21).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v25));
    Object v27 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v26).writeNumber((((java.lang.Short)v27).shortValue()));
    Object v28 = null;
    Object v29 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v26).firstToken();
    Object v30 = ((java.lang.Enum)v18).compareTo(((java.lang.Enum)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7)._append(((com.fasterxml.jackson.core.JsonToken)v18),((java.lang.Object)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v7).getCharacterEscapes();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = "JSON Creator returned null";
    Object v12 = 5;
    Object v13 = 2;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeRawValue(((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ", can not serialize";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNumber(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = ((com.fasterxml.jackson.core.ObjectCodec)v3).createArrayNode();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v6 = "string";
    Object v7 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeNumberField(((java.lang.String)v6),(((java.lang.Float)v7).floatValue()));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeNumber((((java.lang.Short)v11).shortValue()));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).firstToken();
    Object v14 = ((java.lang.Enum)v13).getDeclaringClass();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2)._append(((com.fasterxml.jackson.core.JsonToken)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = ((com.fasterxml.jackson.core.ObjectCodec)v7).createArrayNode();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v10 = "string";
    Object v11 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeNumberField(((java.lang.String)v10),(((java.lang.Float)v11).floatValue()));
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    Object v15 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeNumber((((java.lang.Short)v15).shortValue()));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).firstToken();
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._appendValue(((com.fasterxml.jackson.core.JsonToken)v17),((java.lang.Object)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = false;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).firstToken();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.FIELD_NAME), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = ((com.fasterxml.jackson.core.ObjectCodec)v11).createArrayNode();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = false;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v4).getCurrentValue();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = 23;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeNumber((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeEndArray();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).setCurrentValue(((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v3).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).asParser(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = ((com.fasterxml.jackson.core.ObjectCodec)v11).createArrayNode();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v13));
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v15).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeObject(((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = ((com.fasterxml.jackson.core.ObjectCodec)v11).createArrayNode();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v18 = ((com.fasterxml.jackson.core.JsonGenerator)v16).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.core.JsonGenerator)v16).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = -12;
    Object v23 = ((com.fasterxml.jackson.core.JsonGenerator)v21).setHighestNonEscapedChar((((java.lang.Integer)v22).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeObject(((java.lang.Object)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = ((com.fasterxml.jackson.core.ObjectCodec)v2).createArrayNode();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v5 = "string";
    Object v6 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeNumberField(((java.lang.String)v5),(((java.lang.Float)v6).floatValue()));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v8));
    Object v10 = Short.valueOf((short)1);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeNumber((((java.lang.Short)v10).shortValue()));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).firstToken();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1)._appendValue(((com.fasterxml.jackson.core.JsonToken)v12),((java.lang.Object)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).close();
    Object v11 = null;
    Object v12 = 41L;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeNumber((((java.lang.Long)v12).longValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v6).getCurrentValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).writeEndArray();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).getCodec();
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v4).getOutputBuffered();
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = ((com.fasterxml.jackson.core.ObjectCodec)v11).createArrayNode();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v13));
    Object v15 = 1;
    Object v16 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v15).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v14).writeTypeId(((java.lang.Object)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "0123456789Mabcdef";
    Object v4 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeBooleanField(((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v14 = ((com.fasterxml.jackson.core.JsonGenerator)v12).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    Object v15 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v12).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).asParser(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).getParsingContext();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v23));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).asParser();
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = "string";
    Object v4 = 5.624249F;
    ((com.fasterxml.jackson.core.JsonGenerator)v2).writeNumberField(((java.lang.String)v3),(((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: FIELD_NAME(string), VALUE_NUMBER_FLOAT]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = ((com.fasterxml.jackson.core.ObjectCodec)v0).createArrayNode();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v3 = Character.valueOf((char)0);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v2).writeRaw((((java.lang.Character)v3).charValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = ((com.fasterxml.jackson.core.TreeNode)v9).fieldNames();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeTree(((com.fasterxml.jackson.core.TreeNode)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v3));
    Object v5 = " (need to add/enable type information?)";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeString(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = -12;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v6).setHighestNonEscapedChar((((java.lang.Integer)v7).intValue()));
    Object v9 = "";
    Object v10 = new byte[]{Byte.valueOf((byte)-29)};
    ((com.fasterxml.jackson.core.JsonGenerator)v8).writeBinaryField(((java.lang.String)v9),((byte[])v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }
}
