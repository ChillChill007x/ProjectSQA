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
    Object v7 = new com.fasterxml.jackson.databind.Module[]{null,null,null};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((com.fasterxml.jackson.databind.Module[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).writerWithType(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    ((com.fasterxml.jackson.databind.ObjectMapper)v6).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v14),((java.lang.Object)v16));
    Object v17 = null;
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
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
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
    Object v7 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonParser.Feature[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v0));
    org.junit.Assert.assertNotNull(v1);
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
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).mixInCount();
    Object v8 = "'";
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((java.lang.String)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.EAGER_DESERIALIZER_FETCH;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationFeature[]{null,null,null};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7),((com.fasterxml.jackson.databind.DeserializationFeature[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).convertValue(((java.lang.Object)v10),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
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
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v9).withValueHandler(((java.lang.Object)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._convert(((java.lang.Object)v8),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((java.lang.String)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.Module[]{null,null};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((com.fasterxml.jackson.databind.Module[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new byte[]{};
    Object v8 = 0;
    Object v9 = 1;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readValue(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),((java.lang.Class)v14));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).createObjectNode();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModules(((java.lang.Iterable)v10));
    org.junit.Assert.assertNotNull(v12);
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
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.concurrent.atomic.AtomicReference();
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).canDeserialize(((com.fasterxml.jackson.databind.JavaType)v7),((java.util.concurrent.atomic.AtomicReference)v8));
    Object v10 = "UNKNOWN";
    Object v11 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v14),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._initForReading(((com.fasterxml.jackson.core.JsonParser)v19));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_STRING), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = com.fasterxml.jackson.core.Version.unknownVersion();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).convertValue(((java.lang.Object)v9),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readerWithView(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.util.ISO8601DateFormat();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).writer(((java.text.DateFormat)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).mixInCount();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModules(((java.lang.Iterable)v10));
    Object v13 = com.fasterxml.jackson.core.JsonGenerator.Feature.IGNORE_UNKNOWN;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).isEnabled(((com.fasterxml.jackson.core.JsonGenerator.Feature)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = 13;
    Object v10 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).readTree(((java.io.InputStream)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v17),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ObjectMapper)v21).createObjectNode();
    ((com.fasterxml.jackson.databind.ObjectMapper)v6).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.core.TreeNode)v22));
    Object v23 = null;
    Object v24 = "UNKNOWN";
    Object v25 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v27 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v27),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v28),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v25),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._initForReading(((com.fasterxml.jackson.core.JsonParser)v33));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_STRING), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).getSuperClass();
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    ((com.fasterxml.jackson.databind.ObjectMapper)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModules(((java.lang.Iterable)v10));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v15),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = "Can not create TypeBindi,gs for class ";
    ((com.fasterxml.jackson.core.JsonGenerator)v20).writeArrayFieldStart(((java.lang.String)v21));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    ((com.fasterxml.jackson.databind.ObjectMapper)v12)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v20),((java.lang.Object)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.Class)v15).isSynthetic();
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).treeToValue(((com.fasterxml.jackson.core.TreeNode)v10),((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)("UNKNOWN"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = 13;
    Object v10 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).convertValue(((java.lang.Object)v10),((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
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
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_INDEX;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).disable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
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
    Object v7 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.SerializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_NULL_MAP_VALUES;
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).disable(((com.fasterxml.jackson.databind.SerializationFeature)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).readerFor(((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getMethods();
    ((com.fasterxml.jackson.databind.ObjectMapper)v6)._checkInvalidCopy(((java.lang.Class)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getSimpleName();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).canSerialize(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).getSerializerProviderInstance();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)3)};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).readTree(((byte[])v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
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
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v10));
    org.junit.Assert.assertNotNull(v11);
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
    Object v7 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.SerializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).reader(((com.fasterxml.jackson.databind.DeserializationFeature)v10));
    org.junit.Assert.assertNotNull(v11);
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
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v12),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = ")";
    Object v19 = java.util.TimeZone.getTimeZone(((java.lang.String)v18));
    ((com.fasterxml.jackson.databind.ObjectMapper)v9).writeValue(((com.fasterxml.jackson.core.JsonGenerator)v17),((java.lang.Object)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).setPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).writerWithType(((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = 13;
    Object v8 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._convert(((java.lang.Object)v9),((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModules(((java.lang.Iterable)v10));
    Object v13 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).writer(((com.fasterxml.jackson.databind.SerializationFeature)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v13),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ObjectMapper)v8)._initForReading(((com.fasterxml.jackson.core.JsonParser)v18));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.core.JsonToken.VALUE_STRING), v19);
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
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v10));
    Object v12 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)16),Byte.valueOf((byte)1)};
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).readValue(((byte[])v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.SerializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v12),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.ObjectMapper)v6)._configAndWriteValue(((com.fasterxml.jackson.core.JsonGenerator)v17),((java.lang.Object)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
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
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).getSerializerFactory();
    org.junit.Assert.assertNotNull(v7);
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
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configOverride(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v13),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).isClosed();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.ObjectMapper)v8)._readMapAndClose(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertEquals((Object)("UNKNOWN"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModules(((java.lang.Iterable)v10));
    Object v13 = "";
    Object v14 = "[no message for ";
    Object v15 = new java.io.File(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).readTree(((java.io.File)v15));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
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
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
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
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.SerializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null,null,null};
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v9));
    org.junit.Assert.assertNotNull(v10);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v9));
    Object v11 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v12 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v11),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v12));
    org.junit.Assert.assertNotNull(v13);
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
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "UNKNOWN";
    Object v11 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).treeToValue(((com.fasterxml.jackson.core.TreeNode)v11),((java.lang.Class)v16));
    org.junit.Assert.assertEquals((Object)("UNKNOWN"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v6)._convert(((java.lang.Object)v7),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    ((com.fasterxml.jackson.databind.ObjectMapper)v9)._checkInvalidCopy(((java.lang.Class)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
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
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_INDEX;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).disable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v21).getFields();
    ((com.fasterxml.jackson.databind.ObjectMapper)v11).addMixInAnnotations(((java.lang.Class)v16),((java.lang.Class)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v9));
    Object v11 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v12 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v11),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.ISO8601DateFormat();
    Object v15 = ")";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED";
    Object v18 = ", typed? ";
    Object v19 = "";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v16),((java.util.Locale)v20));
    ((java.text.DateFormat)v14).setCalendar(((java.util.Calendar)v21));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v13).setDateFormat(((java.text.DateFormat)v14));
    org.junit.Assert.assertNotNull(v23);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v9));
    Object v11 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
    Object v12 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).enableDefaultTyping(((com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping)v11),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.ISO8601DateFormat();
    Object v15 = ")";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED";
    Object v18 = ", typed? ";
    Object v19 = "";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v16),((java.util.Locale)v20));
    ((java.text.DateFormat)v14).setCalendar(((java.util.Calendar)v21));
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v13).setDateFormat(((java.text.DateFormat)v14));
    Object v24 = "UNKNOWN";
    Object v25 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ObjectMapper)v23).treeToValue(((com.fasterxml.jackson.core.TreeNode)v25),((java.lang.Class)v30));
    org.junit.Assert.assertEquals((Object)("UNKNOWN"), v31);
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
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_INDEX;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).disable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).writerWithType(((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v17);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    ((com.fasterxml.jackson.databind.ObjectMapper)v8).setFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).getFactory();
    org.junit.Assert.assertNotNull(v11);
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
    Object v7 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.SerializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED";
    Object v11 = ", typed? ";
    Object v12 = "";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).writeValueAsBytes(((java.lang.Object)v13));
    Object v15 = 13;
    Object v16 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).readTree(((java.io.InputStream)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = "UNKNOWN";
    Object v10 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModules(((java.lang.Iterable)v10));
    Object v13 = "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED";
    Object v14 = ", typed? ";
    Object v15 = "";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v21).getEnclosingClass();
    Object v23 = ((com.fasterxml.jackson.databind.ObjectMapper)v12).convertValue(((java.lang.Object)v16),((java.lang.Class)v21));
    org.junit.Assert.assertEquals((Object)("write_single_elem_arrays_unwrapped_, TYPED? "), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    ((com.fasterxml.jackson.databind.ObjectMapper)v11).setFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v12));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v17).containedTypeCount();
    Object v19 = new java.util.concurrent.atomic.AtomicReference();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).canDeserialize(((com.fasterxml.jackson.databind.JavaType)v17),((java.util.concurrent.atomic.AtomicReference)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ")";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).convertValue(((java.lang.Object)v8),((java.lang.Class)v13));
    org.junit.Assert.assertEquals((Object)("GMT"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9));
    org.junit.Assert.assertNotNull(v10);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v9));
    Object v11 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{null};
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v11));
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
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v8),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = "UNKNOWN";
    Object v16 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonNode)v16).isValueNode();
    ((com.fasterxml.jackson.databind.ObjectMapper)v6).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).valueToTree(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    ((com.fasterxml.jackson.databind.ObjectMapper)v11).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 13;
    Object v11 = java.nio.ByteBuffer.allocate((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream(((java.nio.ByteBuffer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).readTree(((java.io.InputStream)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
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
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_INDEX;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).disable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_SETTERS;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).configure(((com.fasterxml.jackson.databind.MapperFeature)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).convertValue(((java.lang.Object)v10),((java.lang.Class)v15));
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).getAnnotatedSuperclass();
    ((com.fasterxml.jackson.databind.ObjectMapper)v8)._checkInvalidCopy(((java.lang.Class)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12).copy();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.MapperFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "UNKNOWN";
    Object v11 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v14),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).readValue(((com.fasterxml.jackson.core.JsonParser)v19),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).getSerializerProvider();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9));
    Object v11 = "UNKNOWN";
    Object v12 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v12));
    Object v14 = java.io.Reader.nullReader();
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).readTree(((java.io.Reader)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).writerFor(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12).copy();
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v15 = "";
    Object v16 = "[no message for ";
    Object v17 = new java.io.File(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v14).readTree(((java.io.File)v17));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).enable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
    org.junit.Assert.assertNotNull(v11);
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
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).enable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).writerWithType(((java.lang.Class)v16));
    Object v18 = java.io.Writer.nullWriter();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ObjectMapper)v11).writeValue(((java.io.Writer)v18),((java.lang.Object)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).canDeserialize(((com.fasterxml.jackson.databind.JavaType)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
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
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null,null};
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).enable(((com.fasterxml.jackson.core.JsonParser.Feature[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = com.fasterxml.jackson.databind.SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS;
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.SerializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "UNKNOWN";
    Object v11 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).treeAsTokens(((com.fasterxml.jackson.core.TreeNode)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).getInjectableValues();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null,null};
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).disable(((com.fasterxml.jackson.core.JsonParser.Feature[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).getDateFormat();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    ((com.fasterxml.jackson.databind.ObjectMapper)v8).setFilters(((com.fasterxml.jackson.databind.ser.FilterProvider)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModules(((java.lang.Iterable)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    ((com.fasterxml.jackson.databind.ObjectMapper)v9).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES;
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).enable(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.databind.ObjectMapper)v6));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).writerFor(((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
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
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS;
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).configure(((com.fasterxml.jackson.databind.DeserializationFeature)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
    Object v11 = ((com.fasterxml.jackson.databind.ObjectMapper)v9).enable(((com.fasterxml.jackson.databind.SerializationFeature)v10));
    Object v12 = new com.fasterxml.jackson.core.JsonParser.Feature[]{null};
    Object v13 = ((com.fasterxml.jackson.databind.ObjectMapper)v11).enable(((com.fasterxml.jackson.core.JsonParser.Feature[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v7 = new com.fasterxml.jackson.core.JsonGenerator.Feature[]{};
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).disable(((com.fasterxml.jackson.core.JsonGenerator.Feature[])v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).setSerializerProvider(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.ISO8601DateFormat();
    Object v12 = ((com.fasterxml.jackson.databind.ObjectMapper)v10).writer(((java.text.DateFormat)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v15),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    ((com.fasterxml.jackson.core.JsonGenerator)v20).close();
    Object v21 = null;
    Object v22 = "UNKNOWN";
    Object v23 = new com.fasterxml.jackson.databind.node.TextNode(((java.lang.String)v22));
    Object v24 = "K";
    Object v25 = ((com.fasterxml.jackson.core.TreeNode)v23).path(((java.lang.String)v24));
    ((com.fasterxml.jackson.databind.ObjectMapper)v10).writeTree(((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.core.TreeNode)v23));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = ", poblem: ";
    Object v2 = false;
    ((java.lang.ClassLoader)v0).setClassAssertionStatus(((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v0));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).writerFor(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v15));
    Object v17 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS;
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).reader(((com.fasterxml.jackson.databind.DeserializationFeature)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).valueToTree(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v1 = new com.fasterxml.jackson.core.JsonFactory(((com.fasterxml.jackson.core.ObjectCodec)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v1),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v2),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v5));
    Object v7 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v8 = ((com.fasterxml.jackson.databind.ObjectMapper)v6).registerModule(((com.fasterxml.jackson.databind.Module)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).writerFor(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.module.SimpleModule();
    Object v16 = ((com.fasterxml.jackson.databind.ObjectMapper)v8).registerModule(((com.fasterxml.jackson.databind.Module)v15));
    Object v17 = new com.fasterxml.jackson.core.JsonParser.Feature[]{};
    Object v18 = ((com.fasterxml.jackson.databind.ObjectMapper)v16).disable(((com.fasterxml.jackson.core.JsonParser.Feature[])v17));
    org.junit.Assert.assertNotNull(v18);
  }
}
