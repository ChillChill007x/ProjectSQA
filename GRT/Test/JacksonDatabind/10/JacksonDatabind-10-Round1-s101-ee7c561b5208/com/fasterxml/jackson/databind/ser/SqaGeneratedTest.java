package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v19).getCurrentValue();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndSerialize(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    Object v19 = "\": ";
    Object v20 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new java.lang.String[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.ser.PropertyFilter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    Object v19 = ": ";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v21 = "\": ";
    Object v22 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v20),((com.fasterxml.jackson.core.io.SerializedString)v22));
    Object v24 = ((com.fasterxml.jackson.databind.SerializerProvider)v18).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v19),((com.fasterxml.jackson.databind.BeanProperty)v23));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    ((com.fasterxml.jackson.databind.SerializerProvider)v20).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v22));
    Object v23 = null;
    Object v24 = new java.lang.String[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndFilter(((java.lang.Object)v17),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v20),((com.fasterxml.jackson.databind.ser.PropertyFilter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonGenerator)v23).useDefaultPrettyPrinter();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = "stringB";
    Object v23 = 0.0D;
    ((com.fasterxml.jackson.core.JsonGenerator)v21).writeNumberField(((java.lang.String)v22),(((java.lang.Double)v23).doubleValue()));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v20).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v22 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v23).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Class)v26));
    Object v28 = new java.lang.String[]{};
    Object v29 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v28));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.ser.PropertyFilter)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new java.lang.String[]{};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.AnnotationIntrospector)v22),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = "]=";
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24),((java.lang.Class)v26),((java.lang.String)v27),((java.lang.Class)v29));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = ((com.fasterxml.jackson.core.JsonGenerator)v32).isClosed();
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v34));
    Object v36 = new java.lang.String[]{};
    Object v37 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v36));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v30),((com.fasterxml.jackson.core.JsonGenerator)v32),((com.fasterxml.jackson.databind.SerializerProvider)v35),((com.fasterxml.jackson.databind.ser.PropertyFilter)v37));
    Object v38 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v22).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v24 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v26 = "\": ";
    Object v27 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v25),((com.fasterxml.jackson.core.io.SerializedString)v27));
    Object v29 = ((com.fasterxml.jackson.databind.SerializerProvider)v23).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v24),((com.fasterxml.jackson.databind.BeanProperty)v28));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndSerialize(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = ((com.fasterxml.jackson.core.JsonGenerator)v25).useDefaultPrettyPrinter();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v31 = ((com.fasterxml.jackson.databind.SerializerProvider)v28).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v29),((com.fasterxml.jackson.databind.BeanProperty)v30));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndSerialize(((java.lang.Object)v23),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    Object v23 = "\": ";
    Object v24 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v24),((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new java.lang.String[]{};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v24).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v25));
    Object v26 = null;
    Object v27 = new java.lang.String[]{};
    Object v28 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v27));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new java.lang.String[]{};
    Object v27 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v26));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.PropertyFilter)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = -2L;
    Object v23 = java.time.Instant.ofEpochSecond((((java.lang.Long)v22).longValue()));
    Object v24 = java.util.Date.from(((java.time.Instant)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v27).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v28));
    Object v29 = null;
    Object v30 = new java.lang.String[]{};
    Object v31 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v30));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v24),((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v27),((com.fasterxml.jackson.databind.ser.PropertyFilter)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = "\": ";
    Object v21 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new java.lang.String[]{};
    Object v26 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v23 = "\": ";
    Object v24 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v22),((com.fasterxml.jackson.core.io.SerializedString)v24));
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v27 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new java.lang.String[]{};
    Object v30 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v29));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v25),((com.fasterxml.jackson.core.JsonGenerator)v27),((com.fasterxml.jackson.databind.SerializerProvider)v28),((com.fasterxml.jackson.databind.ser.PropertyFilter)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.core.JsonGenerator)v22).setCurrentValue(((java.lang.Object)v24));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = ": ";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = false;
    Object v26 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24),(((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v28 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new java.lang.String[]{};
    Object v31 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v30));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v26),((com.fasterxml.jackson.core.JsonGenerator)v28),((com.fasterxml.jackson.databind.SerializerProvider)v29),((com.fasterxml.jackson.databind.ser.PropertyFilter)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v26 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v27));
    Object v29 = new java.lang.String[]{};
    Object v30 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v29));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v24),((com.fasterxml.jackson.core.JsonGenerator)v26),((com.fasterxml.jackson.databind.SerializerProvider)v28),((com.fasterxml.jackson.databind.ser.PropertyFilter)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new java.lang.String[]{};
    Object v27 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v26));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.PropertyFilter)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    Object v19 = -2L;
    Object v20 = java.time.Instant.ofEpochSecond((((java.lang.Long)v19).longValue()));
    Object v21 = java.util.Date.from(((java.time.Instant)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new java.lang.String[]{};
    Object v26 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndFilter(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = ": ";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new java.lang.String[]{};
    Object v29 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v28));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v23),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v27),((com.fasterxml.jackson.databind.ser.PropertyFilter)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v21 = "\": ";
    Object v22 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v20),((com.fasterxml.jackson.core.io.SerializedString)v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = " has no content";
    ((com.fasterxml.jackson.core.JsonGenerator)v25).writeArrayFieldStart(((java.lang.String)v26));
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v31 = "\": ";
    Object v32 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v30),((com.fasterxml.jackson.core.io.SerializedString)v32));
    Object v34 = ((com.fasterxml.jackson.databind.SerializerProvider)v28).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v29),((com.fasterxml.jackson.databind.BeanProperty)v33));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v23),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v28 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new java.lang.String[]{};
    Object v31 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v30));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v26),((com.fasterxml.jackson.core.JsonGenerator)v28),((com.fasterxml.jackson.databind.SerializerProvider)v29),((com.fasterxml.jackson.databind.ser.PropertyFilter)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new java.lang.String[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.ser.PropertyFilter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v20).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v22 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = -2L;
    Object v21 = java.time.Instant.ofEpochSecond((((java.lang.Long)v20).longValue()));
    Object v22 = java.util.Date.from(((java.time.Instant)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v25).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v26));
    Object v27 = null;
    Object v28 = new java.lang.String[]{};
    Object v29 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v28));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.databind.SerializerProvider)v25),((com.fasterxml.jackson.databind.ser.PropertyFilter)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = new java.lang.String[]{};
    Object v26 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new java.lang.String[]{};
    Object v24 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v23));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndFilter(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.ser.PropertyFilter)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v24 = "\": ";
    Object v25 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v23),((com.fasterxml.jackson.core.io.SerializedString)v25));
    Object v27 = "";
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v28),((com.fasterxml.jackson.core.JsonGenerator)v30),((com.fasterxml.jackson.databind.SerializerProvider)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.DatabindContext)v22).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new java.lang.String[]{};
    Object v28 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v27));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v23),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v26),((com.fasterxml.jackson.databind.ser.PropertyFilter)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = ": ";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndSerialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = ((com.fasterxml.jackson.core.JsonGenerator)v20).setCodec(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = new java.lang.String[]{};
    Object v26 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndFilter(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v22).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v24 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v22 = "\": ";
    Object v23 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v21),((com.fasterxml.jackson.core.io.SerializedString)v23));
    Object v25 = ((com.fasterxml.jackson.databind.SerializerProvider)v19).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v20),((com.fasterxml.jackson.databind.BeanProperty)v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = "\": ";
    Object v20 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new java.lang.String[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.ser.PropertyFilter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    Object v27 = new java.lang.String[]{};
    Object v28 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v27));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndFilter(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.databind.SerializerProvider)v26),((com.fasterxml.jackson.databind.ser.PropertyFilter)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v23).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Class)v26));
    Object v28 = new java.lang.String[]{};
    Object v29 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v28));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.ser.PropertyFilter)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new java.lang.String[]{};
    Object v24 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v23));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndFilter(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22),((com.fasterxml.jackson.databind.ser.PropertyFilter)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = ": ";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new java.lang.String[]{};
    Object v25 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v24));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndFilter(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v22),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.ser.PropertyFilter)v25));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new java.lang.String[]{};
    Object v26 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v25));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).getAndFilter(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v13).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v13).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new java.lang.String[]{};
    Object v26 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v28 = "\": ";
    Object v29 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v27),((com.fasterxml.jackson.core.io.SerializedString)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.PropertyFilter)v26).depositSchemaProperty(((com.fasterxml.jackson.databind.ser.PropertyWriter)v30),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v32),((com.fasterxml.jackson.databind.SerializerProvider)v33));
    Object v34 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndFilter(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24),((com.fasterxml.jackson.databind.ser.PropertyFilter)v26));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = "): ";
    Object v23 = "F";
    ((com.fasterxml.jackson.core.JsonGenerator)v21).writeStringField(((java.lang.String)v22),((java.lang.String)v23));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v25).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v26));
    Object v27 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v13).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getName();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v18 = new java.lang.String[]{};
    Object v19 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v14 = "\": ";
    Object v15 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v13).getAndSerialize(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v17 = "\": ";
    Object v18 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndSerialize(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v17));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v17 = -2L;
    Object v18 = java.time.Instant.ofEpochSecond((((java.lang.Long)v17).longValue()));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new java.lang.String[]{};
    Object v23 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v16).getAndFilter(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21),((com.fasterxml.jackson.databind.ser.PropertyFilter)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v23));
    ((com.fasterxml.jackson.core.JsonGenerator)v24).close();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new java.lang.String[]{};
    Object v29 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v28));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v22),((com.fasterxml.jackson.core.JsonGenerator)v24),((com.fasterxml.jackson.databind.SerializerProvider)v27),((com.fasterxml.jackson.databind.ser.PropertyFilter)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((java.lang.Class)v20));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v25).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v26));
    Object v27 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).getAndSerialize(((java.lang.Object)v21),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v13 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = "\"";
    Object v20 = new java.lang.Object[]{null,null};
    Object v21 = ((com.fasterxml.jackson.databind.SerializerProvider)v18).mappingException(((java.lang.String)v19),((java.lang.Object[])v20));
    Object v22 = new java.lang.String[]{};
    Object v23 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v22));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v13).getAndFilter(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18),((com.fasterxml.jackson.databind.ser.PropertyFilter)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getWrapperName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v23).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v24));
    Object v25 = null;
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v19).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v23));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getName();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "]=";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15),((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v17).resolve(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v21 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v20));
    Object v22 = new java.lang.String[]{};
    Object v23 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new java.lang.String[]{};
    Object v28 = com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.filterOutAllExcept(((java.lang.String[])v27));
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v21).getAndFilter(((java.lang.Object)v23),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v26),((com.fasterxml.jackson.databind.ser.PropertyFilter)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "]=";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v5),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11).getDeclaringClass();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v0),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11),((com.fasterxml.jackson.databind.JsonSerializer)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "\": ";
    Object v2 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.core.io.SerializedString)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "]=";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer();
    Object v18 = new com.fasterxml.jackson.databind.ser.AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty)v3),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = true;
    ((com.fasterxml.jackson.core.JsonGenerator)v21).writeBoolean((((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.AnyGetterWriter)v18).getAndSerialize(((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
