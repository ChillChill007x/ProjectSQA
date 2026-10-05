package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = "t";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.util.Annotations)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v1).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.BeanProperty)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v1).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getObjectIdReader();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "Sub-cl";
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).mappingException(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v1)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ")";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ")";
    Object v2 = "";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "t";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.BeanProperty)v22).getName();
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).hasTextCharacters();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "i";
    Object v11 = false;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "t";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v4),((java.util.concurrent.atomic.AtomicReference)v7));
    Object v9 = "t";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "t";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.core.JsonToken)v6),((java.lang.String)v7));
    Object v9 = "t";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v3).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v1)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "t";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).findObjectId(((java.lang.Object)v5),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v8));
    Object v10 = "t";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).getValueType();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ")";
    Object v2 = "";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueType();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new java.io.IOException();
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).instantiationException(((java.lang.Class)v7),((java.lang.Throwable)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getEmptyValue();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getLastClearedToken();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v7));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getKnownPropertyNames();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v7 = "t";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17),((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "t";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.BeanProperty)v22).getFullName();
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "t";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "t";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.BeanProperty)v24).getContextAnnotation(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = "Illegal key-type annotation: type ";
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v2).getValueAsString(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v7).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v4).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v4).getCodec();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "t";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.BeanProperty)v24).getName();
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ")";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "t";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17),((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "(@JsonValue serializer fo";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = "i";
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v7));
    Object v9 = "t";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19),((java.lang.Object)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v28).handledType();
    Object v30 = ((com.fasterxml.jackson.databind.BeanProperty)v27).getContextAnnotation(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new java.io.IOException();
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).instantiationException(((java.lang.Class)v9),((java.lang.Throwable)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10));
    Object v12 = "i";
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v11),((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v4).nextTextValue();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v4).hasTextCharacters();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).nextBooleanValue();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).hasCurrentToken();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = "]";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).getValueClass();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v12 = "}Illegal key-type annotation: type ";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.core.JsonToken)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getDelegatee();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new java.io.IOException();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).findObjectId(((java.lang.Object)v9),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "i";
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v22));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).getBinaryValue();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).checkUnresolvedObjectId();
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v8).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).endOfInputException(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getTextOffset();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).getArrayBuilders();
    Object v7 = "t";
    Object v8 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17),((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getKnownPropertyNames();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).getArrayBuilders();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = "i";
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.Class)v12));
    Object v14 = ")";
    Object v15 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    ((com.fasterxml.jackson.databind.DeserializationContext)v4).reportUnknownProperty(((java.lang.Object)v13),((java.lang.String)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v17));
    Object v18 = null;
    Object v19 = "t";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v36 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.util.Annotations)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v1).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.BeanProperty)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = "]";
    Object v7 = ((com.fasterxml.jackson.core.JsonParser)v5).getValueAsString(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).checkUnresolvedObjectId();
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "i";
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v20));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getObjectIdReader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).handledType();
    Object v10 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).mappingException(((java.lang.Class)v9),((com.fasterxml.jackson.core.JsonToken)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v7 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.core.JsonToken)v6),((java.lang.String)v7));
    Object v9 = "t";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "'";
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).instantiationException(((java.lang.Class)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v4).isExpectedStartArrayToken();
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = ")";
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).findBackReference(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).handledType();
    Object v8 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).mappingException(((java.lang.Class)v7),((com.fasterxml.jackson.core.JsonToken)v8));
    Object v10 = "t";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20),((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v7));
    Object v8 = null;
    Object v9 = "t";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.util.Annotations)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v27).getWrapperName();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).getValueType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).leaseObjectBuffer();
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3)._deserializeCustom(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getKnownPropertyNames();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v2).nextIntValue((((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "]";
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).mappingException(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v4 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3));
    Object v5 = "GMT";
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v4).getValueAsString(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v4),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "t";
    Object v7 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.util.Annotations)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.BeanProperty)v24).isRequired();
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v2).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.BeanProperty)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v2));
    Object v4 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer();
    Object v1 = com.fasterxml.jackson.databind.node.MissingNode.getInstance();
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueClass();
    Object v8 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).mappingException(((java.lang.Class)v7),((com.fasterxml.jackson.core.JsonToken)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
