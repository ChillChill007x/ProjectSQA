package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = ((java.lang.Throwable)v7).toString();
    Object v9 = ")";
    Object v10 = "";
    Object v11 = java.util.TimeZone.getTimeZone(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v9),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "N/A";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).getAnnotated();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "Can not set virtual prope";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = "arry";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializationConfig)v4).withRootName(((com.fasterxml.jackson.databind.PropertyName)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Throwable needs a default contructor, a single-String-arg constructor;&or explicit @JsonCreator";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getName();
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = ", problem: ";
    Object v5 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "findContentDeserializer";
    Object v5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultBean();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "'";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getStackTrace();
    Object v5 = ")";
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = "stri6ng";
    Object v3 = new java.lang.StringBuilder(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v1).getGenericSignature(((java.lang.StringBuilder)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "Invalid Obj ct Id definition for ";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "v";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getBindings();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).hasGenericTypes();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "NUL;";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS;
    Object v6 = ((com.fasterxml.jackson.databind.SerializationConfig)v4).with(((com.fasterxml.jackson.databind.SerializationFeature)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "rray";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isContainerType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).getErasedSignature();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "GBuild method '";
    Object v5 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "]";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = ": value instantiator (";
    Object v9 = "arry";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v13).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "|";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12).getMember();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "P";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).hashCode();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "; actual type: ";
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12).hasAnnotation(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "]";
    Object v9 = "";
    Object v10 = java.util.TimeZone.getTimeZone(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = com.fasterxml.jackson.databind.SerializationFeature.WRAP_EXCEPTIONS;
    Object v6 = ((com.fasterxml.jackson.databind.SerializationConfig)v4).without(((com.fasterxml.jackson.databind.SerializationFeature)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).hasAnnotation(((java.lang.Class)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "intege";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).isEnumType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " sets of annotations";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = "stri6ng";
    Object v15 = new java.lang.StringBuilder(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).getErasedSignature(((java.lang.StringBuilder)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getClassAnnotations();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Multiple fields representKing property \"";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.core.type.ResolvedType)v1).isReferenceType();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ": ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Conflicting/ambiguous property name efinitions (implicit name '";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).isAbstract();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " gette";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v10 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "2.8~5-SNAPSHOT";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "ar";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "void";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12).getAnnotation(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isAbstract();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = "sctring";
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v5),((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = "overflow, value can not be represented as 8-bit value";
    Object v10 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v7),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "item";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12).hasAnnotation(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "; acual type: ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized azs JSON Array";
    Object v5 = false;
    Object v6 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "numbYr";
    Object v5 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).getRawType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getInterfaces();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = false;
    Object v9 = "arry";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),(((java.lang.Boolean)v8).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = "Can not set virtual prope";
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.Class)v32),((java.lang.String)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = true;
    Object v37 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).buildWriter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v19),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),(((java.lang.Boolean)v36).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not pass null fieldName";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "WRITE_EMPTY_JSON_ARRAYS";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "EEX, dd MMM yyyy HH:mm:ss zzz";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = "";
    Object v6 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v4).compileString(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).isInterface();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = false;
    Object v9 = "arry";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),(((java.lang.Boolean)v8).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).isContainerType();
    Object v14 = false;
    Object v15 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v23),((com.fasterxml.jackson.databind.BeanProperty)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = "Can not set virtual prope";
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((java.lang.Class)v33),((java.lang.String)v34),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = false;
    Object v38 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).buildWriter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v20),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v36),(((java.lang.Boolean)v37).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = false;
    Object v9 = "arry";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),(((java.lang.Boolean)v8).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = false;
    Object v14 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((com.fasterxml.jackson.databind.BeanProperty)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = "Can not set virtual prope";
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.Class)v32),((java.lang.String)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    Object v36 = false;
    Object v37 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).buildWriter(((com.fasterxml.jackson.databind.SerializerProvider)v1),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v19),((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),(((java.lang.Boolean)v36).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "I";
    Object v5 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v6 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType[])v10));
    Object v12 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v13 = "arry";
    Object v14 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v16 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = "sctring";
    Object v24 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v22),((java.lang.String)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = "arry";
    Object v28 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v27));
    Object v29 = new java.util.HashSet();
    Object v30 = new java.util.HashSet();
    Object v31 = java.util.Map.of(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v12),((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16),((java.lang.Object)v17),((java.lang.Object)v19),((java.lang.Object)v20),((java.lang.Object)v21),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v29),((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = "overflow, value can not be represented as 8-bit value";
    Object v7 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).getBindings();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).getSuppressed();
    Object v5 = "str";
    Object v6 = new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider();
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not handle managed/back r^ference '";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "sting";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "problem handler tried tRo resolve into non-subtype: ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "set";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "AnnotationIntrospector returned Class ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v13).withTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = ")";
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "arry";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
    Object v6 = ((com.fasterxml.jackson.databind.SerializationConfig)v4).without(((com.fasterxml.jackson.databind.SerializationFeature)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = ": value instantiator (";
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "null";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).findSuperType(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isPrimitive();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "[N/A]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "n";
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")C";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).getType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "U)";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12).hasAnnotation(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = "overflow, value can not be represented as 8-bit value";
    Object v6 = new com.fasterxml.jackson.databind.JsonMappingException.Reference(((java.lang.Object)v4),((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.JsonMappingException.wrapWithPath(((java.lang.Throwable)v3),((com.fasterxml.jackson.databind.JsonMappingException.Reference)v6));
    Object v8 = "i";
    Object v9 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v10 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v7),((java.lang.String)v8),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "9";
    Object v5 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "PHONE";
    Object v5 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = ((java.lang.Throwable)v3).toString();
    Object v5 = "V";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v5),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "Can not set virtual prope";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "), not compatible with POJ) type (";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "Can not set virtual prope";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v9),((java.lang.String)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).getType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v14).findSuperType(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "com.fasterxml.jackson.databind.ext.DOMDeserializer$D+cumentDeserializer";
    Object v5 = new java.io.PrintStream(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = new java.io.PrintStream(((java.io.OutputStream)v5),(((java.lang.Boolean)v6).booleanValue()));
    ((java.lang.Throwable)v3).printStackTrace(((java.io.PrintStream)v7));
    Object v8 = null;
    Object v9 = "a";
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.ser.std.BooleanSerializer((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v9),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = "Failed to narrow v";
    Object v5 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v6 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = "sctring";
    Object v3 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v1),((java.lang.String)v2));
    Object v4 = " ";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType[])v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v3),((java.lang.String)v4),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
