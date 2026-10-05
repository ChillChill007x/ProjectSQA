package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = 0;
    Object v4 = -1;
    ((com.fasterxml.jackson.core.JsonGenerator)v1).writeBinary(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
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
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v3 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).copyCurrentStructure(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v3 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._appendRaw((((java.lang.Integer)v7).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3));
    Object v5 = 30;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v4).setFeatureMask((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v11 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v10));
    ((com.fasterxml.jackson.core.ObjectCodec)v2).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.core.TreeNode)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).asParser(((com.fasterxml.jackson.core.ObjectCodec)v2));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = 30;
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v3).setFeatureMask((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v3).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = 30;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v11).setFeatureMask((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v11).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).serialize(((com.fasterxml.jackson.core.JsonGenerator)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeRawValue(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 0;
    ((com.fasterxml.jackson.core.JsonGenerator)v1).writeStartArray((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeOmittedField(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1)._appendRaw((((java.lang.Integer)v2).intValue()),((java.lang.Object)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeEndObject();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = 0;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeNumber((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeObject(((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).getBinaryValue();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonGenerator)v1).getOutputTarget();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "]";
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeOmittedField(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).useDefaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = 33.85708881275818D;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeNumberField(((java.lang.String)v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v6).getSchema();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).useDefaultPrettyPrinter();
    Object v9 = "string";
    Object v10 = 53;
    Object v11 = 10;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeRawValue(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = 1;
    Object v9 = 31;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v7).overrideFormatFeatures((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).firstToken();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).setCurrentValue(((java.lang.Object)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "]";
    Object v8 = 16;
    Object v9 = 1;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeRawValue(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ": value instantiator (";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeString(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v10 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = ((com.fasterxml.jackson.core.TreeNode)v10).traverse(((com.fasterxml.jackson.core.ObjectCodec)v11));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeTree(((com.fasterxml.jackson.core.TreeNode)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ")";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeString(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v10 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ":";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).mappingException(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).useDefaultPrettyPrinter();
    Object v9 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v10 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v9));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeTree(((com.fasterxml.jackson.core.TreeNode)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.core.JsonGenerator)v7).setCurrentValue(((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).isExpectedStartObjectToken();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).firstToken();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeObject(((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4)._reportUnsupportedOperation();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "g";
    Object v6 = ")B";
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeStringField(((java.lang.String)v5),((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).useDefaultPrettyPrinter();
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).canWriteTypeId();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6)._appendRaw((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 30;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v6).setFeatureMask((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v6).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).serialize(((com.fasterxml.jackson.core.JsonGenerator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = new byte[]{Byte.valueOf((byte)47)};
    Object v9 = java.nio.ByteBuffer.wrap(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v9));
    Object v11 = 1;
    Object v12 = ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBinary(((java.io.InputStream)v10),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeStartObject();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).writeBoolean((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v10 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v3 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v2));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).writeTree(((com.fasterxml.jackson.core.TreeNode)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.core.JsonGenerator)v4).getCurrentValue();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeEndArray();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "1";
    Object v6 = 0L;
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeNumberField(((java.lang.String)v5),(((java.lang.Long)v6).longValue()));
    Object v7 = null;
    Object v8 = ":";
    Object v9 = 1;
    Object v10 = 1;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeRaw(((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeBoolean((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = "T#ue";
    Object v11 = new byte[]{Byte.valueOf((byte)47)};
    Object v12 = java.nio.ByteBuffer.wrap(((byte[])v11));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeObjectField(((java.lang.String)v10),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = 1;
    Object v17 = 33;
    Object v18 = ((com.fasterxml.jackson.core.JsonGenerator)v15).overrideStdFeatures((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.core.JsonGenerator)v18).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = 30;
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v8).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v15 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v14));
    ((com.fasterxml.jackson.core.ObjectCodec)v6).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.core.TreeNode)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v5).asParser(((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v18 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).asParser(((com.fasterxml.jackson.core.JsonParser)v17));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeEndArray();
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v11).hasToken(((com.fasterxml.jackson.core.JsonToken)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).asParser(((com.fasterxml.jackson.core.JsonParser)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v11 = ((java.lang.Enum)v10).hashCode();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9)._append(((com.fasterxml.jackson.core.JsonToken)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 58L;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeNumber((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "strin";
    ((com.fasterxml.jackson.core.JsonGenerator)v1).writeNullField(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v5 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v4));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeTree(((com.fasterxml.jackson.core.TreeNode)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).forceUseOfBigDecimal((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 8;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).setHighestNonEscapedChar((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).forceUseOfBigDecimal((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeEndObject();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 8;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).setHighestNonEscapedChar((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9)._append(((com.fasterxml.jackson.core.JsonToken)v12),((java.lang.Object)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeStartObject();
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).canOmitFields();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)1)};
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeBinary(((byte[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).useDefaultPrettyPrinter();
    Object v9 = "";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).writeRaw(((java.lang.String)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).writeNull();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).forceUseOfBigDecimal((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).toString();
    org.junit.Assert.assertEquals((Object)("[TokenBuffer: ]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).forceUseOfBigDecimal((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ";)";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeRawValue(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeStartArray((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = 1;
    Object v12 = 33;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v13).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).forceUseOfBigDecimal((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4)._append(((com.fasterxml.jackson.core.JsonToken)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = 1;
    Object v7 = 33;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v5).overrideStdFeatures((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.core.JsonGenerator)v8).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v13 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v15).hasToken(((com.fasterxml.jackson.core.JsonToken)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v11).asParser(((com.fasterxml.jackson.core.JsonParser)v15));
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).copyCurrentEvent(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = new char[]{Character.valueOf((char)8),Character.valueOf((char)0)};
    Object v5 = 2;
    Object v6 = 19;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).writeRaw(((char[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v11 = 0;
    Object v12 = 3;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeRawUTF8String(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v5 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).asParser(((com.fasterxml.jackson.core.JsonParser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).forceUseOfBigDecimal((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = 30;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v11).setFeatureMask((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.core.JsonGenerator)v11).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v18 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v17));
    ((com.fasterxml.jackson.core.ObjectCodec)v9).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v16),((com.fasterxml.jackson.core.TreeNode)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).asParser(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v20),((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v7).writeBoolean((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = new byte[]{Byte.valueOf((byte)47)};
    Object v11 = java.nio.ByteBuffer.wrap(((byte[])v10));
    ((com.fasterxml.jackson.core.JsonGenerator)v7).setCurrentValue(((java.lang.Object)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.core.JsonGenerator)v9).version();
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    ((com.fasterxml.jackson.core.JsonGenerator)v9).writeObjectField(((java.lang.String)v11),((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = "integxer";
    Object v3 = 1L;
    ((com.fasterxml.jackson.core.JsonGenerator)v1).writeNumberField(((java.lang.String)v2),(((java.lang.Long)v3).longValue()));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).getOutputContext();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 17;
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v6).overrideStdFeatures((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = Short.valueOf((short)-19);
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeNumber((((java.lang.Short)v10).shortValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 8;
    Object v9 = ((com.fasterxml.jackson.core.JsonGenerator)v7).setHighestNonEscapedChar((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    Object v12 = true;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).writeBoolean((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "[map type; class ";
    Object v6 = "0123456789Mabcdef";
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeStringField(((java.lang.String)v5),((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).getCurrentValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).forceUseOfBigDecimal((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).version();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = -31;
    Object v3 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v3).firstToken();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v6 = ((java.lang.Enum)v5).hashCode();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).forceUseOfBigDecimal((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v10).canWriteTypeId();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "arr";
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).writeNumber(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v4).isClosed();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.core.JsonGenerator)v4).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
    Object v11 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v9).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 1;
    Object v3 = 33;
    Object v4 = ((com.fasterxml.jackson.core.JsonGenerator)v1).overrideStdFeatures((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "D";
    Object v6 = 0.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v4).writeNumberField(((java.lang.String)v5),(((java.lang.Float)v6).floatValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v1 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v7).useDefaultPrettyPrinter();
    Object v9 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v10 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)1)};
    Object v12 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = 30;
    Object v3 = ((com.fasterxml.jackson.core.JsonGenerator)v1).setFeatureMask((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.core.JsonGenerator)v1).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 1;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeStartArray((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = 1;
    Object v12 = 33;
    Object v13 = ((com.fasterxml.jackson.core.JsonGenerator)v10).overrideStdFeatures((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
    Object v15 = ((java.lang.Enum)v14).hashCode();
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.core.JsonGenerator)v13).configure(((com.fasterxml.jackson.core.JsonGenerator.Feature)v14),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v17).forceUseOfBigDecimal((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.databind.util.TokenBuffer)v6).append(((com.fasterxml.jackson.databind.util.TokenBuffer)v19));
    Object v21 = -5.926108F;
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v20).writeNumber((((java.lang.Float)v21).floatValue()));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.util.TokenBuffer)v20).writeObject(((java.lang.Object)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }
}
