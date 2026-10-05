package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = "FaFled to narrow content type ";
    Object v10 = "";
    Object v11 = java.io.File.createTempFile(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.File)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new java.util.TreeMap();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withAttributes(((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v11).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v12));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = java.nio.ByteBuffer.wrap(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readTree(((java.io.InputStream)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = "FaFled to narrow content type ";
    Object v8 = "";
    Object v9 = java.io.File.createTempFile(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.File)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((com.fasterxml.jackson.databind.JsonNode)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readTree(((java.lang.String)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = java.nio.ByteBuffer.wrap(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._detectBindAndCloseAsTree(((java.io.InputStream)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((byte[])v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((com.fasterxml.jackson.core.JsonParser)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._findTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v8 = new byte[]{};
    Object v9 = java.nio.ByteBuffer.wrap(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withAttribute(((java.lang.Object)v7),((java.lang.Object)v10));
    Object v12 = java.io.Reader.nullReader();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((java.io.Reader)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
    Object v8 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null};
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).nextFieldName();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer();
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._unwrapAndDeserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = new java.util.TreeMap();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v26),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v27),((java.util.Map)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v29).withoutAttribute(((java.lang.Object)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v25)._prefetchRootDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v29),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = java.io.Reader.nullReader();
    ((java.io.Reader)v10).close();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v9).readTree(((java.io.Reader)v10));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)-68),Byte.valueOf((byte)1)};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((byte[])v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = null;
    ((com.fasterxml.jackson.databind.ObjectReader)v18)._verifySchemaType(((com.fasterxml.jackson.core.FormatSchema)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._bindAsTree(((com.fasterxml.jackson.core.JsonParser)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = ")";
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withRootName(((java.lang.String)v7));
    Object v9 = new byte[]{};
    Object v10 = java.nio.ByteBuffer.wrap(((byte[])v9));
    Object v11 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v10));
    Object v12 = ((java.io.InputStream)v11).readAllBytes();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readTree(((java.io.InputStream)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = "";
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValues(((java.lang.String)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = new java.util.TreeMap();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v26),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v27),((java.util.Map)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v25)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v9).withType(((java.lang.Class)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).with(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    Object v12 = java.io.Reader.nullReader();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).readTree(((java.io.Reader)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = new java.util.TreeMap();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v26),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v27),((java.util.Map)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v25)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
    Object v32 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v30).without(((com.fasterxml.jackson.databind.DeserializationFeature)v31),((com.fasterxml.jackson.databind.DeserializationFeature[])v32));
    Object v34 = ")";
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v30).readValues(((java.lang.String)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = new byte[]{};
    Object v11 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v10));
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._initForReading(((com.fasterxml.jackson.core.JsonParser)v14));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v9).getConfig();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = new java.util.TreeMap();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).withAttributes(((java.util.Map)v10));
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v18).withView(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v21).getConfig();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._prefetchRootDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v22),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v9).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11));
    Object v13 = new byte[]{};
    Object v14 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._initForReading(((com.fasterxml.jackson.core.JsonParser)v17));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new byte[]{};
    Object v18 = java.nio.ByteBuffer.wrap(((byte[])v17));
    Object v19 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValues(((java.io.InputStream)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new byte[]{};
    Object v18 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v17));
    Object v19 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v21).readValueAs(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._bindAndReadValues(((com.fasterxml.jackson.core.JsonParser)v21),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectReader)v6).createObjectNode();
    Object v8 = new byte[]{};
    Object v9 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new java.util.TreeMap();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._bind(((com.fasterxml.jackson.core.JsonParser)v12),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = new java.util.TreeMap();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v26),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v27),((java.util.Map)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v25)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v32 = ((com.fasterxml.jackson.databind.ObjectReader)v30).without(((com.fasterxml.jackson.core.JsonParser.Feature)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = ((com.fasterxml.jackson.databind.ObjectReader)v30).withValueToUpdate(((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = java.io.Reader.nullReader();
    ((java.io.Reader)v9).close();
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.Reader)v9));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = java.nio.ByteBuffer.wrap(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.InputStream)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isInterface();
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).forType(((com.fasterxml.jackson.databind.JavaType)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)28)};
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = java.io.Reader.nullReader();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.Reader)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = 1;
    Object v9 = 2;
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0)};
    Object v8 = 0;
    Object v9 = -37;
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._detectBindAndClose(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._bind(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)1)};
    Object v8 = 7;
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY;
    Object v27 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null};
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v25).without(((com.fasterxml.jackson.databind.DeserializationFeature)v26),((com.fasterxml.jackson.databind.DeserializationFeature[])v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v7));
    Object v9 = new byte[]{};
    Object v10 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v9));
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._bindAndClose(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v9).withView(((java.lang.Class)v11));
    Object v13 = new byte[]{};
    Object v14 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    ((com.fasterxml.jackson.databind.ObjectReader)v9)._initForMultiRead(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = java.io.Reader.nullReader();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValues(((java.io.Reader)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = new java.util.TreeMap();
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v18).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    ((com.fasterxml.jackson.databind.DeserializationContext)v14).checkUnresolvedObjectId();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer();
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._unwrapAndDeserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new byte[]{};
    Object v15 = java.nio.ByteBuffer.wrap(((byte[])v14));
    Object v16 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v15));
    Object v17 = 1;
    Object v18 = ((java.io.InputStream)v16).readNBytes((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValues(((java.io.InputStream)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v19).withType(((java.lang.Class)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v8).getClassLoader();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).forType(((java.lang.Class)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v11 = 38;
    Object v12 = 0;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).readValue(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v7));
    Object v9 = new byte[]{};
    Object v10 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v9));
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = "} vs ";
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readTree(((java.lang.String)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new byte[]{};
    Object v15 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v14));
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v17));
    ((com.fasterxml.jackson.databind.ObjectReader)v13)._initForMultiRead(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v19).getFactory();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    Object v20 = null;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._detectBindAndClose(((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match)v20),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)1)};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((byte[])v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectReader[]{null};
    Object v8 = new com.fasterxml.jackson.databind.deser.DataFormatReaders(((com.fasterxml.jackson.databind.ObjectReader[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withFormatDetection(((com.fasterxml.jackson.databind.deser.DataFormatReaders)v8));
    Object v10 = ")";
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValues(((java.lang.String)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new byte[]{};
    Object v19 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v18));
    Object v20 = ((com.fasterxml.jackson.core.TreeNode)v19).traverse();
    ((com.fasterxml.jackson.databind.ObjectReader)v13).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.core.TreeNode)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)-38),Byte.valueOf((byte)2)};
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).readValue(((byte[])v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.databind.DeserializationConfig)v18));
    Object v20 = new byte[]{};
    Object v21 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v20));
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v24).getValueAsString();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.core.type.ResolvedType)v26).isThrowable();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readValues(((com.fasterxml.jackson.core.JsonParser)v24),((com.fasterxml.jackson.core.type.ResolvedType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = com.fasterxml.jackson.databind.MapperFeature.USE_STATIC_TYPING;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v14));
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = new java.util.TreeMap();
    Object v21 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((java.util.Map)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v17),((com.fasterxml.jackson.databind.DeserializationConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = new java.util.TreeMap();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((java.util.Map)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v24),((com.fasterxml.jackson.databind.DeserializationConfig)v28));
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v29).getAttributes();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v32 = ((com.fasterxml.jackson.databind.ObjectReader)v22)._new(((com.fasterxml.jackson.databind.ObjectReader)v29),((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new java.util.TreeMap();
    Object v34 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v32).with(((com.fasterxml.jackson.databind.InjectableValues)v34));
    Object v36 = ((com.fasterxml.jackson.databind.ObjectReader)v35).getFactory();
    Object v37 = ((com.fasterxml.jackson.core.JsonFactory)v36).getFormatName();
    Object v38 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.core.JsonFactory)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectReader[]{null};
    Object v8 = new com.fasterxml.jackson.databind.deser.DataFormatReaders(((com.fasterxml.jackson.databind.ObjectReader[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withFormatDetection(((com.fasterxml.jackson.databind.deser.DataFormatReaders)v8));
    Object v10 = new byte[]{};
    Object v11 = java.nio.ByteBuffer.wrap(((byte[])v10));
    Object v12 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v11));
    Object v13 = 0L;
    Object v14 = ((java.io.InputStream)v12).skip((((java.lang.Long)v13).longValue()));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readTree(((java.io.InputStream)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = ")";
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectReader)v6).createArrayNode();
    Object v8 = new byte[]{};
    Object v9 = java.nio.ByteBuffer.wrap(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.InputStream)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = "FaFled to narrow content type ";
    Object v15 = "";
    Object v16 = java.io.File.createTempFile(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValues(((java.io.File)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = "' (type ";
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readTree(((java.lang.String)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = new byte[]{};
    Object v20 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).getCurrentLocation();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = new java.util.TreeMap();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((java.util.Map)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v18).createDeserializationContext(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationConfig)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = true;
    Object v11 = ")r";
    Object v12 = 0;
    Object v13 = ")";
    Object v14 = new com.fasterxml.jackson.databind.PropertyMetadata(((java.lang.Boolean)v10),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v9).withAttribute(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = "FaFled to narrow content type ";
    Object v18 = "";
    Object v19 = java.io.File.createTempFile(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._inputStream(((java.io.File)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = true;
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    ((com.fasterxml.jackson.databind.ObjectReader)v14).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v18),((java.lang.Object)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = new java.util.TreeMap();
    Object v19 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((java.util.Map)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v15),((com.fasterxml.jackson.databind.DeserializationConfig)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v20).getAttributes();
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._new(((com.fasterxml.jackson.databind.ObjectReader)v20),((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new java.util.TreeMap();
    Object v25 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v23).with(((com.fasterxml.jackson.databind.InjectableValues)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v26).getFactory();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.core.JsonFactory)v27));
    Object v29 = java.io.Reader.nullReader();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.io.Reader)v29));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).withView(((java.lang.Class)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = "FaFled to narrow content type ";
    Object v16 = "";
    Object v17 = java.io.File.createTempFile(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "FaFled to narrow content type ";
    Object v19 = "";
    Object v20 = java.io.File.createTempFile(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((java.io.File)v17).compareTo(((java.io.File)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readValue(((java.io.File)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new byte[]{};
    Object v15 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonNode)v15).isMissingNode();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readValue(((com.fasterxml.jackson.databind.JsonNode)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = "FaFled to narrow content type ";
    Object v16 = "";
    Object v17 = java.io.File.createTempFile(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readValues(((java.io.File)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonNode)v8).deepCopy();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((com.fasterxml.jackson.databind.JsonNode)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withType(((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    ((com.fasterxml.jackson.databind.ObjectReader)v14)._reportUndetectableSource(((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = "STRING";
    Object v8 = ((com.fasterxml.jackson.databind.ObjectReader)v6).readValue(((java.lang.String)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).createObjectNode();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = new java.util.TreeMap();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((java.util.Map)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v16),((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v26 = new java.util.TreeMap();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v24),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v25),((java.util.Map)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v23),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getAttributes();
    Object v30 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v21)._new(((com.fasterxml.jackson.databind.ObjectReader)v28),((com.fasterxml.jackson.core.JsonFactory)v30));
    Object v32 = new java.util.TreeMap();
    Object v33 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ObjectReader)v31).with(((com.fasterxml.jackson.databind.InjectableValues)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v34).getFactory();
    Object v36 = ((com.fasterxml.jackson.databind.ObjectReader)v13).with(((com.fasterxml.jackson.core.JsonFactory)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    Object v20 = new byte[]{};
    Object v21 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v20));
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = "Failed to narrow content type ";
    Object v26 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._bindAndClose(((com.fasterxml.jackson.core.JsonParser)v24),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._findTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = java.io.Reader.nullReader();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).readTree(((java.io.Reader)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = new java.util.TreeMap();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v9)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new byte[]{};
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readValue(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.core.type.ResolvedType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    Object v20 = "boole";
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v19).readTree(((java.lang.String)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = new byte[]{};
    Object v20 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v19));
    Object v21 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).nextTextValue();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v18)._bindAndClose(((com.fasterxml.jackson.core.JsonParser)v23),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).withView(((java.lang.Class)v18));
    Object v20 = new byte[]{};
    Object v21 = java.nio.ByteBuffer.wrap(((byte[])v20));
    Object v22 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValues(((java.io.InputStream)v22));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new java.util.TreeMap();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((java.util.Map)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.databind.DeserializationConfig)v17));
    Object v19 = new byte[]{};
    Object v20 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v18).readValue(((com.fasterxml.jackson.databind.JsonNode)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = new java.util.TreeMap();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v18),((com.fasterxml.jackson.databind.DeserializationConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._new(((com.fasterxml.jackson.databind.ObjectReader)v23),((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v25).withFeatures(((com.fasterxml.jackson.databind.DeserializationFeature[])v26));
    Object v28 = new byte[]{};
    Object v29 = java.nio.ByteBuffer.wrap(((byte[])v28));
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v25).withValueToUpdate(((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v6).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v9).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v9).without(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new java.util.TreeMap();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v13).withAttributes(((java.util.Map)v14));
    Object v16 = new byte[]{};
    Object v17 = java.nio.ByteBuffer.wrap(((byte[])v16));
    Object v18 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v13)._detectBindAndCloseAsTree(((java.io.InputStream)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = new java.util.TreeMap();
    Object v5 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((java.util.Map)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v1),((com.fasterxml.jackson.databind.DeserializationConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v8),((com.fasterxml.jackson.databind.DeserializationConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v13).getAttributes();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v6)._new(((com.fasterxml.jackson.databind.ObjectReader)v13),((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.InjectableValues)v18));
    Object v20 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null,null};
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v19).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
