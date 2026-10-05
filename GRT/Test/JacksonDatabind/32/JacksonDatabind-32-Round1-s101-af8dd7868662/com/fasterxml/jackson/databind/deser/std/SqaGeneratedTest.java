package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "Roo name '";
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).instantiationException(((java.lang.Class)v5),((java.lang.String)v6));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).mapObject(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "itemR";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((java.lang.reflect.Type)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.BeanProperty)v18).getName();
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "itemR";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((java.lang.reflect.Type)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v18));
    Object v20 = Short.valueOf((short)0);
    Object v21 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = Short.valueOf((short)0);
    Object v24 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v23).shortValue()));
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24));
    ((com.fasterxml.jackson.core.JsonParser)v22).setCurrentValue(((java.lang.Object)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).mapObject(((com.fasterxml.jackson.core.JsonParser)v22),((com.fasterxml.jackson.databind.DeserializationContext)v29));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.JsonDeserializer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5)._clearIfStdImpl(((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).mapArray(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = Short.valueOf((short)0);
    Object v9 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v8).shortValue()));
    Object v10 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v7),((java.util.concurrent.atomic.AtomicReference)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = "Trying to resolve a forward reference with id [";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).isCachable();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v5).getValueType();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = "Trying to resolve a forward reference with id [";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "itemR";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((java.lang.reflect.Type)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v18));
    Object v20 = Short.valueOf((short)0);
    Object v21 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).mapObject(((com.fasterxml.jackson.core.JsonParser)v22),((com.fasterxml.jackson.databind.DeserializationContext)v25));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0)._findCustomDeser(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getKnownPropertyNames();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getKnownPropertyNames();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6)._clearIfStdImpl(((com.fasterxml.jackson.databind.JsonDeserializer)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "itemR";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((java.lang.reflect.Type)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v20));
    Object v22 = Short.valueOf((short)0);
    Object v23 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v22).shortValue()));
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23));
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v24),((com.fasterxml.jackson.databind.DeserializationContext)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    Object v13 = "Trying to resolve a forward reference with id [";
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17));
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
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9),((com.fasterxml.jackson.databind.JsonDeserializer)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v18 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v19 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v20 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.JsonDeserializer)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6)._withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "itemR";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v17),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanProperty)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9)._clearIfStdImpl(((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getDelegatee();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getObjectIdReader();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getWrapperName();
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = Short.valueOf((short)0);
    Object v11 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v10).shortValue()));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).deserialize(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = "";
    ((com.fasterxml.jackson.core.JsonParser)v8).overrideCurrentName(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v13));
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
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = Short.valueOf((short)0);
    Object v8 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v7).shortValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "Unrlcognized filter type (";
    Object v16 = new java.lang.Throwable(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).instantiationException(((java.lang.Class)v14),((java.lang.Throwable)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6).mapObject(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ")]";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).instantiationException(((java.lang.Class)v16),((java.lang.String)v17));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v14));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = "itemR";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v14),((java.lang.reflect.Type)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.BeanProperty)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    ((com.fasterxml.jackson.databind.DeserializationContext)v3).checkUnresolvedObjectId();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = Short.valueOf((short)0);
    Object v11 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v10).shortValue()));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v26).isCachable();
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).leaseObjectBuffer();
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = "Unrlcognized filter type (";
    Object v21 = new java.lang.Throwable(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).instantiationException(((java.lang.Class)v19),((java.lang.Throwable)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = null;
    Object v29 = "Trying to resolve a forward reference with id [";
    Object v30 = true;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getDelegatee();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
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
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = Short.valueOf((short)0);
    Object v8 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v7).shortValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v9).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = Short.valueOf((short)0);
    Object v7 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).mapArray(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = Short.valueOf((short)0);
    Object v32 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v31).shortValue()));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).mapArray(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "W";
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).findBackReference(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getKnownPropertyNames();
    org.junit.Assert.assertNull(v12);
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v9).getNullValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v34 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v35 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v37 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v38 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v33),((com.fasterxml.jackson.databind.JsonDeserializer)v34),((com.fasterxml.jackson.databind.JsonDeserializer)v35),((com.fasterxml.jackson.databind.JsonDeserializer)v36),((com.fasterxml.jackson.databind.JsonDeserializer)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11)._clearIfStdImpl(((com.fasterxml.jackson.databind.JsonDeserializer)v38));
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v11).handledType();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v18 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v19 = "itemsf";
    Object v20 = "s<t";
    Object v21 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v18).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v24 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v25 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v26 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v27 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v23),((com.fasterxml.jackson.databind.JsonDeserializer)v24),((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v26),((com.fasterxml.jackson.databind.JsonDeserializer)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v30 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v31 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v32 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v33 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v34 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v29),((com.fasterxml.jackson.databind.JsonDeserializer)v30),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.JsonDeserializer)v32),((com.fasterxml.jackson.databind.JsonDeserializer)v33));
    Object v35 = "itemsf";
    Object v36 = "s<t";
    Object v37 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v35),((java.lang.String)v36));
    Object v38 = ((com.fasterxml.jackson.databind.JsonDeserializer)v34).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11)._withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.JsonDeserializer)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5)._findCustomDeser(((com.fasterxml.jackson.databind.DeserializationContext)v29),((com.fasterxml.jackson.databind.JavaType)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = Short.valueOf((short)0);
    Object v28 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v27).shortValue()));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).mapArray(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).getArrayBuilders();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = null;
    Object v25 = "Trying to resolve a forward reference with id [";
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = null;
    Object v24 = "Trying to resolve a forward reference with id [";
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28));
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
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.JsonDeserializer)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6)._clearIfStdImpl(((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonDeserializer)v26).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = "ite";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = null;
    Object v27 = "Trying to resolve a forward reference with id [";
    Object v28 = true;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = Short.valueOf((short)0);
    Object v11 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v10).shortValue()));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = null;
    Object v22 = "Trying to resolve a forward reference with id [";
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = Short.valueOf((short)0);
    Object v8 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v7).shortValue()));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6).mapArray(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v6).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JsonDeserializer)v26).getDelegatee();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.BeanProperty)v29).getMember();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.BeanProperty)v29).getMember();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v32 = "";
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v31).findBackReference(((java.lang.String)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "itemR";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v8),((java.lang.reflect.Type)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.BeanProperty)v18).getName();
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v18));
    Object v21 = ((com.fasterxml.jackson.databind.JsonDeserializer)v20).getObjectIdReader();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "itemR";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v17),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.util.Annotations)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = Short.valueOf((short)0);
    Object v32 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v31).shortValue()));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = ((com.fasterxml.jackson.core.JsonParser)v33).getEmbeddedObject();
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9).mapArray(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JsonDeserializer)v32).getNullValue();
    org.junit.Assert.assertNull(v33);
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = Short.valueOf((short)0);
    Object v32 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v31).shortValue()));
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).mapArray(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = Short.valueOf((short)0);
    Object v34 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v33).shortValue()));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v32).mapArray(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getWrapperName();
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = Short.valueOf((short)0);
    Object v29 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v30).getTextOffset();
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v27).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v11),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v14));
    Object v16 = "itemsf";
    Object v17 = "s<t";
    Object v18 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "T";
    Object v20 = ((com.fasterxml.jackson.databind.util.NameTransformer)v18).transform(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JsonDeserializer)v15).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v18));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v9)._clearIfStdImpl(((com.fasterxml.jackson.databind.JsonDeserializer)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = Short.valueOf((short)0);
    Object v34 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v33).shortValue()));
    Object v35 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v32).mapArrayToArray(((com.fasterxml.jackson.core.JsonParser)v35),((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getFloatValue();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).mapArray(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18));
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "itemR";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.BeanProperty)v29).getMember();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.BeanProperty)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "itemR";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v13),((java.lang.reflect.Type)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v21),((java.lang.Object)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getWrapperName();
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v5).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v27).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = Short.valueOf((short)0);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = "itemR";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = 0;
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v18),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.util.Annotations)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.BeanProperty)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0).mapObject(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v2).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "itemR";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18),((java.lang.Object)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.BeanProperty.Std)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v2).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v26));
    Object v27 = null;
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
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getLastClearedToken();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = Short.valueOf((short)0);
    Object v20 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v19).shortValue()));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationContext)v18).findObjectId(((java.lang.Object)v21),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = null;
    Object v32 = "Trying to resolve a forward reference with id [";
    Object v33 = true;
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v31),((java.lang.String)v32),(((java.lang.Boolean)v33).booleanValue()),((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = "No content to map due to end-of-input";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).reportUnknownProperty(((java.lang.Object)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v22));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).mapObject(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = "null";
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).findBackReference(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = "itemsf";
    Object v4 = "s<t";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.JsonDeserializer)v2),((com.fasterxml.jackson.databind.JsonDeserializer)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v4));
    Object v6 = "itemsf";
    Object v7 = "s<t";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "T";
    Object v10 = ((com.fasterxml.jackson.databind.util.NameTransformer)v8).transform(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v12 = Short.valueOf((short)0);
    Object v13 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)v11).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
