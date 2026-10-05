package com.fasterxml.jackson.databind.ser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = "by6e";
    Object v5 = ")";
    Object v6 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = "numbeR";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.Class)v17),((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.BeanProperty)v24).getFullName();
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.BeanProperty)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = ": 4";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = -46.85472835860002D;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v2).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = "?string";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "arraay";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v6),((java.lang.Object)v8),((java.lang.String)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = "by6e";
    Object v6 = ")";
    Object v7 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = "numbeR";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.BeanProperty)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.reflect.Type)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = "?string";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.Throwable)v10).getStackTrace();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v10),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5).expectMapFormat(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).isMemberClass();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = "?string";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = "numbeR";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.Class)v17),((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ",[ ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.Throwable)v7),((java.lang.Object)v22),((java.lang.String)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = ": 4";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v9).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).properties();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isUnwrappingSerializer();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = 30.584417611183635D;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    Object v10 = 30.782677797448514D;
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v10),((com.fasterxml.jackson.core.JsonGenerator)v13),((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ": 4";
    Object v2 = ")";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = "?string";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = "java.utXl";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v8),((java.lang.Object)v11),((java.lang.String)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = "Could not resolve type id '%s' into a subtype of %s";
    Object v5 = "STATIC";
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = "?string";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).handledType();
    Object v13 = 25;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v10),((java.lang.Object)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = "?string";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).handledType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v12));
    Object v14 = "#L";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v10),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v4 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).handledType();
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = false;
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.reflect.Type)v14),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5).expectIntegerFormat(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).handledType();
    Object v9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).includeFilterSuppressNulls(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).handledType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v13).handledType();
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v14),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = ": 4";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v9).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v15).handledType();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v17).handledType();
    Object v19 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).replaceDelegatee(((com.fasterxml.jackson.databind.JsonSerializer)v19));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = false;
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).serialize(((java.lang.Number)v5),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = "?string";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).handledType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v13).handledType();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v15).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.Object)v18));
    Object v20 = "[]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Throwable)v10),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = 29.209619643094303D;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).includeFilterSuppressNulls(((java.lang.Object)v9));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = "by6e";
    Object v6 = ")";
    Object v7 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = "numbeR";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23),((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.BeanProperty)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5).expectStringFormat(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).handledType();
    Object v7 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).handledType();
    Object v9 = ((java.lang.reflect.Type)v8).getTypeName();
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).properties();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = "?string";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.String)v12));
    Object v14 = ": 4";
    Object v15 = ")";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.Throwable)v13),((java.lang.Object)v16),((java.lang.String)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = null;
    Object v5 = "false";
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ": 4";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "no array delegatecreator specified";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).withFilterId(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = "by6e";
    Object v8 = ")";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = "numbeR";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v20),((java.lang.String)v21),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = "Don't know how to convert embedded Object";
    Object v11 = new java.lang.Object[]{};
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v9).mappingException(((java.lang.String)v10),((java.lang.Object[])v11));
    Object v13 = "by6e";
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "numbeR";
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v24),((java.lang.Class)v26),((java.lang.String)v27),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31),((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.BeanProperty)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = "?string";
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ",on-generic Map class %s did not resolve to something with key type %s but %s ";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v14),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5).expectBooleanFormat(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = "?string";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v6).handledType();
    Object v8 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v8).isUnwrappingSerializer();
    Object v10 = "Non-hex character '%c' (value 0x%s), not valid for UUID String";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v5),((java.lang.Object)v9),((java.lang.String)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = "?string";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).handledType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v11).handledType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JsonSerializer)v13).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.Object)v16));
    Object v18 = "*";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v8),((java.lang.Object)v17),((java.lang.String)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = -62.27573171791776D;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeBoolean((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = -10.09076529930797D;
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 12;
    ((com.fasterxml.jackson.core.JsonGenerator)v6).writeStartArray((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).serialize(((java.lang.Number)v3),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = ": 4";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v12).handledType();
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = "?string";
    Object v20 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = "OBJECT_ANDbNON_CONCRETE";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.Throwable)v20),((java.lang.Object)v28),((java.lang.String)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).getDelegatee();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.reflect.Type)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).withFilterId(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v7).getDelegatee();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = "?string";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v6),((java.lang.Object)v7),((java.lang.String)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = true;
    Object v7 = "number";
    Object v8 = 0;
    Object v9 = "Cannot construct SimpleType for a Collection (clas: ";
    Object v10 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.Integer)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).includeFilterSuppressNulls(((java.lang.Object)v10));
    Object v12 = "by6e";
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "numbeR";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.BeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = ")";
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).mappingException(((java.lang.String)v4),((java.lang.Object[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).handledType();
    Object v9 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v9).handledType();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.reflect.Type)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = true;
    Object v5 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = "?string";
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v13 = ((com.fasterxml.jackson.databind.JsonSerializer)v12).properties();
    Object v14 = "=]";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.Throwable)v11),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v5).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v10 = null;
    Object v11 = ": 4";
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonSerializer)v5).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v13));
    ((com.fasterxml.jackson.databind.SerializerProvider)v4).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v17 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v16).handledType();
    Object v18 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v3).properties();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "by6e";
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = "numbeR";
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.Class)v28),((java.lang.String)v29),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((java.lang.Object)v34));
    Object v36 = ")";
    Object v37 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v35),((java.lang.String)v36));
    ((com.fasterxml.jackson.databind.ser.std.StdScalarSerializer)v2).serializeWithType(((java.lang.Object)v4),((com.fasterxml.jackson.core.JsonGenerator)v7),((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).usesObjectId();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = "?string";
    Object v5 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v3),((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v9 = -3;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.Throwable)v5),((java.lang.Object)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v5).handledType();
    Object v7 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v7).handledType();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.reflect.Type)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ": 4";
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "no array delegatecreator specified";
    Object v7 = ((com.fasterxml.jackson.databind.util.NameTransformer)v5).transform(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.reflect.Type)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.ser.std.NumberSerializer.bigDecimalAsStringSerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v8),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.reflect.Type)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = "?string";
    Object v14 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = "?string";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v16),((java.lang.String)v17));
    ((java.lang.Throwable)v14).addSuppressed(((java.lang.Throwable)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v21 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v20).handledType();
    Object v22 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v26 = ((com.fasterxml.jackson.databind.JsonSerializer)v22).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v24),((java.lang.Object)v25));
    Object v27 = "string";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.Throwable)v14),((java.lang.Object)v26),((java.lang.String)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).getDeclaredMethods();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v6).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = ((java.lang.Class)v1).getDeclaredMethods();
    Object v3 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = "?string";
    Object v9 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v7),((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v11 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v10).handledType();
    Object v12 = ((java.lang.Class)v11).getDeclaredMethods();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v11));
    Object v14 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v3).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.Throwable)v9),((java.lang.Object)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v10).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.reflect.Type)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = false;
    Object v7 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.reflect.Type)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).getSchema(((com.fasterxml.jackson.databind.SerializerProvider)v9),((java.lang.reflect.Type)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v4 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    ((com.fasterxml.jackson.databind.JsonSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v13),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = "?string";
    Object v8 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v6),((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = 0;
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.Throwable)v8),((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = "?string";
    Object v6 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v4),((java.lang.String)v5));
    Object v7 = "[a>ySetter]";
    Object v8 = java.nio.charset.Charset.defaultCharset();
    Object v9 = new java.io.PrintWriter(((java.lang.String)v7),((java.nio.charset.Charset)v8));
    Object v10 = true;
    Object v11 = new java.io.PrintWriter(((java.io.Writer)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((java.lang.Throwable)v6).printStackTrace(((java.io.PrintWriter)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = "";
    ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).wrapAndThrow(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.Throwable)v6),((java.lang.Object)v14),((java.lang.String)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v0).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v3),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
    Object v6 = ": 4";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonSerializer)v0).unwrappingSerializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v9).properties();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonSerializer)v4).properties();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = false;
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).serialize(((java.lang.Number)v5),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v2).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonSerializer)v2).withFilterId(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = true;
    Object v14 = "number";
    Object v15 = 0;
    Object v16 = "Cannot construct SimpleType for a Collection (clas: ";
    Object v17 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v13).booleanValue()),((java.lang.String)v14),((java.lang.Integer)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonSerializer)v10).isEmpty(((com.fasterxml.jackson.databind.SerializerProvider)v12),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer();
    Object v1 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v0).handledType();
    Object v2 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.ser.std.StdSerializer)v2).handledType();
    Object v4 = new com.fasterxml.jackson.databind.ser.std.NumberSerializer(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = "by6e";
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "numbeR";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30),((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.ser.std.NumberSerializer)v4).createContextual(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.BeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
