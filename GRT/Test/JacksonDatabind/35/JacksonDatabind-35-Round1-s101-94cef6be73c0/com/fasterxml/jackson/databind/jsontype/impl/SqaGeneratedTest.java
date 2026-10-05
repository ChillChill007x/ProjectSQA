package com.fasterxml.jackson.databind.jsontype.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getPropertyName();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = 1L;
    Object v14 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v13).longValue()));
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = 1L;
    Object v28 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v27).longValue()));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = java.io.OutputStream.nullOutputStream();
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v29).readBinaryValue(((java.io.OutputStream)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).getTypeIdResolver();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = ")";
    Object v10 = "true";
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getGenericInterfaces();
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).toString();
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).baseTypeName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = "";
    Object v28 = "] thKat wasn't previously seen as unresolved.";
    Object v29 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v29),((com.fasterxml.jackson.databind.AnnotationIntrospector)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v27),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v32),((com.fasterxml.jackson.databind.util.Annotations)v35),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getByteValue();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getTypeIdResolver();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).version();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v19).getDefaultImpl();
    Object v21 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).mappingException(((java.lang.Class)v7),((com.fasterxml.jackson.core.JsonToken)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = 1L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).deserializeTypedFromObject(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).isExpectedStartObjectToken();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = 1L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = -30;
    Object v29 = ((com.fasterxml.jackson.core.JsonParser)v27).nextIntValue((((java.lang.Integer)v28).intValue()));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v34));
    Object v36 = new java.util.concurrent.atomic.AtomicReference();
    Object v37 = ((com.fasterxml.jackson.databind.DeserializationContext)v32).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v35),((java.util.concurrent.atomic.AtomicReference)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v32));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = 32;
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v2).nextIntValue((((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = 1L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = "[]";
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v33).mappingException(((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = 1L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = ((com.fasterxml.jackson.core.JsonParser)v30).hasTextCharacters();
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = new java.lang.Class[]{};
    Object v37 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v35),((java.lang.Class[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = 1L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).isSynthetic();
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).getDefaultImpl();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).getTypeInclusion();
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).getDefaultImpl();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = new java.lang.Class[]{};
    Object v37 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v35),((java.lang.Class[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v38).getDefaultImpl();
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "strXng";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = "";
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v28).getDefaultImpl();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v30).getTypeInclusion();
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v30).getDefaultImpl();
    Object v33 = "]y";
    Object v34 = ((java.lang.Class)v32).getResource(((java.lang.String)v33));
    Object v35 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v32));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v36).baseTypeName();
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v36).getPropertyName();
    org.junit.Assert.assertEquals((Object)("strXng"), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "str8ing";
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = "] thKat wasn't previously seen as unresolved.";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = false;
    Object v24 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.AnnotationIntrospector)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v19),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v24),((com.fasterxml.jackson.databind.util.Annotations)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new java.lang.Class[]{};
    Object v31 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v29),((java.lang.Class[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v18).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v32).getDefaultImpl();
    Object v34 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "strXng";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = "";
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v28).getDefaultImpl();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v30).getTypeInclusion();
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v30).getDefaultImpl();
    Object v33 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = 1L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).deserializeTypedFromObject(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = new java.util.concurrent.atomic.AtomicReference();
    Object v7 = "Current no";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = "";
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v20).getDefaultImpl();
    Object v22 = Short.valueOf((short)1);
    Object v23 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer(((java.lang.Class)v21),((java.lang.Short)v22));
    ((com.fasterxml.jackson.databind.DeserializationContext)v5).reportUnknownProperty(((java.lang.Object)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v23));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.Class)v26).getDeclaredConstructors();
    Object v28 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v26));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).toString();
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getType();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).endOfInputException(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v10).getPackageName();
    Object v12 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getConstructors();
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = 1L;
    Object v28 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v27).longValue()));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = ", probleu: ";
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v32).mappingException(((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "";
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v18).getDefaultImpl();
    Object v20 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = "";
    Object v28 = "] thKat wasn't previously seen as unresolved.";
    Object v29 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = false;
    Object v32 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v29),((com.fasterxml.jackson.databind.AnnotationIntrospector)v30),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v27),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v32),((com.fasterxml.jackson.databind.util.Annotations)v35),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v38).getDefaultImpl();
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v36).getDefaultImpl();
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).toString();
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getValueAsString();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    ((com.fasterxml.jackson.databind.DeserializationContext)v5).checkUnresolvedObjectId();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v19).toString();
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v19).getDefaultImpl();
    Object v22 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getType();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = "";
    Object v29 = "] thKat wasn't previously seen as unresolved.";
    Object v30 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v30),((com.fasterxml.jackson.databind.AnnotationIntrospector)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v36 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v28),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v33),((com.fasterxml.jackson.databind.util.Annotations)v36),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getDefaultImpl();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getType();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = 1L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).getDefaultImpl();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).nextToken();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getLongValue();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getType();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).baseTypeName();
    Object v29 = 1L;
    Object v30 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v29).longValue()));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getType();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = 1L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v27).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).toString();
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getPropertyName();
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).toString();
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).getDefaultImpl();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = 1L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getParsingContext();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v19).getDefaultImpl();
    Object v21 = ((java.lang.Class)v20).getName();
    Object v22 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v35));
    Object v37 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v36).baseTypeName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getType();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getDefaultImpl();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).toString();
    Object v10 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "strXng";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = "";
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((java.lang.String)v24),(((java.lang.Boolean)v25).booleanValue()),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v28).getDefaultImpl();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v30).toString();
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v30).getDefaultImpl();
    Object v33 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "";
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = "] thKat wasn't previously seen as unresolved.";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = false;
    Object v24 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.AnnotationIntrospector)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v19),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v24),((com.fasterxml.jackson.databind.util.Annotations)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new java.lang.Class[]{};
    Object v31 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v29),((java.lang.Class[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v18).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v18).getDefaultImpl();
    Object v34 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getLastClearedToken();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v8).isMemberClass();
    Object v10 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getFloatValue();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).getParsingContext();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).baseTypeName();
    Object v28 = 1L;
    Object v29 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v28).longValue()));
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).deserializeTypedFromAny(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    ((com.fasterxml.jackson.core.JsonParser)v2).close();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).endOfInputException(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).toString();
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v25 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = new java.lang.Class[]{};
    Object v37 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v35),((java.lang.Class[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.BeanProperty)v37).getFullName();
    Object v39 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24),((com.fasterxml.jackson.databind.BeanProperty)v37));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).toString();
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getDefaultImpl();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = ((com.fasterxml.jackson.core.JsonParser)v2).isExpectedStartArrayToken();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "str8ing";
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.Class)v18));
    Object v20 = "";
    Object v21 = "] thKat wasn't previously seen as unresolved.";
    Object v22 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = false;
    Object v25 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v22),((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v20),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v25),((com.fasterxml.jackson.databind.util.Annotations)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = new java.lang.Class[]{};
    Object v32 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v30),((java.lang.Class[])v31));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v19).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v33).getDefaultImpl();
    Object v35 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Class)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).toString();
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).getDefaultImpl();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v12).getDefaultImpl();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "str8ing";
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v18).getDefaultImpl();
    Object v20 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMetadata();
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v27).getPropertyName();
    org.junit.Assert.assertEquals((Object)("str8ing"), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "";
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v18).toString();
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v18).getDefaultImpl();
    Object v21 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = " vs ";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getNestHost();
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "s";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "d";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "s";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).getDefaultImpl();
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "d";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v24).getPropertyName();
    org.junit.Assert.assertEquals((Object)("d"), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "str8ing";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = 1L;
    Object v28 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v27).longValue()));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = ((com.fasterxml.jackson.core.JsonParser)v29).getNumberValue();
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v26).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "d";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = 1L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.DeserializationContext)v30).leaseObjectBuffer();
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).deserializeTypedFromScalar(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "d";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "str8ing";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = 1L;
    Object v26 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v25).longValue()));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).deserializeTypedFromArray(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "";
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v11));
    Object v13 = "";
    Object v14 = "] thKat wasn't previously seen as unresolved.";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new java.lang.Class[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((java.lang.Class[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v12).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v25));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v26).getDefaultImpl();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "strXng";
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase)v22).getDefaultImpl();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v7),((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Class)v23));
    Object v25 = "";
    Object v26 = "] thKat wasn't previously seen as unresolved.";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v27),((com.fasterxml.jackson.databind.AnnotationIntrospector)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v25),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.util.Annotations)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = new java.lang.Class[]{};
    Object v37 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v35),((java.lang.Class[])v36));
    Object v38 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v24).forProperty(((com.fasterxml.jackson.databind.BeanProperty)v37));
    Object v39 = ((com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer)v38).getTypeInclusion();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1L;
    Object v1 = com.fasterxml.jackson.databind.node.LongNode.valueOf((((java.lang.Long)v0).longValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaringClass();
    Object v9 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(((com.fasterxml.jackson.core.JsonParser)v2),((com.fasterxml.jackson.databind.DeserializationContext)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }
}
