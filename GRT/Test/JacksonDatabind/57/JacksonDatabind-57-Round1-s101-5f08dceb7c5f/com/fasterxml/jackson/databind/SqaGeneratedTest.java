package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v13 = ")";
    Object v14 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v11).reportUnknownProperty(((java.lang.Object)v12),((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = java.io.Reader.nullReader();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValues(((java.io.Reader)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._bind(((com.fasterxml.jackson.core.JsonParser)v14),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((java.io.InputStream)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._detectBindAndCloseAsTree(((java.io.InputStream)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((com.fasterxml.jackson.databind.JsonNode)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withFeatures(((com.fasterxml.jackson.databind.DeserializationFeature[])v9));
    Object v11 = new byte[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((byte[])v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = java.io.Reader.nullReader();
    Object v10 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = ((java.io.Reader)v9).read(((char[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((java.io.Reader)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)-29),Byte.valueOf((byte)0)};
    Object v10 = 0;
    Object v11 = -25;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = java.io.Reader.nullReader();
    Object v16 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = ((java.io.Reader)v15).read(((char[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValues(((java.io.Reader)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).nextValue();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._initForReading(((com.fasterxml.jackson.core.JsonParser)v14));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withAttributes(((java.util.Map)v19));
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((com.fasterxml.jackson.databind.JsonNode)v22));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)81)};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((byte[])v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withValueToUpdate(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._bindAndReadValues(((com.fasterxml.jackson.core.JsonParser)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.core.FormatFeature[]{null,null};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withoutFeatures(((com.fasterxml.jackson.core.FormatFeature[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = ":for format ";
    Object v10 = new java.io.File(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((java.io.File)v10));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = ":for format ";
    Object v10 = new java.io.File(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValues(((java.io.File)v10));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._bind(((com.fasterxml.jackson.core.JsonParser)v14),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectReader)v8).getConfig();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).nextValue();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.type.TypeReference)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)2)};
    Object v19 = 0;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17).readValue(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).nextToken();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._bindAndClose(((com.fasterxml.jackson.core.JsonParser)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._bindAsTree(((com.fasterxml.jackson.core.JsonParser)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 0;
    Object v10 = 1.0F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = new com.fasterxml.jackson.databind.deser.DataFormatReaders(((java.util.Collection)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withFormatDetection(((com.fasterxml.jackson.databind.deser.DataFormatReaders)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = "BOOLEAN";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._unwrapAndDeserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JsonDeserializer)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).without(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v21));
    ((com.fasterxml.jackson.databind.ObjectReader)v14)._initForMultiRead(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new byte[]{};
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._bindAndCloseAsTree(((com.fasterxml.jackson.core.JsonParser)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v8).forType(((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)-60)};
    Object v19 = -36;
    Object v20 = 0;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._detectBindAndClose(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION;
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v9));
    Object v11 = java.io.Reader.nullReader();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readTree(((java.io.Reader)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.core.JsonFactory)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectReader[]{null,null};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withFormatDetection(((com.fasterxml.jackson.databind.ObjectReader[])v9));
    Object v11 = ":for format ";
    Object v12 = new java.io.File(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValue(((java.io.File)v12));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "AnnotationIntrospector returned Class ";
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withRootName(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "_";
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValues(((java.lang.String)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new byte[]{};
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17).readValue(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v16 = new java.io.ByteArrayInputStream(((byte[])v15));
    Object v17 = 1L;
    Object v18 = ((java.io.InputStream)v16).skip((((java.lang.Long)v17).longValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readTree(((java.io.InputStream)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v14).createArrayNode();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v17 = new java.io.ByteArrayInputStream(((byte[])v16));
    Object v18 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)-64),Byte.valueOf((byte)0)};
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = ((java.io.InputStream)v17).read(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((java.io.InputStream)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v23 = new java.io.ByteArrayInputStream(((byte[])v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v21).readTree(((java.io.InputStream)v23));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = "BOOLEAN";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v8).forType(((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v17).with(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = false;
    Object v28 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._considerFilter(((com.fasterxml.jackson.core.JsonParser)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v23).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._bindAndClose(((com.fasterxml.jackson.core.JsonParser)v23));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = java.io.Reader.nullReader();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((java.io.Reader)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v17).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v19));
    Object v21 = java.io.Reader.nullReader();
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v17).readValue(((java.io.Reader)v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isAbstract();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).forType(((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)15),Byte.valueOf((byte)-76)};
    Object v16 = 0;
    Object v17 = -29;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readValues(((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = java.io.Reader.nullReader();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).readTree(((java.io.Reader)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getValueAsString();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "BOOLEAN";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._unwrapAndDeserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JsonDeserializer)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS;
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v16));
    Object v18 = java.io.Reader.nullReader();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((java.io.Reader)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = "Trying to resolve a forward rference with id [";
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).at(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v16).with(((com.fasterxml.jackson.databind.DeserializationFeature)v17));
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._bindAsTree(((com.fasterxml.jackson.core.JsonParser)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = 1;
    Object v16 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = "BOOLEAN";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v14)._bind(((com.fasterxml.jackson.core.JsonParser)v20),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v21).withoutFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = null;
    Object v32 = ((com.fasterxml.jackson.databind.ObjectReader)v30)._inputStream(((java.net.URL)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v18 = new java.io.ByteArrayInputStream(((byte[])v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValue(((java.io.InputStream)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = "";
    Object v32 = ((com.fasterxml.jackson.databind.ObjectReader)v30).readValue(((java.lang.String)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.databind.ObjectReader[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFormatDetection(((com.fasterxml.jackson.databind.ObjectReader[])v18));
    Object v20 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v21 = 0;
    Object v22 = 17;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v17).readValues(((byte[])v20),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = ":for format ";
    Object v32 = new java.io.File(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v30)._inputStream(((java.io.File)v32));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = ":for format ";
    Object v32 = new java.io.File(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v30).readValues(((java.io.File)v32));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = null;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._detectBindAndClose(((com.fasterxml.jackson.databind.deser.DataFormatReaders.Match)v17),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = "";
    Object v32 = com.fasterxml.jackson.core.JsonPointer.valueOf(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v30).at(((com.fasterxml.jackson.core.JsonPointer)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v16).withoutFeatures(((com.fasterxml.jackson.databind.DeserializationFeature[])v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = true;
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._considerFilter(((com.fasterxml.jackson.core.JsonParser)v22),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = new byte[]{Byte.valueOf((byte)1)};
    Object v18 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValues(((byte[])v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = ".000";
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValue(((java.lang.String)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = "string";
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((java.lang.String)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v10 = new java.io.ByteArrayInputStream(((byte[])v9));
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = ((java.io.InputStream)v10).transferTo(((java.io.OutputStream)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readValues(((java.io.InputStream)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v21).withoutFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v22));
    Object v24 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)5)};
    Object v25 = 16;
    Object v26 = 8;
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v23)._detectBindAndClose(((byte[])v24),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = ((com.fasterxml.jackson.core.ObjectCodec)v8).getJsonFactory();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v21).withoutAttribute(((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = "BOOLEAN";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._prefetchRootDeserializer(((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v19 = 0;
    Object v20 = 17;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17).readValues(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = "BOOLEAN";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withType(((java.lang.reflect.Type)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "itemP";
    Object v10 = ((com.fasterxml.jackson.databind.ObjectReader)v8).readTree(((java.lang.String)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v16).createArrayNode();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new byte[]{Byte.valueOf((byte)-35),Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    Object v19 = 61;
    Object v20 = 20;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v17).readValue(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v20 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v18),((com.fasterxml.jackson.databind.util.RootNameLookup)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v15).with(((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    Object v22 = ":for format ";
    Object v23 = new java.io.File(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValues(((java.io.File)v23));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = "BOOLEAN";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = "BOOLEAN";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v23));
    Object v25 = java.util.Map.of(((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v18),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v24));
    Object v26 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v14).with(((com.fasterxml.jackson.databind.InjectableValues)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = "BOOLEAN";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectReader)v17)._prefetchRootDeserializer(((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v19),((com.fasterxml.jackson.databind.DeserializationConfig)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectReader)v25).getConfig();
    Object v27 = ((com.fasterxml.jackson.databind.ObjectReader)v16)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = "BOOLEAN";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectReader)v8).withView(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.core.JsonFactory)v14));
    Object v16 = java.io.Reader.nullReader();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v15).readValue(((java.io.Reader)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v21));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v23),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v24),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v22),((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v28).getConfig();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectReader)v19)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v29));
    Object v31 = 1;
    Object v32 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v31).intValue()));
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v34 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v33));
    Object v35 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32),((com.fasterxml.jackson.core.ObjectCodec)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ObjectReader)v30)._bindAndReadValues(((com.fasterxml.jackson.core.JsonParser)v36));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v16).getAttributes();
    Object v18 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v19 = new java.io.ByteArrayInputStream(((byte[])v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValue(((java.io.InputStream)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = "i";
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withRootName(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v21).withoutFeatures(((com.fasterxml.jackson.core.JsonParser.Feature[])v22));
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v24).intValue()));
    Object v26 = "BOOLEAN";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectReader)v23).treeToValue(((com.fasterxml.jackson.core.TreeNode)v25),((java.lang.Class)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).withoutAttribute(((java.lang.Object)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.node.IntNode((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValue(((com.fasterxml.jackson.databind.JsonNode)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectReader)v14).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v19),((com.fasterxml.jackson.databind.DeserializationConfig)v24));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v30 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v26),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v27),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v28),((com.fasterxml.jackson.databind.util.RootNameLookup)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectReader)v25)._with(((com.fasterxml.jackson.databind.DeserializationConfig)v30));
    Object v32 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v33 = ((com.fasterxml.jackson.databind.ObjectReader)v31).withoutAttribute(((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ObjectReader)v33).createArrayNode();
    Object v35 = ((com.fasterxml.jackson.databind.ObjectReader)v16).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v34));
    Object v36 = java.io.Reader.nullReader();
    Object v37 = ((com.fasterxml.jackson.databind.ObjectReader)v16).readValues(((java.io.Reader)v36));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = "BOOLEAN";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = "BOOLEAN";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = java.util.Map.of(((java.lang.Object)v9),((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.InjectableValues.Std(((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.InjectableValues)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectReader)v21).withoutAttribute(((java.lang.Object)v22));
    Object v24 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v25 = ((com.fasterxml.jackson.databind.ObjectReader)v23).withoutFeatures(((com.fasterxml.jackson.databind.DeserializationFeature[])v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = new com.fasterxml.jackson.databind.ObjectReader(((com.fasterxml.jackson.databind.ObjectMapper)v2),((com.fasterxml.jackson.databind.DeserializationConfig)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectReader)v8).with(((com.fasterxml.jackson.databind.DeserializationConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v16 = ((java.lang.Enum)v15).getDeclaringClass();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectReader)v8).without(((com.fasterxml.jackson.databind.DeserializationFeature)v15));
    Object v18 = ":";
    Object v19 = ((com.fasterxml.jackson.databind.ObjectReader)v17).withRootName(((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }
}
