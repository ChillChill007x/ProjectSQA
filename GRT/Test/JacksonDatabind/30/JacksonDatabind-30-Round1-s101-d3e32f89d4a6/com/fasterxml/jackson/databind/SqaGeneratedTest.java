package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new java.lang.Object[]{null};
    Object v8 = new com.fasterxml.jackson.databind.util.ArrayIterator(((java.lang.Object[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).setPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v7));
    Object v9 = new java.lang.Object[]{null};
    Object v10 = new com.fasterxml.jackson.databind.util.ArrayIterator(((java.lang.Object[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.ObjectMapper)v6).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v17),((java.lang.Object)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).writeValueAsBytes(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.Module[]{null,null,null};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((com.fasterxml.jackson.databind.Module[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).createObjectNode();
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((java.io.InputStream)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).getFactory();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).writer(((com.fasterxml.jackson.core.PrettyPrinter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = 1.0F;
    Object v12 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v11).floatValue()));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v15),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v18));
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).readTree(((com.fasterxml.jackson.core.JsonParser)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v10).narrowBy(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).writerFor(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = 1.0F;
    Object v12 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v11).floatValue()));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v15),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v18));
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v20).getDoubleValue();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ObjectMapper)v10)._readMapAndClose(((com.fasterxml.jackson.core.JsonParser)v20),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).isInterface();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._readMapAndClose(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    org.junit.Assert.assertEquals((Object)(1.0D), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).setFilterProvider(((com.fasterxml.jackson.databind.ser.FilterProvider)v7));
    Object v9 = "Z";
    Object v10 = new java.io.StringReader(((java.lang.String)v9));
    Object v11 = java.io.Writer.nullWriter();
    Object v12 = ((java.io.Reader)v10).transferTo(((java.io.Writer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((java.io.Reader)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = "); serialization type ";
    Object v8 = "arra";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((java.io.File)v9));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).findAndRegisterModules();
    Object v8 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null};
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).defaultClassIntrospector();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicIntegerSerializer();
    Object v4 = "]";
    Object v5 = "{";
    Object v6 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = "]";
    Object v13 = "{";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20),((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = true;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v28).booleanValue()),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((com.fasterxml.jackson.databind.PropertyMetadata)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v3),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.io.InputStream.nullInputStream();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((java.io.InputStream)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._initForReading(((com.fasterxml.jackson.core.JsonParser)v16));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v12));
    ((com.fasterxml.jackson.databind.ObjectMapper)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new byte[]{};
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readValue(((byte[])v7),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).setSubtypeResolver(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11));
    Object v13 = 1.0F;
    Object v14 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v13).floatValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v17),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = 1.0F;
    Object v25 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v24).floatValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v10).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.core.TreeNode)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = false;
    ((java.lang.ClassLoader)v0).setDefaultAssertionStatus((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v10)._convert(((java.lang.Object)v11),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 1.0F;
    Object v16 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v15).floatValue()));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v19),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v24));
    Object v26 = 1.0F;
    Object v27 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v26).floatValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v14).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = 1.0F;
    Object v13 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v12).floatValue()));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    ((com.fasterxml.jackson.databind.ObjectMapper)v11).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v22),((java.lang.Object)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicIntegerSerializer();
    Object v4 = "]";
    Object v5 = "{";
    Object v6 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = "]";
    Object v13 = "{";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20),((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = true;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v28).booleanValue()),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((com.fasterxml.jackson.databind.PropertyMetadata)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v3),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v35));
    Object v37 = ((com.fasterxml.jackson.databind.ObjectMapper)v36).getVisibilityChecker();
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readValue(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.JavaType)v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = 1.0F;
    Object v10 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v13),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicIntegerSerializer();
    ((com.fasterxml.jackson.databind.ObjectMapper)v8).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v19),((java.lang.Object)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.core.JsonParser.Feature[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).writerWithType(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 1.0F;
    Object v16 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v15).floatValue()));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v18),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v19),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v22));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v24));
    Object v26 = 1.0F;
    Object v27 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v26).floatValue()));
    Object v28 = ((com.fasterxml.jackson.databind.JsonNode)v27).isNull();
    ((com.fasterxml.jackson.databind.ObjectMapper)v14).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicIntegerSerializer();
    Object v4 = "]";
    Object v5 = "{";
    Object v6 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = "]";
    Object v13 = "{";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20),((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = true;
    Object v29 = "number";
    Object v30 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v28).booleanValue()),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((com.fasterxml.jackson.databind.PropertyMetadata)v30));
    Object v32 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v3),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v35));
    Object v37 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v38 = ((com.fasterxml.jackson.databind.ObjectMapper)v36).writer(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicIntegerSerializer();
    ((com.fasterxml.jackson.databind.ObjectMapper)v15).writeValue(((java.io.OutputStream)v16),((java.lang.Object)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).writerWithType(((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    ((com.fasterxml.jackson.databind.ObjectMapper)v12)._checkInvalidCopy(((java.lang.Class)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).findMixInClassFor(((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).getTypeFactory();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = java.util.TimeZone.getDefault();
    Object v13 = ((java.util.TimeZone)v12).useDaylightTime();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).setTimeZone(((java.util.TimeZone)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    Object v12 = new com.fasterxml.jackson.databind.MapperFeature[]{null};
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).enable(((com.fasterxml.jackson.databind.MapperFeature[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    ((com.fasterxml.jackson.databind.ObjectMapper)v15).acceptJsonFormatVisitor(((java.lang.Class)v17),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v19));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v27 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v26));
    Object v28 = ((java.util.concurrent.atomic.AtomicReference)v27).toString();
    Object v29 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).canDeserialize(((com.fasterxml.jackson.databind.JavaType)v25),((java.util.concurrent.atomic.AtomicReference)v27));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).writer(((com.fasterxml.jackson.databind.ser.FilterProvider)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = 1.0F;
    Object v10 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v13),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v8)._initForReading(((com.fasterxml.jackson.core.JsonParser)v18));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).isAnnotation();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).addMixIn(((java.lang.Class)v12),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v14).setNodeFactory(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readValue(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.core.type.ResolvedType)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v19),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v12)._defaultPrettyPrinter();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).writerWithType(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v19 = new java.lang.Object[]{null};
    Object v20 = new com.fasterxml.jackson.databind.util.ArrayIterator(((java.lang.Object[])v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).convertValue(((java.lang.Object)v20),((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-6),Byte.valueOf((byte)1)};
    Object v2 = 40;
    Object v3 = 9;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getTypeName();
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v0).readValue(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).setMixIns(((java.util.Map)v7));
    Object v9 = "); serialization type ";
    Object v10 = "arra";
    Object v11 = new java.io.File(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).valueToTree(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 0;
    Object v8 = "&";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v7).intValue()),((java.util.Locale)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).writer(((java.text.DateFormat)v10));
    Object v12 = new byte[]{Byte.valueOf((byte)12)};
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((byte[])v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).setFilterProvider(((com.fasterxml.jackson.databind.ser.FilterProvider)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).writerWithType(((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v8));
    ((com.fasterxml.jackson.databind.ObjectMapper)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).convertValue(((java.lang.Object)v11),((java.lang.Class)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disableDefaultTyping();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v14).setNodeFactory(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.Module[]{null};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).registerModules(((com.fasterxml.jackson.databind.Module[])v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = null;
    Object v8 = "' (of type ";
    Object v9 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).valueToTree(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = "Z";
    Object v16 = new java.io.StringReader(((java.lang.String)v15));
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = ((java.io.Reader)v16).transferTo(((java.io.Writer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v14).readValue(((java.io.Reader)v16),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null};
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).isAnnotation();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).addMixIn(((java.lang.Class)v12),((java.lang.Class)v14));
    Object v17 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).setSerializationInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v19),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).getPropertyNamingStrategy();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)14)};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((byte[])v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).convertValue(((java.lang.Object)v3),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).getTypeFactory();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).getDeserializationConfig();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readTree(((java.net.URL)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 1.0F;
    Object v8 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v7).floatValue()));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readValue(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.core.type.ResolvedType)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v19),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null};
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
    Object v8 = 1.0F;
    Object v9 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v8).floatValue()));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v12),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
    Object v20 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    ((com.fasterxml.jackson.databind.ObjectMapper)v7)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v18),((java.lang.Object)v20),((java.lang.Class)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null};
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).disable(((com.fasterxml.jackson.core.JsonParser.Feature[])v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).configure(((com.fasterxml.jackson.databind.MapperFeature)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).isAnnotation();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).addMixIn(((java.lang.Class)v12),((java.lang.Class)v14));
    Object v17 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).setSerializationInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v19),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).writer();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "Z";
    Object v6 = new java.io.StringReader(((java.lang.String)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((java.io.Reader)v6).transferTo(((java.io.Writer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v4).readValue(((java.io.Reader)v6),((java.lang.Class)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    Object v13 = new byte[]{};
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readTree(((byte[])v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readerFor(((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).addMixIn(((java.lang.Class)v8),((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.SerializationFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v14).setNodeFactory(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.Module[]{null,null};
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).registerModules(((com.fasterxml.jackson.databind.Module[])v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).configure(((com.fasterxml.jackson.databind.MapperFeature)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null,null};
    Object v6 = ((com.fasterxml.jackson.databind.ObjectMapper)v4).enable(((com.fasterxml.jackson.core.JsonParser.Feature[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v10 = ((java.lang.Enum)v9).getDeclaringClass();
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v9),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v11));
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.io.InputStream.nullInputStream();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readTree(((java.io.InputStream)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).isAnnotation();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).addMixIn(((java.lang.Class)v12),((java.lang.Class)v14));
    Object v17 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).setSerializationInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v19),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = "); serialization type ";
    Object v24 = "arra";
    Object v25 = new java.io.File(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).readTree(((java.io.File)v25));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).configure(((com.fasterxml.jackson.databind.SerializationFeature)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v0));
    Object v2 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).configure(((com.fasterxml.jackson.databind.MapperFeature)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0F;
    Object v6 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v4)._initForReading(((com.fasterxml.jackson.core.JsonParser)v14));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = "); serialization type ";
    Object v8 = "arra";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readValue(((java.io.File)v9),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).isAnnotation();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).addMixIn(((java.lang.Class)v12),((java.lang.Class)v14));
    Object v17 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).setSerializationInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
    Object v20 = ((java.lang.Enum)v19).hashCode();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v19),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = 1.0F;
    Object v24 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v23).floatValue()));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v26 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v26),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v27),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v30));
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.databind.ObjectMapper)v22)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v33),((java.lang.Object)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
    Object v8 = new byte[]{};
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v7).readValue(((byte[])v8),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v9 = ((java.lang.Enum)v8).getDeclaringClass();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v7),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
    Object v13 = 1.0F;
    Object v14 = com.fasterxml.jackson.databind.node.FloatNode.valueOf((((java.lang.Float)v13).floatValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).treeToValue(((com.fasterxml.jackson.core.TreeNode)v14),((java.lang.Class)v16));
    org.junit.Assert.assertEquals((Object)(1.0D), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
    Object v8 = "C";
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v7).readTree(((java.lang.String)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }
}
