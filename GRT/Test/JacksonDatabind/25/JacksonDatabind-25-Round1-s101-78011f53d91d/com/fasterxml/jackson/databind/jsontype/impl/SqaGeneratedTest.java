package com.fasterxml.jackson.databind.jsontype.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = "Can not use FormatSchema of type ";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).instantiationException(((java.lang.Class)v17),((java.lang.String)v18));
    Object v20 = "boolean";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v20),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = " given resolves to ";
    Object v18 = "str}ng";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = "Pjroperty '";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23).idFromBaseType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v20),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((com.fasterxml.jackson.databind.JavaType)v29));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    ((com.fasterxml.jackson.core.JsonParser)v18).clearCurrentToken();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = -33L;
    Object v10 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v9).longValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v16 = "Can not instantiate abstract type ";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonToken)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Class)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).getPropertyName();
    Object v14 = -33L;
    Object v15 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v14).longValue()));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    ((com.fasterxml.jackson.databind.DeserializationContext)v22).checkUnresolvedObjectId();
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromObject(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromObject(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromObject(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getTypeIdResolver();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v21).leaseObjectBuffer();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ", contains ";
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = "number";
    Object v23 = new java.lang.Object[]{null,null};
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v21).mappingException(((java.lang.String)v22),((java.lang.Object[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = " - ";
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).getTokenLocation();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19).idFromValue(((java.lang.Object)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = "() returned ";
    Object v23 = new java.lang.Object[]{null,null};
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v21).mappingException(((java.lang.String)v22),((java.lang.Object[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v30).mappingException(((java.lang.Class)v32),((com.fasterxml.jackson.core.JsonToken)v33));
    Object v35 = "E";
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Class)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getPropertyName();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "not a valid repres";
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getTypeInclusion();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ")";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "";
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = "doubl";
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.String)v21));
    Object v23 = "integerV";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = "[creator property, name '";
    Object v22 = ")";
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "Invalid delegate-creatKr definition for ";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v24),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v27),((com.fasterxml.jackson.databind.JavaType)v32));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ")";
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.reflect.Constructor)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "3";
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "]";
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).getTextOffset();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).toString();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = " is not a Map(-like) type";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).instantiationException(((java.lang.Class)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((java.lang.reflect.Type)v35).getTypeName();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    ((com.fasterxml.jackson.databind.DeserializationContext)v8).checkUnresolvedObjectId();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).toString();
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).toString();
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getDefaultImpl();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).getCurrentToken();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v10).getConstructors();
    Object v12 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Class)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "Class ";
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((com.fasterxml.jackson.databind.JavaType)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ")";
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.reflect.Constructor)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.DeserializationContext)v36).leaseObjectBuffer();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).baseTypeName();
    Object v14 = -33L;
    Object v15 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v14).longValue()));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "Unexpected JSON values; expected at most %d properties (in JSON A";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getDefaultImpl();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = " vs ";
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = "No (native) type id found when one was expelcted for polymorphic type handling";
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.String)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = -21;
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v18).setFeatureMask((((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ")";
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v25),((java.lang.reflect.Constructor)v29),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v31));
    Object v33 = "";
    Object v34 = new com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v32),((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v24),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v34),((com.fasterxml.jackson.databind.util.Annotations)v35),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v23),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getCurrentValue();
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getShortValue();
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "strin";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19).getMechanism();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getNumberValue();
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = "/'";
    Object v24 = new java.lang.Object[]{null,null};
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).mappingException(((java.lang.String)v23),((java.lang.Object[])v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.DeserializationContext)v30).getArrayBuilders();
    Object v32 = "";
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "4]";
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = -33L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    ((com.fasterxml.jackson.databind.DeserializationContext)v36).checkUnresolvedObjectId();
    Object v37 = null;
    Object v38 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "BeanSerializer for ";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).hasCurrentToken();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = -33L;
    Object v31 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v30).longValue()));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v32));
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v31),((com.fasterxml.jackson.core.ObjectCodec)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29).deserializeTypedFromObject(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = -33L;
    Object v31 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v30).longValue()));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v32));
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v31),((com.fasterxml.jackson.core.ObjectCodec)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29).getDefaultImpl();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29).baseTypeName();
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = "]";
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.lang.String)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = "sting";
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.String)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getDefaultImpl();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDefaultImplDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = -33L;
    Object v31 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v30).longValue()));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v32));
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v31),((com.fasterxml.jackson.core.ObjectCodec)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).getGenericSignature();
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.JavaType)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v32).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v33));
    Object v34 = null;
    Object v35 = ",]";
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.String)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29).getTypeInclusion();
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = "' found (for proper";
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.lang.String)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getTypeInclusion();
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = "";
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.String)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).toString();
    Object v29 = -33L;
    Object v30 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v29).longValue()));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v31));
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v34),((com.fasterxml.jackson.databind.DeserializationContext)v37),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29).getPropertyName();
    org.junit.Assert.assertEquals((Object)(""), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -33L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new java.lang.Class[]{};
    Object v12 = ((java.lang.Class)v10).getDeclaredConstructor(((java.lang.Class[])v11));
    Object v13 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Class)v10));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = "strng";
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.String)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29).getTypeIdResolver();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    ((com.fasterxml.jackson.databind.DeserializationContext)v32).checkUnresolvedObjectId();
    Object v33 = null;
    Object v34 = "number";
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.String)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ", annotations: ";
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = -33L;
    Object v31 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v30).longValue()));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v32));
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v31),((com.fasterxml.jackson.core.ObjectCodec)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = "]";
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.String)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12)._deserializeWithNativeTypeId(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "Could no";
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34).idFromBaseType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((com.fasterxml.jackson.databind.JavaType)v36));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).getDefaultImpl();
    Object v29 = -33L;
    Object v30 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v29).longValue()));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v31));
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v34),((com.fasterxml.jackson.databind.DeserializationContext)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = -33L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = -33L;
    Object v23 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v22).longValue()));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v29 = " is not a ubtype of ";
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v21).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.core.JsonToken)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).getTypeInclusion();
    Object v29 = -33L;
    Object v30 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v29).longValue()));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v31));
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v34),((com.fasterxml.jackson.databind.DeserializationContext)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "ty";
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27)._findDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "O";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v26));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = "'";
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.type.TypeFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v29)._handleUnknownTypeId(((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.String)v33),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }
}
