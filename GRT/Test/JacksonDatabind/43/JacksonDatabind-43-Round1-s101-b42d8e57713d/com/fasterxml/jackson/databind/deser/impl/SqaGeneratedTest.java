package com.fasterxml.jackson.databind.deser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = 17;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).assignIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getValueDeserializer();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setViews(((java.lang.Class[])v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setViews(((java.lang.Class[])v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = "]";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).setAndReturn(((java.lang.Object)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).setAndReturn(((java.lang.Object)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.BeanProperty)v18).getFullName();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v18).getMetadata();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = java.util.Map.of();
    Object v22 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.core.JsonFactory();
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22),((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).deserialize(((com.fasterxml.jackson.core.JsonParser)v25),((com.fasterxml.jackson.databind.DeserializationContext)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "#";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider)v19).setProvider(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v19),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getFullName();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).getContextAnnotation(((java.lang.Class)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "string";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = java.util.Map.of();
    Object v25 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).setAndReturn(((java.lang.Object)v23),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getValueDeserializer();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v19),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    Object v22 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setViews(((java.lang.Class[])v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = -43;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).assignIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v18).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getContextAnnotation(((java.lang.Class)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v20).getMetadata();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "Unresolv";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setManagedReferenceName(((java.lang.String)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).getContextAnnotation(((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = -1;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).assignIndex((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).getMetadata();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v20),((java.lang.Class)v22),((java.lang.Class)v24));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v25));
    Object v26 = null;
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v27).booleanValue()));
    Object v29 = java.util.Map.of();
    Object v30 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v28),((java.util.Map)v29));
    Object v31 = new com.fasterxml.jackson.core.JsonFactory();
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v31));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v38 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v19),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).getAnnotation(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).visibleInView(((java.lang.Class)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = 1;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).assignIndex((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v29 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v24).setAndReturn(((java.lang.Object)v27),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = java.util.Map.of();
    Object v24 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v22),((java.util.Map)v23));
    Object v25 = new com.fasterxml.jackson.core.JsonFactory();
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24),((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = "]";
    Object v32 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v32),((java.lang.Class)v34),((java.lang.Class)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).visibleInView(((java.lang.Class)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getManagedReferenceName();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = "";
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).withName(((java.lang.String)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).setViews(((java.lang.Class[])v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v29).booleanValue()));
    Object v31 = java.util.Map.of();
    Object v32 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v30),((java.util.Map)v31));
    Object v33 = new com.fasterxml.jackson.core.JsonFactory();
    Object v34 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v33));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32),((com.fasterxml.jackson.core.ObjectCodec)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).deserialize(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getCreatorIndex();
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).toString();
    org.junit.Assert.assertEquals((Object)("[property 'a']"), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new com.fasterxml.jackson.core.JsonFactory();
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v28));
    Object v30 = true;
    Object v31 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v29),(((java.lang.Boolean)v30).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v27).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v31));
    Object v32 = null;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v25),((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getValueDeserializer();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).visibleInView(((java.lang.Class)v30));
    org.junit.Assert.assertEquals((Object)(true), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = java.util.Map.of();
    Object v22 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v20),((java.util.Map)v21));
    Object v23 = new com.fasterxml.jackson.core.JsonFactory();
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22),((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v25),((com.fasterxml.jackson.databind.DeserializationContext)v28),((java.lang.Object)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v20).isVirtual();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).setViews(((java.lang.Class[])v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = "]";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v22),((java.lang.Class)v24),((java.lang.Class)v26));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27));
    Object v28 = null;
    Object v29 = "#";
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = 0;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getNestMembers();
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).getAnnotation(((java.lang.Class)v22));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).getName();
    org.junit.Assert.assertEquals((Object)("]"), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = "#";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).setViews(((java.lang.Class[])v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = java.util.Map.of();
    Object v24 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v22),((java.util.Map)v23));
    Object v25 = new com.fasterxml.jackson.core.JsonFactory();
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24),((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = new java.util.concurrent.atomic.AtomicReference();
    Object v33 = ((com.fasterxml.jackson.databind.DeserializationContext)v30).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v31),((java.util.concurrent.atomic.AtomicReference)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).deserialize(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = "]";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v22),((java.lang.Class)v24),((java.lang.Class)v26));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27));
    Object v28 = null;
    Object v29 = "#";
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v31).getAnnotation(((java.lang.Class)v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).visibleInView(((java.lang.Class)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "not a valid Double value";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).getAnnotation(((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider)v28).setProvider(((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v28),((com.fasterxml.jackson.databind.SerializerProvider)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v19),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "not a valid Double value";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).getAnnotation(((java.lang.Class)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = "";
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).withName(((java.lang.String)v29));
    Object v31 = new java.util.concurrent.atomic.AtomicReference();
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v30).setAndReturn(((java.lang.Object)v31),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v20),((java.lang.Class)v22),((java.lang.Class)v24));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getManagedReferenceName();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "not a valid Double value";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).getFullName();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "not a valid Double value";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).getInjectableValueId();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v18).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getCreatorIndex();
    org.junit.Assert.assertEquals((Object)(-1), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v22).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v24 = null;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = 33;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).assignIndex((((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = "#";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v22));
    Object v24 = "byt&";
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).withSimpleName(((java.lang.String)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).getValueDeserializer();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = "]";
    Object v12 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18));
    Object v20 = true;
    Object v21 = ")";
    Object v22 = 0;
    Object v23 = "Q";
    Object v24 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v20).booleanValue()),((java.lang.String)v21),((java.lang.Integer)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v19),((com.fasterxml.jackson.databind.PropertyMetadata)v24));
    Object v26 = "#";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27));
    Object v29 = "]k";
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).withSimpleName(((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v30).getMetadata();
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).setViews(((java.lang.Class[])v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).getPropertyIndex();
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "not a valid Double value";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).setAndReturn(((java.lang.Object)v21),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getAnnotation(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getValueTypeDeserializer();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).getInjectableValueId();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.BeanProperty)v20).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v20).isRequired();
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "not a valid Double value";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = "]";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v22),((java.lang.Class)v24),((java.lang.Class)v26));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "a";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withSimpleName(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).getValueDeserializer();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "[pa";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = 59;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v20).assignIndex((((java.lang.Integer)v21).intValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.PropertyName)v20).equals(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v25 = 43;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v24).assignIndex((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).getValueDeserializer();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = 28;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).assignIndex((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v18).withName(((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = "&";
    Object v23 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v21).withName(((java.lang.String)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = "*items";
    Object v27 = ((com.fasterxml.jackson.databind.PropertyName)v25).hasSimpleName(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v21).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v29 = "";
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).withName(((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v30).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "]";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = "#";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReader(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v8));
    Object v10 = true;
    Object v11 = ")";
    Object v12 = 0;
    Object v13 = "Q";
    Object v14 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11),((java.lang.Integer)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v9),((com.fasterxml.jackson.databind.PropertyMetadata)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "]k";
    Object v20 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v18).withSimpleName(((java.lang.String)v19));
    Object v21 = "#";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty)v20).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v22));
    Object v24 = "]";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).withName(((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v27),((com.fasterxml.jackson.databind.SerializerProvider)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }
}
