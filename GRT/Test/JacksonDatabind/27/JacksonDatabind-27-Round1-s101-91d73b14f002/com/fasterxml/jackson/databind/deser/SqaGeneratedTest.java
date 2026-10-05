package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getKnownPropertyNames();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromBoolean(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getValueType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).getValueClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = "array";
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).getValueAsString(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.core.JsonToken)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getDelegatee();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).getValueClass();
    Object v10 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).mappingException(((java.lang.Class)v9),((com.fasterxml.jackson.core.JsonToken)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v5));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = "strin";
    Object v9 = "A]";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v17));
    Object v19 = true;
    Object v20 = "";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v19).booleanValue()),((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v18),((com.fasterxml.jackson.databind.PropertyMetadata)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v25).getValueClass();
    Object v27 = true;
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.InnerClassProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v22),((java.lang.reflect.Constructor)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = "() returned valBe of type ";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getNullValue();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = -6;
    Object v10 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v16 = ": ";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.core.JsonToken)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromNumber(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).properties();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v3),((com.fasterxml.jackson.databind.DeserializationConfig)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.lang.Object[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = " Oexpected type: ";
    Object v24 = "a";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = "strin";
    Object v29 = "A]";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new java.lang.Object[]{null,null,null};
    Object v33 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v32));
    Object v34 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v30),((java.lang.Object)v31),((java.lang.Object)v33));
    Object v35 = new java.lang.Object[]{null,null,null};
    Object v36 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v35));
    Object v37 = false;
    Object v38 = true;
    Object v39 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v9),((com.fasterxml.jackson.databind.BeanDescription)v13),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v17),((java.util.Map)v34),((java.util.HashSet)v36),(((java.lang.Boolean)v37).booleanValue()),(((java.lang.Boolean)v38).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ")";
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.String)v13),((java.lang.Object[])v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getFloatValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).leaseObjectBuffer();
    Object v12 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).getArrayBuilders();
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromEmbedded(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getCurrentLocation();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).hasProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.core.JsonToken)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).hasProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromEmbedded(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v3),((com.fasterxml.jackson.databind.DeserializationConfig)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.lang.Object[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = " Oexpected type: ";
    Object v24 = "a";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = "strin";
    Object v29 = "A]";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new java.lang.Object[]{null,null,null};
    Object v33 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v32));
    Object v34 = java.util.Map.of(((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v22),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v27),((java.lang.Object)v30),((java.lang.Object)v31),((java.lang.Object)v33));
    Object v35 = new java.lang.Object[]{null,null,null};
    Object v36 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v35));
    Object v37 = true;
    Object v38 = true;
    Object v39 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v9),((com.fasterxml.jackson.databind.BeanDescription)v13),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v17),((java.util.Map)v34),((java.util.HashSet)v36),(((java.lang.Boolean)v37).booleanValue()),(((java.lang.Boolean)v38).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).nextTextValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromBoolean(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "6NamedType, class ";
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).instantiationException(((java.lang.Class)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v5));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new java.util.concurrent.atomic.AtomicReference();
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v10),((java.util.concurrent.atomic.AtomicReference)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getFloatValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.core.JsonToken)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " Oexpected type: ";
    Object v2 = "a";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.core.JsonToken)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).creatorProperties();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getPropertyCount();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = "";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    ((com.fasterxml.jackson.databind.DeserializationContext)v12).reportUnknownProperty(((java.lang.Object)v13),((java.lang.String)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = null;
    Object v21 = "(vs ";
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 1;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).hasTokenId((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = -6;
    Object v13 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v13),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "item";
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = 1L;
    Object v15 = -29L;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).instantiationException(((java.lang.Class)v11),((java.lang.Throwable)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v24).getValueClass();
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v21),((java.lang.Class)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "strin";
    Object v6 = "A]";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v14));
    Object v16 = true;
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v16).booleanValue()),((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v15),((com.fasterxml.jackson.databind.PropertyMetadata)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v22).getValueClass();
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.InnerClassProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v19),((java.lang.reflect.Constructor)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new java.lang.Object[]{null,null,null};
    Object v11 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v10));
    Object v12 = " vsX ";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).reportUnknownProperty(((java.lang.Object)v11),((java.lang.String)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromNumber(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "item";
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = 1L;
    Object v15 = -29L;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v12),((com.fasterxml.jackson.core.JsonLocation)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).instantiationException(((java.lang.Class)v11),((java.lang.Throwable)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((java.lang.Class)v23).isMemberClass();
    Object v25 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v21),((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getCurrentValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "item";
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = 1L;
    Object v16 = -29L;
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.JsonMappingException(((java.lang.String)v13),((com.fasterxml.jackson.core.JsonLocation)v19));
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).instantiationException(((java.lang.Class)v12),((java.lang.Throwable)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v9).getValueClass();
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v6).readValueAs(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).isCachable();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).getArrayBuilders();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = "(vs ";
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = "strin";
    Object v3 = "A]";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v4),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v10),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).withObjectIdReader(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " Oexpected type: ";
    Object v2 = "a";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0),((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).withIgnorableProperties(((java.util.HashSet)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getValueInstantiator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0),(((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v5),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = "strin";
    Object v14 = "A]";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v22));
    Object v24 = true;
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v24).booleanValue()),((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v23),((com.fasterxml.jackson.databind.PropertyMetadata)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v30).getValueClass();
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.InnerClassProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27),((java.lang.reflect.Constructor)v33));
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -69;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getFloatValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "'";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).hasProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v13).getValueClass();
    Object v15 = ((java.lang.Class)v14).getClassLoader();
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((java.lang.Class)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = "strin";
    Object v11 = "A]";
    Object v12 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).isClosed();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v10),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((java.lang.Class)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.core.JsonToken)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getFloatValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeUsingPropertyBased(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = -6;
    Object v11 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getDoubleValue();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v10),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v13),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = "strin";
    Object v15 = "A]";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23));
    Object v25 = true;
    Object v26 = "";
    Object v27 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v25).booleanValue()),((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v24),((com.fasterxml.jackson.databind.PropertyMetadata)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v31).getValueClass();
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.InnerClassProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28),((java.lang.reflect.Constructor)v34));
    Object v36 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.BeanProperty)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v6).getEmbeddedObject();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v10),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v17).getValueClass();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v14),((java.lang.Class)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "H";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 4;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = "Can not instantiate value of type %s from Boolean value(%s)";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.getClassDescription(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = 0;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v6).nextIntValue((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = "strin";
    Object v15 = "A]";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23));
    Object v25 = true;
    Object v26 = "";
    Object v27 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v25).booleanValue()),((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v24),((com.fasterxml.jackson.databind.PropertyMetadata)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v31).getValueClass();
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.InnerClassProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28),((java.lang.reflect.Constructor)v34));
    Object v36 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.BeanProperty)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -6;
    Object v2 = com.fasterxml.jackson.databind.node.IntNode.valueOf((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v3));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v9),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
