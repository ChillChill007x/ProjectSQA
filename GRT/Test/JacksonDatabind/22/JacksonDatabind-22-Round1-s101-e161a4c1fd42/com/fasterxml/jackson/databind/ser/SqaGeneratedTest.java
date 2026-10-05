package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.JavaType)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).getFactoryConfig();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.JavaType)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).getName();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ")";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.introspect.Annotated)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v3),((com.fasterxml.jackson.databind.introspect.Annotated)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ")";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v8),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v2),((com.fasterxml.jackson.databind.introspect.Annotated)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).customSerializers();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JsonSerializer)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = false;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = "]";
    Object v10 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ")";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((com.fasterxml.jackson.databind.BeanProperty)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v32 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildIndexedListSerializer(((com.fasterxml.jackson.databind.JavaType)v4),(((java.lang.Boolean)v5).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v30),((com.fasterxml.jackson.databind.JsonSerializer)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v34 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).getFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).customSerializers();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = ": ";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5)._verifyAsClass(((java.lang.Object)v6),((java.lang.String)v7),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = "enum";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5)._verifyAsClass(((java.lang.Object)v6),((java.lang.String)v7),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    ((com.fasterxml.jackson.databind.JsonSerializer)v17).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.databind.JsonSerializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = "]";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ")";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ValueInjector(((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.util.Annotations)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29),((java.lang.Object)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v34 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildCollectionSerializer(((com.fasterxml.jackson.databind.JavaType)v6),(((java.lang.Boolean)v7).booleanValue()),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v32),((com.fasterxml.jackson.databind.JsonSerializer)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v36),((com.fasterxml.jackson.databind.JavaType)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ")";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15),((java.lang.Class)v17),((java.lang.String)v18),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredFields();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5)._verifyAsClass(((java.lang.Object)v6),((java.lang.String)v7),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.SerializationConfig)v9).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v6),((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.JsonSerializer)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).getAnnotation(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).getFactoryConfig();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v11),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = null;
    Object v17 = false;
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).findSerializerByPrimaryType(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.BeanDescription)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ")";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = ((com.fasterxml.jackson.core.type.ResolvedType)v31).toCanonical();
    Object v33 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.introspect.Annotated)v27),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v11),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = " is not a Map(-iike) type";
    Object v21 = new java.lang.StringBuilder(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v19).getErasedSignature(((java.lang.StringBuilder)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).customSerializers();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v11).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JsonSerializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v13).getFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).customSerializers();
    Object v17 = ")";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._verifyAsClass(((java.lang.Object)v16),((java.lang.String)v17),((java.lang.Class)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JsonSerializer)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16),((java.lang.Class)v18),((java.lang.String)v19),((java.lang.Class)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v24 = ((com.fasterxml.jackson.databind.introspect.Annotated)v22).equals(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.introspect.Annotated)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9));
    Object v11 = null;
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).findSerializerByLookup(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.BeanDescription)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.introspect.Annotated)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = "'), bu ";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9)._verifyAsClass(((java.lang.Object)v10),((java.lang.String)v11),((java.lang.Class)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v9 = "java.util.NavigableSet";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._verifyAsClass(((java.lang.Object)v8),((java.lang.String)v9),((java.lang.Class)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = "]";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3)._verifyAsClass(((java.lang.Object)v4),((java.lang.String)v5),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = "F";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._verifyAsClass(((java.lang.Object)v10),((java.lang.String)v11),((java.lang.Class)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v15 = ((com.fasterxml.jackson.databind.SerializationConfig)v13).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v14));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findFilterId(((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.BeanDescription)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v10),((com.fasterxml.jackson.databind.introspect.Annotated)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = "integer";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11)._verifyAsClass(((java.lang.Object)v12),((java.lang.String)v13),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = "]";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializationConfig)v9).withRootName(((com.fasterxml.jackson.databind.PropertyName)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ")";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    ((com.fasterxml.jackson.databind.JsonSerializer)v21).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v22),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v28 = null;
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JsonSerializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).isIndexedList(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v4),((com.fasterxml.jackson.databind.introspect.Annotated)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v11),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v17).forcedNarrowBy(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).createTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ")";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    ((com.fasterxml.jackson.databind.JsonSerializer)v21).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v22),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JsonSerializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).customSerializers();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getUnknownTypeSerializer(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v13).getUnknownTypeSerializer(((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v18),((com.fasterxml.jackson.databind.AnnotationIntrospector)v19),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ")";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19),((java.lang.Class)v21),((java.lang.String)v22),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v13),((com.fasterxml.jackson.databind.introspect.Annotated)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).isContainerType();
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JsonSerializer)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).buildEnumSetSerializer(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v21),((com.fasterxml.jackson.databind.introspect.Annotated)v27),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = " Zfrom Integer number (";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7)._verifyAsClass(((java.lang.Object)v8),((java.lang.String)v9),((java.lang.Class)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ")";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v12),((com.fasterxml.jackson.databind.introspect.Annotated)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ")";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15),((java.lang.Class)v17),((java.lang.String)v18),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).buildIterableSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.BeanDescription)v17),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    ((com.fasterxml.jackson.databind.SerializerProvider)v11).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ")";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20),((java.lang.Class)v22),((java.lang.String)v23),((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getGenericType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = "Invalid delegate-creator definition for";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9)._verifyAsClass(((java.lang.Object)v12),((java.lang.String)v13),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = "int'eger";
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).mappingException(((java.lang.String)v6),((java.lang.Object[])v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ")";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).getFactoryConfig();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).customSerializers();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).annotations();
    Object v17 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v18 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findConvertingSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.databind.JsonSerializer)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = "items";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5)._verifyAsClass(((java.lang.Object)v6),((java.lang.String)v7),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v13).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v15).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v17).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v19).getFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v23 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v14 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v13).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).createKeySerializer(((com.fasterxml.jackson.databind.SerializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v8).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ")";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findSerializerFromAnnotation(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.introspect.Annotated)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializationConfig)v5).constructDefaultPrettyPrinter();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).hasAnnotation(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.Annotated)v23).getGenericType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).getFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v11 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v11).modifyTypeByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v17),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.databind.JavaType)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v9)._findKeySerializer(((com.fasterxml.jackson.databind.SerializerProvider)v11),((com.fasterxml.jackson.databind.introspect.Annotated)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((java.lang.Object)v10),((java.lang.Object)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).createSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v8),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5)._findContentSerializer(((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withAdditionalKeySerializers(((com.fasterxml.jackson.databind.ser.Serializers)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.Serializers.Base();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withAdditionalSerializers(((com.fasterxml.jackson.databind.ser.Serializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v13 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v5).withAttribute(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.Object)v21),((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.ser.BasicSerializerFactory.modifySecondaryTypesByAnnotation(((com.fasterxml.jackson.databind.SerializationConfig)v5),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.ser.BeanSerializerFactory(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v3 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v5 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v3).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BasicSerializerFactory)v7).findConverter(((com.fasterxml.jackson.databind.SerializerProvider)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
