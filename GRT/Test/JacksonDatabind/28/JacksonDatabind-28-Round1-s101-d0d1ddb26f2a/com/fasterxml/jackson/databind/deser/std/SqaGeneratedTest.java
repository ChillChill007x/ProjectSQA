package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getEmptyValue();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new java.util.TreeSet();
    Object v8 = new java.util.TreeSet();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v5).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new java.util.TreeSet();
    Object v8 = new java.util.TreeSet();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new java.util.TreeSet();
    Object v21 = new java.util.TreeSet();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v23));
    Object v25 = "st";
    Object v26 = "[";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = null;
    Object v29 = true;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = "[";
    Object v32 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v30),((com.fasterxml.jackson.databind.PropertyName)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v33),((com.fasterxml.jackson.databind.util.Annotations)v34),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = ((com.fasterxml.jackson.databind.DeserializationContext)v18).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v24),((com.fasterxml.jackson.databind.BeanProperty)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v5).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new java.util.TreeSet();
    Object v8 = new java.util.TreeSet();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getDelegatee();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v5).getValueType();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new java.util.TreeSet();
    Object v8 = new java.util.TreeSet();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new java.util.TreeSet();
    Object v18 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).getNullValue();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).handledType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getKnownPropertyNames();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).isEnum();
    Object v13 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v18));
    Object v19 = null;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "Attempted to unwrap single value array for single ";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v10).getEmptyValue();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).nextIntValue((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v18).getValueClass();
    Object v20 = "lrray";
    Object v21 = new java.lang.Throwable(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).instantiationException(((java.lang.Class)v19),((java.lang.Throwable)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "N";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).mappingException(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getObjectIdReader();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getObjectIdReader();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).getNullValue();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v18).handledType();
    Object v20 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).getEmptyValue();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).nextBooleanValue();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    ((com.fasterxml.jackson.databind.DeserializationContext)v12).checkUnresolvedObjectId();
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getObjectIdReader();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v18).handledType();
    Object v20 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).mappingException(((java.lang.Class)v19),((com.fasterxml.jackson.core.JsonToken)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).getValueType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "";
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).isEnum();
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = ((java.lang.Class)v4).isInstance(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v13 = "";
    Object v14 = " ";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v16).getValueClass();
    Object v18 = "lrray";
    Object v19 = new java.lang.Throwable(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).instantiationException(((java.lang.Class)v17),((java.lang.Throwable)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "";
    Object v13 = new java.lang.Object[]{null};
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).mappingException(((java.lang.String)v12),((java.lang.Object[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).isEnum();
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = ((java.lang.Class)v4).isInstance(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JsonDeserializer)v20).getEmptyValue();
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v14).deserialize(((com.fasterxml.jackson.core.JsonParser)v22),((com.fasterxml.jackson.databind.DeserializationContext)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = ((java.lang.Class)v5).getDeclaredMethods();
    Object v7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).isEnum();
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = ((java.lang.Class)v4).isInstance(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v14).getValueClass();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v3).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v4));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = "lrray";
    Object v13 = new java.lang.Throwable(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = ((java.lang.Class)v5).getDeclaredMethods();
    Object v7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new java.util.TreeSet();
    Object v10 = new java.util.TreeSet();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v13).getEmptyValue();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v7).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).nextToken();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getTokenLocation();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "";
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getObjectIdReader();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "";
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new java.util.TreeSet();
    Object v11 = new java.util.TreeSet();
    Object v12 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonDeserializer)v14).getEmptyValue();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v2 = "";
    Object v3 = " ";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "regex";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).transform(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).leaseObjectBuffer();
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = ((java.lang.Class)v5).getDeclaredMethods();
    Object v7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v7).getValueType();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).getNullValue();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).isEnum();
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = ((java.lang.Class)v4).isInstance(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v14).getValueClass();
    Object v16 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v4).getNullValue();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v2).getNullValue();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).isEnum();
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = ((java.lang.Class)v4).isInstance(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v14).getValueClass();
    Object v16 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v16).handledType();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.util.TreeSet();
    Object v3 = new java.util.TreeSet();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new java.util.TreeSet();
    Object v14 = new java.util.TreeSet();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new java.util.TreeSet();
    Object v19 = new java.util.TreeSet();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v21).isEnum();
    Object v23 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v21));
    Object v24 = ((com.fasterxml.jackson.databind.JsonDeserializer)v23).getEmptyValue();
    Object v25 = ((java.lang.Class)v16).isInstance(((java.lang.Object)v24));
    Object v26 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v16));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v26).getValueClass();
    Object v28 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).mappingException(((java.lang.Class)v27),((com.fasterxml.jackson.core.JsonToken)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "";
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new java.util.TreeSet();
    Object v11 = new java.util.TreeSet();
    Object v12 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonDeserializer)v14).getEmptyValue();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v21 = "";
    Object v22 = " ";
    Object v23 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = "regex";
    Object v25 = ((com.fasterxml.jackson.databind.util.NameTransformer)v23).transform(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v20).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v23));
    Object v27 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = ((java.lang.Class)v5).getDeclaredMethods();
    Object v7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getKnownPropertyNames();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).handledType();
    Object v4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getKnownPropertyNames();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getObjectIdReader();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).nextValue();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v4 = "";
    Object v5 = " ";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = "";
    Object v8 = " ";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v4 = "";
    Object v5 = " ";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v4 = "";
    Object v5 = " ";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new java.util.TreeSet();
    Object v10 = new java.util.TreeSet();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v13).getEmptyValue();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v7).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "DEFAU";
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).findBackReference(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "regex";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = "";
    Object v8 = " ";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v16).getEmptyValue();
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v10).deserialize(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = "";
    Object v2 = " ";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).getValueClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new java.util.TreeSet();
    Object v9 = new java.util.TreeSet();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13));
    Object v15 = -37;
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.core.JsonParser)v14).overrideStdFeatures((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "";
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new java.util.TreeSet();
    Object v11 = new java.util.TreeSet();
    Object v12 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JsonDeserializer)v14).getEmptyValue();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15));
    Object v17 = 45L;
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v16).nextLongValue((((java.lang.Long)v17).longValue()));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).handledType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "0.0";
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).findBackReference(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = "";
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ": ";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getDelegatee();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).handledType();
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = new java.util.TreeSet();
    Object v6 = new java.util.TreeSet();
    Object v7 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v9).getEmptyValue();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).nextToken();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new java.util.TreeSet();
    Object v7 = new java.util.TreeSet();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).isEnum();
    Object v11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v9));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getEmptyValue();
    Object v13 = ((java.lang.Class)v4).isInstance(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v14).getValueClass();
    Object v16 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v16).handledType();
    Object v18 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.util.TreeSet();
    Object v5 = new java.util.TreeSet();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v10).hasTextCharacters();
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v16 = "";
    Object v17 = " ";
    Object v18 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonDeserializer)v15).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v19).getValueClass();
    Object v21 = ((java.lang.Class)v20).getDeclaredMethods();
    Object v22 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v20));
    Object v23 = "st";
    Object v24 = "[";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v24));
    Object v26 = null;
    Object v27 = true;
    Object v28 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v25),((com.fasterxml.jackson.databind.AnnotationIntrospector)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = "[";
    Object v30 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v28),((com.fasterxml.jackson.databind.PropertyName)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v23),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v31),((com.fasterxml.jackson.databind.util.Annotations)v32),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.BeanProperty)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)v2).deserialize(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    Object v2 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).handledType();
    Object v5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v5));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }
}
