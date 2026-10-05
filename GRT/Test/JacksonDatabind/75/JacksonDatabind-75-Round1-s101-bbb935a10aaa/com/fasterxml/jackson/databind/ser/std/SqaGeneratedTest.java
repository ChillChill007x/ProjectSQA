package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v2 = Short.valueOf((short)18);
    Object v3 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v2).shortValue()));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "items";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = "true";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((java.lang.Class)v22),((java.lang.String)v23),((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.util.Annotations)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((java.lang.Object)v29));
    Object v31 = ")";
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((com.fasterxml.jackson.databind.BeanProperty)v30),((java.lang.String)v31));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v0).serializeWithType(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v9),((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32));
    Object v33 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v3 = true;
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.Boolean)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v3 = "items";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "true";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v4),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v2),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = "";
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v21),((java.lang.String)v22));
    Object v24 = "truH";
    Object v25 = new java.util.Locale(((java.lang.String)v24));
    Object v26 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v23),((java.lang.Object)v25),(((java.lang.Integer)v26).intValue()));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v3 = false;
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.Boolean)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v6 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v5),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = "'string";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v6 = "columnNr";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v5),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "items";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "true";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.util.Annotations)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.BeanProperty)v18).getMetadata();
    Object v20 = ((com.fasterxml.jackson.databind.ser.std.EnumSerializer)v0).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.BeanProperty)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getUnknownTypeSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = "only \"true\" or \"false\" recognized";
    Object v9 = java.nio.charset.Charset.defaultCharset();
    Object v10 = new java.io.PrintWriter(((java.lang.String)v8),((java.nio.charset.Charset)v9));
    ((java.lang.Throwable)v7).printStackTrace(((java.io.PrintWriter)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v7),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v3 = true;
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.Boolean)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v8),((java.lang.Object)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "AnnotationIntrospector returned Converter definition of type ";
    Object v9 = new java.lang.Object[]{null,null};
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).mappingException(((java.lang.String)v8),((java.lang.Object[])v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = "";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v13),((java.lang.Object)v14),(((java.lang.Integer)v15).intValue()));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).getName();
    Object v3 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v4 = true;
    Object v5 = false;
    Object v6 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.Boolean)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v6 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v8 = Short.valueOf((short)18);
    Object v9 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v8).shortValue()));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeFactory)v18));
    Object v20 = "items";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = "true";
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.Class)v28),((java.lang.String)v29),((java.lang.Class)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.util.Annotations)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v32),((java.lang.Object)v35));
    Object v37 = ")";
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v19),((com.fasterxml.jackson.databind.BeanProperty)v36),((java.lang.String)v37));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v6).serializeWithType(((java.lang.Object)v7),((com.fasterxml.jackson.core.JsonGenerator)v15),((com.fasterxml.jackson.databind.SerializerProvider)v16),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v38));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).getFields();
    Object v3 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v4 = true;
    Object v5 = false;
    Object v6 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.Boolean)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v10),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "items";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = false;
    Object v5 = "items";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.EnumSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = "')]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v5),((java.lang.String)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v3 = true;
    Object v4 = false;
    Object v5 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.Boolean)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ")L";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v5),((java.lang.Class)v7),((java.lang.Class)v9));
    Object v11 = "valueOf";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v10),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = java.nio.charset.Charset.defaultCharset();
    Object v2 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = "";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = -6;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v8),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = false;
    Object v15 = "items";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = ((java.lang.Class)v1).getDeclaredAnnotation(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v6 = true;
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.Boolean)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = ": ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v7),((java.lang.Object)v8),((java.lang.String)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = "')";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v9),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v3 = "stri";
    Object v4 = ".";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "~number";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).reverse(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = "";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v3 = false;
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v2),(((java.lang.Boolean)v3).booleanValue()),((java.lang.Boolean)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = Short.valueOf((short)18);
    Object v7 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v6).shortValue()));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v5).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.String)v16));
    Object v18 = "only \"true\" or \"false\" recognized";
    Object v19 = java.nio.charset.Charset.defaultCharset();
    Object v20 = new java.io.PrintWriter(((java.lang.String)v18),((java.nio.charset.Charset)v19));
    ((java.lang.Throwable)v17).printStackTrace(((java.io.PrintWriter)v20));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = -41;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v17),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v8).handledType();
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.Throwable)v4).fillInStackTrace();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v3 = "items";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "true";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v4),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v2),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = ((com.fasterxml.jackson.databind.ser.std.EnumSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = "";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.Throwable)v6).initCause(((java.lang.Throwable)v9));
    Object v11 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v12 = "; actual type: ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v6),((java.lang.Object)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v11).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = "2";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.Throwable)v16),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v3 = "items";
    Object v4 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "true";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v4),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v2),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v22 = "stri";
    Object v23 = ".";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = "~number";
    Object v26 = ((com.fasterxml.jackson.databind.util.NameTransformer)v24).reverse(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JsonSerializer)v21).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v27).handledType();
    Object v29 = true;
    Object v30 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = false;
    Object v14 = "items";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v15));
    Object v17 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v10),((java.lang.Object)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = Short.valueOf((short)18);
    Object v4 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v3).shortValue()));
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "items";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = "true";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v30));
    Object v32 = ")";
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v31),((java.lang.String)v32));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v0).serializeWithType(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v10),((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).handledType();
    Object v7 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v9 = false;
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v7),((com.fasterxml.jackson.annotation.JsonFormat.Value)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.Boolean)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v8 = true;
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v6),((com.fasterxml.jackson.annotation.JsonFormat.Value)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.Boolean)v9));
    Object v11 = 38;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = Short.valueOf((short)18);
    Object v2 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v3 = ((com.fasterxml.jackson.annotation.JsonFormat.Value)v2).getTimeZone();
    Object v4 = false;
    Object v5 = false;
    Object v6 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v2),(((java.lang.Boolean)v4).booleanValue()),((java.lang.Boolean)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v2 = Short.valueOf((short)18);
    Object v3 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v2).shortValue()));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v1).withFilterId(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v4));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v5).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = "";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = 1;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v10),((java.lang.Object)v11),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v8 = "stri";
    Object v9 = ".";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v11).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = Short.valueOf((short)18);
    Object v2 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v5 = "stri";
    Object v6 = ".";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "~number";
    Object v9 = ((com.fasterxml.jackson.databind.util.NameTransformer)v7).reverse(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).usesObjectId();
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).withFilterId(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((java.lang.reflect.Type)v8).getTypeName();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = Short.valueOf((short)18);
    Object v2 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "stri";
    Object v6 = ".";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = Short.valueOf((short)18);
    Object v2 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).getDelegatee();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = ")";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.Throwable)v16),((java.lang.Object)v18),((java.lang.String)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "stri";
    Object v6 = ".";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).properties();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v7 = "stri";
    Object v8 = ".";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "~number";
    Object v11 = ((com.fasterxml.jackson.databind.util.NameTransformer)v9).reverse(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v5).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v14),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v2));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).handledType();
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = ((java.lang.Class)v1).getProtectionDomain();
    Object v3 = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
    Object v4 = true;
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.ser.std.EnumSerializer._isShapeWrittenUsingIndex(((java.lang.Class)v1),((com.fasterxml.jackson.annotation.JsonFormat.Value)v3),(((java.lang.Boolean)v4).booleanValue()),((java.lang.Boolean)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "~number";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).reverse(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "s)";
    Object v5 = ((com.fasterxml.jackson.databind.util.NameTransformer)v3).transform(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v7 = "stri";
    Object v8 = ".";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "() returned value of type ";
    Object v11 = ((com.fasterxml.jackson.databind.util.NameTransformer)v9).reverse(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonSerializer)v6).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = Short.valueOf((short)18);
    Object v2 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v9 = "stri";
    Object v10 = ".";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "s)";
    Object v13 = ((com.fasterxml.jackson.databind.util.NameTransformer)v11).transform(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v15 = "stri";
    Object v16 = ".";
    Object v17 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "() returned value of type ";
    Object v19 = ((com.fasterxml.jackson.databind.util.NameTransformer)v17).reverse(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JsonSerializer)v14).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v17));
    Object v21 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "stri";
    Object v6 = ".";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "char";
    Object v9 = ((com.fasterxml.jackson.databind.util.NameTransformer)v7).transform(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = Short.valueOf((short)18);
    Object v2 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v1).shortValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).withFilterId(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = Short.valueOf((short)18);
    Object v6 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v5).shortValue()));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v12));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = "";
    Object v16 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v14),((java.lang.String)v15));
    Object v17 = java.time.Instant.now();
    Object v18 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v16),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = "stri";
    Object v2 = ".";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.EnumSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v2),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = "";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = "No content to map due to end-of-input";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v4),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
