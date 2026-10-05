package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = Short.valueOf((short)0);
    Object v14 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v13).shortValue()));
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v15));
    Object v17 = Short.valueOf((short)0);
    Object v18 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v17).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v12).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v16),((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v19 = null;
    Object v20 = java.io.Reader.nullReader();
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readTree(((java.io.Reader)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = Short.valueOf((short)0);
    Object v14 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v13).shortValue()));
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readValue(((com.fasterxml.jackson.core.JsonParser)v15),((java.lang.Class)v17));
    Object v19 = ")";
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readTree(((java.lang.String)v19));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v17 = ((java.lang.Enum)v16).getDeclaringClass();
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v16),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).configure(((com.fasterxml.jackson.databind.SerializationFeature)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = java.io.Reader.nullReader();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readTree(((java.io.Reader)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).findMixInClassFor(((java.lang.Class)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15)._convert(((java.lang.Object)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).reader();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).writeValueAsString(((java.lang.Object)v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = Short.valueOf((short)0);
    Object v17 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v16).shortValue()));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readValue(((com.fasterxml.jackson.core.JsonParser)v18),((java.lang.Class)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v24).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectMapper)v15)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v24),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).configure(((com.fasterxml.jackson.databind.MapperFeature)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v19 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).convertValue(((java.lang.Object)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = Short.valueOf((short)0);
    Object v17 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v16).shortValue()));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readValue(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = new byte[]{Byte.valueOf((byte)5)};
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readTree(((byte[])v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).writer(((java.text.DateFormat)v14));
    Object v16 = Short.valueOf((short)0);
    Object v17 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v16).shortValue()));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v18));
    ((com.fasterxml.jackson.core.JsonGenerator)v19).close();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v22 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v21));
    ((com.fasterxml.jackson.databind.ObjectMapper)v12)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v19),((java.lang.Object)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = Short.valueOf((short)0);
    Object v21 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = ((com.fasterxml.jackson.core.JsonParser)v22).getCurrentToken();
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).readTree(((com.fasterxml.jackson.core.JsonParser)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v20)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v23),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).valueToTree(((java.lang.Object)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v21 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).registerModule(((com.fasterxml.jackson.databind.Module)v21));
    Object v23 = Short.valueOf((short)0);
    Object v24 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v23).shortValue()));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).readTree(((com.fasterxml.jackson.core.JsonParser)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v24).getGenericSignature();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).convertValue(((java.lang.Object)v23),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).setDateFormat(((java.text.DateFormat)v19));
    Object v21 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).disable(((com.fasterxml.jackson.databind.SerializationFeature)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ": can not find property with name '";
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v18).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v15)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v18),((com.fasterxml.jackson.databind.JavaType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = Short.valueOf((short)0);
    Object v21 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).readValues(((com.fasterxml.jackson.core.JsonParser)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v18)._convert(((java.lang.Object)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertEquals((Object)("GMT"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.Module[]{null,null};
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).registerModules(((com.fasterxml.jackson.databind.Module[])v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).writer(((java.text.DateFormat)v17));
    Object v19 = Short.valueOf((short)0);
    Object v20 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v19).shortValue()));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v21));
    Object v23 = Short.valueOf((short)0);
    Object v24 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v23).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v15)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v22),((java.lang.Object)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).setAnnotationIntrospectors(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).isEnabled(((com.fasterxml.jackson.core.JsonParser.Feature)v20));
    Object v22 = Short.valueOf((short)0);
    Object v23 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v22).shortValue()));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v24));
    Object v26 = Short.valueOf((short)0);
    Object v27 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v26).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v19).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.core.TreeNode)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).setAnnotationIntrospectors(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    ((com.fasterxml.jackson.databind.ObjectMapper)v25).setFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).writerWithType(((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).configure(((com.fasterxml.jackson.databind.MapperFeature)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = Short.valueOf((short)0);
    Object v25 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v24).shortValue()));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectMapper)v23)._readMapAndClose(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)17)};
    Object v23 = 54;
    Object v24 = -10;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v25).isInterface();
    Object v27 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).readValue(((byte[])v22),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).getVisibilityChecker();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    ((com.fasterxml.jackson.databind.ObjectMapper)v21)._checkInvalidCopy(((java.lang.Class)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((java.lang.Class)v23).getGenericSuperclass();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).convertValue(((java.lang.Object)v21),((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v23 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).registerModule(((com.fasterxml.jackson.databind.Module)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).setDateFormat(((java.text.DateFormat)v19));
    Object v21 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).disable(((com.fasterxml.jackson.databind.SerializationFeature)v21));
    Object v23 = Short.valueOf((short)0);
    Object v24 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v23).shortValue()));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v25));
    Object v27 = Short.valueOf((short)-19);
    ((com.fasterxml.jackson.core.JsonGenerator)v26).writeNumber((((java.lang.Short)v27).shortValue()));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v29));
    ((com.fasterxml.jackson.databind.ObjectMapper)v22)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v26),((java.lang.Object)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).configure(((com.fasterxml.jackson.databind.MapperFeature)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new byte[]{Byte.valueOf((byte)68)};
    Object v25 = java.nio.ByteBuffer.wrap(((byte[])v24));
    Object v26 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v25));
    Object v27 = new byte[]{Byte.valueOf((byte)68)};
    Object v28 = ((java.io.InputStream)v26).read(((byte[])v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectMapper)v23).readTree(((java.io.InputStream)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).generateJsonSchema(((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = Short.valueOf((short)0);
    Object v22 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v21).shortValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v23));
    Object v25 = "";
    ((com.fasterxml.jackson.core.JsonGenerator)v24).writeArrayFieldStart(((java.lang.String)v25));
    Object v26 = null;
    Object v27 = Short.valueOf((short)0);
    Object v28 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v27).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v20).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.core.TreeNode)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES;
    Object v24 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null};
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).disable(((com.fasterxml.jackson.databind.DeserializationFeature)v23),((com.fasterxml.jackson.databind.DeserializationFeature[])v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.Class)v24).isPrimitive();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).writerWithType(((java.lang.Class)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = Short.valueOf((short)0);
    Object v19 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v18).shortValue()));
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.ObjectMapper)v17).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v21),((java.lang.Object)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = Short.valueOf((short)0);
    Object v22 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v21).shortValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v20)._initForReading(((com.fasterxml.jackson.core.JsonParser)v23));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    ((com.fasterxml.jackson.databind.ObjectMapper)v25).setFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v26));
    Object v27 = null;
    Object v28 = "Class ";
    Object v29 = new java.io.File(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    ((com.fasterxml.jackson.databind.ObjectMapper)v25).writeValue(((java.io.File)v29),((java.lang.Object)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = Short.valueOf((short)0);
    Object v17 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v16).shortValue()));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).readTree(((com.fasterxml.jackson.core.JsonParser)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).setDateFormat(((java.text.DateFormat)v19));
    Object v21 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).disable(((com.fasterxml.jackson.databind.SerializationFeature)v21));
    Object v23 = com.fasterxml.jackson.databind.DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL;
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).setSubtypeResolver(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = Short.valueOf((short)0);
    Object v20 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v19).shortValue()));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v21));
    Object v23 = Short.valueOf((short)0);
    Object v24 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v23).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v18).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.core.TreeNode)v24));
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).mixInCount();
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v21).isMemberClass();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).findMixInClassFor(((java.lang.Class)v21));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).setLocale(((java.util.Locale)v13));
    Object v15 = "Class ";
    Object v16 = new java.io.File(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readTree(((java.io.File)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = Short.valueOf((short)0);
    Object v27 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v26).shortValue()));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v28));
    Object v30 = Short.valueOf((short)0);
    Object v31 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v30).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v25).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v29),((com.fasterxml.jackson.databind.JsonNode)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).setAnnotationIntrospectors(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{null,null};
    ((com.fasterxml.jackson.databind.ObjectMapper)v25).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = Short.valueOf((short)0);
    Object v22 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v21).shortValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v23));
    Object v25 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    ((com.fasterxml.jackson.databind.ObjectMapper)v20)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v24),((java.lang.Object)v26),((java.lang.Class)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).writeValueAsBytes(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).setSubtypeResolver(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13));
    Object v17 = Short.valueOf((short)0);
    Object v18 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v17).shortValue()));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v18));
    Object v20 = Short.valueOf((short)0);
    Object v21 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = ((com.fasterxml.jackson.core.JsonParser)v22).nextBooleanValue();
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v16)._initForReading(((com.fasterxml.jackson.core.JsonParser)v22));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).mixInCount();
    org.junit.Assert.assertEquals((Object)(0), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = "NUMBER";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).valueToTree(((java.lang.Object)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = new byte[]{Byte.valueOf((byte)68)};
    Object v19 = java.nio.ByteBuffer.wrap(((byte[])v18));
    Object v20 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).readTree(((java.io.InputStream)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.ObjectMapper)v17).registerSubtypes(((java.lang.Class[])v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS;
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ((com.fasterxml.jackson.databind.ObjectMapper)v25)._convert(((java.lang.Object)v27),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v24 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v23));
    Object v25 = ((com.fasterxml.jackson.databind.Module)v24).version();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).registerModule(((com.fasterxml.jackson.databind.Module)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v17 = true;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).configure(((com.fasterxml.jackson.databind.SerializationFeature)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).readValue(((byte[])v19),((java.lang.Class)v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v21)._findRootDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v24),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = new com.fasterxml.jackson.databind.Module[]{null,null,null};
    Object v27 = ((com.fasterxml.jackson.databind.ObjectMapper)v25).registerModules(((com.fasterxml.jackson.databind.Module[])v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = Short.valueOf((short)0);
    Object v24 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v23).shortValue()));
    Object v25 = ((com.fasterxml.jackson.core.TreeNode)v24).asToken();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = "Class ";
    Object v23 = new java.io.File(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).readTree(((java.io.File)v23));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)1),Byte.valueOf((byte)14)};
    Object v27 = ((com.fasterxml.jackson.databind.ObjectMapper)v25).readTree(((byte[])v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v23 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).registerModule(((com.fasterxml.jackson.databind.Module)v23));
    Object v25 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v24).enable(((com.fasterxml.jackson.databind.SerializationFeature)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).setAnnotationIntrospectors(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v25).copy();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v23 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).registerModule(((com.fasterxml.jackson.databind.Module)v23));
    Object v25 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v24).enable(((com.fasterxml.jackson.databind.SerializationFeature)v25));
    Object v27 = "Class ";
    Object v28 = new java.io.File(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).readTree(((java.io.File)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v23 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).registerModule(((com.fasterxml.jackson.databind.Module)v23));
    Object v25 = Short.valueOf((short)0);
    Object v26 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v25).shortValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v27));
    Object v29 = Short.valueOf((short)0);
    Object v30 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v29).shortValue()));
    ((com.fasterxml.jackson.databind.ObjectMapper)v24).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v28),((com.fasterxml.jackson.databind.JsonNode)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.NamedType[]{};
    ((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13).registerSubtypes(((com.fasterxml.jackson.databind.jsontype.NamedType[])v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).setSubtypeResolver(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).mixInCount();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v24 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v23));
    Object v25 = ((com.fasterxml.jackson.databind.Module)v24).version();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).registerModule(((com.fasterxml.jackson.databind.Module)v24));
    Object v27 = new byte[]{};
    Object v28 = 1;
    Object v29 = 0;
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).readValue(((byte[])v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).configure(((com.fasterxml.jackson.databind.MapperFeature)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v23).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v24 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v23));
    Object v25 = ((com.fasterxml.jackson.databind.Module)v24).version();
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).registerModule(((com.fasterxml.jackson.databind.Module)v24));
    Object v27 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v28 = new com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).valueToTree(((java.lang.Object)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null};
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = 35;
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v20),((java.lang.reflect.Type)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v13).withValueHandler(((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).reader(((com.fasterxml.jackson.databind.JavaType)v13));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).setDateFormat(((java.text.DateFormat)v19));
    Object v21 = com.fasterxml.jackson.databind.SerializationFeature.CLOSE_CLOSEABLE;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).disable(((com.fasterxml.jackson.databind.SerializationFeature)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).readerWithView(((java.lang.Class)v24));
    Object v26 = Short.valueOf((short)0);
    Object v27 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v26).shortValue()));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).readValue(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.core.type.ResolvedType)v29));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = java.util.Locale.getDefault();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).setLocale(((java.util.Locale)v22));
    Object v24 = Short.valueOf((short)0);
    Object v25 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v24).shortValue()));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectMapper)v21)._readMapAndClose(((com.fasterxml.jackson.core.JsonParser)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v23 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).registerModule(((com.fasterxml.jackson.databind.Module)v23));
    Object v25 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v24).enable(((com.fasterxml.jackson.databind.SerializationFeature)v25));
    Object v27 = Short.valueOf((short)0);
    Object v28 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v27).shortValue()));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((java.lang.Class)v30).getDeclaredConstructors();
    Object v32 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).treeToValue(((com.fasterxml.jackson.core.TreeNode)v28),((java.lang.Class)v30));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_FIELDS;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v21));
    Object v23 = com.fasterxml.jackson.databind.DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL;
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16));
    Object v18 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_SELF_REFERENCES;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v17).configure(((com.fasterxml.jackson.databind.SerializationFeature)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME;
    Object v22 = false;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v20).configure(((com.fasterxml.jackson.databind.MapperFeature)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES;
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v23).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v28 = 65;
    Object v29 = -6;
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).readValue(((byte[])v27),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v14),((java.lang.Class)v16));
    Object v18 = ((java.lang.Iterable)v17).iterator();
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).registerModules(((java.lang.Iterable)v17));
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).configure(((com.fasterxml.jackson.databind.SerializationFeature)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v22).setAnnotationIntrospectors(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v25).copy();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).findMixInClassFor(((java.lang.Class)v28));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).getSubtypeResolver();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getDeclaredAnnotations();
    Object v6 = ((com.fasterxml.jackson.databind.ObjectMapper)v1).convertValue(((java.lang.Object)v2),((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).configure(((com.fasterxml.jackson.databind.SerializationFeature)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v17 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v15).registerModule(((com.fasterxml.jackson.databind.Module)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v18).enableDefaultTyping();
    Object v20 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v19).disable(((com.fasterxml.jackson.databind.SerializationFeature)v20));
    Object v22 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v23 = new com.fasterxml.jackson.databind.module.SimpleModule(((com.fasterxml.jackson.core.Version)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).registerModule(((com.fasterxml.jackson.databind.Module)v23));
    Object v25 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v24).enable(((com.fasterxml.jackson.databind.SerializationFeature)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).setTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v30 = false;
    Object v31 = ((com.fasterxml.jackson.databind.ObjectMapper)v26).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v29),(((java.lang.Boolean)v30).booleanValue()));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonFactory();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v0),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v1),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes(((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v5).registerModules(((java.lang.Iterable)v11));
    Object v13 = Short.valueOf((short)0);
    Object v14 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v13).shortValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).treeToValue(((com.fasterxml.jackson.core.TreeNode)v14),((java.lang.Class)v16));
    org.junit.Assert.assertEquals((Object)(Short.valueOf((short)0)), v17);
  }
}
