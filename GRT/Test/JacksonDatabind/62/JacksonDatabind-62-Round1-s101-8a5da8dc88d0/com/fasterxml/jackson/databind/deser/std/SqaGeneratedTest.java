package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = "5";
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v25).findBackReference(((java.lang.String)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = 23;
    Object v35 = new java.util.HashSet((((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).handleNonArray(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.util.Collection)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = "]";
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v25).findBackReference(((java.lang.String)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).getContentDeserializer();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = 23;
    Object v35 = new java.util.HashSet((((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.util.Collection)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getEmptyValue();
    org.junit.Assert.assertEquals((Object)(26.276815F), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = "properties";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = 23;
    Object v36 = new java.util.HashSet((((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34),((java.util.Collection)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = 23;
    Object v36 = new java.util.HashSet((((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34),((java.util.Collection)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).getValueType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getDelegatee();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).getContentDeserializer();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = 26.276815F;
    Object v30 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v28),((java.lang.Float)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v26).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v30));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = ((com.fasterxml.jackson.core.JsonParser)v31).readValueAsTree();
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = 23;
    Object v37 = new java.util.HashSet((((java.lang.Integer)v36).intValue()));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v35),((java.util.Collection)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = 23;
    Object v36 = new java.util.HashSet((((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).handleNonArray(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34),((java.util.Collection)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = 23;
    Object v36 = new java.util.HashSet((((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).handleNonArray(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34),((java.util.Collection)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).getContentType();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = "";
    ((com.fasterxml.jackson.core.JsonParser)v31).overrideCurrentName(((java.lang.String)v32));
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = 23;
    Object v38 = new java.util.HashSet((((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.util.Collection)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((com.fasterxml.jackson.core.JsonParser)v31).readValuesAs(((java.lang.Class)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 26.276815F;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v9),((java.lang.Float)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27).getPropertyName();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v30 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v30));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getObjectIdReader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = ((com.fasterxml.jackson.core.JsonParser)v31).getValueAsString();
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getKnownPropertyNames();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v7).getValueClass();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).handledType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = "Non-hex character '%c' (value 0x%s), not valid for UUID String: input String '%s''";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getContentType();
    Object v29 = "Invalid Object Id definition (or ";
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertEquals((Object)(26.276815F), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v26).handledType();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = 26.276815F;
    Object v30 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v28),((java.lang.Float)v29));
    Object v31 = "[N/A]";
    Object v32 = "@";
    Object v33 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JsonDeserializer)v30).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonDeserializer)v26).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v34));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = "strin";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v7));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertEquals((Object)(26.276815F), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v27).getValueClass();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 26.276815F;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v2),((java.lang.Float)v3));
    Object v5 = "[N/A]";
    Object v6 = "@";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "')";
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 26.276815F;
    Object v29 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v27),((java.lang.Float)v28));
    Object v30 = "[N/A]";
    Object v31 = "@";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v33),((java.lang.Boolean)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v34 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32),((com.fasterxml.jackson.core.ObjectCodec)v33));
    Object v35 = ((com.fasterxml.jackson.core.JsonParser)v34).getBinaryValue();
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).deserialize(((com.fasterxml.jackson.core.JsonParser)v34),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getEmptyValue();
    org.junit.Assert.assertEquals((Object)(26.276815F), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertEquals((Object)(26.276815F), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v32).getParsingContext();
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = 23;
    Object v38 = new java.util.HashSet((((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).handleNonArray(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.util.Collection)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 26.276815F;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v2),((java.lang.Float)v3));
    Object v5 = "[N/A]";
    Object v6 = "@";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "')";
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 26.276815F;
    Object v29 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v27),((java.lang.Float)v28));
    Object v30 = "[N/A]";
    Object v31 = "@";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v35).getValueType();
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = "]";
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).findBackReference(((java.lang.String)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = "*";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).getContentDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.JsonDeserializer)v26).getObjectIdReader();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).getContentDeserializer();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = "o";
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).findBackReference(((java.lang.String)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getKnownPropertyNames();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = "#";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v34).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v35));
    Object v36 = null;
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).getContentType();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 26.276815F;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v2),((java.lang.Float)v3));
    Object v5 = "[N/A]";
    Object v6 = "@";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "')";
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 26.276815F;
    Object v29 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v27),((java.lang.Float)v28));
    Object v30 = "[N/A]";
    Object v31 = "@";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v35).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).getNullValue();
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getNullValue();
    org.junit.Assert.assertEquals((Object)(26.276815F), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25).getContentDeserializer();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = 26.276815F;
    Object v30 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v28),((java.lang.Float)v29));
    Object v31 = "[N/A]";
    Object v32 = "@";
    Object v33 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JsonDeserializer)v30).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonDeserializer)v26).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v34));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).getObjectIdReader();
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 26.276815F;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v2),((java.lang.Float)v3));
    Object v5 = "[N/A]";
    Object v6 = "@";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "')";
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 26.276815F;
    Object v29 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v27),((java.lang.Float)v28));
    Object v30 = "[N/A]";
    Object v31 = "@";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JsonDeserializer)v35).getDelegatee();
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = "int";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getNullValue();
    org.junit.Assert.assertEquals((Object)(26.276815F), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = ", problem^: ";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).getContentDeserializer();
    Object v31 = "[N/A]";
    Object v32 = "@";
    Object v33 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JsonDeserializer)v30).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v7).getValueType();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getContentType();
    Object v29 = "strin.";
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = ((com.fasterxml.jackson.core.JsonParser)v31).isExpectedStartObjectToken();
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getDelegatee();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = "O";
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).findBackReference(((java.lang.String)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 26.276815F;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v2),((java.lang.Float)v3));
    Object v5 = "[N/A]";
    Object v6 = "@";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "')";
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 26.276815F;
    Object v29 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v27),((java.lang.Float)v28));
    Object v30 = "[N/A]";
    Object v31 = "@";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v35).getContentType();
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = 26.276815F;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v1),((java.lang.Float)v2));
    Object v4 = "[N/A]";
    Object v5 = "@";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = 26.276815F;
    Object v15 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v13),((java.lang.Float)v14));
    Object v16 = "[N/A]";
    Object v17 = "@";
    Object v18 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonDeserializer)v15).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v18));
    Object v20 = "[N/A]";
    Object v21 = "@";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v23));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v31));
    Object v33 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v34 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32),((com.fasterxml.jackson.core.ObjectCodec)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).deserialize(((com.fasterxml.jackson.core.JsonParser)v34),((com.fasterxml.jackson.databind.DeserializationContext)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = ((com.fasterxml.jackson.core.JsonParser)v31).nextBooleanValue();
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    ((com.fasterxml.jackson.databind.DeserializationContext)v30).checkUnresolvedObjectId();
    Object v31 = null;
    Object v32 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v30));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = 2;
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v31).setFeatureMask((((java.lang.Integer)v32).intValue()));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = 23;
    Object v38 = new java.util.HashSet((((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.util.Collection)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = 23;
    Object v37 = new java.util.HashSet((((java.lang.Integer)v36).intValue()));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).handleNonArray(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v35),((java.util.Collection)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = "', problem: ";
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).findBackReference(((java.lang.String)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = "str.ng";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = "'";
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v25).findBackReference(((java.lang.String)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 26.276815F;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v2),((java.lang.Float)v3));
    Object v5 = "[N/A]";
    Object v6 = "@";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = "')";
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 26.276815F;
    Object v29 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v27),((java.lang.Float)v28));
    Object v30 = "[N/A]";
    Object v31 = "@";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = true;
    Object v35 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v35).getContentDeserializer();
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = ",";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v29).getContentDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v30).getKnownPropertyNames();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
    Object v34 = ((com.fasterxml.jackson.core.JsonParser)v32).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v27).getValueClass();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).getContentType();
    Object v31 = "Can not instantimate abstract type ";
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).findBackReference(((java.lang.String)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23).getPropertyName();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25));
    Object v27 = "array";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = "[N/A]";
    Object v9 = "@";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeFactory)v20));
    Object v22 = "')";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v29 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v27),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v28));
    Object v30 = "";
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v29).findBackReference(((java.lang.String)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 26.276815F;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer(((java.lang.Class)v5),((java.lang.Float)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "')";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21),((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer(((com.fasterxml.jackson.databind.deser.std.CollectionDeserializer)v25));
    Object v27 = "]";
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v26).findBackReference(((java.lang.String)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
