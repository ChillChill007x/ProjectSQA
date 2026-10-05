package com.fasterxml.jackson.databind.deser.std;
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
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = -33;
    Object v27 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v26).intValue()));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = "array";
    Object v33 = ((com.fasterxml.jackson.databind.DeserializationContext)v31).mappingException(((java.lang.String)v32));
    Object v34 = -33;
    Object v35 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v34).intValue()));
    Object v36 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = -33;
    Object v27 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v26).intValue()));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = "lonf";
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v31).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v32),((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = -33;
    Object v27 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v26).intValue()));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getObjectIdReader();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).getValueType();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = -33;
    Object v27 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v26).intValue()));
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.databind.DeserializationContext)v31),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isInterface();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "m";
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v19).getDefaultImpl();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).isConcrete();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.type.TypeFactory)v31));
    Object v33 = "m";
    Object v34 = false;
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v32),((java.lang.String)v33),(((java.lang.Boolean)v34).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v38 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v24),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v36),((com.fasterxml.jackson.databind.JsonDeserializer)v37));
    Object v39 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = -33;
    Object v19 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v17).deserialize(((com.fasterxml.jackson.core.JsonParser)v20),((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).handledType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "m";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v17).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "m";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v17).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v31).getEmptyAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "array";
    Object v5 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v0),((java.text.DateFormat)v3),((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ")E";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "m";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v17).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v31).getValueType();
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v17).getNullAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v25).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v2 = ", ";
    Object v3 = ")E";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v25).handledType();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.type.TypeFactory)v29));
    Object v31 = "m";
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v30),((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = 0;
    Object v21 = 1;
    Object v22 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = "array";
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v19),((java.text.DateFormat)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v26 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v28));
    Object v30 = -33;
    Object v31 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v30).intValue()));
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v31));
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v32).getBigIntegerValue();
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v21 = -33;
    Object v22 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v26).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v27));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26),((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v16).getDelegatee();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v19).getCurrentTokenId();
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = 3.651036730348652D;
    Object v25 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v25).getValueClass();
    Object v27 = ", ";
    Object v28 = ((com.fasterxml.jackson.databind.DeserializationContext)v23).weirdNumberException(((java.lang.Number)v24),((java.lang.Class)v26),((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "array";
    Object v5 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v0),((java.text.DateFormat)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getDelegatee();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getKnownPropertyNames();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "m";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v17).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    Object v32 = new java.util.concurrent.atomic.AtomicReference();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v31).updateReference(((java.util.concurrent.atomic.AtomicReference)v32),((java.lang.Object)v34));
    Object v36 = new java.util.concurrent.atomic.AtomicReference();
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v31).getReferenced(((java.util.concurrent.atomic.AtomicReference)v36));
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v29));
    Object v31 = new java.util.concurrent.atomic.AtomicReference();
    Object v32 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).updateReference(((java.util.concurrent.atomic.AtomicReference)v31),((java.lang.Object)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = "item";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getEmptyAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new java.util.concurrent.atomic.AtomicReference();
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).getReferenced(((java.util.concurrent.atomic.AtomicReference)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new java.io.ByteArrayOutputStream();
    Object v21 = ((com.fasterxml.jackson.core.JsonParser)v19).readBinaryValue(((java.io.OutputStream)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = "Ctems";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).mappingException(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v26 = ", ";
    Object v27 = ")E";
    Object v28 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JsonDeserializer)v25).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v29).handledType();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "aray";
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).findBackReference(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v19).nextBooleanValue();
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v24 = ", ";
    Object v25 = ")E";
    Object v26 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JsonDeserializer)v23).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v27).handledType();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).referenceValue(((java.lang.Object)v18));
    Object v20 = -33;
    Object v21 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v24));
    Object v26 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v22),((com.fasterxml.jackson.databind.DeserializationContext)v25),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "array";
    Object v5 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v0),((java.text.DateFormat)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getNullValue();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v19).getCurrentToken();
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v21 = -33;
    Object v22 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = "m";
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new java.util.concurrent.atomic.AtomicReference();
    Object v18 = java.util.Comparator.naturalOrder();
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).updateReference(((java.util.concurrent.atomic.AtomicReference)v17),((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).mappingException(((java.lang.Class)v24),((com.fasterxml.jackson.core.JsonToken)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v19).currentName();
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getKnownPropertyNames();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v21 = -33;
    Object v22 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v28 = ", ";
    Object v29 = ")E";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = "Cannot deserialize instance of %s out of %s token";
    Object v32 = ((com.fasterxml.jackson.databind.util.NameTransformer)v30).transform(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getNullAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "array";
    Object v5 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v0),((java.text.DateFormat)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getNullValue();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ", ";
    Object v8 = ")E";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getKnownPropertyNames();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v21 = -33;
    Object v22 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ", ";
    Object v31 = ")E";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = "Cannot deserialize instance of %s out of %s token";
    Object v34 = ((com.fasterxml.jackson.databind.util.NameTransformer)v32).transform(((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "array";
    Object v5 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer(((com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer)v0),((java.text.DateFormat)v3),((java.lang.String)v4));
    Object v6 = ", ";
    Object v7 = ")E";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v9).handledType();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new java.io.ByteArrayOutputStream();
    Object v24 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v24).handledType();
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).weirdNativeValueException(((java.lang.Object)v23),((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = "m";
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "m";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v17).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v31).getNullAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.type.TypeFactory)v29));
    Object v31 = "m";
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v30),((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v34).getTypeInclusion();
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = -33;
    Object v19 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v19));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.type.TypeFactory)v30));
    Object v32 = "m";
    Object v33 = false;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v31),((java.lang.String)v32),(((java.lang.Boolean)v33).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v17).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v20),((com.fasterxml.jackson.databind.DeserializationContext)v23),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ", ";
    Object v31 = ")E";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = "Cannot deserialize instance of %s out of %s token";
    Object v34 = ((com.fasterxml.jackson.databind.util.NameTransformer)v32).transform(((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v35));
    Object v37 = new java.util.concurrent.atomic.AtomicReference();
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v36).getReferenced(((java.util.concurrent.atomic.AtomicReference)v37));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = ((com.fasterxml.jackson.core.JsonParser)v19).getCurrentToken();
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = "number";
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v23).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.type.TypeFactory)v33));
    Object v35 = "m";
    Object v36 = false;
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v34),((java.lang.String)v35),(((java.lang.Boolean)v36).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v23),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "m";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "m";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v17).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    Object v32 = -33;
    Object v33 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v32).intValue()));
    Object v34 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v33));
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v31).deserialize(((com.fasterxml.jackson.core.JsonParser)v34),((com.fasterxml.jackson.databind.DeserializationContext)v37),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new java.util.concurrent.atomic.AtomicReference();
    Object v18 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v19 = ((com.fasterxml.jackson.databind.JsonDeserializer)v18).isCachable();
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).updateReference(((java.util.concurrent.atomic.AtomicReference)v17),((java.lang.Object)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = ", ";
    Object v17 = ")E";
    Object v18 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonDeserializer)v15).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v21 = -33;
    Object v22 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v21).intValue()));
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).getCurrentName();
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = new java.io.ByteArrayOutputStream();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v27),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).referenceValue(((java.lang.Object)v17));
    Object v19 = -33;
    Object v20 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = java.util.Comparator.naturalOrder();
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v21),((com.fasterxml.jackson.databind.DeserializationContext)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ")";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "m";
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v23 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v9),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v23));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = ", ";
    Object v21 = ")E";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "Cannot deserialize instance of %s out of %s token";
    Object v24 = ((com.fasterxml.jackson.databind.util.NameTransformer)v22).transform(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v22));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).handledType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ", ";
    Object v31 = ")E";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = "Cannot deserialize instance of %s out of %s token";
    Object v34 = ((com.fasterxml.jackson.databind.util.NameTransformer)v32).transform(((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v36).getValueType();
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = -33;
    Object v24 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v23).intValue()));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v28 = ")";
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.core.JsonToken)v27),((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ", ";
    Object v31 = ")E";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = "Cannot deserialize instance of %s out of %s token";
    Object v34 = ((com.fasterxml.jackson.databind.util.NameTransformer)v32).transform(((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v36).getEmptyAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = ", ";
    Object v21 = ")E";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "Cannot deserialize instance of %s out of %s token";
    Object v24 = ((com.fasterxml.jackson.databind.util.NameTransformer)v22).transform(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v22));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v26).getNullAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v29));
    Object v31 = -33;
    Object v32 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v31).intValue()));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v38 = ((com.fasterxml.jackson.databind.JsonDeserializer)v37).isCachable();
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v30).deserialize(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = -33;
    Object v21 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v20).intValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v26 = "org.apache.ibatis.parsing.XPathParser";
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationContext)v19).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v22),((java.lang.Class)v24),((com.fasterxml.jackson.core.JsonToken)v25),((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v19));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ", ";
    Object v8 = ")E";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = ", ";
    Object v12 = ")E";
    Object v13 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v10).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v13));
    org.junit.Assert.assertNotNull(v14);
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
    Object v6 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "m";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v20 = ", ";
    Object v21 = ")E";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "Cannot deserialize instance of %s out of %s token";
    Object v24 = ((com.fasterxml.jackson.databind.util.NameTransformer)v22).transform(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v22));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v25));
    Object v27 = -33;
    Object v28 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v27).intValue()));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ", ";
    Object v31 = ")E";
    Object v32 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v29).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v16).getEmptyValue();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "m";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer)v16).withResolved(((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v29));
    Object v31 = -33;
    Object v32 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v31).intValue()));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v30).deserialize(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v1 = ", ";
    Object v2 = ")E";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Cannot deserialize instance of %s out of %s token";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getNullValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "m";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v2),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = -33;
    Object v18 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    Object v20 = "Multiple type ids specified with ";
    ((com.fasterxml.jackson.core.JsonParser)v19).setRequestPayloadOnError(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
