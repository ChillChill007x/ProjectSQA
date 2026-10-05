package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databin";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v16 = "numbeG";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.core.JsonToken)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v10 = "string";
    Object v11 = "a";
    Object v12 = new java.lang.NoClassDefFoundError(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v12));
    ((com.fasterxml.jackson.databind.DeserializationContext)v8).reportUnknownProperty(((java.lang.Object)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v13));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "true";
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
    org.junit.Assert.assertEquals((Object)("true"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "ites";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = 6.376885066998612D;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "L";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).weirdNumberException(((java.lang.Number)v9),((java.lang.Class)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "string";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertEquals((Object)("string"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "a";
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parseLong(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "DtYNAMIC";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertEquals((Object)("DtYNAMIC"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "sring";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "`";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "a";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v10));
    Object v12 = "";
    Object v13 = ",";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "Y";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v25),((java.lang.String)v26),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30),((java.lang.Object)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.BeanProperty)v32),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "numbec";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "]";
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "`rray";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "deserializer";
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "]";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "array";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "Trying to resolve a forward reference with id [";
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "strin";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "]";
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "items";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v19 = "string";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v13),((java.lang.Class)v17),((com.fasterxml.jackson.core.JsonToken)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parse(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ")";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "Parameter #0 type for factory method (";
    Object v11 = "[TokenBuffer: ";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertEquals((Object)(")"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "m";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "'";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "aray";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4)._parseInt(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).endOfInputException(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "not a v";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "Cannot use FormatSchema of type ";
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._weirdKey(((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.String)v9),((java.lang.Exception)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parseDouble(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "string";
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parseLong(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "array";
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parseDouble(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "items";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 6;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parseDouble(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "c";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parse(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "org.apache.commons.collections.functors.InstantiateTransformer";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "Failed to specialize base type ";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "items";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parse(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "items7";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v17 = "Cannot call setValue() Mon constructor parameter of ";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.core.JsonToken)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "Trying to";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v13 = "";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parseLong(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v10));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "Infinite recursion (StackOverflowError)";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "Called ";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "it/ms";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "U3TC";
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parseLong(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "type ids are not statically kno.n";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "Cannot use FormatSchema of type ";
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._weirdKey(((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.String)v9),((java.lang.Exception)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "string";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parse(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "+0000";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parseDouble(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = ", ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parse(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "[nulCl]";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).deserializeKey(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "DYNMIC";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v13 = "Problem deserializing 'setterless' property '%s': get method returned null";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertEquals((Object)("Problem deserializing 'setterless' property '%s': get method returned null"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "'T)]";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = 1;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v11).intValue()),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v16).getKeyClass();
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v9).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "an>";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v19 = "Ca@not set virtual property '";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.core.JsonToken)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "boolean";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "a";
    Object v14 = new java.lang.NoClassDefFoundError(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v14));
    Object v16 = "";
    Object v17 = ",";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = "Y";
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v25),((java.lang.Class)v29),((java.lang.String)v30),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v34),((java.lang.Object)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.BeanProperty)v36),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertEquals((Object)(")"), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = "'";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "]";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v13 = "]";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = "]";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = "itms";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertEquals((Object)("itms"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "[map type; cl";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = "), cannot call with() on it";
    Object v11 = new java.lang.Object[]{null,null};
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).mappingException(((java.lang.String)v10),((java.lang.Object[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertEquals((Object)("[map type; cl"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "Non-generic Collection class %s did not resolve to something with element type %s but %s ";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parseDouble(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).isPrimitive();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 44;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    Object v7 = "Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6)._parse(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "1";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertEquals((Object)("1"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = ")";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).isPrimitive();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "False";
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parseLong(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 70;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 70;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    Object v9 = "not a valid representation";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = "Intances of ";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ", Uroblem: ";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "not a vaYlid representation";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    Object v11 = "number";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "tring";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertEquals((Object)("tring"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "via method";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "need JSON Array to contain As.WRAPPER_ARRAY type information for class ";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "\"%s\"";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).deserializeKey(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertEquals((Object)("\"%s\""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v8 = "n)";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v13 = ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    Object v11 = "withConfig";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v10).deserializeKey(((java.lang.String)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
    org.junit.Assert.assertEquals((Object)("withConfig"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "string";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 6;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    Object v9 = "; expected type Converter or Class<Con8erter> instead";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).isPrimitive();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "items";
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parseInt(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5).getKeyClass();
    Object v7 = ((java.lang.Class)v6).getNestMembers();
    Object v8 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v6));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    Object v11 = "f";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new java.util.concurrent.atomic.AtomicReference();
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v17),((java.util.concurrent.atomic.AtomicReference)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v10).deserializeKey(((java.lang.String)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
    org.junit.Assert.assertEquals((Object)("f"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 6;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    Object v9 = "items";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -11;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getModifiers();
    Object v5 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v6 = "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS";
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v5)._parse(((java.lang.String)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v3));
    Object v5 = "Invalid Object Id definition for %s: cannot find property wih name '%s'";
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = "null";
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.Class)v18).getPackageName();
    Object v20 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v18));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v20).getKeyClass();
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).weirdNativeValueException(((java.lang.Object)v14),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v4).deserializeKey(((java.lang.String)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
    org.junit.Assert.assertEquals((Object)("null"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 70;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    Object v9 = "W";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 70;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    Object v9 = "(";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -11;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v4),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 70;
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v6).getKeyClass();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v7));
    Object v9 = "Cannot gest virtual property '";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
